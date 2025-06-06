public class spiral_matrix {
    public static void print_spira(int matrix[][]) {
        int start_column=0;
        int start_row=0;
        int end_column=matrix[0].length-1;
        int end_row=matrix.length-1;
        
        //taking j as number of columns 
        //takin i as number of rows
         
        while (start_column<=end_column&&start_row<=end_row) {
            
        //printing the top
        for(int j=start_column;j<=end_column;j++){
            System.out.print(matrix[start_row][j]+" ");

        }
        //printing the right
        for(int i=start_row+1;i<=end_row;i++){
            System.out.print(matrix[i][end_column]+" ");
        }
        //printing the buttom
        for(int  j=end_column-1;j>=start_column;j--){
            if (start_row==end_row) {
                break;
            }
            System.out.print(matrix[end_row][j]+" ");
        }
        //printing left
        for(int i=end_row-1;i>=start_row+1;i--){
            if (start_column==end_column) {
                break;
            }
            System.out.print(matrix[i][start_column]+" ");
        }
        start_row++;
        start_column++;
        end_row--;
        end_column--;
    }
    System.out.println();
    
        
        
    }
    public static void main(String[] args) {
        int matrix[][]={{2,3,4,5},{6,7,8,9},{7,8,6,2},{4,3,5,2}};
        print_spira(matrix);

    }
}
