package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RightHolderPage {

    //Кнопка "Редактировать" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using =".//button[@class='bars-button mat-button _mat-animation-noopable']")
    private SelenideElement buttonEditRightHolder;

    //Строковое поле "Бухгалтер" в окне редактирования
    //Double-поле "Данные о балансовой стоимости прочего движимого имущества, руб." в окне редактирования
    //Кнопка открытия календаря для поля "ОГРН - дата"
    //Кнопка выбора значения для поля "ОГРН - дата"
    //Кнопка отчищения поля ОГРН - дата
    //Кнопка выбора значения для справочника ОКВЭД
    //Кнопка отчищения поля-справочника ОКВЭД
    //Строка со значением для поля "Справочник ОКВЭД"
    //Кнопка "ОК" в окне выбора значения для поля "Справочник ОКВЭД"
    //Кнопка "Отмена" в окне выбора значения для поля "Справочник ОКВЭД"

    //Кнопка "Сохранить" в окне "Редактирование контрагента"
    @FindBy(how = How.XPATH, using =".//span[text()='Сохранить']")
    private SelenideElement buttonSaveWindowChangeRightHolder;

    //Кнопка "Закрыть" в окне "Редактирование контрагента"
    @FindBy(how = How.XPATH, using =".//span[text()='Закрыть']")
    private SelenideElement buttonCloseWindowChangeRightHolder;

    //Кнопка " X " для выхода из окна редактирования контрагента в правом верхнем углу
    @FindBy(how = How.XPATH, using =".//i[@class='far fa-times-circle']")
    private SelenideElement buttonExitWindowChangeRightHolder;

    //Кнопка "Архив документов" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using =".//button[@class='bars-button mat-button _mat-animation-noopable ng-star-inserted']")
    private SelenideElement buttonDocumentArchiveRightHolder;

    //Кнопка загрузить в окне "Архив документов"
    //Кнопка скачать в окне "Архив документов"
    //Кнопка удалить в окне "Архив документов"
    //Кнопка Закрыть в окне "Архив документов"
    //Кнопка " Х " в окне "Архив документов" в правом верхнем углу


    //Кнопка "История" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using =".//button[@class='bars-button history-icon mat-button _mat-animation-noopable']")
    private SelenideElement buttonHistoryRightHolder;

    //Кнопка "Отчёты" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using =".//button[@class='bars-button list-icon mat-button _mat-animation-noopable']")
    private SelenideElement buttonReportsRightHolder;

    //Кнопка "Окончание внесения изменений" на вкладке Правообладатель
    @FindBy(how = How.XPATH, using =".//button[@class='bars-button update-button mat-button _mat-animation-noopable']")
    private SelenideElement buttonEndOfChangesRightHolder;

    //Поле "Бухгалтер" на вкладке Правообладатель
    //Поле "Данные о балансовой стоимости прочего движимого имущества, руб." на вкладке Правообладатель
    //Поле "ОГРН - дата" на вкладке Правообладатель
    //Поле ОКВЭД на вкладке Правообладатель

}
