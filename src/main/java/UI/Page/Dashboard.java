package UI.Page;
import UI.Context;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Dashboard {
    public SelenideElement setting = $(By.id("setting")),
            userName = $(By.xpath("//button[@id='setting']/following-sibling::ul[contains(@class,'dropdown-menu-right')]/li"));

    public Dashboard() {
        open(Context.baseUrl);
    }

    public void openSetting() {
        setting.click();
    }
}
