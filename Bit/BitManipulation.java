package Bit;

/**
 * BitManipulation
 */

 //check if number is odd or even
public class BitManipulation {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if( (n & bitMask) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }

    }
    public static int setIthBit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;

    }
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n | bitMask;

    }

    public static void main(String[] args) {
        // oddOrEven(4);
        // System.out.println(getIthBit(10, 3));
      System.out.println(clearIthBit(10, 1));
    }
}