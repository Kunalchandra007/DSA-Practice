public class pattern21 {
    // Function to print pattern21
    public static void pattern21(int n) {
        // Outer loop for the rows.
        for(int i = 0; i < n; i++){
            
            /* Inner loop for printing
            the stars at borders only.*/
            for(int j = 0; j < n; j++){
                
                if(i == 0 || j == 0 || i == n-1 || j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Move to the next row.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        
        // Create an instance of Solution class
        pattern21(N);
    }
}