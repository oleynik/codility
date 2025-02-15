package ua.infinity.codility.PermMissingElem;

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
                Arguments.of(new int[] {}, 1),
                Arguments.of(new int[] {1}, 2),
                Arguments.of(new int[] {1, 2}, 3),
                Arguments.of(new int[] {2, 3, 1, 5}, 4),
                Arguments.of(new int[] {2, 3, 1, 4}, 5)
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(int[] a, int expected) {
        assertEquals(expected, solution.solution(a));
    }
}