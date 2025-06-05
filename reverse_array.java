public class reverse_array{
    public static void reverse_array(int arr[]) {
        int start=0;
        int end=arr.length-1;
        int temp=0;
        while (start<end) {
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;

            
        }
        
    }
    public static void main(String[] args) {
       int arr[]={2,3,6,8,10};
       reverse_array(arr);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
       
    }
}