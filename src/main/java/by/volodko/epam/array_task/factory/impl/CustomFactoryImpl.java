package by.volodko.epam.array_task.factory.impl;

import by.volodko.epam.array_task.entity.ArrayDemo;
import by.volodko.epam.array_task.factory.CustomFactory;


public class CustomFactoryImpl implements CustomFactory {

    @Override
    public ArrayDemo create(double... doubleToArray) {
        return new ArrayDemo(doubleToArray);
    }
}
