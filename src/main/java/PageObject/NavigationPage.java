package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class NavigationPage {
    //Вкладка Правообладатель в меню навигации
    @FindBy(how = How.XPATH, using =".//a[text()='Правообладатель']")
    SelenideElement navBarButtonRightHolder;

    //Вкладка Объекты в меню навигации
    @FindBy(how = How.XPATH, using =".//a[text()='Объекты']")
    SelenideElement navBarButtonObject;

    //Вкладка Документы в меню навигации
    @FindBy(how = How.XPATH, using =".//a[text()='Документы']")
    SelenideElement navBarButtonDocument;

    //Кнопка справка
    @FindBy(how = How.XPATH, using =".//span[text()=' Справка ']")
    SelenideElement navBarButtonReference;

    //Кнопка выход
    @FindBy(how = How.XPATH, using =".//span[text()=' Выход ']")
    SelenideElement navBarButtonLogout;

    //Нажатие на вкладку "Правообладатель" в меню навигации
    public void clickNavBarButtonRightHolder() {
        navBarButtonRightHolder.click();
    }

    //Нажатие на вкладку "Объекты" в меню навигации
    public void clickNavBarButtonObject() {
        navBarButtonObject.click();
    }

    //Нажатие на вкладку "Документы" в меню навигации
    public void clickNavBarButtonDocument() {
        navBarButtonDocument.click();
    }

    //Нажатие на кнопку "Справка" в меню навигации
    public void clickNavBarButtonReference() {
        navBarButtonReference.click();
    }

    //Нажатие на кнопку "Выход" в меню навигации
    public void clickNavBarButtonLogout() {
        navBarButtonLogout.click();
    }
}
