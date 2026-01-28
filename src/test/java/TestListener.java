import com.codeborne.selenide.Screenshots;
import io.qameta.allure.Allure;
import lombok.SneakyThrows;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestListener implements ITestListener {

    @Override
    @SneakyThrows
    public void onTestFailure(ITestResult result) {

        Path screenshot = Screenshots.takeScreenShotAsFile().toPath();
        Allure.addAttachment(
                "Screenshot on failure",
                new ByteArrayInputStream(Files.readAllBytes(screenshot))
        );
    }
}
