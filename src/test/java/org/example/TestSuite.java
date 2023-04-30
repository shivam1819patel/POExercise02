package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage= new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResult registrationResult= new RegistrationResult();
    HomePageReturn homePageReturn=new HomePageReturn();
    ProductHomePage productHomePage= new ProductHomePage();
    EmailAFriendHomePage emailAFriendHomePage= new EmailAFriendHomePage();
    ElectronicsHomePage electronicsHomePage= new ElectronicsHomePage();
    ElectronicsCamaraAndPhotoHomePage electronicsCamaraAndPhotoHomePage= new ElectronicsCamaraAndPhotoHomePage();
    AddToCartPage addToCartPage=new AddToCartPage();
    CompareProductPage compareProductPage= new CompareProductPage();

    @Test
    public void verifyuserregistersucessfully()
    {
        homePage.clickonregistrationButton();
        registrationPage.filldetailsforregistration();
        registrationResult.verifyUserregistersucesfully();
    }
    @Test
    public void verifyUsershouldVoteSucessfully()
    {
        homePage.clickonVote();
    }

    @Test
    public void verifyuserShouldbeAbleToregisterandVoteSuccessfully()
    {
        homePage.clickonregistrationButton();
        registrationPage.filldetailsforregistration();
        registrationResult.verifyUserregistersucesfully();
        homePageReturn.moveToHomePage();
        homePage.clickonVote();

    }

    @Test
    public void verifyUsershouldSendMailToFriend()
    {
        homePage.clickonAddToCart();
        productHomePage.clickEmailFriendbutton();
        emailAFriendHomePage.verifyUsershouldSendMailToFriend();
    }

@Test
    public void verifyUserShouldAddProductInCartSucessfully()
    {
        homePage.clickOnElectronics();
        electronicsHomePage.clickOnCameraAndPhotos();
        electronicsCamaraAndPhotoHomePage.clickonElectronicsCamaraAndPhotoHomePage();
        addToCartPage.addToCart();
    }
    @Test
    public void verifyUserShouldAddProductInComapreListAndClearSucessfully(){
        homePage.clickOnCompareButton();
        compareProductPage.compareProducts();

    }

}
