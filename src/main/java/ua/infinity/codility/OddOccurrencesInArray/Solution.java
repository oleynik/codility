package ua.infinity.codility.OddOccurrencesInArray;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        // {9, 3, 9, 3, -9, -7, -9}
        for (int i=0;i<a.length-1;i++) {
            int n = a[i];
            if (n == 0) {
                continue;
            }
            for (int j=i+1;j<a.length;j++) {
                if (n == a[j]) {
                    a[j] = 0;
                    n = 0;
                    break;
                }
            }
            if (n != 0) {
                return n;
            }
        }
        return a[a.length-1];
    }
}
