package by.volodko.epam.array_task.parser;

import by.volodko.epam.array_task.exception.CustomException;

public interface StringToDoubleArrayParser {
    String STRING_SPlIT_REGEX="\\s+";
    public double[] parseStringToDouble(String contentFromFile) throws CustomException;
}
