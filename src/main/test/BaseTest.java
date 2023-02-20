import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {
    @Before
    public void beforeTest(){
        GeneralSettings.authUser();
    }

    @After
    public void afterTest(){
        Selenide.closeWebDriver();
    }
}
