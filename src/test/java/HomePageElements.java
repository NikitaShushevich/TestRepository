import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}
