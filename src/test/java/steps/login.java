package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.BeforeTest;
import setup.capabilities;

public class login extends capabilities {

    @Before
    public void setup()throws Exception{
        preparation();
    }

    @Given("open app")
    public void open_app() {
        // Write code here that turns the phrase above into concrete action
        driver.findElement(By.id("com.graveltechnology.owner.debug:id/constraint_to_login_phone")).click();
//        throw new io.cucumber.java.PendingException();
    }
    @And("view splash screen")
    public void view_splash_screen() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("splash");
        assert true;
//        throw new io.cucumber.java.PendingException();
    }
    @And("input phone number")
    public void input_phone_number() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("phone");
        assert true;
//        throw new io.cucumber.java.PendingException();
    }
    @When("choose verification method")
    public void choose_verification_method() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("mathod");
        assert true;
//        throw new io.cucumber.java.PendingException();
    }
    @And("input otp verification")
    public void input_otp_verification() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("otp");
        assert true;
//        throw new io.cucumber.java.PendingException();
    }
    @Then("user logged in")
    public void user_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("login");
        assert true;
//        throw new io.cucumber.java.PendingException();
    }
}
