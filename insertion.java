import java.util.Arrays;
public class insertion {
    public static void insertion_sort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev =i-1;
            //finding the correct location;
            while (prev>=0&&arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
                
            }
            //insertion
            arr[prev+1]=curr;

        }
        //printing
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertion_sort(arr);
        /*Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(
                arr[i]+" "
            );
            
        }*/


    

        }
           }


