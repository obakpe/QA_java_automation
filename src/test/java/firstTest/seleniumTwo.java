package firstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class seleniumTwo {
    private WebDriver driver;

    @Test(priority = 0)
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void DropDownTest() {
        driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement dropDownelement = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));

        Select select = new Select(dropDownelement);

        select.selectByVisibleText("United States");

        WebElement selectedOption = select.getFirstSelectedOption();
        assert selectedOption.getText().equals("United States");
    }

    @Test(priority = 2)
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }

        }

    }

