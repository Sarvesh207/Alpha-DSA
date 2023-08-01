package Practice_DSA.Arrays;

public class SpanofArrays {
    public static int findSpan(int arr [] ){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            } 

            if(arr[i] < min){
                min = arr[i];
            }

              
            
        }

        return max - min ;
    }
    
    public static void main(String[] args) {
        int arr [] = {5, 6, 15, 40, 22};
         
        int result  = findSpan(arr);
        System.out.println(" this is the span of array "+ result);
    }
}
