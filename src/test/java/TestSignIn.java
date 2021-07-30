import login.SignIn;
import main.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import util.Util;

public class TestSignIn {

    @Test
    public void TestProba() {
        Util.getDriver();
        Main.signUp();
    }
    

    @Test
    public void TestRegistrationNoEmailAddress() {
        Util.getDriver();
        SignIn.registrationNoEmailAddress();

        Assertions.assertEquals("There was a problem", Util.getDriver().findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText());
    }

    @Test
    public void TestRegistrationNoName() {
        Util.getDriver();
        SignIn.registrationNoName();

        Assertions.assertEquals("Enter your name", Util.getDriver().findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText());
    }

    @Test
    public void TestRegistrationNoPassword() {
        Util.getDriver();
        SignIn.registrationNoPassword();

        Assertions.assertEquals("Enter your password", Util.getDriver().findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText());
    }

    @Test
    public void TestRegistrationNotValidPassword() {
        Util.getDriver();
        SignIn.registrationNotValidPassword();

        Assertions.assertEquals("There was a problem", Util.getDriver().findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4")).getText());
    }

    @Test
    public void TestRegistrationNoMatchPassword() {
        Util.getDriver();
        SignIn.registrationNoMatchPassword();

        Assertions.assertEquals("Passwords must match", Util.getDriver().findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")).getText());
    }

    @Test
    public void TestRegistration(){
        Util.getDriver();
        SignIn.registration();

        Assertions.assertEquals("Enter the characters above", Util.getDriver().findElement(By.xpath("//*/div[1]/label")).getText());
    }

    @AfterEach
    public void driverClose(){
        Util.closeDriver();
    }
}
