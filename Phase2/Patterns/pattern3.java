package phase2.Patterns;
public class pattern3 {
// 1

// 12

// 123

// 1234

// 12345
    public static void patterrn3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        patterrn3(n);

    }
    
}
