package Day3_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {
    public static void main(String[] args) {
       /* ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");*/
        WebDriver driver = new FirefoxDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");



    }
}