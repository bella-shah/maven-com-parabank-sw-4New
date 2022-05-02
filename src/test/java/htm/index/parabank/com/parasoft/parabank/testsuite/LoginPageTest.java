package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.LoginPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class LoginPageTest extends TestBase {
   LoginPage loginPage = new LoginPage();
   @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
       loginPage.enterUserName("Bella");
       loginPage.enterPassword("bella123");
       loginPage.clickOnLoginButton();
       String expectedMessage="Accounts Overview";
       String actualMessage = loginPage.getverifyText();
       Assert.assertEquals(expectedMessage,actualMessage,"can not match with Valid Text");
   }
   @Test
    public void verifyTheErrorMessage(){
       loginPage.enterUserName("Setu");
       loginPage.enterPassword("setu123");
       loginPage.clickOnLoginButton();
       String expectedMessage="The userNameand password could not be verify";
       String actualMessage = loginPage.getverifyText();
       Assert.assertEquals(expectedMessage,actualMessage,"can not match with Valid Text");
   }
}
