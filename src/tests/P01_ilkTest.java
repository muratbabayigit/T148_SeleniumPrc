package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_ilkTest {

    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","kurulum/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.babayigit.net");
        driver.quit();




    }
}
