package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthorizationPage {

    //Поле ввода логина
    @FindBy(how = How.ID, using = "username")
    private SelenideElement inputLoginUser;

    //Поле ввода пароля
    @FindBy(how = How.ID, using = "password")
    private SelenideElement inputPasswordUser;

    //Кнопка "Вход"
    @FindBy(how = How.XPATH, using = ".//span[text()='Вход']")
    private SelenideElement signInButton;

    //Всплывающий элемент с ошибкой при вводе неверного логина или пароля
    @FindBy(how = How.XPATH, using = ".//div[@class='bars-error-panel ng-star-inserted']")
    private SelenideElement elementError;

    //Метод ввода логина
    public void setLoginUser(String loginUser) {
        this.inputLoginUser.setValue(loginUser);
    }

    //Метод ввода пароля
    public void setPasswordUser(String passwordUser) {
        this.inputPasswordUser.setValue(passwordUser);
    }

    //Метод нажатия на кнопку входа
    public void clickSignInButton(){
        signInButton.click();
    }

    //Метод авторизации в балансодержателе
    public void login(String loginUser, String passwordUser){
        setLoginUser(loginUser);
        setPasswordUser(passwordUser);
        clickSignInButton();
    }

    //Метод возвращающий текст ошибки
    public String getTextElementError(){
        return elementError.getText();
    }

}
