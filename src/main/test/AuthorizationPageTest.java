import PageObject.AuthorizationPage;
import PageObject.NavigationPage;
import PageObject.RightHolderPage;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class AuthorizationPageTest {

    //URL кабинета балансодержателя
    final String url = "http://localhost:4200/bh/";

    //Логин для пользователя ГБОУ"Алексеевская общеобразовательная школа интернат"
    final String LoginUser = "3122004230";

    //Пароль для пользователя ГБОУ"Алексеевская общеобразовательная школа интернат"
    final String PasswordUser = "11RsssfJ";

    //Несуществующий логин
    final String incorrectLoginUser = "00a2004230";

    //Несуществующий пароль
    final String incorrectPasswordUser = "122resjfJ";

    //Попытка авторизации пользователя с существующими логином и паролем и сравнение URL-адреса вкладки "Правообладатель"
    @Test
    public void authUser(){
        AuthorizationPage authorizationPage = open(url , AuthorizationPage.class);
        Configuration.holdBrowserOpen = true;
        authorizationPage.login(LoginUser, PasswordUser);
        NavigationPage navigationPage = page(NavigationPage.class);
        navigationPage.clickNavBarButtonRightHolder();
        assertEquals("http://localhost:4200/bh/reestr-element", url());
    }

    //Попытка авторизации пользователя с существующим логином, но не правильным паролем
    @Test
    public void authUserWithWrongPassword(){
        AuthorizationPage authorizationPage = open(url , AuthorizationPage.class);
        authorizationPage.login(LoginUser, incorrectPasswordUser);
        assertEquals("Неверный логин или пароль", authorizationPage.getTextElementError());
    }

    //Попытка авторизации пользователя с несуществующим логином и паролем
    @Test
    public void authUserWithWrongLogin(){
        AuthorizationPage authorizationPage = open(url , AuthorizationPage.class);
        authorizationPage.login(incorrectLoginUser, incorrectPasswordUser);
        assertEquals("Неверный логин или пароль", authorizationPage.getTextElementError());
    }
}
