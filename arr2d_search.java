import java.util.*;
public class arr2d_search {
    public static boolean search(int arr[][],int key) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    return true;

                }

            }

        }
        return false;
        
        
        }
       
        
    
    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
       System.out.println(search(arr, 10));
        



    }
}

