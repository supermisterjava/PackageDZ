import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyWikimediaTest {

    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikimapia.org");
        driver.findElement(By.id("search-input")).sendKeys("perm");
        driver.findElement(By.xpath("//*[@id=\"categories-suggest\"]/li[1]/em/strong")).click();

        WebElement text = driver.findElement(By.xpath("/html/body/div/div/ul[2]/li[1]/div"));

        Assert.assertEquals(text.getText(), "/html/body/div/div/ul[2]/li[1]/div");

        driver.quit();

    }
}
