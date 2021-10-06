package by.volodko.epam.array_task.reader;

import by.volodko.epam.array_task.exception.CustomException;


public interface ArrayReaderFromFile {
    double[] readFromFile (String fileName) throws CustomException;
}
