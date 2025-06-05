public class sum_of_subarray {
    public static void subarray_sum(int arr[]) {
        int sum=0;
        int min_value=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++){
                    sum=sum+arr[k];
                    System.out.println(arr[k]);
                     if (min_value<sum) {
                    min_value=sum;
                    
                    
                    
                   
            }
                    

                }
               
        }
        
            
    }
     
        System.out.println("the maximum subarray sum is:"+min_value);
        
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        subarray_sum(arr);
    }
}
