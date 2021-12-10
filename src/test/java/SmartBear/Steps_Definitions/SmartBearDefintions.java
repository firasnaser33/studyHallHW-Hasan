package SmartBear.Steps_Definitions;

import SmartBear.Pages.LogIn;
import SmartBear.Pages.OrderPage;
import SmartBear.Util.ConfigurationsReader;
import SmartBear.Util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.logging.Log;

public class SmartBearDefintions {


    LogIn logIn= new LogIn();
    OrderPage orderPage= new OrderPage();

    @Given("The user wants to login Smartbear")
    public void the_user_wants_to_login_smartbear() {
       // Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
        logIn.setUsername();
        logIn.setPasswordBox();
        logIn.setLoginButton();



    }
    @Then("The user wants to go order page")
    public void the_user_wants_to_go_order_page() {
        orderPage.clickOrderModule();


    }
    @Then("The user wants to enter product info as {string} and {string}")
    public void the_user_wants_to_enter_product_info_as_and(String string, String string2) {
        orderPage.selectProduct(string);
        orderPage.setQuantityBox(string2);

    }
    @Then("The user wants to enter address info as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_address_info_as_and_and_and_and(String cname, String street, String city, String state, String zip) {
        orderPage.addressInfo(cname,street,city,state,zip);

    }
    @Then("The user wants to enter payment information as {string} and {string} and {string}")
    public void the_user_wants_to_enter_payment_information_as_and_and(String cardType, String cardnumber, String exp) {
        orderPage.paymentInfo(cardType,cardnumber, exp);

    }


}
