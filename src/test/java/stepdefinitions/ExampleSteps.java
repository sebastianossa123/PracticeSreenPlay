package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.Login;
import userinterfaces.HomePage;

public class ExampleSteps {


    @Managed(driver = "chrome" )
    private WebDriver navegador;
    private Actor actor = Actor.named("Sebastian");
    private HomePage homePage = new HomePage();


    @Given("^that a new customer accesses the purchasing website$")
    public void thatANewCustomerAccessesThePurchasingWebsite() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
        navegador.manage().window().maximize();


    }


    @When("^the person is in the users menu$")
    public void thePersonIsInTheUsersMenu() {
       actor.wasAbleTo(
               Login.login()
       );

    }

    @Then("^he sees the products listed in the page$")
    public void heSeesTheProductsListedInThePage() {

    }

}
