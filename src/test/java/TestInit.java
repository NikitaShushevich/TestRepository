import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }

    private WebElement getSearchField() {
        return driver.findElement(By.xpath("//input"));
    }
}