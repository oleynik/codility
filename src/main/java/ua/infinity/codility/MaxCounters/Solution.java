package ua.infinity.codility.MaxCounters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alex Oliinyk
 */
public class Solution {

    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    public int[] solution(int n, int[] a) {
        int[] result = new int[n];
        int max = 0;
        for (int operation : a) {
            if (operation == (n + 1)) {
                // Set all to max
                for (int j = 0; j < n; result[j++] = max);
            } else {
                // Increment
                int value = result[operation - 1] += 1;
                if (value > max) {
                    max = value;
                }
            }
        }
        return result;
    }
}
