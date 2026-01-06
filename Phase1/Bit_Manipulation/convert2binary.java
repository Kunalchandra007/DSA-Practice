package Bit_Manipulation;

public class convert2binary {

    // Method to reverse a string
    public static String reversestring(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to convert a decimal string to binary
    public static String converttobinary(String str) {
        // Convert the input string to an integer
        int n = Integer.parseInt(str);
        String res = "";

        // Convert integer to binary by repeatedly dividing by 2
        while (n > 0) {
            res += (n % 2);  // Append remainder
            n = n / 2;
        }

        // Reverse the binary result since bits were added in reverse order
        return reversestring(res);
    }

    public static void main(String[] args) {
        String str = "13";  // Declare and initialize the input string
        String binary = converttobinary(str);  // Call the method
        System.out.println("Binary of " + str + " is: " + binary);
    }
}
