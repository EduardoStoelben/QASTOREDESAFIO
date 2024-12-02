package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static driver.Drivers.setConfigurationDownload;
import static driver.Drivers.setDriver;

public class AppWeb {

    WebDriver driver;
    public void setUpDriver() {
        setConfigurationDownload();
        initChrome();
    }

    public void initChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        setDriver(driver);
    }

}

