import PageObject.AuthorizationPage;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class GeneralSettings {
    //URL кабинета балансодержателя
    final static String url = "http://localhost:8090/bh/";

    //Логин для пользователя ГБОУ"Алексеевская общеобразовательная школа интернат"
    final static String LoginUser = "3122004230";

    //Пароль для пользователя ГБОУ"Алексеевская общеобразовательная школа интернат"
    final static String PasswordUser = "11RsssfJ";

    //Несуществующий логин
    final static String incorrectLoginUser = "00a2004230";

    //Несуществующий пароль
    final static String incorrectPasswordUser = "122resjfJ";

    //метод авторизации в кабинете балансодержателя
    public static void authUser(){
        AuthorizationPage authorizationPage = open(url , AuthorizationPage.class);
        authorizationPage.login(LoginUser, PasswordUser);
    }
}
