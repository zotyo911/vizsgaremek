import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import pages.MainPageObjects;
import pages.NewAccountPageObjects;
import pages.SignInPageObjects;
import util.Util;
import org.junit.jupiter.api.Order;

public class TestSignIn {

    @BeforeEach
    public void setup(){
        Util.getDriver();
    }

    @Test
    @DisplayName("BE-01")
    @Order(1)
    public void TestSignInEmptyNameInputField(){
        MainPageObjects.clickSignInButton();
        NewAccountPageObjects.clickSignInWithIMDbButton();
        SignInPageObjects.signInEmptyNameInputField();

        Assertions.assertEquals("Enter your email or mobile phone number", Util.getDriver().findElement(By.xpath("//*[@id=\"auth-email-missing-alert\"]/div/div")).getText());
    }

    @Test
    @DisplayName("BE-02")
    @Order(2)
    public void TestSignInEmptyPasswordField(){
        MainPageObjects.clickSignInButton();
        NewAccountPageObjects.clickSignInWithIMDbButton();
        SignInPageObjects.signInEmptyPasswordField();

        Assertions.assertEquals("Enter your password", Util.getDriver().findElement(By.xpath("//*[@id=\"auth-password-missing-alert\"]/div/div")).getText());
    }

    @Test
    @DisplayName("BE-03")
    @Order(3)
    public void TestSignInWrongPassword(){
        MainPageObjects.clickSignInButton();
        NewAccountPageObjects.clickSignInWithIMDbButton();
        SignInPageObjects.signInWrongPassword();

        Assertions.assertEquals("Your password is incorrect", Util.getDriver().findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText());
    }

    @Test
    @DisplayName("BE-04")
    @Order(4)
    public void TestSignIn(){
        MainPageObjects.clickSignInButton();
        NewAccountPageObjects.clickSignInWithIMDbButton();
        SignInPageObjects.signIn();

        Assertions.assertEquals("Soós", Util.getDriver().findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/div/label[2]/div/span")).getText());
    }

    @AfterEach
    public void driverClose(){
        Util.closeDriver();
    }
}
