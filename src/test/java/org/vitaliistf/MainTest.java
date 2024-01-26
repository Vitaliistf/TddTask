package org.vitaliistf;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class MainTest {

    private final static double EPSILON = 1e-4;
    private final static double START = 0.2;
    private final static double END = 2.8;
    private final static double STEP = 0.002;

    private Main main;

    @BeforeMethod
    public void setUp() {
        main = new Main();
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "calculateFunctionData")
    public void testCalculateFunction(double x, double expected) {
        double actual = main.calculateFunction(x);
        assertEquals(actual, expected, EPSILON, "Incorrect function value for " + x);
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "calculateStepsData")
    public void testCalculateSteps(double start, double end, double step, int expected) {
        int actual = main.calculateSteps(start, end, step);
        assertEquals(actual, expected, "Incorrect number of steps for start = " + start +
                ", end = " + end + ", step = " + step);
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "createXArrayData")
    public void testCreateXArray(int index, double expected) {
        double[] x = main.createXArray(START, END, STEP);
        assertEquals(x[index], expected, EPSILON, "Incorrect x array");
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "createYArrayData")
    public void testCreateYArray(int index, double expected) {
        double[] x = main.createXArray(START, END, STEP);
        double[] y = main.createYArray(x);
        assertEquals(y[index], expected, EPSILON, "Incorrect y array");
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "getMaxElementIndexXArrayData")
    public void testGetMaxElementIndexXArray(int expected) {
        double[] x = main.createXArray(START, END, STEP);
        int actual = main.getMaxElementIndex(x);
        assertEquals(actual, expected, "Incorrect max for x array");
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "getMaxElementIndexYArrayData")
    public void testGetMaxElementIndexYArray(int expected) {
        double[] x = main.createXArray(START, END, STEP);
        double[] y = main.createYArray(x);
        int actual = main.getMaxElementIndex(y);
        assertEquals(actual, expected, "Incorrect max for y array");
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "getMaxElementIndexData")
    public void testGetMaxElementIndex(double[] arr, int expected) {
        int actual = main.getMaxElementIndex(arr);
        assertEquals(actual, expected, "Incorrect max for array: " + Arrays.toString(arr));
    }


    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "getMinElementIndexXArrayData")
    public void testGetMinElementIndexXArray(int expected) {
        double[] x = main.createXArray(START, END, STEP);
        int actual = main.getMinElementIndex(x);
        assertEquals(actual, expected, "Incorrect min for x array");
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "getMinElementIndexYArrayData")
    public void testGetMinElementIndexYArray(int expected) {
        double[] x = main.createXArray(START, END, STEP);
        double[] y = main.createYArray(x);
        int actual = main.getMinElementIndex(y);
        assertEquals(actual, expected, "Incorrect min for y array");
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "getMinElementIndexData")
    public void testGetMinElementIndex(double[] arr, int expected) {
        int actual = main.getMinElementIndex(arr);
        assertEquals(actual, expected, "Incorrect min for array: " + Arrays.toString(arr));
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "calculateSumXArrayData")
    public void testCalculateSumXArray(double expected) {
        double[] x = main.createXArray(START, END, STEP);
        double actual = main.calculateSum(x);
        assertEquals(actual, expected, EPSILON, "Incorrect sum for x array");
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "calculateSumData")
    public void testCalculateSum(double[] arr, double expected) {
        double actualSum = main.calculateSum(arr);
        assertEquals(actualSum, expected, 0.001, "Incorrect sum for array: " + Arrays.toString(arr));
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "calculateAverageXArrayData")
    public void testCalculateAverageXArray(double expected) {
        double[] x = main.createXArray(START, END, STEP);
        double actual = main.calculateAverage(x);
        assertEquals(actual, expected, EPSILON, "Incorrect average for x array");
    }

    @Test(dataProviderClass = StaticDataProvider.class, dataProvider = "calculateAverageData")
    public void testCalculateAverage(double[] arr, double expected) {
        double actualAverage = main.calculateAverage(arr);
        assertEquals(actualAverage, expected, 0.001, "Incorrect average for array: " + Arrays.toString(arr));
    }
}
