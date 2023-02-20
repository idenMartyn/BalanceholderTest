import PageObject.RightHolderPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import java.util.Locale;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class RightHolderPageTest extends BaseTest{

    //Генерация рандомной строки для заполнения поля "Бухгалтер"
    String accountant = RandomStringUtils.randomAlphabetic(10);

    //Генерация рандомного числа для заполнения поля "Данные о балансовой стоимости прочего движимого имущества, руб."
    Double opother = Math.random() * 1000;

    //Редактирование поля Бухгалтер и проверка этого же поля на вкладке Правообладатель
    @Test
    public void setValueAccountant(){
        RightHolderPage rightHolderPage = page(RightHolderPage.class);
        rightHolderPage.clickButtonEditRightHolder();
        rightHolderPage.setEntryAccountantInWindowEdit(accountant);
        rightHolderPage.clickButtonSaveWindowChangeRightHolder();
        sleep(3_000);
        assertEquals(accountant, rightHolderPage.getValueAccountantInWindowRightHolder());
    }

    //Редактирование поля "Данные о балансовой стоимости прочего движимого имущества, руб." и проверка этого же поля на вкладке Правообладатель
    @Test
    public void setValueOpother(){
        RightHolderPage rightHolderPage = page(RightHolderPage.class);
        rightHolderPage.clickButtonEditRightHolder();
        rightHolderPage.setEntryOpotherInWindowEdit(opother.toString());
        rightHolderPage.clickButtonSaveWindowChangeRightHolder();
        sleep(3_000);
        opother = Math.floor(opother*100)/100.0;
        assertEquals(String.format(Locale.ROOT,"%.2f", opother), rightHolderPage.getValueOpotherInWindowRightHolder());
    }

    //Редактирование поля "ОГРН-дата" и проверка этого же поля на вкладке Правообладатель
    @Test
    public void setValueOGRNDate(){
        RightHolderPage rightHolderPage = page(RightHolderPage.class);
        rightHolderPage.clickButtonEditRightHolder();
        rightHolderPage.setValueOGRN("01.01.2022");
        rightHolderPage.clickButtonSaveWindowChangeRightHolder();
        sleep(3_000);
        assertEquals("01.01.2022", rightHolderPage.getValueOGRN());
    }

    //Редактирование поля "ОКВЭД" и проверка этого же поля на вкладке Правообладатель
    @Test
    public void setValueOKVED(){
        RightHolderPage rightHolderPage = page(RightHolderPage.class);
        rightHolderPage.clickButtonEditRightHolder();
        rightHolderPage.clickSelectInAttributeOKVEDInWindowEdit();
        rightHolderPage.clickValueForOKVEDInWindowEdit();
        rightHolderPage.clickButtonOkForOKVEDInWindowEdit();
        sleep(3_000);
        assertEquals("Деятельность в области права и бухгалтерского учета", rightHolderPage.getValueForeOKVEDInRightHolderPage());
    }
}
