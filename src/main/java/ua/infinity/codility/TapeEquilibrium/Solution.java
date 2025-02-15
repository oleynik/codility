package ua.infinity.codility.TapeEquilibrium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author Alex Oliinyk
 */
public class Solution {

    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    public int solution(int[] a) {
        int sum1 = a[0];
        int sum2 = Arrays.stream(a).sum() - sum1;
        int result = Math.abs(sum1-sum2);
        for (int i=1;i<a.length-1;i++) {
            sum1 += a[i];
            sum2 -= a[i];
            int diff = Math.abs(sum1-sum2);
            if (diff < result) {
                result = diff;
            }
        }
        return result;
    }
}
