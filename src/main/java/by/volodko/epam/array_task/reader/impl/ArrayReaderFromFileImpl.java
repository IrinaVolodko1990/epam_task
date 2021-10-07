package by.volodko.epam.array_task.reader.impl;

import by.volodko.epam.array_task.exception.CustomException;
import by.volodko.epam.array_task.parser.impl.StringToDoubleParserImpl;
import by.volodko.epam.array_task.reader.ArrayReaderFromFile;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;


public class ArrayReaderFromFileImpl implements ArrayReaderFromFile {
    static Logger logger = LogManager.getLogger();

    public ArrayReaderFromFileImpl(String path) {
    }

    @Override
    public double[] readFromFile(String pathToFile) throws CustomException {

        double[] doubleArray;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(pathToFile)))) {
            String stringFromFile = reader.readLine();
            StringToDoubleParserImpl parser = new StringToDoubleParserImpl();
            doubleArray = parser.parseStringToDouble(stringFromFile);


        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR,"Oops, file " + pathToFile + " not found", e);
           throw new CustomException("File " + pathToFile + " not found", e);

        } catch (IOException e) {
            logger.log(Level.ERROR,"IO exception: ", e);
          throw new CustomException("IO exception: " + e);
        }

        return doubleArray;
    }

}