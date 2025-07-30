package Bit_Manipulation;

public class clearithbit {
     public static int cleaarIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(cleaarIthBit(10,1));
    }
    
}

    

