package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    By emailFeild = By.xpath("//*[@id='email']");
    By fullNameFeild = By.id("fullName");
    By selectOption = By.tagName("select");
    By genderFeild = By.xpath("/html/body/div/form/input[4]");
    By terms = By.id("terms");
    By photoFeild = By.id("photo");
    By registerBtn = By.cssSelector("body > div > form > button");
    public  By backToHome = By.partialLinkText("Back to Home");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }


    public void setFullName(String fullName){
        driver.findElement(fullNameFeild).sendKeys(fullName);
    }
    public void setEmail(String email){
        driver.findElement(emailFeild).sendKeys(email);
    }
    public void selectOptionByValue(String option){
        Select selectElement = new Select(driver.findElement(selectOption));
        selectElement.selectByValue(option);

    }
    public void selectGender(){
        driver.findElement(genderFeild).click();

    }
public void selectTerms(){
    driver.findElement(terms).click();
    }


    public void uploadFile(String filePath){
        driver.findElement(photoFeild).sendKeys(filePath);

    }
    public void register(){
        driver.findElement(registerBtn).click();
    }
    public void backToHome(){
        driver.findElement(backToHome).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
}
