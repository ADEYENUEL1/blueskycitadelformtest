package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registrationpageobject {
    public registrationpageobject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "nf-field-26")
    private WebElement firstname;

    @FindBy(how = How.NAME, using = "lname")
    private WebElement lastname;

    @FindBy(how = How.ID, using = "nf-field-28")
    private WebElement email;

    @FindBy(how = How.ID, using = "nf-field-29")
    private WebElement emailconfirmation;

    @FindBy(how = How.ID, using = "nf-field-30")
    private WebElement gender;

    @FindBy(how = How.NAME, using = "nf-field-31")
    private WebElement age;
    @FindBy(how = How.ID, using = "nf-field-39")
    private WebElement singlecheckbox;

   @FindBy(how = How.ID, using = "nf-field-41")
   private WebElement multiselect;

    @FindBy(how = How.ID, using = "nf-field-40-1")
    private WebElement checkbox;

   @FindBy(how = How.CSS, using = "#nf-label-class-field-42-0")
   private WebElement radiolist;

   @FindBy(how = How.ID, using = "nf-field-43")
   private WebElement selecttext;

   @FindBy(how = How.NAME, using = "address")
    private WebElement address;

   @FindBy(how = How.ID, using = "nf-field-37")
   private WebElement submit;

   public void ClickSubmitButton()
   {
       submit.click();
   }
    public void EnterAddress()
    {
        address.sendKeys("9 Crabtree Place Sheffield");
    }

    public void ClickSelect()
    {
        new Select(selecttext).selectByVisibleText("Three");
    }
    public void ClickRadioList()
    {
        radiolist.click();
    }
    public void SelectMultiSelect()
    {
        new Select(multiselect).selectByValue("one");
        new Select(multiselect).selectByValue("two");
    }

    public void ClickCheckBox()
    {
        checkbox.click();
    }

    public void ClickSingleCheckBox()
    {
        singlecheckbox.click();
    }

    public void SelectAge()
    {
        age.click();
    }



    public void EnterGender()

    {
        gender.sendKeys();
    }


    public void EnterEmailConfirmation()
    {
        emailconfirmation.sendKeys("olumuyee@gmail.com");
    }



    public void EnterEmail()
    {
        email.sendKeys("olumuyee@gmail.com");
    }


    public void EnterFirstname()
    {
        firstname.sendKeys("muyiwa");
    }

    public void EnterLastname()
    {
        lastname.sendKeys("Babatunde");
    }


}
