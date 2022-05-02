package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage = new RegisterPage();
    @Test
    public void verifyThatSigningUpPageIsDisplayed(){
        registerPage.clickOnRegisterLink();
        String expectedMessage = "Signing up is easy!";
        String actualMessage = registerPage.TheSignInUpiseasy();
        Assert.assertEquals(expectedMessage,actualMessage,"Cannot Match with the valid text");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        registerPage.clickOnRegisterLink();
        registerPage.enterFirstName("Bella");
        registerPage.enterLastName("Shah");
        registerPage.enterAddressfield("54 Ealing Road");
        registerPage.enterCityfield("Wembley");
        registerPage.enterstatefieldfield("Middlesex");
        registerPage.enterzipfield("HP20 1DA");
        registerPage.enterPhonefield("07939373398");
        registerPage.enterssnfield("AA-12-34-55-B");
        registerPage.enteruserName("Bella-shah8");
        registerPage.enterpassword("Bella1234");
        registerPage.enterconfirmpassword("Belaa1234");
        registerPage.clickOnRegisterBtn();
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        String actualMessage = registerPage.verifyforSuccessAfterRegister();
        Assert.assertEquals(expectedMessage,actualMessage,"Cannot Match with the valid text");
    }
}
