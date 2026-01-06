package Bit_Manipulation;
public class oddoreven {
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even no.");
        }else{
            System.out.println("odd no.");
        }


    }
    
    public static void main(String[] args) {
        oddoreven(0);
        oddoreven(3);

        
    }
}
