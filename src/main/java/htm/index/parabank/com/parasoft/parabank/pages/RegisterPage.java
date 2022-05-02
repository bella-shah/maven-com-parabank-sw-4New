package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By clickRegLink =By.xpath("//a[@contains(text(),'Register']");
    By verifyText = By.className("title");
    By firstNamefield = By.id("Customer.firstname");
    By lastNamefield =By.id("customer.lastName");
    By Addressfield = By.id("customer.address.city");
    By cityfield = By.id("customer.address.city");
    By satatefield =By.id("customer.address.state");
    By ZipCode =By.id("customer. address..zipCode");
    By phone = By.id ("customer PhoneNumber");
    By ssn = By.id ("customer ssn");
    By userName = By.id("customer.userName");
    By password =By.id("customer password");
    By confirmPassword = By.id("repeatedPassword");
    By clickRegButtton =By.xpath("//tbody//tr[13]/td[2]/input[1]");
    By verifyTextforSuccess =By.xpath("// p[contains(text),'your account was created successfullyyou are now']");
    public void clickOnRegisterLink(){
        clickOnElement(clickRegLink);
    }
    public String TheSignInUpiseasy() {
     return getTextFromElement(verifyText);
    }
    public void enterFirstName(String firstname){
        sendTextToElement(firstNamefield,firstname);
    }
    public void enterLastName(String lastname) {
        sendTextToElement(lastNamefield, lastname);
    }
    public void enterAddressfield(String address) {
        sendTextToElement(Addressfield, address);
    }
    public void enterstatefieldfield(String Statefield) {
        sendTextToElement(satatefield, Statefield);
    }
    public void enterCityfield(String city) {
        sendTextToElement(cityfield, city);
    }
    public void enterzipfield(String zipcode) {
        sendTextToElement(ZipCode, zipcode);
    }
    public void enterPhonefield(String phNo) {
        sendTextToElement(phone, phNo);
    }
    public void enterssnfield(String ssnNo1) {
        sendTextToElement(ssn, ssnNo1);
    }
    public void enteruserName(String UserName) {
        sendTextToElement(userName, UserName);
    }
    public void enterpassword(String password1) {
        sendTextToElement(password, password1);
    }
    public void enterconfirmpassword(String conpassword) {
        sendTextToElement(confirmPassword, conpassword);
    }
    public void clickOnRegisterBtn(){
        clickOnElement(clickRegButtton);
    }
    public String verifyforSuccessAfterRegister(){
        return getTextFromElement(verifyTextforSuccess);
    }

}
