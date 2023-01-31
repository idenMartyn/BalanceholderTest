package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RightHolderPage {
    @FindBy(how = How.XPATH, using = ".//a[text()='Правообладатель']")
    private SelenideElement navBarButtonRightHolder;

    public void clickNavBarButtonRightHolder() {
        navBarButtonRightHolder.click();
    }
}
