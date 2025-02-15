package ua.infinity.codility.OddOccurrencesInArray;

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
                Arguments.of(new int[] {1}, 1),
                Arguments.of(new int[] {9, 3, 9, 3, 4}, 4),
                Arguments.of(new int[] {9, 3, 9, 3, 9, 7, 9}, 7)
        );
    }


    @MethodSource
    @ParameterizedTest
    void solution(int[] input, int expected) {
        assertEquals(expected, solution.solution(input));
    }
}