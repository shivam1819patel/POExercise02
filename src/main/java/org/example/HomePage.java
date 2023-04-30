package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends Utils
{

    By _registrationButton = By.className("ico-register");

       By _communityPollButton= By.id("pollanswers-2");

       By _voteButton= By.id("vote-poll-1");

       By _clickOnAddToCart=By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
       By _clickOnElectronics= By.xpath("//a[@href='/electronics']");

       By _clickProduct1= By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div[1]/div[2]/div[3]/div/button[2]");

      By _clickOnProduct2= By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[4]/div[1]/div[2]/div[3]/div/button[2]");
       By _compareProductLink=By.xpath("//div[@class='bar-notification-container']/div[1]/p/a");
        public void clickonregistrationButton()
        {
            //click on resister button
            clickOnElement(_registrationButton);
        }

        public void clickonVote()
    {
        //find community poll and click on Good
        clickOnElement(_communityPollButton);
        //click on vote button
        clickOnElement(_voteButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String actualVoteSubmitMsg =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("block-poll-vote-error-1"))).getText();
        // String actualVoteSubmitMsg =getTextFormElement(By.id("block-poll-vote-error-1"));
        System.out.println(actualVoteSubmitMsg);
        Assert.assertEquals(expectedVotesubmitMsg,actualVoteSubmitMsg,"Vote invalid");
    }
    public void clickonAddToCart()
    {
        //Find item and add in cart with click
        clickOnElement(_clickOnAddToCart);
    }
    public void clickOnElectronics()
    {
        //go to electronics category and click on electronic
        clickOnElement(_clickOnElectronics);
    }
    public void clickOnCompareButton()
    { //Add in compare HTC one M8 Android L 5.0 Lollipop
        clickOnElement(_clickProduct1);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='bar-notification-container']/div[1]/p/a")));
        //add in compare $25 virtual gift card
        clickOnElement(_clickOnProduct2);
        //WebDriverWait wait = new WebDriverWait(driver,20);

        //click link to go comparission page
        clickOnElement(_compareProductLink);

    }
    }


