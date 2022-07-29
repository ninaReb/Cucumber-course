package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep {
    @Given("I am at the Login page")
    public void i_am_at_the_login_page() {
        System.out.println("Given OK");

    }



    @When("I click the login button")
    public void i_click_the_login_button() {
        System.out.println("When 3 OK");
    }

    @Then("I should be at the home page")
    public void i_should_be_at_the_home_page() {
        System.out.println("Then OK");
    }


    @When("I fill the account Username textbox with value {string}")
    public void iFillTheAccountUsernameTextboxWithValue(String Username) {
        System.out.println(Username);
    }

    @And("I fill the password textbox with value {string}")
    public void iFillThePasswordTextboxWithValue(String Password) {
        System.out.println(Password);
    }
}
