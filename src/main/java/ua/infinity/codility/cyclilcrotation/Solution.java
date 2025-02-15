package ua.infinity.codility.cyclilcrotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author Alex Oliinyk
 */
public class Solution {

    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    public int[] solution(int[] a, int k) {
        int length = a.length;
        if (length == 0) {
            return a;
        }
        k = k % length;
        if (k == 0) {
            return a;
        }
        int[] result = new int[length];
        System.arraycopy(a, 0, result, k, length - k);
        System.arraycopy(a, length - k, result, 0, k);
        logger.info("Result: {}", Arrays.toString(result));
        return result;
    }
}
