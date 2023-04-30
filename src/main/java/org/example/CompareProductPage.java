package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductPage extends Utils
{
    static String expectedClearListMsg= "No data";

    By _clearButton = By.className("clear-list");

    public void compareProducts()
    {
        //check products added in list
        String compareProduct1 =getTextFormElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr[3]/td[2]"));
        System.out.println("Added Product Name1:"+ compareProduct1);
        String compareProduct2 =driver.findElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr[3]/td[3]")).getText();
        System.out.println("Added Product Name2:"+ compareProduct2);

        //Click clear list
        clickOnElement(By.className("clear-list"));
        //print no data Sout
        String actualMasssage =getTextFormElement(By.className("no-data"));
        System.out.println(actualMasssage);
        Assert.assertEquals(expectedClearListMsg,actualMasssage,"No Item");
    }
}
