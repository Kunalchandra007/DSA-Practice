import java.util.*;

public class minnoofplatformreq {

    public static int findPlatform(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int n = arrival.length;
        int i = 0, j = 0;
        int count = 0, maxCount = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int arrival[] = {900, 940, 950, 1100, 1500, 1800};
        int departure[] = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println("Minimum platforms required = " + findPlatform(arrival, departure));
    }
}