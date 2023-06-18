package saucedemo_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) throws InterruptedException {

//        1. Setup Chrome browser

        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver = new ChromeDriver();

//        2. Open URL

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        3. Print the title of the page

        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

//        4. Print the current url

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Url is: " + currentUrl);

//        5. Print the page source

        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);

//        6. Enter the email to email field

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");


//        7. Enter the password to password field

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        Thread.sleep(2000);

//        8. Close the browser
        driver.close();
    }
}
