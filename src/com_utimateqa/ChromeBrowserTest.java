package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        //Setup chrome browser
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        // Open URL
        driver.get(baseUrl);

        // Maximise the window
        driver.manage().window().maximize();

        // We give Implicit wait to driver by implicit method
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Print the title of the page
        System.out.println("Title of the page : " + driver.getTitle());

        //Print the current Url
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source is : " + driver.getPageSource());

        //Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("Meghamehta123@gmail.com");

        //Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("Megha12345");

        //Close the browser
        driver.close();

    }
}
