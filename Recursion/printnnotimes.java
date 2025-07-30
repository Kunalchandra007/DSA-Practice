package Recursion;
public class printnnotimes {
    public static void printnames(int i,int n){
        if(i>9){
            return;
        }
        System.out.println("Kunal");
        printnames(i+1, n);
    }
    public static void main(String[] args) {
        printnames(1, 10);
    }
}
