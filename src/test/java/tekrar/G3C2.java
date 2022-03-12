package tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class G3C2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://a.testaddressbook.com");
        WebElement sing= driver.findElement(By.id("sign-in"));
         sing.click();

        WebElement email= driver.findElement(By.id("session_email"));

        WebElement pass= driver.findElement(By.id("session_password"));

        WebElement sgn= driver.findElement(By.name("commit"));
        email.sendKeys("testtechproed@gmail.com");
        pass.sendKeys("Test1234!");
        Thread.sleep(3000);
        sgn.click();


        WebElement giris= driver.findElement(By.tagName("h1"));
        System.out.println(giris.getText());
        String actuelYazi= giris.getText();
        String expectedYazi="Welcome to Address Book";
        if (actuelYazi.equals(expectedYazi)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }

        WebElement adress= driver.findElement(By.linkText("Adresses"));
        WebElement sout= driver.findElement(By.linkText("sign-out"));//mınnos bi hata yaptım geciyorum
        System.out.println(adress.isDisplayed());
        if (adress.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }

        if (sout.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }


    }
}
