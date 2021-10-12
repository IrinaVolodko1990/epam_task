package by.volodko.epam.array_task.service.sort;

import by.volodko.epam.array_task.entity.ArrayDemo;
import by.volodko.epam.array_task.service.sort.impl.ArraySorterImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySorterImplTest {
    @Test
    public void testShouldSortArray() {

        ArraySorterImpl sorter = new ArraySorterImpl();
        double [] startArray = {500, 0, -100, 899, 898.3, -56.78};
        double [] sortedArray = { -100, -56.78, 0, 500, 898.3, 899};
        ArrayDemo testArr = new ArrayDemo(startArray);
        ArrayDemo arrToBeCompared = new ArrayDemo(sortedArray);

        sorter.bubleSort(testArr);

        Assert.assertEquals(arrToBeCompared, testArr);
    }
}
