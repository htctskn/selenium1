package tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class G5C2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement nyc= driver.findElement(By.xpath("//img[@id='pid3_thumb']"));//NCY
        WebElement bstn= driver.findElement(By.xpath("//img[@id='pid6_thumb']"));//boston
        WebElement berlin= driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc));
        System.out.println(berlin.getAttribute("id"));
    }
}
