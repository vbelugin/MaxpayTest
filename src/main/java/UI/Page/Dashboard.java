package UI.Page;
import UI.Utils.Context;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class Dashboard {
    private SelenideElement setting = $(By.id("setting")),
            userName = $(By.xpath("//button[@id='setting']/following-sibling::ul[contains(@class,'dropdown-menu-right')]/li"));

    public Dashboard() {
        open(Context.baseUrl);
    }

    public Dashboard openSetting() {
        setting.should(Condition.appear).click();
        return page(this);
    }

    public void userNameShouldMatch(String login) {
        userName.shouldHave(Condition.text(login));
    }
}
