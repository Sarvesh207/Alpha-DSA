package Functions_Methods;

public class Prime {
    public static boolean isPrime(int n ){
        boolean isPrimeNum = true;

        for(int i=2; i<n-1; i++){
            if(n % i == 0){
                isPrimeNum  = false;
                break;
            }
        }
        return isPrimeNum;
    }
    public static void main(String[] args) {
       boolean result =  isPrime(6);
       System.out.println(result);
    }
}
