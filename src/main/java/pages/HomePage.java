package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPage clickRegisterLink(){
        clickLink("Register");
        return new RegisterPage(driver);
    }

    public AlertsPage clickAlertsLink(){
        clickLink("Practice Alerts");
        return new AlertsPage(driver);
    }

    private void clickLink(String link){
        driver.findElement(By.partialLinkText(link)).click();
    }
}
