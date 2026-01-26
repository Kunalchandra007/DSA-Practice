package phase2.Patterns;
public class pattern18 {
    // Function to print pattern18
    public static void pattern18(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {
            
            /* Inner loop for printing alphabets
            from A + n -1 -i (i is row no.) to
            A + n -1 ( E in this case).*/
            for(char ch = (char)(('A'+ n-1)-i); ch <= ('A'+ n-1); ch++){
                System.out.print(ch+" ");
            }

            // Move to the next line for the next row.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        
        pattern18(N);
    }
}
