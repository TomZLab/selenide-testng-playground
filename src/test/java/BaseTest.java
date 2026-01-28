import com.codeborne.selenide.Configuration;
import io.qameta.allure.testng.AllureTestNg;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({AllureTestNg.class, TestListener.class})
public abstract class BaseTest {

    @BeforeSuite
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.reportsFolder = "target/selenide-reports";
    }
}
