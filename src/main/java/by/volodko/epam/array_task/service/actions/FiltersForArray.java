package by.volodko.epam.array_task.service.actions;

import by.volodko.epam.array_task.entity.ArrayDemo;

import java.util.Arrays;

public interface FiltersForArray {

    double minValue(ArrayDemo arr);

    double maxValue(ArrayDemo arr);

    double averageValue(ArrayDemo arr);

    double sumOfAllElements(ArrayDemo arr);

    int countPositivElements(ArrayDemo arr);

    int countNegativElements (ArrayDemo arr);

    ArrayDemo changeArrayValues (ArrayDemo arr, int position, double newValue);


    double minValueStream(ArrayDemo arr);

    double maxValueStream (ArrayDemo arr);

    double averageValueStream(ArrayDemo arr);

    double sumOfAllElementsStream(ArrayDemo arr);

    long countPositivElementsStream(ArrayDemo arr);

    long countNegativElementsStream (ArrayDemo arr);

    ArrayDemo changeArrayValuesStream (ArrayDemo arr, int pow);

}
