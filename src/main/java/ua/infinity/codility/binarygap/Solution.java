package ua.infinity.codility.binarygap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alex Oliinyk
 */
public class Solution {

    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
        logger.info("Binary: {}", binary);
        int result = 0;
        int count = 0;
        for (int i=1;i<binary.length();i++) {
            char ch = binary.charAt(i);
            if (ch == '1') {
                if (count > result) {
                    result = count;
                }
                count = 0;
                continue;
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5);
    }
}
