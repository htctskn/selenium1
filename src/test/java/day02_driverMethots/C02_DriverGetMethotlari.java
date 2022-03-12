package day02_driverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethotlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());//sayfanın title ini getirir,
        System.out.println(driver.getCurrentUrl());//Sayfanın adresini getirir
        System.out.println(driver.getWindowHandle());//bı numara windowsun kımlık no
        System.out.println(driver.getPageSource());//html kodlarını getirir


    }
}
