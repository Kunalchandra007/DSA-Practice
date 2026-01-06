public class pattern5 {
// *****

// ****

// ***

// **

// *
   public static void patternn5(int n){
    for(int i=0;i<=n;i++){
        for(int j=0;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
    public static void main(String[] args) {
        int n=5;
        patternn5(n);
    }
}
