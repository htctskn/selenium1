package tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class G4C2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement add = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        add.click();
        WebElement del = driver.findElement(By.xpath("//button[@class='added-manually']"));


        if (del.isDisplayed()) {
            System.out.println("del goruntuleme PASS");
        } else {
            System.out.println("del goruntuleme FAİLED");

        }
        del.click();

        WebElement addYazısiEl= driver.findElement(By.xpath("//h3"));
        WebElement addYazisiEl2=driver.findElement(By.tagName("h3"));
        if (addYazısiEl.isDisplayed()) {
            System.out.println("Add goruntuleme PASS");
        } else {
            System.out.println("Add goruntuleme FAİLED");

        }
        driver.close();

    }
}