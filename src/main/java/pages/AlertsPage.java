package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    WebDriver webDriver;

    By btn1 = By.id("btn1");

    public AlertsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickBtn1(){
        webDriver.findElement(btn1).click();
    }
}
