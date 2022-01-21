package com.cybertek.tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class Amazon_Test extends TestBase{


@Test
    public void searchHat() throws InterruptedException {

    AmazonBasePage page = new AmazonBasePage();

//    Alert alert = driver.switchTo().alert();
//    alert.accept();
//    Thread.sleep(2000);

    page.searchBox.sendKeys("hats for men");
    Thread.sleep(2000);
    page.searchButton.click();


}
}
