package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_seleniumTest {
    public static void main(String[] args) {
                /*
          1-Driver oluşturalim
          2-Java class'imiza chromedriver.exe i tanitalim
          3-Driver'in tum ekranı kaplamasini saglayalim
          4-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklemesini
            söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
          5-"https://www.testotomasyonu.com” adresine gidelim
          6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
          7-Title'ın Test ve url inin testotomasyonu kelimesini içerip icermedigini kontrol edelim
          8-Ardindan "https://wisequarter.com/” adresine gidip
          9-Bu adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
          10-Bir onceki web sayfamiza geri donelim
          11-Sayfayı yenileyelim
          12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
          13- En son adim olarak butun sayfalarimizi kapatmis olalim
         */


        System.setProperty("Webdriver.chrome.driver","kurulum/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.testotomasyonu.com");
        String actualTitle=driver.getTitle();
        String expectedTitleWord="testotomasyonu";

        String actualUrl=driver.getCurrentUrl();
        String expextedUrlWord="testotomasyonu";

        if (actualTitle.contains(expectedTitleWord)){
            System.out.println("TESTOTOMASYONU TITLE TEST PASSED");
        }else {
            System.out.println("TESTOTOMASYONU TITLE TEST FAILED");
        }

        if (actualUrl.contains(expectedTitleWord)){
            System.out.println("TESTOTOMASYONU URL TEST PASSED");
        }else {
            System.out.println("TESTOTOMASYONU URL FAILED");
        }
        driver.navigate().to("https://wisequarter.com/");

        String wiseTitle=driver.getTitle();
        String wiseTitleWord="Quarter";

        if (wiseTitle.contains(wiseTitleWord)){
            System.out.println("WISE TITLE TEST PASSED");
        }else {
            System.out.println("WISE TITLE TEST FAILED");

        }
        driver.navigate().back();

        driver.quit();

    }
}
