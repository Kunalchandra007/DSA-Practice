public class majorityelement {
    public static int majorel(int[]arr){
        int count=0;
        int el=-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                el=arr[i];

            }
            else if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el)count1++;

        }
        if(count1>(arr.length/2)){
            return el;
        }
        return -1;


    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,3,1,4,5,1};
        System.out.println(majorel(arr));        
    }
    
}
