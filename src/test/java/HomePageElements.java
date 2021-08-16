import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageElements extends AbstractBaseElements{
    public HomePageElements(WebDriver driver){
        super(driver);
    }
    public WebElement getAddClick(){
        return findElementByXpath("//div[contains(@class,'max-header')]");
    }
    public WebElement getBtnFirstJob(){
        return findElementByXpath("//a[contains(text(),'Первая')]");
    }
    public WebElement getBtnCareer(){
        return findElementByXpath("//a[contains(text(),'Карьера в ')]");
    }
    public WebElement getBtnJunior(){
        return findElementByXpath("//a[contains(text(),'Наем')]");
    }
    public List<WebElement> getList(){
        return driver.findElements(By.xpath("//ul[@class=\"b-index-links\"]/li"));
    }

}
