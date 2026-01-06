package arrays.Twodim_arrays;

public class diagonalsum {
    public static int DiagonalSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal (only add if it's not the same as primary diagonal)
            if(i != n - 1 - i){
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int result = DiagonalSum(matrix);
        System.out.println("Diagonal Sum: " + result);
    }
}
