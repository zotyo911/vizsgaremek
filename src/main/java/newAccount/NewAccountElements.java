package newAccount;

import org.openqa.selenium.WebElement;
import util.Util;

import static org.openqa.selenium.By.xpath;

public class NewAccountElements {

    protected static final WebElement createANewAccountButton = Util.getDriver().findElement(xpath("//*[@id=\"signin-options\"]/div/div[2]/a"));
}
