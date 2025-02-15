package ua.infinity.codility.binarygap;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alex Oliinyk
 */
class SolutionTest {

    Solution solution = new Solution();

    public static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.arguments(5, 1),
                Arguments.arguments(9, 2),
                Arguments.arguments(1041, 5),
                Arguments.arguments(15, 0),
                Arguments.arguments(32, 0)
        );
    }

    @ParameterizedTest
    @MethodSource
    void solution(int n, int expected) {
        int result = solution.solution(n);
        assertEquals(expected, result);
    }
}