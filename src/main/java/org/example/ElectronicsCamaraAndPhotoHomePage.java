package org.example;

import org.openqa.selenium.By;

public class ElectronicsCamaraAndPhotoHomePage extends Utils
{
    By _cameraAndPhotoAddToCartProduct=By.xpath("//div[@class='products-wrapper']/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]");
    By _clickShoppingCartLink=By.className("ico-cart");
    public void clickonElectronicsCamaraAndPhotoHomePage()
    {
        // click on add to cart button
        clickOnElement(_cameraAndPhotoAddToCartProduct);
        //click on shopping cart button
        clickOnElement(_clickShoppingCartLink);

    }
}
