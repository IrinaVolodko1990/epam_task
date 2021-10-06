package by.volodko.epam.array_task.service.actions;

import by.volodko.epam.array_task.entity.ArrayDemo;

public interface FiltersForArray {
    double minValue(ArrayDemo arr);

    double maxValue(ArrayDemo arr);

    double averageValue(ArrayDemo arr);

    double sumOfAllElements(ArrayDemo arr);

    double countPositivElements(ArrayDemo arr);

    double countNegativElements (ArrayDemo arr);

    ArrayDemo changeArrayValues (ArrayDemo arr, int position, double newValue);

}
