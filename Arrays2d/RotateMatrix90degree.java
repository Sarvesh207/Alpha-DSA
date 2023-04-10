package Arrays2d;

import java.util.Scanner;

public class RotateMatrix90degree {
    public static void roated90Degree(int [][]matrix){

        int n = matrix.length;
        // Approch 1 
        // int rotateMatrix [][] = new int[n][n];
        // for(int i=0; i<n;i++){
        //     for(int j=0; j<n; j++){
        //         rotateMatrix[j][n - 1 - i] = matrix[i][j];
        //     }
        // }

        // 2nd Approch
        //   first make of tranpose of matrix 
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse thr matrix row

        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }


        //print

        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        int matrix [][] ={{1,2,3},{4,5,6},{7,8,9}};
        roated90Degree(matrix);

        
    }


}
