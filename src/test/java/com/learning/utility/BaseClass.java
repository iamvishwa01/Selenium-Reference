package com.learning.utility;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.learning.WebElement_learning.allpagesElement;
import com.learning.pages.SauceLabs_Login;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import static com.learning.utility.LogUtility.*;
public class BaseClass {

    public static Logger logger;
   //public static WebDriver driver;
   public static RemoteWebDriver driver;
    ReadConfig readConfig = new ReadConfig();
   public ExtentReports extent = new ExtentReports();
   public ExtentTest extentTest;
    public SauceLabs_Login sp;
    public allpagesElement al;
    public static final String TestData_FILEPATH = System.getProperty("user.dir"+"/TestData");
    public static final String TestData_FILENAME = "TestData.xlsx";

    public static String captureScreenshot(WebDriver driver,String screenshotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }

    public static String formatdate() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }

    @Parameters(value ="browser")
    @BeforeClass
    public void setup(String br) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        logger = Logger.getLogger("swaglabs");
//        PropertyConfigurator.configure(System.getProperty("user.dir")+"/configuration/log4j.properties");
//        DesiredCapabilities dc =  DesiredCapabilities.chrome();
//        URL url = new URL("http://192.168.1.108:4444/");
        startTestCase("Starting the test");
        if (br.equals("chrome")||br.equals("headlessChrome")) {
            // driver = new RemoteWebDriver(url,dc);
            ChromeOptions co = new ChromeOptions();
            System.setProperty("webdriver.chrome.driver", readConfig.getCdriver());
            driver = new ChromeDriver(co);
            info("Chrome browser launched");
            info("Remote Chrome browser launched");
        }

        else if (br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", readConfig.getFdriver());
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(new FirefoxProfile());
            driver = new FirefoxDriver(options);
            info("Firefox browser launched");
        } else if(br.equals("Edge")){
            System.setProperty("webdriver.edge.driver",readConfig.getEdgeDriver());
            driver = new EdgeDriver();
            info("Edge browser launched");
        } else {
            info("Please select a browser or provide a browser");
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       info("Browser Maximized");

    }
    @AfterClass
        public void Teardown(){
       driver.quit();
        endTestCase("Test done !");
    }


}
