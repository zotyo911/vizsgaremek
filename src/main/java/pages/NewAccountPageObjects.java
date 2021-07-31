package pages;

import org.openqa.selenium.By;
import util.Util;

public class NewAccountPageObjects {

    private static final By createANewAccountButton = By.xpath("//*/div/div[2]/a");

    public static void clickNewAccountPageButton(){
        Util.getDriver().findElement(createANewAccountButton).click();
    }
}
