package contacttests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import base.BaseTest;

public class ContactUsTests extends BaseTest {

    @Test
    public void emptyEmailShowsAlert() {
        driver.get("file:///D://Full-Stack Project//QA//QA-main//hqa//contactus.html");
        ContactUsPage contact = new ContactUsPage(driver);

        contact.clickSend();
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals(alertText, "Email is empty!");
        driver.switchTo().alert().accept();
    }
}
