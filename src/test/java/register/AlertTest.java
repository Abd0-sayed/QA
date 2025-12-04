package register;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import pages.AlertsPage;

import java.util.Base64;

public class AlertTest extends BaseTest {




    public void test(){
        AlertsPage alertsPage = homePage.clickAlertsLink();
        alertsPage.clickBtn1();
//        alertsPage.do32);


    }
}
