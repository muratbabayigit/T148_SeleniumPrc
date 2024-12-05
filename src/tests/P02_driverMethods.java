package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_driverMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulum/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2500);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       Thread.sleep(2500);
        driver.manage().window().minimize();
        Thread.sleep(2500);
        driver.quit();


    }
}
