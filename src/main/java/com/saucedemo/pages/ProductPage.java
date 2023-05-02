package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By productsText = By.className("title");
    By actualNoOfProducts = By.xpath("//div[@class='inventory_item_name']");
 //   int productSize = driver.findElements(By.xpath("//div[@class='inventory_item_name']") ).size();


    public String getProductText(){
        return getTextFromElement(productsText);
    }
    public boolean numberOfProducts(int expectedNoOfProducts){
        return getNumberFromElement(actualNoOfProducts,expectedNoOfProducts);
    }

}
