package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsWebTablesPage extends BaseTest {
    public ElementsWebTablesPage() {
        PageFactory.initElements(driver, this);
    }
    public @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]/span")
    WebElement webTablesElement;
    public @FindBy (id="addNewRecordButton")
    WebElement addButton;
    public @FindBy (id="firstName")
    WebElement firstName;
    public @FindBy (id="lastName")
    WebElement lastName;
    public @FindBy (id="userEmail")
    WebElement email;
    public @FindBy (id="age")
    WebElement age;
    public @FindBy (id="salary")
    WebElement salary;
    public @FindBy (id="department")
    WebElement department;
    public @FindBy (id="submit")
    WebElement submitButton;

    public void clickOnWebTablesElement() {
        webTablesElement.click();
    }
    public void clickOnAddButton() {
        addButton.click();
    }
    public void enterFirstName(String name) {
        firstName.clear();
        firstName.sendKeys(name);
    }
    public void enterLastName(String surname) {
        lastName.clear();
        lastName.sendKeys(surname);
    }
    public void enterEmail(String email3) {
        email.clear();
        email.sendKeys(email3);
    }
    public void enterAge(String years) {
        age.clear();
        age.sendKeys(years);
    }
    public void enterSalary(String money) {
        salary.clear();
        salary.sendKeys(money);
    }
    public void enterDepartment(String apartment) {
        department.clear();
        department.sendKeys(apartment);
    }
    public void clickOnSubmitButton() {
        submitButton.click();
    }
}

