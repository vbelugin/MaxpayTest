package UI.Tests;

import UI.Page.LoginPage;
import UI.Utils.Context;
import com.codeborne.selenide.Condition;
import org.junit.Test;

public class LoginTest {

    @Test
    public void shouldLoginWithCorrectCredentials() {
        new LoginPage()
                .passCredentials(Context.login, Context.password)
                .submitLogin()
                .openSetting()
                .userNameShouldMatch(Context.login);
    }

    @Test
    public void shouldShowErrorIfEmptyLogin() {
        new LoginPage()
                .passOnlyPassword(Context.password)
                .submitLoginWithError()
                .loginError.should(Condition.appear);
        }

    @Test
    public void shouldShowErrorIfEmptyPass() {
        new LoginPage()
                .passOnlyLogin(Context.login)
                .submitLoginWithError()
                .passwordError.should(Condition.appear);
    }

    @Test
    public void shouldShowErrorIfWrongCredentials() {
        new LoginPage()
                .passCredentials("random@email.com", "Random123+")
                .submitLoginWithError()
                .wrongCredentialsAlert
                .should(Condition.appear);
    }
}
