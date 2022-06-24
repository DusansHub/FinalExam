package Test;

import Base.BaseTest;
import Pages.AlertsFramesWidnowsBrowserPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoQAAlertsFramesWindowsTests extends BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
    }

    @Test
    public void newTabTest() throws InterruptedException {
        //String browserWindowsURL = driver.getCurrentUrl();
        //System.out.println(browserWindowsURL);
        clickabilityWait(alertsFramesWidnowsBrowserPage.newTabButton);
        alertsFramesWidnowsBrowserPage.clickOnTheTabButton();
        visibilityWait(alertsFramesWidnowsBrowserPage.newTabMessage);
        Assert.assertTrue(alertsFramesWidnowsBrowserPage.newTabMessage.isDisplayed());
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterMethod() {
        driver.manage().deleteAllCookies();
    }
}
