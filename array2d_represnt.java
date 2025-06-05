import java.util.*;
public class array2d_represnt {
    public static void main(String[] args) {
        int matrix[][]=new int[4][3];
        Scanner sc= new Scanner(System.in);
        int n=matrix.length;//rows or we can write n=4;
        int m=matrix[0].length;// columns or m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            
            }
            
        }
        //output\
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            
            }
            System.out.println();
            
        }
        System.out.println();
        

    }
}

