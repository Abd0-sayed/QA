package login;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {



    @DataProvider(name = "validLoginData")
    public Object[][] validData(){
        return new Object[][]{
                {"user1","pass123"}
        };
    }
    @DataProvider(name = "inValidLoginData")
    public Object[][] inValidData(){
        return new Object[][]{
                {"hagar","admin"},{"user1","admin13"},{"","pass123"},{"user1",""}
        };
    }

    @Test(dataProvider = "validLoginData")
    public void testSuccessfulLogin(String userName , String pasaword){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clearPassword();
        loginPage.setPassword(pasaword);
        loginPage.clearUser();
        loginPage.setUserName(userName);
        loginPage.login();
        //Assert.assertTrue(loginPage.getWelecomeMessage().contains(userName));
        String welcomeMessage = loginPage.getWelecomeMessage();
        Assert.assertEquals(welcomeMessage,"Successful login");
    }

    @Test(dataProvider = "inValidLoginData")
    public void testInValidLogin(String userName , String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clearUser();
        loginPage.clearPassword();
        loginPage.setPassword(password);

        loginPage.setUserName(userName);
        loginPage.login();
        String errorMessage = loginPage.getWelecomeMessage();
        Assert.assertEquals(errorMessage,"Wrong username or password");
    }
}
