package Array;
import javax.sound.sampled.SourceDataLine;

public class Arrray {
    public static void print(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr [] = {12,22,99};
        print(arr);
    }
    
}
