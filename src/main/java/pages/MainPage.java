package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By price = By.id("Price");
    private By deposit = By.id("Deposit");
    private By month = By.id("month");
    private By calculateBtn = By.xpath("//button[text()='Calculate']");
    private By answer = By.id("ans");

    public void setPrice(String value) {
        driver.findElement(price).sendKeys(value);
    }

    public void setDeposit(String value) {
        driver.findElement(deposit).sendKeys(value);
    }

    public void selectMonth(String value) {
        driver.findElement(month).sendKeys(value);
    }

    public void clickCalculate() {
        driver.findElement(calculateBtn).click();
    }

    public String getResult() {
        return driver.findElement(answer).getText().trim();
    }
}
