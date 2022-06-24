package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ElementsRadioButtonPage extends BaseTest {
        public ElementsRadioButtonPage() {
            PageFactory.initElements(driver, this);
        }

        public @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]/span")
        WebElement radioButtonElement;
        public @FindBy (id="yesRadio")
        WebElement yesRadioButton;

        public void clickOnTheRadioButtonsElement() {
            radioButtonElement.click();
        }
        public void clickOnYesRadioButton() {
            yesRadioButton.click();
        }
    public void clickOnImpressiveRadioButton() {
        List<WebElement> radioButtons = driver.findElements(By.cssSelector(".custom-control.custom-radio.custom-control-inline"));
        //wdwait.until(ExpectedConditions.visibilityOf(radioButtons));
        WebElement impressiveRadio = radioButtons.get(1);
        impressiveRadio.click();
    }
    }

