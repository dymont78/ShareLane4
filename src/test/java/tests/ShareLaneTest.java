package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {
    @Test
    public void fillZipcodeFieldTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Dmitry");
        driver.findElement(By.name("last_name")).sendKeys("Tkachuk");
        driver.findElement(By.name("email")).sendKeys("abc@defg.hi");
        driver.findElement(By.name("password1")).sendKeys("11223344");
        driver.findElement(By.name("password2")).sendKeys("11223344");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        driver.quit();
    }
    @Test
    public void clickEnter() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com");
        driver.findElement(By.xpath("//b[text()='ENTER']")).click();
        //driver.quit();
    }
    @Test
    public void clickSignUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[text()='Sign up']")).click();
        driver.quit();
    }
    @Test
    public void setZipCode(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        //driver.quit();
    }
    @Test
    public void setRegData(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        driver.findElement(By.name("first_name")).sendKeys("Dmitry");
        driver.findElement(By.name("last_name")).sendKeys("Tkachuk");
        driver.findElement(By.name("email")).sendKeys("abc@defg.hi");
        driver.findElement(By.name("password1")).sendKeys("11223344");
        driver.findElement(By.name("password2")).sendKeys("11223344");
        driver.quit();
    }
    @Test
    public void clickRegister() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }
}

