package stepdefs;

import PageObject.registrationpageobject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BlueSkyTestForm {

    public WebDriver driver;
    public registrationpageobject registration;

    @Given("^I navigate to Blueskycitadel test form$")
    public void iNavigateToBlueskycitadelTestForm()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        registration = new registrationpageobject(driver);
        driver.get("http://blueskycitadel.com/test-form-for-bluesky-automation-training/");
    }

    @When("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String arg0) throws Throwable
    {
        registration.EnterFirstname();
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String arg0) throws Throwable
    {
        registration.EnterLastname();
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) throws Throwable
    {
        registration.EnterEmail();
    }
    @And("^I enter confirm my email \"([^\"]*)\"$")
    public void iEnterConfirmMyEmail(String arg0) throws Throwable
    {
        registration.EnterEmailConfirmation();
    }

    @And("^I enter Gender \"([^\"]*)\"$")
    public void iEnterGender(String arg0) throws Throwable
    {
        registration.EnterGender();
    }

    @And("^I select age (\\d+) - (\\d+)$")
    public void iSelectAge(int arg0, int arg1)
    {
        registration.SelectAge();
    }

    @And("^I select single check box$")
    public void iSelectSingleCheckBox()
    {
        registration.ClickSingleCheckBox();
    }

    @And("^I select Two under from check box list$")
    public void iSelectTwoUnderFromCheckBoxList()
    {
        registration.ClickSingleCheckBox();
    }

    @And("^I select Three from Multi - select$")
    public void iSelectThreeFromMultiSelect()
    {
        registration.SelectMultiSelect();
    }

    @And("^I click One from  radio list$")
    public void iClickOneFromRadioList()
    {
        registration.ClickRadioList();
    }


    @And("^I click three from select$")
    public void iClickThreeFromSelect()
    {
        registration.ClickSelect();
    }

    @And("^I enter address$")
    public void iEnterAddress()
    {
        registration.EnterAddress();
    }

    @And("^I click on submit button$")
    public void iClickOnSubmitButton()
    {
        registration.ClickSubmitButton();
    }

    @Then("^I am registered$")
    public void iAmRegistered() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"nf-form-4-cont\"]")).getText(),"Your form has been successfully submitted.");
       // Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"nf-form-4-cont\"]")).getText(), "Your form has been successfully submitted");
    }


}
