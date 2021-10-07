package by.volodko.epam.array_task.service.actions.impl;

import by.volodko.epam.array_task.entity.ArrayDemo;
import by.volodko.epam.array_task.service.actions.FiltersForArray;
import org.apache.commons.math3.util.Precision;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;


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
        logger.log(Level.INFO,"Minimal value is " + min);
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
        logger.log(Level.INFO,"Maximal value is " + max);
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
        avgValue=Precision.round(sum,3);
        logger.log(Level.INFO,"Average value is " + avgValue);
        return avgValue;
    }

    @Override
    public double sumOfAllElements(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        double sum=0;
        for (int index=0; index<doubleArr.length; index++) {
            sum+=doubleArr[index];
        }
        sum=Precision.round(sum,3);
        logger.log(Level.INFO,"Summa of all array's elements is " + sum);
        return sum;

    }

    @Override
    public int countPositivElements(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        int count=0;
        for (int index=0; index<doubleArr.length; index++) {
           if (doubleArr[index]>0){
            count++;}
        }
        logger.log(Level.INFO,"Summa of array's pozitive elements is " + count);
        return count;

    }

    @Override
    public int countNegativElements(ArrayDemo arr) {
        double [] doubleArr = arr.getArray();
        int count=0;
        for (int index=0; index<doubleArr.length; index++) {
            if (doubleArr[index]<0){
                count++;}
        }
        logger.log(Level.INFO,"Summa of array's negative elements is " + count);
        return count;
    }

    @Override
    public ArrayDemo changeArrayValues(ArrayDemo arr, int position, double newValue) {
        double [] doubleArr = arr.getArray();
        logger.log(Level.INFO,"Array before changes: " + arr.toString());
        for (int index=0; index<doubleArr.length; index++) {
            if (index==position){
                doubleArr[index]=newValue;
            }
        }

        arr.setArray(doubleArr);
        logger.log(Level.INFO,"Array after changes: " + arr.toString());
        return arr;

    }

    @Override
    public double minValueStream(ArrayDemo arr) {
        double[] doubleArr = arr.getArray();
        double min= Arrays
                .stream(doubleArr)
                .min().getAsDouble();
        logger.log(Level.INFO,"Minimal value is " + min);
        return min;
    }

    @Override
    public double maxValueStream(ArrayDemo arr) {
        double[] doubleArr = arr.getArray();
        double max = Arrays
                .stream(doubleArr)
                .max()
                .getAsDouble();
        logger.log(Level.INFO,"Maximal value is " + max);
        return max;
    }

    @Override
    public double averageValueStream(ArrayDemo arr) {
        double[] doubleArr=arr.getArray();
        double avg = Arrays
                .stream(doubleArr)
                .average()
                .getAsDouble();
        avg=Precision.round(avg,3);
       // BigDecimal bd = new BigDecimal(Double.toString(avg));
      //  bd = bd.setScale(2, RoundingMode.HALF_UP);
        logger.log(Level.INFO,"Average value is "+ avg);
       // return bd.doubleValue();
        return avg;
    }

    @Override
    public double sumOfAllElementsStream(ArrayDemo arr) {
        double[] doubleArr=arr.getArray();
        double sum = Arrays
                .stream(doubleArr)
                .sum();
        sum=Precision.round(sum,3);
        logger.log(Level.INFO,"Summa of all array's elements is "+ sum);
        return sum;
    }

    @Override
    public long countPositivElementsStream(ArrayDemo arr) {
        double[] doubleArr= arr.getArray();
        long count=Arrays
                .stream(doubleArr)
                .filter(n->n>0)
                .count();
        logger.log(Level.INFO,"Summa of array's pozitive elements is  "+ count);
        return count;
    }

    @Override
    public long countNegativElementsStream(ArrayDemo arr) {
        double[] doubleArr = arr.getArray();
        long count=Arrays
                .stream(doubleArr)
                .filter(n->n<0)
                .count();
        logger.log(Level.INFO,"Summa of array's negative elements is  "+ count);
        return count;
    }

    @Override
    public ArrayDemo changeArrayValuesStream(ArrayDemo arr, int pow) {
        double[] doubleArr= arr.getArray();
        logger.log(Level.INFO,"Array before changes: " + arr.toString());
        doubleArr=Arrays
                .stream(doubleArr)
                .map(n->Math.pow(n,pow))
                .toArray();
        arr.setArray(doubleArr);
        logger.log(Level.INFO,"Array after changes: " + arr.toString());
        return arr;
    }
}


