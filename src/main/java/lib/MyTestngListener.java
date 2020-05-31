package lib;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyTestngListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Start date test scenario: " + context.getStartDate());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finish date test scenario: " + context.getEndDate());
    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test name "+result.getName()+" result success. Test time: " + (result.getEndMillis() - result.getStartMillis())/1000 +" s.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test name "+result.getName()+" result failure. Test time: " + (result.getEndMillis() - result.getStartMillis())/1000 +" s.");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test name "+result.getName()+" result skipped. Test time: " + (result.getEndMillis() - result.getStartMillis())/1000 +" s.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test name "+result.getName()+" result failed but within success percentage. Test time: " + (result.getEndMillis() - result.getStartMillis())/1000 +" s.");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test name "+result.getName()+" result failed with timeout. Test time: " + (result.getEndMillis() - result.getStartMillis())/1000 +" s.");
    }
}
