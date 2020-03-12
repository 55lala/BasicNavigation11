package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {
        Chrome();
        fireFox();
        Edge();

//        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
//                "https://wayfair.com/",
//                "https://walmart.com" ,
//                        "https://www.westelm.com/");

    }

public static void Chrome() throws InterruptedException {

    WebDriver driver = BrowserFactory.getDriver("chrome");
    driver.get("http://google.com");
    String title = driver.getTitle();

    driver.navigate().to("http://etsy.com");
    String title1 = driver.getTitle();

    Thread.sleep(4);
    driver.navigate().back();
    String title2 = driver.getTitle();

    StringUtility.verifyEquals(title,title2);
    driver.navigate().forward();
    String title3 = driver.getTitle();
    Thread.sleep(3);

    StringUtility.verifyEquals(title1,title3);
    driver.quit();

}
public static void fireFox() throws InterruptedException{
        //
        WebDriver driver = BrowserFactory.getDriver("fireFox");
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title1 = driver.getTitle();
        Thread.sleep(3);
        driver.navigate().back();
        String title2 = driver.getTitle();
        StringUtility.verifyEquals(title2,title);
        driver.navigate().forward();
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title3,title1);
        driver.quit();
        //

}
public static void Edge() throws InterruptedException{
    WebDriver driver = BrowserFactory.getDriver("Edge");
    driver.get("http://google.com");
    String title = driver.getTitle();
    driver.navigate().to("http://etsy.com");
    String title1 = driver.getTitle();
    Thread.sleep(3);
    driver.navigate().back();
    String title2 = driver.getTitle();
    StringUtility.verifyEquals(title2,title);
    driver.navigate().forward();
    String title3 = driver.getTitle();
    StringUtility.verifyEquals(title3,title1);
    driver.quit();

}



}
