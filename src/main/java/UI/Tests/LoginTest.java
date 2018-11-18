package UI.Tests;

import UI.Page.Dashboard;
import UI.Page.LoginPage;
import UI.Utils.Context;
import com.codeborne.selenide.Condition;
import org.junit.Test;

public class LoginTest {

    @Test
    public void shouldLoginWithCorrectCredentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginInput.setValue(Context.login);
        loginPage.passwordInput.setValue(Context.password);

        Dashboard dashboard = loginPage.submitLogin();
        dashboard.setting.should(Condition.appear).click();
        dashboard.userName.shouldHave(Condition.text(Context.login));
    }

    @Test
    public void shouldShowErrorIfEmptyLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginInput.clear();
        loginPage.passwordInput.setValue(Context.password);
        loginPage.submitBtn.shouldBe(Condition.enabled).click();
        loginPage.loginError.should(Condition.appear);
    }

    @Test
    public void shouldShowErrorIfEmptyPass() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginInput.setValue(Context.login);
        loginPage.passwordInput.clear();
        loginPage.submitBtn.shouldBe(Condition.enabled).click();
        loginPage.passwordError.should(Condition.appear);
    }

    @Test
    public void shouldShowErrorIfWrongCredentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginInput.setValue("random@email.com");
        loginPage.passwordInput.setValue("Random123+");
        loginPage.submitBtn.click();
        loginPage.wrongCredentialsAlert.should(Condition.appear);
    }
}
