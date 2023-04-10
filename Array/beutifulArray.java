package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

import javax.swing.undo.UndoManager;

/**
 * Input: 4 2 -2 1
 * Output: 4 1
 * Explanation: As at indices 1 and 2 , 2 and -2 have
 * different sign, they are removed. And the the final
 * array is: 4 1.
 */

public class beutifulArray {
    public static ArrayList<Integer> BeutifulArray(int[] arr) {

        Stack<Integer> list = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.push(arr[i]);
            } else if (list.peek() >= 0 && arr[i] < 0 || list.peek() < 0 && arr[i] >= 0) {
                list.pop();
            } else {
                list.pop();
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while(!list.isEmpty()){
            result.add(list.peek());
            list.pop();
        }

        Collections.reverse(result);

        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, -2, 1 };

        // ArrayList<Integer> result = BeutifulArray(arr);
        System.out.println(BeutifulArray(arr));
       
    //     int i=0; 
    //    while(!result.isEmpty()){
    //     System.out.println("hii");
    //     System.out.print(result.get(i)+" ");
    //     i++;
    //    }
    }

}
