import PageObject.AuthorizationPage;
import PageObject.NavigationPage;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class AuthorizationPageTest {
    @After
    public void afterTest(){
        Selenide.closeWebDriver();
    }

    //Попытка авторизации пользователя с существующими логином и паролем и сравнение URL-адреса вкладки "Правообладатель"
    @Test
    public void authUser(){
        GeneralSettings.authUser();
        NavigationPage navigationPage = page(NavigationPage.class);
        navigationPage.clickNavBarButtonRightHolder();
        assertEquals(GeneralSettings.url + "reestr-element", url());
    }

    //Попытка авторизации пользователя с существующим логином, но не правильным паролем
    @Test
    public void authUserWithWrongPassword(){
        AuthorizationPage authorizationPage = open(GeneralSettings.url , AuthorizationPage.class);
        authorizationPage.login(GeneralSettings.LoginUser, GeneralSettings.incorrectPasswordUser);
        assertEquals("Неверный логин или пароль", authorizationPage.getTextElementError());
    }

    //Попытка авторизации пользователя с несуществующим логином и паролем
    @Test
    public void authUserWithWrongLogin(){
        AuthorizationPage authorizationPage = open(GeneralSettings.url , AuthorizationPage.class);
        authorizationPage.login(GeneralSettings.incorrectLoginUser, GeneralSettings.incorrectPasswordUser);
        assertEquals("Неверный логин или пароль", authorizationPage.getTextElementError());
    }
}
