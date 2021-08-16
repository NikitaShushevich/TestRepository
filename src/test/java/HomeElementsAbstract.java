import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeElementsAbstract extends AbstractBaseElements {

    public HomeElementsAbstract(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearch() {
        return  findElementByXpath("//input[@name='search']");
    }

    public WebElement getLogo() {
        return  findElementByXpath("//input[@name='logo']");
    }

}

