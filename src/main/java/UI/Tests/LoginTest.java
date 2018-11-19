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
                .assertLoginError();
        }

    @Test
    public void shouldShowErrorIfEmptyPass() {
        new LoginPage()
                .passOnlyLogin(Context.login)
                .submitLoginWithError()
                .assertPasswordError();
    }

    @Test
    public void shouldShowErrorIfWrongCredentials() {
        new LoginPage()
                .passCredentials("random@email.com", "Random123+")
                .submitLoginWithError()
                .assertWrongCredentialsAlert();
    }
}
