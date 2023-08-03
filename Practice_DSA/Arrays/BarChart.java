package Practice_DSA.Arrays;

import java.util.Scanner;

public class BarChart {
    private Object system;

    public static void main(String[] args) {

       

       int n = 5;
       int arr [] ={5,2,9,4,1,6};

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int floor = max; floor >= 0; floor++) {
            for (int i = 0; i < n; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}
