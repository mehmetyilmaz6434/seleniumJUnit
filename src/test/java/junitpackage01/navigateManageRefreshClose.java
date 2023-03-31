package junitpackage01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateManageRefreshClose {
    //...Practice 1...
    // Set Driver Path
    // Create chrome driver object
    // Maximize the window
    // Open google home page https://www.google.com/
    // Navigate to techproeducation home page https://techproeducation.com/
    // Navigate back to google
    // Navigate forward to techproeducation
    // Refresh the page
    // Close/Quit the browser
    // And last step : print "ALL OK" on console

    public static void main(String[] args) throws InterruptedException {
        //...Practice 1...

        // Set Driver Path
        //System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        // Create chrome driver object
        WebDriver driver=new ChromeDriver();
        // Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(3);

        // Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

        // Navigate to techproeducation home page https://techproeducation.com/
        driver.navigate().to("https://techproeducation.com/");
        // Navigate back to google
        driver.navigate().back();
        // Navigate forward to techproeducation
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();
        // Close/Quit the browser
        driver.close();
        // And last step : print "ALL OK" on console
        System.out.println("ALL OK");

    }

}
