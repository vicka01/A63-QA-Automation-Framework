import PageFactory.HomePage;
import PageFactory.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
public void loginValidEmailPassword(){
            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            loginPage.provideEmail("victoria.mereneanu@testpro.io").providePassword("Testpro1234$").clickSubmit();
            Assert.assertTrue(homePage.isAvatarDisplayed());

    }
}
