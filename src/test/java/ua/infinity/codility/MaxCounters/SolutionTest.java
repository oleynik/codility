package ua.infinity.codility.MaxCounters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Alex Oliinyk
 */
class SolutionTest {

    private final Solution solution = new Solution();

    public static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(1, new int[] {1}, new int[] {1}),
                Arguments.of(1, new int[] {2}, new int[] {0}),
                Arguments.of(2, new int[] {1, 3, 1}, new int[] {2, 1}),
                Arguments.of(2, new int[] {1, 1, 3}, new int[] {2, 2}),
                Arguments.of(5, new int[] {3, 4, 4, 6, 1, 4, 4}, new int[] {3, 2, 2, 4, 2})
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int n, int[] a, int[] expected) {
        assertArrayEquals(expected, solution.solution(n, a));
    }
}