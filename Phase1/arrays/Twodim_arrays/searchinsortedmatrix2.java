package arrays.Twodim_arrays;

public class searchinsortedmatrix2 {
    public static boolean searchrowandcolwise(int matrix[][],int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0;
        int col=m-1;
        while (row<n&& col>=0) {
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
            
            
        }
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        System.out.println(searchrowandcolwise(matrix,5));
    }

    
}
