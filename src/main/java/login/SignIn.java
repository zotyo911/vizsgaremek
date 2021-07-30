package login;

import main.Main;
import newAccount.NewAccount;

public class SignIn {


    public static void registrationNoEmailAddress() {

        Main.signUp();
        NewAccount.createANewAccount();
        SignInElements.nameInput.sendKeys(SignInElements.name);
        SignInElements.passwordInput.sendKeys(SignInElements.password);
        SignInElements.checkPasswordInput.sendKeys(SignInElements.password);
        SignInElements.createYourIMDBAccountButton.click();
    }

    public static void registrationNoName() {

        Main.signUp();
        NewAccount.createANewAccount();
        SignInElements.emailInput.sendKeys(SignInElements.email);
        SignInElements.passwordInput.sendKeys(SignInElements.password);
        SignInElements.checkPasswordInput.sendKeys(SignInElements.password);
        SignInElements.createYourIMDBAccountButton.click();
    }

    public static void registrationNoPassword() {
        Main.signUp();
        NewAccount.createANewAccount();
        SignInElements.nameInput.sendKeys(SignInElements.name);
        SignInElements.emailInput.sendKeys(SignInElements.email);
        SignInElements.createYourIMDBAccountButton.click();
    }

    public static void registrationNotValidPassword() {
        Main.signUp();
        NewAccount.createANewAccount();
        SignInElements.nameInput.sendKeys(SignInElements.name);
        SignInElements.emailInput.sendKeys(SignInElements.email);
        SignInElements.passwordInput.sendKeys(SignInElements.notValidPassword);
        SignInElements.checkPasswordInput.sendKeys(SignInElements.notValidPassword);
        SignInElements.createYourIMDBAccountButton.click();
    }

    public static void registrationNoMatchPassword() {
        Main.signUp();
        NewAccount.createANewAccount();
        SignInElements.nameInput.sendKeys(SignInElements.name);
        SignInElements.emailInput.sendKeys(SignInElements.email);
        SignInElements.passwordInput.sendKeys(SignInElements.password);
        SignInElements.checkPasswordInput.sendKeys(SignInElements.notMatchPassword);
        SignInElements.createYourIMDBAccountButton.click();
    }

    public static void registration() {
        Main.signUp();
        NewAccount.createANewAccount();
        SignInElements.nameInput.sendKeys(SignInElements.name);
        SignInElements.emailInput.sendKeys(SignInElements.email);
        SignInElements.passwordInput.sendKeys(SignInElements.password);
        SignInElements.checkPasswordInput.sendKeys(SignInElements.password);
        SignInElements.createYourIMDBAccountButton.click();
    }

}
