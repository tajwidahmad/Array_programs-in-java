public class trappingwater {
    public static int trapofwater(int height[]) {
        //calculation of left max auxillary array
        int left_max[]= new int[height.length];
        left_max[0]=height[0];
        for(int i=1;i<height.length;i++){
            left_max[i]=Math.max(height[i], left_max[i-1]); 

        }
        //calculation of right max auxillary array
        int right_max[]=new int [height.length];
        right_max[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right_max[i]=Math.max(height[i],right_max[i+1]);

        }
        // trapped water calculuation
        int trpped_water=0;
        for(int i=0;i<height.length-1;i++){
            int water_level=Math.min(left_max[i], right_max[i]);
            trpped_water=trpped_water+(water_level-height[i]);
            }
            return trpped_water;


    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapofwater(height));
    }
} 
