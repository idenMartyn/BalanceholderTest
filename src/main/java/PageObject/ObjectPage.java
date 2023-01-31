package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectPage {

    //Раздел Движимое имущество на вкладке Объекты
    @FindBy(how = How.XPATH, using = ".//div[text()=' Земельный участок ']")
    private SelenideElement inputLoginUser;

    //Кнопка добавление Объекта
    @FindBy(how = How.XPATH, using = ".//i[@class='fas fa-plus']")
    private SelenideElement buttonAddObject;
}
