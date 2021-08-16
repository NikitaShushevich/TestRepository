import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderElements extends AbstractBaseElements {

    public HeaderElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnSalary() {
       return findElementByXpath("//a[contains(text(),'Зарплаты')]");
    }

    public WebElement getBtnLenta() {
        return findElementByXpath("//a[contains(text(),'Лента')]");
    }

    public WebElement getBtnForums() {
        return findElementByXpath("//a[contains(text(),'Форум')]");
    }

    public WebElement getBtnWork() {
        return findElementByXpath("//a[contains(text(),'Работа')]");
    }
    public WebElement getbtnCalendar() {
        return findElementByXpath("//a[contains(text(),'Календарь')]");
    }
}