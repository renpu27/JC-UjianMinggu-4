package test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CatatanKeuangan;

import java.net.MalformedURLException;
import java.net.URL;

public class TestCatatanKeuangan {
    private static AndroidDriver<MobileElement> driver;
    public CatatanKeuangan ck;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("devicename", "POCO X3 Pro");
        dc.setCapability("udid", "c09ea964");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "12");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        }

        @BeforeMethod
        public void pageObject() {
            ck = new CatatanKeuangan(driver);
            ck.setUp();
        }

        @Test(priority = 1)
        public void testPengeluaran() {
            ck.pengeluaran();
            System.out.println("Keterangan = "+ck.getTxtDesc());
            Assert.assertEquals(ck.getTxtDesc(),"Bensin");
        }

        @Test(priority = 2)
        public void testPemasukan() {
            ck.pemasukan();
            System.out.println("Keterangan = "+ck.getTxtDesc());
            Assert.assertEquals(ck.getTxtDesc(),"Jual Ganja");
        }

        @AfterClass
        public void closeApp() {
            driver.quit();
        }
}
