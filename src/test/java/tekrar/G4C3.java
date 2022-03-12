package tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class G4C3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        WebElement dlt= driver.findElement(By.xpath("//button[text()='Delete']"));
        if (dlt.isDisplayed()){
            System.out.println("dltbtn PASS");
        }else{
            System.out.println("dltbtn Failed");
        }
        dlt.click();


        WebElement add= driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));
        if (add.isDisplayed()){
            System.out.println("addbtn PASS");
        }else{
            System.out.println("addbtn Failed");
        }
        driver.close();

    }
}
