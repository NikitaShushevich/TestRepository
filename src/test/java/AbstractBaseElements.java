import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbstractBaseElements {

   protected WebDriver driver;

    public AbstractBaseElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElementByXpath(String locator) {
        return driver.findElement(By.xpath(locator));
    }

}
