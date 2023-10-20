package java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumTest {
    public static void main(String[] args) {
        // Setup the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Create a WebDriver instance for Chrome
        WebDriver driver = new ChromeDriver();

        // Perform actions and tests with the WebDriver
        driver.get("https://www.example.com");
        // ...

        // Quit the WebDriver when done
        driver.quit();
    }
}
