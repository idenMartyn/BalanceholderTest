import PageObject.AuthorizationPage;
import PageObject.RightHolderPage;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class RightHolderPageTest {

    //Генерация рандомной строки для заполнения поля "Бухгалтер"
    String accountant = RandomStringUtils.randomAlphabetic(10);

    @Before
    public void beforeTest(){
        GeneralSettings.authUser();
    }

    @After
    public void afterTest(){
        Selenide.closeWebDriver();
    }

    //Редактирование поля Бухгалтер и проверка этого же поля на вкладке Правообладатель
    @Test
    public void setValueAccountant(){
        RightHolderPage rightHolderPage = page(RightHolderPage.class);
        rightHolderPage.clickButtonEditRightHolder();
        rightHolderPage.setEntryAccountantInWindowEdit(accountant);
        rightHolderPage.clickButtonSaveWindowChangeRightHolder();
        sleep(3_000);
        assertEquals(rightHolderPage.getValueAccountantInWindowRightHolder(), accountant);
    }
}
