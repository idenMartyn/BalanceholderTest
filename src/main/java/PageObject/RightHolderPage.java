package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RightHolderPage {

    //--------------------Основные кнопки на вкладке Правообладатель--------------------
    //Кнопка "Редактировать" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using = ".//button[@class='bars-button mat-button _mat-animation-noopable']")
    private SelenideElement buttonEditInRightHolder;
    //Кнопка "Сохранить" в окне "Редактирование контрагента"
    @FindBy(how = How.XPATH, using = ".//span[text()='Сохранить']")
    private SelenideElement buttonSaveInWindowEditRightHolder;
    //Кнопка "Закрыть" в окне "Редактирование контрагента"
    @FindBy(how = How.XPATH, using = ".//span[text()='Закрыть']")
    private SelenideElement buttonCloseInWindowEditRightHolder;
    //Кнопка " X " для выхода из окна редактирования контрагента в правом верхнем углу
    @FindBy(how = How.XPATH, using = ".//i[@class='far fa-times-circle']")
    private SelenideElement buttonExitInWindowEditRightHolder;
    //Кнопка "История" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using = ".//button[@class='bars-button history-icon mat-button _mat-animation-noopable']")
    private SelenideElement buttonHistoryInRightHolder;
    //Кнопка "Отчёты" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using = ".//button[@class='bars-button list-icon mat-button _mat-animation-noopable']")
    private SelenideElement buttonReportsInRightHolder;
    //Кнопка "Окончание внесения изменений" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using = ".//button[@class='bars-button update-button mat-button _mat-animation-noopable']")
    private SelenideElement buttonEndOfChangesInRightHolder;

    //--------------------Архив документов--------------------
    //Кнопка "Архив документов" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using = ".//button[@ng-reflect-message='Архив документов']")
    private SelenideElement buttonDocumentArchiveInRightHolder;

    //Кнопка "Загрузить" в окне Архив документов
    @FindBy(how = How.XPATH, using = ".//button[@ng-reflect-message='Загрузить']")
    private SelenideElement buttonUploadInWindowDocumentArchive;

    //Кнопка "Выберите файл" во втором окне Архива документов
    @FindBy(how = How.XPATH, using = ".//label[text()='Выберите файл']")
    private SelenideElement buttonSelectFileInSecondWindowDocumentArchive;

    //Кнопка "ОК" во втором окне Архива документов
    @FindBy(how = How.XPATH, using = ".//span[text()='ОК ']")
    private SelenideElement buttonOkInSecondWindowDocumentArchive;


    //--------------------Бухгалтер--------------------
    //Строковое поле "Бухгалтер" в окне редактирования
    @FindBy(how = How.ID, using = "RCONTRAGENT_EDIT_ACCOUNTANT")
    private SelenideElement entryAccountantInWindowEdit;
    //Поле "Бухгалтер" на вкладке Правообладатель
    @FindBy(how = How.ID, using = "RCONTRAGENT_ACCOUNTANT")
    private SelenideElement entryAccountantInWindowRightHolderPage;


    //--------------------Данные о балансовой стоимости прочего движимого имущества, руб.--------------------
    //Double-поле "Данные о балансовой стоимости прочего движимого имущества, руб." в окне редактирования
    @FindBy(how = How.ID, using = "RCONTRAGENT_EDIT_OPOTHER")
    private SelenideElement entryOpotherInWindowEdit;
    //Поле "Данные о балансовой стоимости прочего движимого имущества, руб." на вкладке Правообладатель
    @FindBy(how = How.ID, using = "RCONTRAGENT_OPOTHER")
    private SelenideElement entryOpotherInRightHolderPage;

    //--------------------ОГРН-дата--------------------
    //Поле ОГРН - дата в окне редактирования
    @FindBy(how = How.ID, using = "RCONTRAGENT_EDIT_OGRN_DATE")
    private SelenideElement entryOGRNDateInWindowEdit;

    //Кнопка открытия календаря "ОГРН - дата" в окне редактирования
    @FindBy(how = How.XPATH, using = ".//input[@id='RCONTRAGENT_EDIT_OGRN_DATE']/parent::div/div/button[@title='Открыть календарь']")
    private SelenideElement calendarInAttributeOGRNDateInWindowEdit;

    //Кнопка отчищения поля ОГРН - дата в окне редактирования
    @FindBy(how = How.XPATH, using = ".//input[@id='RCONTRAGENT_EDIT_OGRN_DATE']/parent::div/div/button[@title='Очистить']")
    private SelenideElement clearValueInAttributeOGRNDateInWindowEdit;

    //Поле "ОГРН - дата" на вкладке Правообладатель
    @FindBy(how = How.ID, using = "RCONTRAGENT_OGRN_DATE")
    private SelenideElement entryOGRNDateInRightHolderPage;

    //--------------------ОКВЭД--------------------
    //Кнопка выбора значения для справочника ОКВЭД в окне редактирования
    @FindBy(how = How.XPATH, using = ".//input[@id='RCONTRAGENT_EDIT_OKVED']/parent::div/div/button[@title='Открыть справочник']")
    private SelenideElement selectInAttributeOKVEDInWindowEdit;

    //Строка со значением для поля "Справочник ОКВЭД" в окне редактирования
    @FindBy(how = How.XPATH, using = ".//span[text()='Деятельность в области права и бухгалтерского учета']/parent::span/parent::div/parent::div")
    private SelenideElement valueForOKVEDInWindowEdit;

    //Кнопка "ОК" в окне выбора значения для поля "Справочник ОКВЭД"
    @FindBy(how = How.XPATH, using = ".//button[text()='ОК']")
    private SelenideElement buttonOkForOKVEDInWindowEdit;

    // Поле ОКВЭД на вкладке Правообладатель
    @FindBy(how = How.ID, using = "RCONTRAGENT_OKVED")
    private SelenideElement entryOKVEDInRightHolderPage;

    //Кнопка отчищения поля-справочника ОКВЭД в окне редактирования
    //Кнопка "Отмена" в окне выбора значения для поля "Справочник ОКВЭД"


    //--------------------методы--------------------
    //Нажатие на основные кнопки
    //метод нажатия на кнопку "Редактировать"
    public void clickButtonEditRightHolder() {
        buttonEditInRightHolder.click();
    }

    //метод нажатия на кнопку "сохранить" в окне "Редактирование контрагента"
    public void clickButtonSaveWindowChangeRightHolder() {
        buttonSaveInWindowEditRightHolder.click();
    }


    //--------------------взаимодействие с атрибутом "Бухгалтер"--------------------
    //метод ввода значения в поле "Бухгалтер" в окне "Редактирование контрагента"
    public void setEntryAccountantInWindowEdit(String value) {
        entryAccountantInWindowEdit.setValue(value);
    }

    //метод получения значения из атрибута "Бухгалтер" на вкладке правообладатель
    public String getValueAccountantInWindowRightHolder() {
        return entryAccountantInWindowRightHolderPage.getValue();
    }


    //--------------------взаимодействие с атрибутом "Данные о балансовой стоимости прочего движимого имущества, руб."--------------------
    //метод получения значения из атрибута "Данные о балансовой стоимости прочего движимого имущества, руб." на вкладке правообладатель
    public String getValueOpotherInWindowRightHolder() {
        return entryOpotherInRightHolderPage.getValue();
    }

    //метод ввода значения в поле "Данные о балансовой стоимости прочего движимого имущества, руб." в окне "Редактирование контрагента"
    public void setEntryOpotherInWindowEdit(String value) {
        entryOpotherInWindowEdit.setValue(value);
    }


    //--------------------взаимодействие с атрибутом "ОГРН-дата"--------------------
    //Метод добавления значения в поле "ОГРН - дата" в окне редактирования
    public void setValueOGRN(String value) {
        entryOGRNDateInWindowEdit.setValue(value);
    }

    //метод получения значения из поля "ОГРН-дата" на вкладке Правообладатель
    public String getValueOGRN() {
        return entryOGRNDateInRightHolderPage.getValue();
    }


    //--------------------взаимодействие с атрибутом "ОКВЭД"--------------------
    //Метод открытия списка значений для Справочника ОКВЭД
    public void clickSelectInAttributeOKVEDInWindowEdit() {
        selectInAttributeOKVEDInWindowEdit.click();
    }

    //Метод выбора значения в справочнике ОКВЭД
    public void clickValueForOKVEDInWindowEdit() {
        valueForOKVEDInWindowEdit.click();
    }

    //Метод нажатия на кнопку "ОК" в Справочнике ОКВЭД
    public void clickButtonOkForOKVEDInWindowEdit() {
        buttonOkForOKVEDInWindowEdit.click();
    }

    //Метод получения значения из атрибута "Справочник ОКВЭД"
    public String getValueForeOKVEDInRightHolderPage() {
        return entryOKVEDInRightHolderPage.getText();
    }

    //------------------------Взаимодействие с архивом документов------------------------------
    //Метод нажатия на кнопку "Архив документов"
    public void clickButtonDocumentArchiveInRightHolder() {
        buttonDocumentArchiveInRightHolder.click();
    }

    //Метод нажатия на кнопку "Загрузить" (Загрузка файла на сервер в первом окне) в окне Архив документов
    public void clickButtonUploadInWindowDocumentArchive() {
        buttonUploadInWindowDocumentArchive.click();
    }

    //Метод нажатия на кнопку "Выберите файл" во втором окне Архива документов
    public void clickButtonSelectFileInSecondWindowDocumentArchive() {
        buttonSelectFileInSecondWindowDocumentArchive.click();
    }

    //Метод нажатия на кнопку "ОК" во втором окне Архива документов
    public void clickButtonOkInSecondWindowDocumentArchive(){
        buttonOkInSecondWindowDocumentArchive.click();
    }


}
