public class Palindrome {
    public int palindromeNumber(int n) {
        int reverseNumber = 0;
        int duplicateofn = n;
        
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        
        if (duplicateofn == reverseNumber) {
            return 1; // It is a palindrome
        } else {
            return 0; // Not a palindrome
        }
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome(); // ✅ Correct object creation
        int n = 12321; // Change this to test other numbers
        int result = obj.palindromeNumber(n); // ✅ Correct method call

        if (result == 1) {
            System.out.println(n + " is a Palindrome.");
        } else {
            System.out.println(n + " is NOT a Palindrome.");
        }
    }
}
