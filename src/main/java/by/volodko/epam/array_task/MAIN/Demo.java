package by.volodko.epam.array_task.MAIN;

import by.volodko.epam.array_task.entity.ArrayDemo;
import by.volodko.epam.array_task.exception.CustomException;
import by.volodko.epam.array_task.factory.impl.CustomFactoryImpl;
import by.volodko.epam.array_task.reader.impl.ArrayReaderFromFileImpl;
import by.volodko.epam.array_task.service.actions.impl.FiltersForArrayImpl;
import by.volodko.epam.array_task.service.sort.impl.ArraySorterImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;


public class Demo {
    public static void main(String[] args) throws IOException, CustomException {

        Logger logger =  LogManager.getLogger();
     String pathToFile= "D:\\epam_task\\src\\main\\resources\\data\\arraysData.txt";
       // String pathToFile= "\\resources\\data\\arraysData.txt";// почему-то так не работает??

     ArrayReaderFromFileImpl reader= new ArrayReaderFromFileImpl(pathToFile);
     double[] n= reader.readFromFile(pathToFile);
        CustomFactoryImpl create = new CustomFactoryImpl();
        ArrayDemo arr=create.create(n);
        FiltersForArrayImpl action = new FiltersForArrayImpl();
       action.changeArrayValuesStream(arr,2);
        ArraySorterImpl sorter= new ArraySorterImpl();
       // sorter.insertionSort(arr);






    }
}
