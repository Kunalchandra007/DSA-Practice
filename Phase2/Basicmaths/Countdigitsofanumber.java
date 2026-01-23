package Phase2.Basicmaths;
public class Countdigitsofanumber {
    public static int countDigit(int n) {
        // Edge case
        if (n == 0) return 1;

        // Set counter to 0
        int cnt = 0;

        // Iterate until n is greater than zero
        while (n > 0) {
            // Increment count of digits
            cnt = cnt + 1;
            n = n / 10;
        }

        return cnt;
    }
    public static void main(String[] args) {
        int n = 6678;
        int ans = countDigit(n);
        System.out.println("The count of digits in the given number is: " + ans);
    }
}

//Betterway
//  public int countDigit(int n) {
//        if (n == 0) return 1;
//     return (int)Math.log10(n) + 1;

  
//     }
