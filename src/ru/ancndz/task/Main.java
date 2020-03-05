package ru.ancndz.task;

public class Main {

    public static void main(String[] args) {

        //сортировка массива
        first_zad();
        System.out.println();
        //"нормализация" размера
        second_zad();
    }

    static void first_zad(){
        int[] array = {0, 1, 3, 4, 6, 7, 44, -1, -23, 34, 4};
        System.out.print("Orig.:");
        for (int each: array) {
            System.out.print(each + " ");
        }

        //сортировка
        ArraySort sort = new ArraySort();
        sort.Sorting(array);

        System.out.print("\nNew:");
        for (int each: array) {
            System.out.print(each + " ");
        }
    }

    static void second_zad() {

        long b = 92233L;

        //check out: https://convertlive.com/u/convert/bytes/to/kilobytes
        ByteFormat form = new ByteFormat();
        String s = form.formatting(b);
        System.out.print(s);
    }
}
