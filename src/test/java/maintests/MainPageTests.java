package maintests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import base.BaseTest;

public class MainPageTests extends BaseTest {

    @Test
    public void validEMICalculation() {
        driver.get("file:///D://Full-Stack Project//QA//QA-main//hqa//main.html"); 
        MainPage main = new MainPage(driver);

        main.setPrice("800000");
        main.setDeposit("200000");
        main.selectMonth("12");
        main.clickCalculate();

        Assert.assertNotEquals(main.getResult(), "0");
    }

    @Test
    public void priceEqualsDeposit() {
        driver.get("file:///D://Full-Stack Project//QA//QA-main//hqa//main.html");
        MainPage main = new MainPage(driver);

        main.setPrice("200000");
        main.setDeposit("200000");
        main.clickCalculate();

        Assert.assertEquals(main.getResult(), "Price must be Bigger than Deposit");
    }
}
