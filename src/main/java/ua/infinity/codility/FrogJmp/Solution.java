package ua.infinity.codility.FrogJmp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alex Oliinyk
 */
public class Solution {

    private static final Logger logger = LoggerFactory.getLogger(Solution.class);

    public int solution(int x, int y, int d) {
        return (int) Math.ceil((1.0 * (y-x)) / d);
    }
}
