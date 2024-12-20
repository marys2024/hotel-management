package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;

public class DriverManager {

    public static ThreadLocal<WebDriver> container = new ThreadLocal<WebDriver>();

    public static synchronized WebDriver getDriver() {
        return container.get();
    }

    public WebDriver initialiseBrowser(String browserType) throws MalformedURLException {
        switch (browserType) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                container.set(new ChromeDriver());
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                container.set(new FirefoxDriver());
                break;
            case "Safari":
                WebDriverManager.safaridriver().setup();
                container.set(new SafariDriver());
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                container.set(new EdgeDriver());
                break;
            default:
                System.out.println("Please provide the browserType value from Chrome/Firefox/Safari/Edge");
                break;
        }
        return getDriver();
    }
}
