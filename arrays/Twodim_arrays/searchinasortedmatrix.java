package arrays.Twodim_arrays;

public class searchinasortedmatrix {
    public static boolean search(int matrix[][],int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=n*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        System.out.println(search(matrix,7));
    }
}
