import lombok.SneakyThrows;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    @SneakyThrows
    public void onTestFailure(ITestResult result) {
        AllureAttachments.screenshot();
    }
}
