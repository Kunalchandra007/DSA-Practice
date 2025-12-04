public class Singlenumber {
    public static int Singlenumberfind(int []arr){
        int xor=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            xor^=arr[i];

        }
        return xor;

    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,8,8};
        System.out.println("Singlenumber is: "+Singlenumberfind(arr));
        
    }
    
}
