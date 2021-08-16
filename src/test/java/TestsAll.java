import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsAll extends TestInit {

    @Test
    public void testCart() {
        HeaderElements headerElements = new HeaderElements(driver);
        driver.manage().window().fullscreen();
        driver.get("https://dou.ua");
        headerElements.getBtnForums().click();
        checkUrl("https://dou.ua/forums/");
        headerElements.getBtnLenta().click();
        checkUrl("https://dou.ua/lenta/");
        headerElements.getBtnSalary().click();
        checkUrl("https://jobs.dou.ua/salaries/");
        headerElements.getBtnWork().click();
        checkUrl("https://jobs.dou.ua/");
        headerElements.getBtnCalendar().click();
        checkUrl("https://dou.ua/calendar/");
        headerElements.getBtnSearch().sendKeys("character\n");

    }

    private WebElement findElementByXpath(String locatorXpath) {
        return driver.findElement(By.xpath(locatorXpath));
    }

    private void checkUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }

    private void assertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

}
