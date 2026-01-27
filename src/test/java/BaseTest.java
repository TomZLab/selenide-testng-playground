import com.codeborne.selenide.Configuration;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({AllureTestNg.class, TestListener.class})
public class BaseTest {

    @BeforeSuite
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.screenshots = false;
    }
}
