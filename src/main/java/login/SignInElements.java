package login;

import org.openqa.selenium.WebElement;
import util.Util;

import static org.openqa.selenium.By.*;

public class SignInElements {

    protected static final String name = "Soós Zoltán";
    protected static final String email = "sooszoltan79@gmail.com";
    protected static final String password = "Ca1133557799";
    protected static final String notValidPassword = "Ca11334";
    protected static final String notMatchPassword = "Ca1133557798";


    protected static final WebElement nameInput = Util.getDriver().findElement(id("ap_customer_name"));
    protected static final WebElement emailInput = Util.getDriver().findElement(id("ap_email"));
    protected static final WebElement passwordInput = Util.getDriver().findElement(id("ap_password"));
    protected static final WebElement checkPasswordInput = Util.getDriver().findElement(id("ap_password_check"));
    protected static final WebElement createYourIMDBAccountButton = Util.getDriver().findElement(id("continue"));
}

