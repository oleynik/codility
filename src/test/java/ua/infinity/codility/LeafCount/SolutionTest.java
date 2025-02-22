package ua.infinity.codility.LeafCount;

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
                Arguments.of(null, 0),
                Arguments.of(new TreeNode<>(1), 1),
                Arguments.of(new TreeNode<>(2, new TreeNode<>(1), null), 1),
                Arguments.of(new TreeNode<>(2, new TreeNode<>(1), new TreeNode<>(3)), 2)
        );
    }

    @MethodSource
    @ParameterizedTest
    void solution(TreeNode<?> tree, int expected) {
        assertEquals(expected, solution.solution(tree));
    }
}