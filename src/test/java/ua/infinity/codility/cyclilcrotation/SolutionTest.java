package ua.infinity.codility.cyclilcrotation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alex Oliinyk
 */
class SolutionTest {

    private final Solution solution = new Solution();

    public static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new int[] {}, 1, new int[] {}),
                Arguments.of(new int[] {1, 2, 3}, 0, new int[] {1, 2, 3}),
                Arguments.of(new int[] {0, 0, 0}, 1, new int[] {0, 0, 0}),
                Arguments.of(new int[] {1, 2, 3, 4}, 4, new int[] {1, 2, 3, 4}),
                Arguments.of(new int[] {3, 8, 9, 7, 6}, 1, new int[] {6, 3, 8, 9, 7}),
                Arguments.of(new int[] {3, 8, 9, 7, 6}, 3, new int[] {9, 7, 6, 3, 8})
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int[] input, int k, int[] expected) {
        assertArrayEquals(expected, solution.solution(input, k));
    }
}