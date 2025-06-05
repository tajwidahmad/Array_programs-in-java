public class sub_array {
    public static void sub_arr(int arr[]) {
        int max_value=Integer.MAX_VALUE;
            int min_value=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int start=i;
           
            
            for(int j=i;j<arr.length;j++){
                int end=j;
                sum=sum+arr[j];
                if(max_value>sum){
                    max_value=sum;
                }
                else if (min_value<sum) {
                    min_value=sum;
                    
                }

                for(int k=start;k<=end;k++){
                   
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.println("sum of the subarray is: "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("the maximum sum of the subarray is: "+min_value);
        System.out.println("the manimum sum of the subarray is: "+max_value);


        
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        sub_arr(arr);
}
}