package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class Utils extends BasePage
{
    private static String expectedRegistationCompleteMsg= "Your registration not completed";

    static String expectedVotesubmitMsg= "Your Vote Submited";
    static String expectedSendMailMsg = "Your Mail sent";

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String Text) {
        driver.findElement(by).sendKeys(Text);
    }

    public static String getTextFormElement(By by) {

        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();

    }
}
