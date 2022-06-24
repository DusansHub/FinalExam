package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsFramesWidnowsBrowserPage extends BaseTest {
    public AlertsFramesWidnowsBrowserPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy (id="tabButton")
    WebElement newTabButton;
    public @FindBy (id="windowButton")
    WebElement newWindowButton;
    public @FindBy(id="messageWindowButton")
    WebElement newMessageWindowButton;
    public @FindBy (id="sampleHeading")
    WebElement newTabMessage;

    public void clickOnTheTabButton() {
        newTabButton.click();
    }

    public void clickOnTheWindowButton() {
        newWindowButton.click();
    }

    public void clickOnTheMessageWindowButton() {
        newMessageWindowButton.click();
    }
}
