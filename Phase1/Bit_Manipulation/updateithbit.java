package Bit_Manipulation;

public class updateithbit {
     public static int cleaarIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
     public static int settIthBit(int n,int i){
        int bitmask=1<<i;
        return n |bitmask;
    }
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int updateeithbit(int n,int i,int newBit){
        // if(newBit==0){
        //     return cleaarIthBit(n,i);

        // }else{
        //     return settIthBit(n,i);
        // }
        n=cleaarIthBit(n,i);
        int bitmask=newBit<<i;
        return n | bitmask;

    }
    public static void main(String[] args) {
        System.out.println(updateeithbit(10, 2, 4));
    }
}
