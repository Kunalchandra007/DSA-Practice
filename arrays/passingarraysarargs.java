package arrays;

public class passingarraysarargs {

    public static void update(int marks[],int nonChangebale){
        nonChangebale=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;


        }

    }
    public static void main(String args[]){
        int marks[]={24,55,66,33,55}; 
        int nonChangebale=5;
        update(marks,nonChangebale);  
        System.out.println(nonChangebale);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");


        }
        System.out.println();
    }

    
}
