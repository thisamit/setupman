package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SetupChrome {
	public static void main(String[] args) {
		
	
	// WebDriverManager.chromedriver().setup();

     // Create a WebDriver instance for Chrome
     WebDriver driver = new ChromeDriver();

     // Perform actions and tests with the WebDriver
     driver.get("https://www.example.com");
     // ...

     // Quit the WebDriver when done
     driver.quit();

}
}
