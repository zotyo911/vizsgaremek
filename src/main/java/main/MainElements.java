package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Util;

public class MainElements {
    protected static final WebElement signInButton = Util.getDriver().findElement(By.cssSelector(".imdb-header__signin-text > .ipc-button__text"));
}
