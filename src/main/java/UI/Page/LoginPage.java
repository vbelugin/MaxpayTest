package UI.Page;
import UI.Utils.Context;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    private SelenideElement loginInput = $(By.id("login-email")),
                            passwordInput = $(By.id("login-password")),
                            submitBtn = $(By.cssSelector("button[type='submit']"));
    public SelenideElement  loginError = $(By.id("login-email-error")),
                            passwordError = $(By.id("login-password-error")),
                            wrongCredentialsAlert = $(By.cssSelector("div.alert-danger"));

    public LoginPage() {
        open(Context.baseUrl);
    }

    public LoginPage passCredentials(String login, String pass) {
        loginInput.setValue(login);
        passwordInput.setValue(pass);
        return page(this);
    }

    public LoginPage passOnlyLogin(String login) {
        loginInput.setValue(login);
        passwordInput.clear();
        return page(this);
    }

    public LoginPage passOnlyPassword(String pass) {
        loginInput.clear();
        passwordInput.setValue(pass);
        return page(this);
    }

    public Dashboard submitLogin() {
        submitBtn.shouldBe(Condition.enabled).click();
        return page(Dashboard.class);
    }

    public LoginPage submitLoginWithError() {
        submitBtn.shouldBe(Condition.enabled).click();
        return page(this);
    }
}
