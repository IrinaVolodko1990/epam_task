package by.volodko.epam.array_task.parser.impl;

import by.volodko.epam.array_task.exception.CustomException;
import by.volodko.epam.array_task.parser.StringToDoubleArrayParser;
import by.volodko.epam.array_task.validation.impl.CustomValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class StringToDoubleParserImpl implements StringToDoubleArrayParser {

    static Logger logger = LogManager.getLogger();

    @Override
    public double[] parseStringToDouble(String contentFromFile) throws CustomException{

        String[] stringArray;
        if (contentFromFile!=null){
        stringArray=contentFromFile.split(STRING_SPlIT_REGEX);}
        else
            { logger.error("File is empty");
                throw new CustomException("File is empty");
            }

        CustomValidatorImpl validator = new CustomValidatorImpl();
        double[] doubleArray = new double[stringArray.length];

            for (int index=0; index<stringArray.length; index++) {
                if (validator.isValid(stringArray[index])) {
                    doubleArray[index]=Double.parseDouble(stringArray[index]);
            }
            else {logger.error("File contains incorrect data, reading stopped at" +
                        " element " +(index+1)+" out of "+ stringArray.length);
                    throw new CustomException("File contains incorrect data");
                }
            }

        return doubleArray;
    }

}



