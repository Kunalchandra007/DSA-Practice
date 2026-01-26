package phase2.Patterns;
public class pattern11 {
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1
    public void pattern11(int n) {
        // First row starts by printing a single 1.
        int start = 1;

        // Outer loop for the number of rows
        for (int i = 0; i < n; i++) {
            /* If the row index is even, start
            with 1; if odd, start with 0*/
            if (i % 2 == 0) start = 1;
            
            else start = 0;

            /* Alternatively print 1's and 0's 
            in each row by using inner for loop*/
            for (int j = 0; j <= i; j++) {
                System.out.print(start+" ");
                start = 1 - start;
            }

            // Move to the next row and give a line break
            System.out.println();
        }
    }
        

    }