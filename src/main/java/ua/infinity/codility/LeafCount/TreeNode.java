package ua.infinity.codility.LeafCount;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * @author Alex Oliinyk
 */
public class TreeNode<T extends Comparable<T>> {

    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T value) {
        this(value, null, null);
    }

    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
        this.value = Objects.requireNonNull(value);
        this.left = left;
        this.right = right;
    }

    private static void print(Collection<String> collection, TreeNode<?> node) {
        if (node == null) {
            return;
        }
        print(collection, node.left);
        collection.add(String.valueOf(node.value));
        print(collection, node.right);
    }

    public String toString() {
        Collection<String> list = new ArrayList<>();
        print(list, this);
        return String.valueOf(list);
    }
}
