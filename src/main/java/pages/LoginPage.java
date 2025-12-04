package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    By userNameInput = By.id("inputUsername3");

    By passwordInput = By.cssSelector("#inputPassword3");
    By loginButton = By.xpath("/html/body/form/button");
    By welcomeMessage = By.id("validate");
    By errorMessage = By.id("errorMessage");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }



    public void setUserName(String userName){
        driver.findElement(userNameInput).sendKeys(userName);
    }

    public void setPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void login(){
        driver.findElement(loginButton).click();
    }

    public String getWelecomeMessage() {
      driver.findElement(passwordInput).click();
        return driver.findElement(welcomeMessage).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();

    }

    public void clearPassword() {
        driver.findElement(passwordInput).clear();
    }
    public void clearUser() {
        driver.findElement(userNameInput).clear();
    }
}
