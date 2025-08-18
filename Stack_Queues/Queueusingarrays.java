package Stack_Queues;

public class Queueusingarrays {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){//constructor
            arr=new int[n];
            size=n;
            rear=-1;
        }

    
    public static boolean isEmpty(){
        return rear==-1;
    }
    //add
    public static void add(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;

        }
        rear=rear+1;
        arr[rear]=data;
    }
}
}
