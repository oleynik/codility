package ua.infinity.codility.PermMissingElem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author Alex Oliinyk
 */
public class Solution {

    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    public int solution(int[] a) {
        int n = a.length;
        // (n+1)! - n!
        if (n == 0) {
            return 1; // (N+1)
        }
        Arrays.sort(a);
        // {1, 2, 3, 5}
        for (int i=0;i<n;i++) {
            if (a[i] != (i+1)) {
                return i+1;
            }
        }
        return n+1;
    }
}
