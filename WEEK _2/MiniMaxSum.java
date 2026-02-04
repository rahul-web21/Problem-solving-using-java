import java.util.*;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        for (int n : arr) sum += n;

        int min = Collections.min(arr);
        int max = Collections.max(arr);

        System.out.println((sum - max) + " " + (sum - min));
    }
}