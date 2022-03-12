package day02_driverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    //Normalde selenıum un kendi IDEsi varfakat biz daha kullanışlı oldugu için intellij kullanıyoruz
    //intellij de yeni bir proje actiğimizda oncelİkle selenıum kutuphanelerini projeye eklememiz gerekir
    //biz en ilkel haliyle projemize kutuphaneleri jar dosyaları olarak yukledik
    //bu eklediğimiz dosyalarla artık driver in ayarlarını yapabiliriz

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        //setProperty methodu ıkı parametre ister.
        // Ilkı kullanacagımız browser a ait driver
        //Ikıncı parametre ise selenıum itesinden indirip projemize eklediğimiz choremedriver in path ı
        //windows kullanıcıları sona .exe eklerken ,apple kullananlar .exe eklemez

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);
        //javadan gelir içine yazılan milisaniye kadar kodların calısmasını sağlar

        driver.close();
        //driver.close(); classın sonuna yazılır cunku bu kod calısınca driver imiz kapanır
        //bu koddan sonra yeniden bir browser acmak istiyorsak driver e yeni deger atamalıyız




    }
}
