package SmartBear.Pages;

import SmartBear.Util.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class OrderPage {

        public OrderPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(linkText = "Order")
        private WebElement orderModule;

        @FindBy (xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
        private WebElement productDropDown;

        @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
        private WebElement quantityBox;

        @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
        private WebElement customerNameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement StreetBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement CityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement StateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zipCodeBox;


    @FindBy (xpath = "(//ol)[3]//li//tr")
    private WebElement selectCardType;

    @FindBy(id ="ctl00_MainContent_fmwOrder_TextBox6" )
    private WebElement cardNbox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;



    public void paymentInfo (String cardType, String cBox, String expBox1){

        for (int i=0; i<3 ; i ++){
            if (selectCardType.getText().contains(cardType)){
                selectCardType.click();

            }
            System.out.println(selectCardType.getText());
        }




        cardNbox.sendKeys(cBox);
        expBox.sendKeys(expBox1);
        processButton.click();


    }


    public void addressInfo(String customerName, String street, String city, String state, String zip){
        customerNameBox.sendKeys(customerName);
        StreetBox.sendKeys(street);
        CityBox.sendKeys(city);
        StateBox.sendKeys(state);
        zipCodeBox.sendKeys(zip);
    }

        public void setQuantityBox(String quantity){
            quantityBox.sendKeys(Keys.BACK_SPACE);
            quantityBox.sendKeys(quantity);
        }

        public void selectProduct(String producttt){
            Select prodcut = new Select(productDropDown);
            prodcut.selectByValue(producttt);
        }

        public void clickOrderModule() {
            orderModule.click();
        }

}
