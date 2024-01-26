package org.vitaliistf;

import org.testng.annotations.DataProvider;

public class StaticDataProvider {

    @DataProvider(name = "calculateFunctionData")
    public static Object[][] calculateFunctionData() {
        return new Object[][]{
                {0.3, 3.1487},
                {2.3, 13.89},
                {2.8, -2.45315}
        };
    }

    @DataProvider(name = "calculateStepsData")
    public static Object[][] calculateStepsData() {
        return new Object[][]{
                {0.2, 2.8, 0.002, 1301},
                {10, 9, 0.002, 0}
        };
    }

    @DataProvider(name = "createXArrayData")
    public static Object[][] createXArrayData() {
        return new Object[][]{
                {50, 0.3},
                {1050, 2.3},
                {1300, 2.8}
        };
    }

    @DataProvider(name = "createYArrayData")
    public static Object[][] createYArrayData() {
        return new Object[][]{
                {50, 3.1487},
                {1050, 13.89},
                {1300, -2.45315}
        };
    }

    @DataProvider(name = "getMaxElementIndexXArrayData")
    public static Object[][] getMaxElementIndexXArrayData() {
        return new Object[][]{
                {1300}
        };
    }

    @DataProvider(name = "getMaxElementIndexYArrayData")
    public static Object[][] getMaxElementIndexYArrayData() {
        return new Object[][]{
                {51}
        };
    }

    @DataProvider(name = "getMaxElementIndexData")
    public Object[][] getMaxElementIndexData() {
        return new Object[][]{
                {new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, 4},
                {new double[]{5.0, 4.0, 3.0, 2.0, 1.0}, 0},
                {new double[]{3.2, 10.5, 8.7, 5.5, 2.0}, 1},
                {new double[]{}, -1}
        };
    }

    @DataProvider(name = "getMinElementIndexXArrayData")
    public static Object[][] getMinElementIndexXArrayData() {
        return new Object[][]{
                {0}
        };
    }

    @DataProvider(name = "getMinElementIndexYArrayData")
    public static Object[][] getMinElementIndexYArrayData() {
        return new Object[][]{
                {1051}
        };
    }

    @DataProvider(name = "getMinElementIndexData")
    public Object[][] getMinElementIndexData() {
        return new Object[][]{
                {new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, 0},
                {new double[]{5.0, 4.0, 3.0, 2.0, 1.0}, 4},
                {new double[]{3.2, 10.5, 8.7, 2.0, 5.5}, 3},
                {new double[]{}, -1}
        };
    }

    @DataProvider(name = "calculateSumXArrayData")
    public static Object[][] calculateSumXArrayData() {
        return new Object[][]{
                {1951.5}
        };
    }

    @DataProvider(name = "calculateSumData")
    public Object[][] calculateSumData() {
        return new Object[][]{
                {new double[]{1.0, 2.0, 3.0}, 6.0},
                {new double[]{4.5, 3.0, 1.5}, 9.0},
                {new double[]{-1.0, 0.0, 1.0}, 0.0}
        };
    }

    @DataProvider(name = "calculateAverageXArrayData")
    public static Object[][] calculateAverageXArrayData() {
        return new Object[][]{
                {1.5}
        };
    }

    @DataProvider(name = "calculateAverageData")
    public Object[][] calculateAverageData() {
        return new Object[][]{
                {new double[]{1.0, 2.0, 3.0}, 2.0},
                {new double[]{4.5, 3.0, 1.5}, 3.0},
                {new double[]{-1.0, 0.0, 1.0}, 0.0}
        };
    }
}
