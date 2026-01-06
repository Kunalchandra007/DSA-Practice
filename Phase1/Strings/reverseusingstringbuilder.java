package Strings;

public class reverseusingstringbuilder {
       public static void main(String[] args) {
        String original = "kunalchandra";

        // Using StringBuilder to reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
    
}
