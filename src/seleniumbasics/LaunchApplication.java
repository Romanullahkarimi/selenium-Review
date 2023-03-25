package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\roman\\IdeaProjects\\Selenium_Review_4.8.1\\Driver\\chromedriver.exe");

        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.google.com/");

    }
}
