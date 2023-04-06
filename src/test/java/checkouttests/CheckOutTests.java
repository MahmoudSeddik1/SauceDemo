package checkouttests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class CheckOutTests extends BaseTests {
    @Test
    public void AddToCart_Test(){
        var startPage = loginPage.loginPredefined();
        startPage.checkItemButtons();

    }
    @Test
    public void ItemPageTest(){
        var startPage = loginPage.loginPredefined();
        var saucebackpackPage = startPage.clickSauceBackpack();

        softAssert.assertEquals(saucebackpackPage.getItemTitle(), "Sauce Labs Backpack");
        softAssert.assertEquals(saucebackpackPage.getBtnText(),"Add to cart");
        saucebackpackPage.clickItemBtn();
        softAssert.assertEquals(saucebackpackPage.getBtnText(),"Remove");
        softAssert.assertAll();

    }

    @Test
    public void AddingItemtoShoppingCart(){
        var startPage = loginPage.loginPredefined();
        startPage.AddItemToCart();
        var shoppingcartPage = startPage.goToCart();
        softAssert.assertEquals(shoppingcartPage.getItemName_SingleItem(), "Sauce Labs Backpack");
        softAssert.assertEquals(shoppingcartPage.getBtnName(),"Remove");
        shoppingcartPage.clickRemove();
        softAssert.assertTrue(shoppingcartPage.checkforEmptyList());
        softAssert.assertAll();



    }
    @Test
    public void ChangingProductQuantity(){
        var startPage = loginPage.loginPredefined();
        startPage.AddItemToCart();
        var shoppingcartPage = startPage.goToCart();
        shoppingcartPage.ChangeQuantity();

    }


}
