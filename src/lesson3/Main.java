package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ---------способ 1----------
//        int day = 29;
//        int month = 9;
//        int year = 1990;
//        Integer[] date = { day, month, year };
//        List<Integer> d = Arrays.asList(date);   // сформировываем коллекцию
//        System.out.println(d);

        //----------способ 2------------
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[] { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);
        date[1] = new StringBuilder("09");
        System.out.println(d);

    }
}
