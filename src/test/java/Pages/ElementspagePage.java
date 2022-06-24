package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ElementspagePage extends BaseTest {
    public ElementspagePage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span")
    WebElement textBox;
    public @FindBy (id="userName")
    WebElement fullName;
    public @FindBy (id="userEmail")
    WebElement email;
    public @FindBy (id="currentAddress")
    WebElement currentAddress;
    public @FindBy (id="permanentAddress")
    WebElement permanentAddress;
    public @FindBy (id="submit")
    WebElement submitButton;

    public void clickOnTheTextBoxSection() {
        textBox.click();
    }
    public void enterUsername(String userName) {
        fullName.clear();
        fullName.sendKeys(userName);
    }

    public void enterEmail(String mail) {
        email.clear();
        email.sendKeys(mail);
    }

    public void enterCurrentAddress(String currAddr) {
        currentAddress.clear();
        currentAddress.sendKeys(currAddr);
    }

    public void enterPermanentAddress(String permAddr) {
        permanentAddress.clear();
        permanentAddress.sendKeys(permAddr);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
}
