package org.example;

public class Main {
    public static void main() {

//        Exercise 1: Try to find out what the ! operator does by assigning different values to b.

        boolean b = true;

//        !b changes true to false.
//        If b is already false, !b changes it to true.
        System.out.println(!b);

//        Exercise 2: Try to find out what the || operator does by assigning different values to a and b.

        boolean x = true;
        boolean y = false;

//        The result is true if at least one variable is true.
//        The result is false only if both variables are false.
        System.out.println(y || x);


//        Exercise 3: Try to find out what the || operator does by assigning different values to a and b.

        boolean a = true;
        boolean c = false;

//        The result is false if at least one variable is false.
//        The result is true only if both variables are true.
        System.out.println(a && c);


//        Exercise 4:

        int r = 16;
        int j = 8;

        boolean greaterThan10 = r > 10 && j > 10;
        System.out.println("r and j are greater than 10: " + greaterThan10);    // false

        boolean smallerThan10 = r < 10 || j < 10;
        System.out.println("r or j are smaller than 10: " + smallerThan10);     // true

        boolean isTwoTimesBigger = r >= j * 2;
        System.out.println("r is at least two times bigger than j: " + isTwoTimesBigger);   // true
    }
}
