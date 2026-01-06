package Strings;

public class reversestring {

    // Method to reverse a string
    public static String reverse(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        // Swap characters using two-pointer technique
        while (left < right) {
            // Swap characters at left and right
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers toward the center
            left++;
            right--;
        }

        // Convert the character array back to string
        return new String(chars);
    }

    // Main method to test the reverse method
    public static void main(String[] args) {
        String original = "kunalchandra";
        String reversed = reverse(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
