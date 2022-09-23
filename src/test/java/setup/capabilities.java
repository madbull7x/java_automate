package setup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

//public class capabilities extends DesiredCapabilities{
////    protected AndroidDriver driver;
//public AppiumDriver<MobileElement> driver;
//    TouchAction touchAction;
//
//    @BeforeTest
//    protected void preparation() throws Exception {
//        try {
//            DesiredCapabilities caps = new DesiredCapabilities();
//            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
//            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//            caps.setCapability(MobileCapabilityType.NO_RESET, true);
//            caps.setCapability(MobileCapabilityType.APP, "Users/dewirachmawati/Downloads/owner-debug.apk");
//
//            URL url = new URL("http://127.0.0.1:4723/wd/hub");
//            driver = new AndroidDriver<>(url, caps);
//            touchAction = new TouchAction(driver);
//        } catch (Exception e) {
//            System.out.println("Cause : " + e.getCause());
//            System.out.println("Message : " + e.getMessage());
//            e.printStackTrace();
//        }
//    }

public class capabilities {
    public AppiumDriver<MobileElement> driver;
    TouchAction touchAction;

    @BeforeTest
    public void preparation() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability(MobileCapabilityType.NO_RESET, true);
            caps.setCapability(MobileCapabilityType.APP, "/Users/afrino/Documents/java/automate/owner/app/owner-debug.apk");

//            URL url = new URL("http://localhost:4723/wd/hub");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<>(url, caps);
//            touchAction = new TouchAction(driver);
        } catch (Exception e) {
            System.out.println("Cause : " + e.getCause());
            System.out.println("Message : " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterTest
    public  void teardown() {
        driver.close();
        driver.quit();
    }
}
