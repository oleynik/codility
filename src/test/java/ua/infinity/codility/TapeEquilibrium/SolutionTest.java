package ua.infinity.codility.TapeEquilibrium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alex Oliinyk
 */
class SolutionTest {

    private final Solution solution = new Solution();

    public static Stream<Arguments> solution() {
        return Stream.of(
                Arguments.of(new int[] {1, 2}, 1),
                Arguments.of(new int[] {1, 1}, 0),
                Arguments.of(new int[] {3, 1, 2, 4, 3}, 1),
                Arguments.of(new int[] {1, 2, 3}, 0),
                Arguments.of(new int[] {3, 2, 1}, 0)
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int[] a, int expected) {
        assertEquals(expected, solution.solution(a));
    }
}