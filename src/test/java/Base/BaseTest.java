package Base;

import Pages.AlertsFramesWidnowsBrowserPage;
import Pages.ElementsRadioButtonPage;
import Pages.ElementsWebTablesPage;
import Pages.ElementspagePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public ElementspagePage elementsHomepagePage;
    public ElementsRadioButtonPage elementsRadioButtonPage;
    public ElementsWebTablesPage elementsWebTablesPage;
    public AlertsFramesWidnowsBrowserPage alertsFramesWidnowsBrowserPage;

    @BeforeClass
    public void beforeClass() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\HP\\Desktop\\finalTest.xlsx");
        elementsHomepagePage = new ElementspagePage();
        elementsRadioButtonPage = new ElementsRadioButtonPage();
        elementsWebTablesPage = new ElementsWebTablesPage();
        alertsFramesWidnowsBrowserPage = new AlertsFramesWidnowsBrowserPage();
    }

    public void visibilityWait(WebElement e) {
        wdwait.until(ExpectedConditions.visibilityOf(e));
    }

    public void clickabilityWait(WebElement e) {
        wdwait.until(ExpectedConditions.elementToBeClickable(e));
    }

    public void scrollToElement(WebElement e) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", e);

    }

    public void clickElementJS(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    }

    @AfterClass
    public void afterClass() {
        driver.close();
        driver.quit();
    }
}
