package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;


public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///G:/QA/tst pr/hqa/index.html");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
