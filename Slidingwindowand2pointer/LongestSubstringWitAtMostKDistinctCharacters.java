import java.util.*;
public class LongestSubstringWitAtMostKDistinctCharacters {
    public static int longestsubs(String s, int k){
    int maxlen=0;
    int l=0;
    int r=0;
    Map<Character,Integer>mpp=new HashMap<>();
    while(r<s.length()){
       char ch=s.charAt(r);
       mpp.put(ch,mpp.getOrDefault(ch,0)+1);

       while(mpp.size()>k){
        char leftchar=s.charAt(l);
        mpp.put(leftchar,mpp.get(leftchar)-1);

        if(mpp.get(leftchar)==0){
            mpp.remove(leftchar);
        }
        l++;
       }
       maxlen=Math.max(maxlen,r-l+1);
       r++;
    }
    return maxlen;
    
}
public static void main(String[] args) {
    String s="eceba";
    int k=2;
    System.out.println(longestsubs(s, k));
}
}
