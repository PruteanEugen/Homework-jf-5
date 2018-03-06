package md.tekwill;

import java.util.Scanner;

public class Exercise3 {

    /*
    Write a program that would determine minimal number in an array.
    Input: {256, 16, 32, 8, 4, 512}
    OUT: 4
    */
    public static void main(String[] args) {
        int[] inputArray = {256,16,32,8,512};
        int min = inputArray[0];

        for (int inputElement : inputArray)
            min = inputElement < min ? inputElement : min;

        System.out.println(min);
    }
}
