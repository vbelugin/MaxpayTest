package UI.Page;
import UI.Context;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    public SelenideElement loginInput = $(By.id("login-email")),
                            passwordInput = $(By.id("login-password")),
                            submitBtn = $(By.cssSelector("button[type='submit']")),
                            loginError = $(By.id("login-email-error")),
                            passwordError = $(By.id("login-password-error")),
                            wrongCredentialsAlert = $(By.cssSelector("div.alert-danger"));

    public LoginPage() {
        open(Context.baseUrl);
    }

    public Dashboard submitLogin() {
        submitBtn.shouldBe(Condition.enabled).click();
        return page(Dashboard.class);
    }
}
