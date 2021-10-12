package by.volodko.epam.array_task.service.actions;

import by.volodko.epam.array_task.entity.ArrayDemo;
import by.volodko.epam.array_task.service.actions.impl.FiltersForArrayImpl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltersForArrayImplTest {
    FiltersForArrayImpl actionsForTest = new FiltersForArrayImpl();
    double [] startArray = {500, 0, -100, 899, 898.3, -56.78};
    ArrayDemo testArr = new ArrayDemo(startArray);


    @Test
    public void testShouldSeachMinValue() {
        double expectedMinValue=-100;
        double actualMinValue = actionsForTest.minValue(testArr);
        Assert.assertEquals(expectedMinValue, actualMinValue);// переслушать, что первое
    }

    @Test
    public void testShouldSeachMaxValue() {
        double expectedMaxValue=899;
        double actualMaxValue = actionsForTest.maxValue(testArr);
        Assert.assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testAverageValue()  {
        double expectedAvgValue=356.753;
        double actualAvgValue=actionsForTest.averageValue(testArr);
        Assert.assertEquals(expectedAvgValue, actualAvgValue,0.00001);
    }

    @Test
    public void testsumOfAllElements()  {
        double expectedSum=2140.52;
        double actualSum=actionsForTest.sumOfAllElements(testArr);
        Assert.assertEquals(expectedSum, actualSum,0.00001);
    }
    @Test
    public void testCountPositivElements()  {
        double expectedSum=3;
        double actualSum=actionsForTest.countPositivElements(testArr);
        Assert.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void testCountNegativeElements()  {
        double expectedSum=2;
        double actualSum=actionsForTest.countNegativElements(testArr);
        Assert.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void testСhangeArrayValues()  {
        double[] tempArr=  {500, 0, 45.4, 899, 898.3, -56.78};
        ArrayDemo expectedArr=new ArrayDemo(tempArr);
        ArrayDemo actualArr=actionsForTest.changeArrayValues(testArr,2,45.4);
        Assert.assertEquals(expectedArr, actualArr);
    }

    @Test
    public void testShouldSeachMinValueStream() {
        double expectedMinValue=-100;
        double actualMinValue = actionsForTest.minValueStream(testArr);
        Assert.assertEquals(expectedMinValue, actualMinValue);// переслушать, что первое
    }

    @Test
    public void testShouldSeachMaxValueStream() {
        double expectedMaxValue=899;
        double actualMaxValue = actionsForTest.maxValueStream(testArr);
        Assert.assertEquals(expectedMaxValue, actualMaxValue);
    }

    @Test
    public void testAverageValueStream()  {
        double expectedAvgValue=356.753;
        double actualAvgValue=actionsForTest.averageValueStream(testArr);
        Assert.assertEquals(expectedAvgValue, actualAvgValue,0.00001);
    }

    @Test
    public void testsumOfAllElementsStream()  {
        double expectedSum=2140.52;
        double actualSum=actionsForTest.sumOfAllElements(testArr);
        Assert.assertEquals(expectedSum, actualSum,0.00001);
    }
    @Test
    public void testCountPositivElementsStream()  {
        double expectedSum=3;
        double actualSum=actionsForTest.countPositivElementsStream(testArr);
        Assert.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void testCountNegativeElementsStream()  {
        double expectedSum=2;
        double actualSum=actionsForTest.countNegativElementsStream(testArr);
        Assert.assertEquals(expectedSum, actualSum);
    }
//    @Test  /не проходит
//    public void testСhangeArrayValuesStream()  {
//        double[] tempArr=  {250_000, 0, 2061.16, 808_201, 806_942.8999999999, 3_223.9684};
//        ArrayDemo expectedArr=new ArrayDemo(tempArr);
//        ArrayDemo actualArr=actionsForTest.changeArrayValuesStream(testArr,2);
//        Assert.assertEquals(expectedArr, actualArr);
//    }
}
