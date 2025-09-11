import java.util.*;
public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s,int k){
        int l=0;
        int r=0;
        int maxlen=0;
        int maxfreq=0;
        HashMap<Character,Integer>freq=new HashMap<>();

        while (r<s.length())
         {
            char ch=s.charAt(r);
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
            maxfreq = Math.max(maxfreq, freq.get(ch));

        while((r-l+1)-maxfreq>k){
            char leftchar=s.charAt(l);
            freq.put(leftchar,freq.get(leftchar)-1);
            l++;
        }
        if((r-l+1)-maxfreq<=k){
            maxlen=Math.max(maxlen,r-l+1);
        }
        r++;
    }
    return maxlen;
}
public static void main(String[] args) {
    System.out.println(characterReplacement("AAABBCCD", 2));
}
    

}

//leetcode one
// import java.util.HashMap;

// class Solution {
//     public int characterReplacement(String s, int k) {
//         HashMap<Character, Integer> freqs = new HashMap<>();
//         int res = 0, i = 0, maxFreq = 0;

//         for (int j = 0; j < s.length(); j++) {
//             char c = s.charAt(j);
//             freqs.put(c, freqs.getOrDefault(c, 0) + 1);
//             maxFreq = Math.max(maxFreq, freqs.get(c));

//             while ((j - i + 1) - maxFreq > k) {
//                 char left = s.charAt(i);
//                 freqs.put(left, freqs.get(left) - 1);
//                 i++;
//             }

//             res = Math.max(res, j - i + 1);
//         }

//         return res;
//     }
// }