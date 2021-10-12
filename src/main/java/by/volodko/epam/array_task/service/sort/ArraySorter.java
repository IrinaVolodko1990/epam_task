package by.volodko.epam.array_task.service.sort;

import by.volodko.epam.array_task.entity.ArrayDemo;

public interface ArraySorter {
    ArrayDemo bubleSort(ArrayDemo arr);

    ArrayDemo insertionSort(ArrayDemo arr);

    ArrayDemo easySort(ArrayDemo arr);

    ArrayDemo sortByStream(ArrayDemo arr);


}
