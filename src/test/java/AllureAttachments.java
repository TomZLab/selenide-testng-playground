import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class AllureAttachments {

    @Attachment(value = "Screenshot on failure", type = "image/png")
    public static byte[] screenshot() {
        return ((TakesScreenshot) getWebDriver())
                .getScreenshotAs(OutputType.BYTES);
    }
}
