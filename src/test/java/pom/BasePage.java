package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("No se pudo clikear sobre el elemto: " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            throw new Exception("No se pudo encontar el elemto: " + element);
        }
    }

    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se pudo encontar obtener el texto del Elemento : " + element);
        }
    }

    public String getTitle() throws Exception {

        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se puedo obtner el Titulo");
        }
    }

    public void type(String inputText, By locator) throws Exception {
        {

            try {
                driver.findElement(locator).sendKeys(inputText);
            } catch (Exception e) {
                throw new Exception("No se puedo obtener el Titulo");
            }
        }

    }

}