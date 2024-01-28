package lesson1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * program
 */
public class Main {
    public static void main(String[] args) {
        // String s;
        // s = "best world";
        // String g = null;
        // System.out.println(g);

        // short age = 10;
        // int salary = 123456;
        // System.out.println(age);
        // System.out.println(salary);

        // float e = 1.2f;
        // double pi = 3.1415;
        // System.out.println(e);
        // System.out.println(pi);

        // char ch = 123;
        // System.out.println(ch);

        // int a = 12;
        // double d = a;
        // System.out.println(d);

        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1);

        // boolean f = true ^ false;
        // System.out.println(f);

        // var i = 3 + " {} " + 2;
        // System.out.println(i);

        // int i = 123;
        // System.out.println(Integer.MAX_VALUE);

        // int i = 123_25_6556 + 00_44;
        // System.out.println(i);

        // String s = "makeba";
        // s.length();
        // System.out.println();

        // int a = 123;
        // // a = a-- - --a;
        // // a = --a - --a;
        // a = --a - a--;
        // System.out.println(a);

        // boolean f = 123 <= 215;
        // System.out.println(f);

//         int f = 123;
//         System.out.println(f);


//        String s = "qwer1";
//        boolean b = s.length() >= 5 || s.charAt(4) == '1';
////        boolean b = s.length() >= 5 | s.charAt(4) == '1';
//        System.out.println(b);


//        -----------------------------Массивы одномерные---------------------------------------------------------------
//        int[] arr = new int[10];
//        System.out.println(arr.length);
//
//        arr = new int[] {1,2,3,4,5};
//        System.out.println(arr.length);
//
//        int[] array1 = {3,5,2,5,6,7};
//        System.out.println(array1.length);
//        System.out.println("number will be " + array1[3]);
//        System.out.printf("number = %s\n", array1[4]);
//        array1[1] = 15;
//        System.out.println(Arrays.toString(array1));

//        -----------------------------Массивы многомерные--------------------------------------------------------------

//        int[] arr[] = new int[3][5];
//        for (int[] line : arr) {
//            for (int item : line) {
//                System.out.printf("%d", item);
//            }
//            System.out.println();
//        }
//        int[] array[] = new int[3][5];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.printf("%d", array[i][j]);
//            }
//            System.out.println();
//        }
//---------------------------------------Получение данных из терминала----------------------------------------------
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s", name);
//        iScanner.close();

//        Scanner iScanner2 = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int x = iScanner2.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner2.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanner2.close();

//        Scanner iScanner3 = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner3.hasNextInt();
//        System.out.println(flag);

//        Scanner iscan1 = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int x = iscan1.nextInt();
//        Scanner iscan2 = new Scanner(System.in);
//        System.out.printf("int b: ");
//        int y = iscan2.nextInt();
//        if (x > y) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//        iScanner.close();

//
//------------------Форматированный вывод-----------------------------
//        String s = "qwe";
//        int a = 123;
//        String q = s + a;
//        System.out.println(q);

//        float pi = 3.1415f;
//        System.out.printf("%f\n", pi);      // 3.141500
//        System.out.printf("%.2f\n", pi);    // 3.14
//        System.out.printf("%.3f\n", pi);    // 3.141
//        System.out.printf("%e\n", pi);      // 3.141500e+00
//        System.out.printf("%.2e\n", pi);    // 3.14e+00
//        System.out.printf("%.3e\n", pi);    // 3.141e+00

//        int b = 999;
//        {
//            int a = 345;
//            System.out.println(a + b);
//        }
//        int a = 123;
//        System.out.println(a);


//-------------Функции и методы---------------------
        // Recursion
//        static double factor(int n) {
//            if (n==1) return 1;
//            return n * factor(n - 1);
//        }

//        Scanner iS = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int a = iS.nextInt();
//        Scanner iS2 = new Scanner(System.in);
//        System.out.printf("int b: ");
//        int b = iS2.nextInt();
//        int c;
//        if (a > b) {
//            c = a;
//        } else {
//            c = b;
//        }
//        System.out.println(c);

        // Тернарный оператор
//        int min = a > b ? a : b;
//        System.out.println(min);

//        int a = 1;
//        int b = 2;
//        int min = a < b ? a : b;
//        System.out.println(min);

//        int value = 321;
//        int count = 0;
//
//        while (value != 0) {
//            value /= 10;
//            count++;
//        }
//        System.out.println(count);


        // -------------------------Continue & Break--------------------------------------------

//        for (int i = 0; i < 15; i++) {
//            if (i % 2 != 0)
//                break;
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < 15; i++) {
//            if (i % 2 == 0)
//                continue;
//            System.out.println(i);
//        }

//        int s = 0;
//        for (int i = 1; i <= 10; i++) {
//            s += i;
//        }
//        System.out.println(s);  // 1+2+3+4+5+6+7+8+9+10 = 55

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *

//        int[] arr = new int[] {1,2,3,4,5,6,77};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 77;
//        }
//
//        for (int item : arr) {
//            System.out.println(item);
//        }







//          System.out.printf("6 %4d" + "%10d \n", 6, 6);
        // System.out.printf("6 %3d" + "%10d" + "%2d \n", 6, 6, 6);
        // System.out.printf("6 %2d" + "%10d" + "%4d \n",6, 6, 6);
        // System.out.printf("6 %1d" + "%10d" + " 6 6 " + "%1d \n", 6, 6, 6);
        // System.out.printf("6 %2d" + "%8d" + "%8d \n", 6, 6, 6);
        // System.out.printf("6 %3d" + "%6d" + "%10d \n", 6, 6, 6);
        // System.out.printf("6 %4d" + "%4d" + "%12d \n",6, 6, 6);

        // System.out.printf("String %.2f", 10.230215);

//         String numbers = "0123456789";
//
//         StringBuffer sb = new StringBuffer(numbers);
//
//         System.out.println(sb.substring(3)); // 3456789
//         System.out.println(sb.substring(4, 8)); // 4567
//         System.out.println(sb.replace(3, 5, "ABCDE")); // 012ABCDE56789
//
//         sb = new StringBuffer(numbers);
//         System.out.println(sb.reverse()); // 9876543210
//         sb.reverse(); // Вернем изначальный порядок
//
//         sb = new StringBuffer(numbers);
//         System.out.println(sb.delete(5, 9)); // 012349
//         System.out.println(sb.deleteCharAt(1)); // 02349
//         System.out.println(sb.insert(1, "One")); // 0One2349
//         System.out.println("java");

    }

}
