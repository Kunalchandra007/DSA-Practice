package Greedy_Algo;
import java.util.*;
public class Assigncookies {
    public static int assigncookiii(int[] s,int[] g){
         Arrays.sort(g); // greed array
            Arrays.sort(s); // cookie sizes

            int l = 0; // pointer for cookies
            int r = 0; // pointer for children

            while (l < s.length && r < g.length) {
                if (g[r] <= s[l]) { // if current cookie can satisfy current child
                    r++; // child is satisfied
                }
                l++; // move to next cookie
            }

            return r; // total children satisfied
        }
        public static void main(String[] args) {
        int[] greed = {1, 2, 3};
        int[] size = {1, 1};
        int result =assigncookiii(greed, size);
        System.out.println("Number of children that can be contented: " + result);
    }
}
