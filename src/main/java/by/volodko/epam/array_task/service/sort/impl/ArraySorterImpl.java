package by.volodko.epam.array_task.service.sort.impl;

import by.volodko.epam.array_task.entity.ArrayDemo;
import by.volodko.epam.array_task.service.sort.ArraySorter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySorterImpl implements ArraySorter {
    static Logger logger = LogManager.getLogger();

    @Override
    public ArrayDemo bubleSort(ArrayDemo arr) {
        double[] doubleArr = arr.getArray();
        logger.log(Level.INFO,"Array before buble sorting: " + arr.toString());
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int index = 1; index < doubleArr.length; index++) {
                if (doubleArr[index] < doubleArr[index - 1]) {
                    double tmp = doubleArr[index];
                    doubleArr[index] = doubleArr[index - 1];
                    doubleArr[index - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        arr.setArray(doubleArr);
        logger.log(Level.INFO,"Array after buble sorting: " + arr.toString());
        return arr;
    }

    @Override
    public ArrayDemo insertionSort(ArrayDemo arr) {
        double[] doubleArr = arr.getArray();
        logger.log(Level.INFO,"Array before insertion sorting: " + arr.toString());
        for (int index = 0; index < doubleArr.length; index++) {
            double value = doubleArr[index];
            int i;
            for (i = index - 1; i >= 0; i--) {
                if (value < doubleArr[i]) {
                    doubleArr[i + 1] = doubleArr[i];
                } else {
                    break;
                }
            }
            doubleArr[i + 1] = value;
        }
            arr.setArray(doubleArr);
            logger.log(Level.INFO,"Array after insertion sorting: " + arr.toString());
            return arr;
        }

    @Override
    public ArrayDemo easySort(ArrayDemo arr) {
        double[] doubleArr = arr.getArray();
        logger.log(Level.INFO,"Array before easy sorting: " + arr.toString());
        Arrays.sort(doubleArr);

        arr.setArray(doubleArr);
        logger.log(Level.INFO,"Array after easy sorting: " + arr.toString());
        return arr;

    }

    @Override
    public ArrayDemo sortByStream(ArrayDemo arr) {
        double[] doubleArr = arr.getArray();
        logger.log(Level.INFO,"Array before Stream sorting: " + arr.toString());
        double[] sortArr = Arrays.stream(doubleArr).sorted().toArray();
        arr.setArray(sortArr);
        logger.log(Level.INFO,"Array after Stream sorting: " + arr.toString());
        return arr;

    }


}
