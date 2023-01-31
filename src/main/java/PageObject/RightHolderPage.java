package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class RightHolderPage {

    //Кнопка "Редактировать" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using =".//button[@class='bars-button mat-button _mat-animation-noopable']")
    private SelenideElement buttonEditRightHolder;

}
