public class reversenumber {
   public int reverseNumber(int n) {
        int reverseNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        return reverseNumber;
    }
    public static void main(String[] args) {
        reversenumber rn = new reversenumber();
        int n = 12345; // Example number
        int result = rn.reverseNumber(n);
        System.out.println("The reverse of " + n + " is: " + result);
    }
}