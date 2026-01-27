import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.FileAssert.fail;

@Listeners({AllureTestNg.class, TestListener.class})
public class SelenideLabTest extends BaseTest {

    @Test
    public void firstTest() {

        System.out.println("This is a sample selenide test.");

        open("https://google.com");
        $(By.xpath("//div[text()='Reject all']")).click();
        SelenideElement apps = $(By.xpath("//a[@href='https://www.google.pl/intl/en/about/products']"));
        SelenideElement addFiles = $(By.xpath("//button[@aria-label='Upload files or images']"));

        apps.hover();
        actions().moveByOffset(2, 2).pause(3000).build().perform();

        addFiles.hover();
        actions().moveByOffset(2, 2).pause(3000).perform();
        actions().click().perform();

        fail("screenshot test");
    }
}
