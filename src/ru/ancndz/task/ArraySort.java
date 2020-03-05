package ru.ancndz.task;

public class ArraySort {

    public int[] Sorting(int[] array) {
        //сортировка
        sort(array, 0, array.length - 1);
        return array;
    }

    int part(int[] array, int begin, int mainObj) {
        int counter = begin;
        for (int i = begin; i < mainObj; i++) {
            if (array[i] < array[mainObj]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[mainObj];
        array[mainObj] = array[counter];
        array[counter] = temp;

        //возвращаем кол-во перемещенных элементов (новая позиция)
        return counter;
    }

    void sort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int mainObj = part(array, begin, end);
        sort(array, begin, mainObj - 1); //left
        sort(array, mainObj + 1, end); //right
    }
}
