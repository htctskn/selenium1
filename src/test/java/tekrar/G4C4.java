package tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class G4C4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement email= driver.findElement(By.cssSelector("input[type='email']"));
        WebElement psw= driver.findElement(By.cssSelector("input[id='session_password']"));
        WebElement sign= driver.findElement(By.cssSelector("input[type='submit']"));
        email.sendKeys("testtechproed@gmail.com");
        psw.sendKeys("Test1234!");

        sign.click();
        driver.close();

    }
}
