package seminars.five;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void setDown() {
        driver.quit();
    }

    @Test
    void findSeleniumSiteTest() {
//        System.setProperty("webdriver.chrome.driver",
//                "C:/Users/Old_Home/IdeaProjects/Unit-test_Seminars/chromedriver.exe ");
//        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        WebElement seleniumPath = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite"));

        assertThat(seleniumPath).isNotNull();

//        driver.quit();
    }

    @Test
    void findSaucedemoSiteTest() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement searchUser = driver.findElement(By.name("user-name"));
        searchUser.sendKeys("standard_user");
        WebElement searchPass = driver.findElement(By.name("password"));
        searchPass.sendKeys("secret_sauce");
        WebElement searchLoginBtn = driver.findElement(By.name("login-button"));
        searchLoginBtn.click();

        WebElement productPath = driver.findElement(By.className("title"));
        sleep(2000);

        assertThat(productPath.getText()).isEqualTo("Products");
    }


}
