public class pairs_in_array{
public static void array_pairs(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int first = arr[i];
            for(int j=i+1;j<arr.length;j++){
                int second = arr[j];
                System.out.print("("+first+","+second+")");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,8,10};
        array_pairs(arr);
    }
}