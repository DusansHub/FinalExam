package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DemoQaElementsSectionTests extends BaseTest {

    public String fullName = "Dusan Orlovic";
    public String email = "dusandusan@dusan.com";
    public String currentAddress = "Cara Dusana 1";
    public String permanentAddress = "Cara Dusana 2";

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/elements");
    }

    @Test
    public void textBoxFunctionAssert() {
        clickabilityWait(elementsHomepagePage.textBox);
        elementsHomepagePage.clickOnTheTextBoxSection();
        visibilityWait(elementsHomepagePage.fullName);
        elementsHomepagePage.enterUsername(fullName);
        elementsHomepagePage.enterEmail(email);
        elementsHomepagePage.enterCurrentAddress(currentAddress);
        elementsHomepagePage.enterPermanentAddress(permanentAddress);
        clickabilityWait(elementsHomepagePage.submitButton);
        scrollToElement(elementsHomepagePage.submitButton);
        elementsHomepagePage.clickOnSubmitButton();

        WebElement output = driver.findElement(By.id("output"));
        visibilityWait(output);
        String submitMessage = output.getText();
        System.out.println(submitMessage);
        Assert.assertTrue(submitMessage.contains(fullName) && submitMessage.contains(email) && submitMessage.contains(currentAddress) && submitMessage.contains(permanentAddress));
    }

    @Test
    public void yesRadioButtonTest() {
        clickabilityWait(elementsRadioButtonPage.radioButtonElement);
        scrollToElement(elementsRadioButtonPage.radioButtonElement);
        elementsRadioButtonPage.clickOnTheRadioButtonsElement();
        clickElementJS(elementsRadioButtonPage.yesRadioButton);
        String yesLabel = driver.findElement(By.className("text-success")).getText();
        System.out.println(yesLabel);
        Assert.assertTrue(yesLabel.contains("Yes"));

    }

    @Test
    public void impressiveRadioButtonTest() {
        clickabilityWait(elementsRadioButtonPage.radioButtonElement);
        scrollToElement(elementsRadioButtonPage.radioButtonElement);
        elementsRadioButtonPage.clickOnTheRadioButtonsElement();
        elementsRadioButtonPage.clickOnImpressiveRadioButton();
        String impressiveLabel = driver.findElement(By.className("text-success")).getText();
        System.out.println(impressiveLabel);
        Assert.assertTrue(impressiveLabel.contains("Impressive"));
    }

    @Test
    public void webTablesNewInputTest() {

         String ime = excelReader.getStringData("Registration form", 0, 0);
         String prezime = excelReader.getStringData("Registration form", 1, 0);
         String imejl = excelReader.getStringData("Registration form", 2, 0);
         String god = String.valueOf(excelReader.getIntegerData("Registration form", 3, 0));
         String plata = String.valueOf(excelReader.getIntegerData("Registration form", 4, 0));
         String odeljenje = excelReader.getStringData("Registration form", 5, 0);

        clickabilityWait(elementsWebTablesPage.webTablesElement);
        scrollToElement(elementsWebTablesPage.webTablesElement);
        elementsWebTablesPage.clickOnWebTablesElement();
        clickabilityWait(elementsWebTablesPage.addButton);
        elementsWebTablesPage.clickOnAddButton();
        visibilityWait(elementsWebTablesPage.firstName);
        elementsWebTablesPage.enterFirstName(ime);
        elementsWebTablesPage.enterLastName(prezime);
        elementsWebTablesPage.enterEmail(imejl);
        elementsWebTablesPage.enterAge(god);
        elementsWebTablesPage.enterSalary(plata);
        elementsWebTablesPage.enterDepartment(odeljenje);
        clickabilityWait(elementsWebTablesPage.submitButton);
        elementsWebTablesPage.clickOnSubmitButton();
        List<WebElement> data = driver.findElements(By.className("rt-td"));
        for (WebElement singleData : data) {
            String str = "Dusan";
            String str2 = "Orlovic";
            if(str.equals(singleData.getText()) && str2.equals(singleData.getText())) {
                Assert.assertTrue(true);
                break;
            }
        }
    }

    @AfterMethod
    public void afterMethod() {
        driver.manage().deleteAllCookies();
    }
}
