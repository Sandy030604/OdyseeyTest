package odyssey.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import odyssey.methods.Baseclass_test;
import odyssey.pageobjects.OdysseyPom;
import odyssey.utilities.OdysseyPropertyUtilities;
import odyssey.utilities.OdysseyXlCreateAccount;
import odyssey.utilities.OdysseyXlUtilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.Properties;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class Odyseeymain{
   WebDriver drivermain;
    OdysseyPom pommain;
   String urlmain;
   String browsermain;
    OdysseyPropertyUtilities pk;
    Baseclass_test sk;
    String userMain;
    String passwordMain;
    ExtentReports extent;//


   @Test(priority = 1)
   public void config()
   {
       System.out.println("Config");
   }

    @BeforeMethod
    public void beforeMethod() throws IOException {
        ExtentTest test=extent.createTest("Verify your Login");
       ExtentTest test1=extent.createTest("Verify your logout");
       drivermain.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



        OdysseyXlUtilities Xlmain;
        Xlmain =new OdysseyXlUtilities();
        Xlmain.OdysseyPropertyUtilities();
        int a=Xlmain.Od_count;
        String b=Xlmain.getUsername_Od();
        String c= Xlmain.getPassword_Od();
        System.out.println("Rows:"+a);
        System.out.println("Username:"+b);

        if(Xlmain.Od_sheet==null)
        {
            System.out.println("Sheet is null");
        }
       pommain.clickActionByXpath("/html[1]/body[1]/div[5]/section[1]/header[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[2]");
        pommain.sendkeysByXpath("/html[1]/body[1]/div[5]/section[1]/header[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]",b);
        pommain.sendkeysByXpath("/html[1]/body[1]/div[5]/section[1]/header[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]",c);
        System.out.println("Username and Password entered in Before method");
        pommain.clickActionByXpath("/html[1]/body[1]/div[5]/section[1]/header[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]");
        if(pommain.elementfindxpath("/html/body/main/section/div/div[2]/div[2]/div/div[1]/h1")==true)
        {
            test.pass("It is true");
        }
        //pommain.clickActionByXpath("/html[1]/body[1]/div[5]/section[1]/header[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[2]");
        pommain.clickActionByXpath("//a[@class='header__action-item-link hidden-pocket hidden-lap']");
        pommain.clickActionByXpath("//a[@class='popover__link-item'][normalize-space()='Logout']");
        if(pommain.elementfindxpath("/html/body/main/div[1]/section/div/header/h2")==true)
        {
            test1.pass("Logout is done");
        }

        extent.flush();

    }

    @AfterMethod
    public void afterMethod() {
    }


    @BeforeClass
    public void beforeClass() throws IOException {
//
        extent=new ExtentReports();//
        ExtentSparkReporter spark = new ExtentSparkReporter("report.html");//to mention the file type
        extent.attachReporter(spark);//to attach the report.html to the extent
        ExtentTest testCA=extent.createTest("Verify Your registration");
        pk=new OdysseyPropertyUtilities();
        urlmain=pk.getUrl();
        browsermain=pk.getbrowser();

         sk=new Baseclass_test();
        drivermain=sk.setup(urlmain,browsermain);
        pommain=new OdysseyPom(drivermain);
       drivermain.manage().window().maximize();
        drivermain.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        OdysseyXlCreateAccount CreateXl=new OdysseyXlCreateAccount();
        CreateXl.OdysseyXlCreateAccountmethod();
        int CA=CreateXl.Od_count_Create;
        System.out.println("Create Account Row"+CA);
        String CreateFname= CreateXl.CreateUsername();
        String CreateLname=CreateXl.CreatePassword();
        String CreateUId=CreateXl.CreateUsername();
        String CreatePword=CreateXl.CreatePassword();
        pommain.clickActionByXpath("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/a[2]");
        pommain.clickActionByXpath("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/div/div/div[1]/div/div/p[1]/button");
        pommain.sendkeysByXpath("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/div[1]/input",CreateFname);
        pommain.sendkeysByXpath("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/div[2]/input",CreateLname);
        pommain.sendkeysByXpath("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/div[3]/input",CreateUId);
        pommain.sendkeysByXpath("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/div[4]/input",CreatePword);
        pommain.clickActionByXpath("/html/body/div[5]/section/header/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/button");

        if(pommain.elementfindxpath("/html/body/main/section/div/form/div[1]/ul/li")==true)
        {
            testCA.fail("Account creation error");
        }

        System.out.println("BEfore class completed");






        //------------------------------------------------------------------------------------------

    }

    @AfterClass
    public void afterClass() {
    }

    @BeforeTest
    public void beforeTest() {
    }

    @AfterTest
    public void afterTest() {
    }

    @BeforeSuite
    public void beforeSuite() {
    }

    @AfterSuite
    public void afterSuite() {
    }

}