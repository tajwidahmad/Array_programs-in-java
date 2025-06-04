public class binary_search {
    public static int binary_search(int arr[],int key){
        int start=arr[0];
        int end = arr.length-1;
        int mid = (start+end)/2;
        if (mid>key) {
            end = mid-1;
            
        }
        else{
            start=mid+1;
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key) {
                return i;
            }
            
        }
        return -1;

        
    }
    public static void main(String[] args) {
        int arr[]={2,7,5,4,9,8,10};
        int key = 10;
        int done =binary_search(arr, key);
        if (done==-1) {
            System.out.println("number not found");
        }
        else{
            System.out.println("number found at index "+done);
        }
    }
}
