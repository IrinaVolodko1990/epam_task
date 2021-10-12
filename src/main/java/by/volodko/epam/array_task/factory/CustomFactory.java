package by.volodko.epam.array_task.factory;

import by.volodko.epam.array_task.entity.ArrayDemo;

public interface CustomFactory {
    ArrayDemo create(double... doubleToArray);
}
