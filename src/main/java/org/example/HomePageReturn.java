package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageReturn extends Utils
{
    By _clickLogoBackToHomePage = By.xpath("//div[@class='master-wrapper-page']/div[1]/div[2]/div/a/img");
    public void moveToHomePage()
    {
        //click on header logo for reach to homepage
        clickOnElement(_clickLogoBackToHomePage);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("vote-poll-1")));
    }
}
