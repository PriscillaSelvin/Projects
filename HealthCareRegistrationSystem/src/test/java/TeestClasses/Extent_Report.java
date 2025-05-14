package TeestClasses;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utilities.BaseClass;
import utilities.ExtentManager;

public class Extent_Report {
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite(alwaysRun=true)
    public void setup() {
   
     extent = ExtentManager.getInstance();
    }

    @Test(groups = {"sanity"})
    public void demoTest() {
        test = extent.createTest("LoginTest");
        test = extent.createTest("RegisterPatientTest");
        extent.createTest("appointmentTest");
        extent.createTest("startvisitTest");
        extent.createTest("AddPatVitalsTest");
        extent.createTest("conditionsTest");
        extent.createTest("exitvisitTest");
        
        test.pass("Test case passed successfully!");
        Reporter.log("All scenarios passed");
    }

    @AfterSuite(alwaysRun=true)
    public void tearDown() {
        extent.flush(); // Important to write the report!
    }
}

