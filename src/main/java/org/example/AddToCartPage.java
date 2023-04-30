package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCartPage extends Utils {
    static String expectedProductName = "Apple Macbook";

    public void addToCart() {
        String actualAddProductName = getTextFormElement(By.className("product-name"));
        System.out.println(actualAddProductName);
        Assert.assertEquals(expectedProductName, actualAddProductName, "Product not match");
    }
}