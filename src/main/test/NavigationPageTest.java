import PageObject.AuthorizationPage;
import PageObject.NavigationPage;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertTrue;

public class NavigationPageTest {

    @Before
    public void beforeTest(){
        GeneralSettings.authUser();
    }

    @After
    public void afterTest(){
        Selenide.closeWebDriver();
    }

    //Переход на вкладку правообладатель
    @Test
    public void switchToTabRightHolder(){
        NavigationPage navigationPage = page(NavigationPage.class);
        navigationPage.clickNavBarButtonRightHolder();
        assertTrue(url().startsWith(GeneralSettings.url + "reestr-element"));
    }

    //Переход на вкладку объекты
    @Test
    public void switchToTabObjects(){
        NavigationPage navigationPage = page(NavigationPage.class);
        navigationPage.clickNavBarButtonObject();
        assertTrue(url().startsWith(GeneralSettings.url + "objects"));
    }

    //Переход на вкладку документы
    @Test
    public void switchToTabDocuments(){
        NavigationPage navigationPage = page(NavigationPage.class);
        navigationPage.clickNavBarButtonDocument();
        assertTrue(url().startsWith(GeneralSettings.url + "documents"));
    }

    //Выход из учётной записи
    @Test
    public void logout(){
        NavigationPage navigationPage = page(NavigationPage.class);
        navigationPage.clickNavBarButtonLogout();
        assertTrue(url().startsWith(GeneralSettings.url));
    }

}
