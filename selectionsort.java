public class selectionsort {
    public static void select_sort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if (arr[minpos]>arr[j]) {
                    //if decending then do change then (arr[minpos]<arr[j])
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        

    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        select_sort(arr);
    }
}
