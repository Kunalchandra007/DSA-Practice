import java.util.*;;
public class countnumbers{
    public static int countDigit(int n) {
        if (n == 0) return 1;  // special case for 0

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = countDigit(n);
        System.out.println("Number of digits in " + n + " is: " + result);
        sc.close();
    }
}
