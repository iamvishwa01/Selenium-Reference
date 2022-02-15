package com.learning.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
      System.out.println("Test is Success");
        System.out.println(result.getName() + " "+ "test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed ");
        System.out.println(result.getName() + " "+ "test Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped" + result.getName());
        System.out.println(result.getName() + " "+ "test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
