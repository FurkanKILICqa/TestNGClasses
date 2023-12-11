package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.FileNotFoundException;

public class Listeners implements ITestListener {

    //ITestListener bir interface dir daloaysıyla implements yaparız


    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart==> Tum testlerden once tek bir kere cagirilir  :  "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish==> Tum testlerden sonra tek bir kere cagirilir  :  " +context.getName() );
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart==> her bir @Test ten once bir kere cagirilir  :  "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess==> sadece pass olan testlerden sonra bir kere cagirilir  :  "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure==> sadece fail olan testlerden sonra bir kere cagirilir  :  "+result.getName());
        try {
            ReusableMethods.screenShot(result.getName());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped==> sadece atlanan testlerden sonra bir kere cagirilir  :  "+result.getName());
    }
}
