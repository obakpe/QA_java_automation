/*package CucumberTesting;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import java.time.Duration;

public class OrangeSteps {
    private WebDriver driver;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String arg0, String arg1) {
        driver.manage().timeouts().implcitlyWait(Duration.ofSeconds(10));
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys(arg0);
        passwordField.sendKeys(arg1);
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/"));
        loginButton.click();
    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String arg0) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
        WebElement dashboardTitle =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath()))

        Assert.assertTrue(dashboardTitle.isDisplayed(), "Login was success");
        Assert.assertTrue(arg0, dashboardTitle.getText());
    }
    @When()

    }
}


 */