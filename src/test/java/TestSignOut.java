import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import pages.MainPageObjects;
import pages.NewAccountPageObjects;
import pages.SignInPageObjects;
import pages.SignOutPageObjects;
import util.Util;

public class TestSignOut {

    @BeforeEach
    public void setup(){
        Util.getDriver();
    }

    @Test
    public void TestSignOut(){
        MainPageObjects.clickSignInButton();
        NewAccountPageObjects.clickSignInWithIMDbButton();
        SignInPageObjects.signIn();
        SignOutPageObjects.clickToDropDownButton();
        SignOutPageObjects.clickSignOutButton();

        Assertions.assertEquals("Sign In", Util.getDriver().findElement(By.cssSelector(".imdb-header__signin-text > .ipc-button__text")).getText());
    }

    @AfterEach
    public void driverClose(){
        Util.closeDriver();
    }

}
