package ua.infinity.codility.OddOccurrencesInArray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author Alex Oliinyk
 */
public class Solution {

    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    public int solution(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        // {9, 3, 9, 3, 9, 7, 9}
        Arrays.sort(a); // N*log(N) + N/2
        // {3, 3, 7, 9, 9, 9, 9}
        for (int i=0;i<a.length-1;i+=2) {
            if (a[i] != a[i+1]) {
                return a[i];
            }
        }
        return a[a.length-1];
    }
}
