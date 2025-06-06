public class bubblesort {
   public static void buble_sort(int arr[]) {
   int hello=0;;
        for( int turns=0;turns<arr.length-1;turns++){
            for(int j=0;j<=arr.length-2-turns;j++){
                
                
                //or this loop can be (int j=0;j<=arr.length-2-turns;j++)//
                if (arr[j]>arr[j+1]) {
                    hello++;
                    
                    
                
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
               
               
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        System.out.println(hello);
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        buble_sort(arr);
    }
    /*public static  int optomised_bubble(int arr[]){
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                swap++;
                
            }
        }
        return swap;

        
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5};
        if (optomised_bubble(arr)==0) {
            System.out.println("array already sorted");
        }
        else{
            System.out.println("not sorted");
        }

    
    
    
}*/
}