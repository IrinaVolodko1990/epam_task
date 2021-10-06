package by.volodko.epam.array_task.service.actions.impl;

import by.volodko.epam.array_task.entity.ArrayDemo;
import by.volodko.epam.array_task.service.actions.FiltersForArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class FiltersForArrayImpl implements FiltersForArray {
    static Logger logger= LogManager.getLogger();

    @Override
    public double minValue(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        double min = doubleArr[0];
        for (int index = 1; index<doubleArr.length; index++){
            if (min > doubleArr[index]) {
                min=doubleArr[index];

            }
        }
        logger.info("Minimal value is " + min);
        return min;
    }

    @Override
    public double maxValue(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        double max = doubleArr[0];
        for (int index = 1; index<doubleArr.length; index++){
            if (max < doubleArr[index]) {
                max=doubleArr[index];

            }
        }
        logger.info("Maximum value is " + max);
        return max;
    }

    @Override
    public double averageValue(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        double avgValue;
        double sum=0;
        for (int index=0; index<doubleArr.length; index++) {
            sum+=doubleArr[index];
        }
        avgValue= sum/doubleArr.length;
        logger.info("Average value is " + avgValue);
        return avgValue;
    }

    @Override
    public double sumOfAllElements(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        double sum=0;
        for (int index=0; index<doubleArr.length; index++) {
            sum+=doubleArr[index];
        }

        logger.info("Summa of all array's elements is " + sum);
        return sum;

    }

    @Override
    public double countPositivElements(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        int count=0;
        for (int index=0; index<doubleArr.length; index++) {
           if (doubleArr[index]>0){
            count++;}
        }
        logger.info("Summa of array's pozitive elements is " + count);
        return count;

    }

    @Override
    public double countNegativElements(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        int count=0;
        for (int index=0; index<doubleArr.length; index++) {
            if (doubleArr[index]<0){
                count++;}
        }
        logger.info("Summa of array's negative elements is " + count);
        return count;
    }

    @Override
    public ArrayDemo changeArrayValues(ArrayDemo arr, int position, double newValue) {
        double [] doubleArr = arr.getArray();
        int elementPosition = position;
        double upgradeValue = newValue;

        for (int index=0; index<doubleArr.length; index++) {
            if (index==elementPosition){
                doubleArr[index]=upgradeValue;
            }
        }

        arr.setArray(doubleArr);
        logger.info("Array after changes: " + arr.toString());
        return arr;

    }
}
