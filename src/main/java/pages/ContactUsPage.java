package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    private WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By email = By.id("inputEmail4");
    private By address = By.id("inputAddress");
    private By state = By.id("State");
    private By topic = By.id("Topic");
    private By comment = By.id("comment");
    private By sendBtn = By.cssSelector("button[type='button']");

    public void setEmail(String value) {
        driver.findElement(email).sendKeys(value);
    }

    public void setAddress(String value) {
        driver.findElement(address).sendKeys(value);
    }

    public void setState(String value) {
        driver.findElement(state).sendKeys(value);
    }

    public void setTopic(String value) {
        driver.findElement(topic).sendKeys(value);
    }

    public void setComment(String value) {
        driver.findElement(comment).sendKeys(value);
    }

    public void clickSend() {
        driver.findElement(sendBtn).click();
    }
}
