package Bit_Manipulation;

public class setithbit {
     public static int settIthBit(int n,int i){
        int bitmask=1<<i;
        return n |bitmask;
    }
    public static void main(String[] args) {
        System.out.println(settIthBit(2,4));
    }
    
}
