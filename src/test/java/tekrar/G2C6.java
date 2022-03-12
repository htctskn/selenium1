package tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G2C6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().minimize();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("max iken:"+driver.manage().window().getPosition());
        System.out.println("max iken:"+driver.manage().window().getSize());
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("full iken:"+driver.manage().window().getPosition());
        System.out.println("fulliken:"+driver.manage().window().getSize());
        driver.close();
    }
}
