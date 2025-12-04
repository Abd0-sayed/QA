package register;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {


    @Test()
    public void register()  {
        RegisterPage registerPage = homePage.clickRegisterLink();
        registerPage.setFullName("Hagar");
        registerPage.setEmail("test@test.com");
        registerPage.selectTerms();
        registerPage.selectGender();
        registerPage.selectOptionByValue("CA");
        registerPage.uploadFile("C:/Users/pc/Desktop/hagar/2006.xlsx");
        registerPage.register();
        Assert.assertEquals(registerPage.getAlertText(),"Registration Successful!");
        registerPage.acceptAlert();
        registerPage.backToHome();
    }

}
