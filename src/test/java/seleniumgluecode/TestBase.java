package seleniumgluecode;
import org.openqa.selenium.WebDriver;
import pom.*;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    protected Login login = new Login(driver);
    protected PostForCreation postForCreation = new PostForCreation(driver);
    protected PostForUpdate postForUpdate = new PostForUpdate(driver);

}
