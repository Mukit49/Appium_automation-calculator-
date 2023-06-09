package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {

    public AndroidDriver driver;
    public WebDriver driver1;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", "samsung");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("os", 9);
        //      desiredCapabilities.setCapability("platformVersion","");
//        desiredCapabilities.setCapability("os", 13);
        desiredCapabilities.setCapability("uuid", "330048e110ac2509");
//        desiredCapabilities.setCapability("uuid", dotenv.get("UUID_REAL_DEVICE"));
        desiredCapabilities.setCapability("uiautomator2ServerInstallTimeout", "90000");
        desiredCapabilities.setCapability("autoGrantPermissions", true);
        // desiredCapabilities.setCapability("fullReset", true);
        desiredCapabilities.setCapability("app", "C:\\Users\\Progoti\\OneDrive\\Desktop\\calculator.apk");
        //       desiredCapabilities.setCapability("appPackage", "com.progoti.tallykhata");
        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        //       desiredCapabilities.setCapability("appActivity", "com.progoti.tallykhata.v2.MainActivity");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(url, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("Application Started .................");
        return driver;


    }

}
