public class armstrongnumber {
    public static int armstrongnumber(int n){
        int originalNumber = n;
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum = sum + (int)Math.pow(lastdigit, 3);
            n=n/10;

        }
        if(sum==originalNumber){
            return 1;

        }
        else{
            return 0;
        }   
    }
    public static void main(String[] args) {
        armstrongnumber arm =new armstrongnumber();
        int n=121;
        int result=arm.armstrongnumber(n);
        if(result==0){
            System.out.println("It is armstrong");

        }
        else{
            System.out.println("it is not an armstrong");
        }

    }
    
}
