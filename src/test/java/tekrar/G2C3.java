package tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G2C3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        //4. Sayfa basligini(title) yazdirin
        //5. Sayfa basliginin “Youtub” icerdigini test edin
        //6. Sayfa adresini(url) yazdirin
        //. Sayfa url’inin “Youtube” icerdigini test edin.
        //8. Sayfa handle degerini yazdirin
        //9. Sayfa HTML kodlarinda “video" kelimesi gectigini test edin
        System.out.println(driver.getTitle());
        String actualTitle=driver.getTitle();
        String aranan="Youtub";
        if (actualTitle.contains(aranan)){
            System.out.println("title testi pass");
        }else {
            System.out.println("title testi failed");
            System.out.println("sayfanın title i:"+actualTitle);
        }

        System.out.println(driver.getCurrentUrl());
        String actualUrl=driver.getCurrentUrl();
        String arananUrl="Youtube";
        if (actualUrl.contains(arananUrl)){
            System.out.println("Url testi pass");
        }else {
            System.out.println(" Urltesti failed");
            System.out.println("sayfanın url i:"+actualUrl);
        }

        System.out.println(driver.getWindowHandle());

        System.out.println(driver.getPageSource());
        String actualPage=driver.getPageSource();
        String arananPage="video";
        if (actualPage.contains(arananPage)){
            System.out.println("PAGE testi pass");
        }else {
            System.out.println("PAGE testi failed");

        }
        driver.close();

    }
}
