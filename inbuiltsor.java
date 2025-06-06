import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class inbuiltsor {
    public static void main(String[] args) {
        //int arr[]={3,4,2,1,5};
        //Arrays.sort(arr);

        
        //to sort the array in reverse order
        Integer arr[]={3,4,2,1,5};
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        
        }
        System.out.println();
    }
}
