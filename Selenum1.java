package selenum1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author opi
 */
public class Selenum1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/opi/Selenium/chrome-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        WebElement searchInput = driver.findElement(By.name("search_query"));
        searchInput.sendKeys("Green University of Bangladesh");
        searchInput.submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        int buttonCount = driver.findElements(By.tagName("button")).size();
        if (buttonCount == 5) {
            System.out.println("There are 5 buttons on the page.");
        } else {
            System.out.println("There are not 5 buttons on the page.");
        }
        driver.quit();
    }
}
