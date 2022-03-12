package tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class G5C1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        String  actualTitleEl=driver.getTitle();
        String aranan="Spend less";
        if (actualTitleEl.contains(aranan)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }
        WebElement giftEL= driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        giftEL.click();

        WebElement birtEL= driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']"));
        birtEL.click();

        //sadece click ya elemmen olusturmasanda olur
        driver.findElement(By.xpath("//span[@class='a-truncate-cut'][1]")).click();
        driver.findElement(By.xpath("//button[@value='25.00']")).click();


        WebElement ucret= driver.findElement(By.xpath("//span[text()='$25.00']"));
        String excuc="25.00$";
        String actuc=ucret.getText();
        if (actuc.equals(excuc)){
            System.out.println("PASS");
        }else{
            System.out.println("FAİLED");
        }
        driver.close();
    }
}
