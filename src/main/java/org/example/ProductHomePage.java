package org.example;

import org.openqa.selenium.By;

public class ProductHomePage extends Utils
{
    private By _emailFriendButton=By.xpath("(//button[@class='button-2 email-a-friend-button'])");
    public void clickEmailFriendbutton()
    {
        // find link email friend and click
        clickOnElement(_emailFriendButton);

}

}
