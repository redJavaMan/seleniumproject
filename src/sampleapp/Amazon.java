package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Amazon.com/");
        driver.manage().window().maximize();
        WebElement electronics = driver.findElement(By.xpath("//h2[contains(.,'Electronics')]/parent::div/following-sibling::div[2]/child::a"));
        electronics.click();
        WebElement airpods = driver.findElement(By.xpath("//span[contains(.,'Apple AirPods (2nd Generation)')]"));
        airpods.click();
        WebElement addToList = driver.findElement(By.xpath("//a[contains(.,'Add to List')]"));
        addToList.click();
        WebElement all = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']/child::i"));
        all.click();
        WebElement computers = driver.findElement(By.xpath("//div[text()='Computers']"));
        computers.click();
        WebElement monitors = driver.findElement(By.xpath("//a[text()='Monitors']"));
        monitors.click();


    }


    }






