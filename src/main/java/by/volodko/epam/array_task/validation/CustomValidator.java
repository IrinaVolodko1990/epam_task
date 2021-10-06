package by.volodko.epam.array_task.validation;



public interface CustomValidator  {
    String STRING_TO_DOUBLE_REGEXP = "-?\\d*\\.?\\d+";

    boolean isValid(String parametr) ;


}
