package Day4_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fileUpload {
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//@multiple")).sendKeys("C:\\Users\\roman\\Downloads\\poi-src-5.2.3-20220909");

    }
}
