public class kadanes_algo {
    public static void max_subarray(int arr[]) {
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            current_sum=current_sum+arr[i];
            if(current_sum<0){
                current_sum=0;
            }
            max_sum=Math.max(current_sum, max_sum);
            
            

        
        }
        
        System.out.println("the maximum is:"+max_sum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        max_subarray(arr);
    }
}
