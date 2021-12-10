package SmartBear.Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {


    // private static WebDriver driver;
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
    //pool of driver we can create more then one driver

    private Driver(){}

    public static WebDriver getDriver() {

        if (driverPool.get() == null) {
            synchronized (Driver.class){
                switch (ConfigurationsReader.getProperty("browser")) {

                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        break;
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driverPool.set(new EdgeDriver());
                        break;

                    default:
                        System.out.println("The Driver Is Not Found");


                }
            }
        }

        return driverPool.get();


    }

    public static void closeDriver(){
        if (driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();// afte
        }
    }
}
// static you don't have create obj for access

