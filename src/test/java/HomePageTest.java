import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestInit {

    @Test
    public void testHomePage() {
        HomePageElements homePageElements = new HomePageElements(driver);
        driver.manage().window().fullscreen();
        driver.get("https://dou.ua");
        homePageElements.getAddClick().click();

        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        checkUrl("https://squad.ua/?from=header");

        driver.close();
        driver.switchTo().window(winHandleBefore);

        homePageElements.getBtnFirstJob().click();
        checkUrl("https://jobs.dou.ua/first-job/?from=doufp");
    }

    private void checkUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }

    private void assertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

}
