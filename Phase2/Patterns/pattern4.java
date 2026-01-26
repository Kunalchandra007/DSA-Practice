package phase2.Patterns;
public class pattern4 {
// 1

// 22

// 333

// 4444

// 55555
    public static void patterrn4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        patterrn4(n);
    }
}
