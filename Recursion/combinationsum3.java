package Recursion;
import java.util.*;
public class combinationsum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(k,n,1,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int k,int n,int start,List<Integer> current,List<List<Integer>> result){
        if (k==0) {
            if (n==0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if (n<0) {
            return;
        }
        for(int i=start;i<=9;i++){
            if(i>n){//pruning , prevents TLES
                break;
            }
            current.add(i);
            backtrack(k-1,n-i,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}
    

