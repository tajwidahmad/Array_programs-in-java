public class largest_in_array {
    public static void maxiinarr(int arr[]) {
        int min_value=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>=min_value) {
                min_value=arr[i];
            }

        }
        System.out.println("the maximum number present in the given array is "+ min_value);
    }
    public static void main(String[] args) {
        int arr[]={2,6,1,2,9};
        maxiinarr(arr);
    }
}
