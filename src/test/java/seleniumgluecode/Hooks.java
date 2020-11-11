package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browserManager.DriverManager;
import runner.browserManager.DriverManagerFactory;
import runner.browserManager.DriverType;

import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;

    private static int numberOfCase = 0;
    @Before
    public void setUp()
    {
        numberOfCase++;
        System.out.println("Se esta ejecutado el escenario Nro : " + numberOfCase );
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDonw()
    {
        System.out.println( "El escenario nro "+ numberOfCase + " se ejecuto correctamente.");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver()
    {
        return  driver;
    }

}
