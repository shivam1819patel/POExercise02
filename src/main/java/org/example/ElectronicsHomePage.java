package org.example;

import org.openqa.selenium.By;

public class ElectronicsHomePage extends Utils
{
    By _CameraAndPhotos= By.xpath("//div[@class='page category-page']/div/div/div/div/div[1]/h2[1]/a[1]");
    public void clickOnCameraAndPhotos()

    {
        //click on camera and photo on electronic homepage
        clickOnElement(_CameraAndPhotos);
    }
}