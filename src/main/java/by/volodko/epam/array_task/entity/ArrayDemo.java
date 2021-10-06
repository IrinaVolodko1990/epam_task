package by.volodko.epam.array_task.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class ArrayDemo {
    private double [] array;


    public ArrayDemo(double [] array) {
        this.array = array;
    }

    public ArrayDemo() {
    }

    public double [] getArray() {
        return array.clone();
    }

    public void setArray(double[] array) {
        this.array = array.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayDemo arrayDemo = (ArrayDemo) o;

        return Arrays.equals(array, arrayDemo.array);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ArrayDemo.class.getSimpleName() + "[", "]")
                .add("array=" + Arrays.toString(array))
                .toString();
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);

    }
}