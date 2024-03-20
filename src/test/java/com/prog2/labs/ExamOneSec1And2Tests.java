package com.prog2.labs;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class ExamOneSec1And2Tests {

    @Test
    void partitionLabelsTest1() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> expected = Arrays.asList(9, 7, 8);
        
        assertEquals(expected, ExamOneSec1And2.partitionLabels(s));
    }

    @Test
    void partitionLabelsTest2() {
        String s = "eccbbbbdec";
        List<Integer> expected = Arrays.asList(10);
        
        assertEquals(expected, ExamOneSec1And2.partitionLabels(s));
    }

    @Test
    void partitionLabelsTest3() {
        String s = "a";
        List<Integer> expected = Arrays.asList(1);
        
        assertEquals(expected, ExamOneSec1And2.partitionLabels(s));
    }

    @Test
    void partitionLabelsTest4() {
        String s = "abcdef";
        List<Integer> expected = Arrays.asList(1, 1, 1, 1, 1, 1);
        
        assertEquals(expected, ExamOneSec1And2.partitionLabels(s));
    }

    @Test
    void partitionLabelsTest5() {
        String s = "aaaaa";
        List<Integer> expected = Arrays.asList(5);
        
        assertEquals(expected, ExamOneSec1And2.partitionLabels(s));
    }

    @Test
    void traverseTreeTest1() {
        TreeNode root = new TreeNode(1);
        assertArrayEquals(new int[]{1}, ExamOneSec1And2.traverseTree(root));
    }

    @Test
    void traverseTreeTest2() {
        TreeNode root = new TreeNode(100);

        root.left = new TreeNode(50);
        root.right = new TreeNode(200);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(75);
        root.right.right = new TreeNode(350);

        assertArrayEquals(new int[]{100, 50, 200, 25, 75, 350}, ExamOneSec1And2.traverseTree(root));
    }

    @Test
    void traverseTreeTest3() {
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        assertArrayEquals(new int[]{1, 2, 3}, ExamOneSec1And2.traverseTree(root));
    }

    @Test
    void traverseTreeTest4() {
        TreeNode root = new TreeNode(1);
        
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        
        assertArrayEquals(new int[]{1, 2, 3}, ExamOneSec1And2.traverseTree(root));
    }

    @Test
    void traverseTreeTest5() {
        // Constructing a more complex tree
        /*
                  100
                 /   \
                50   200
               / \     \
              25  75   350
             /          / \
            10         300 400
           / \               \
          5  15               500
        */
        
        TreeNode root = new TreeNode(100);
        
        root.left = new TreeNode(50);
        root.right = new TreeNode(200);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(75);
        root.right.right = new TreeNode(350);
        root.left.left.left = new TreeNode(10);
        root.left.left.left.left = new TreeNode(5);
        root.left.left.left.right = new TreeNode(15);
        root.right.right.left = new TreeNode(300);
        root.right.right.right = new TreeNode(400);
        root.right.right.right.right = new TreeNode(500);
        
        int[] expectedOutput = {
            100, 50, 200, 25, 75, 350, 10, 300, 400, 5, 15, 500
        };
        
        assertArrayEquals(expectedOutput, ExamOneSec1And2.traverseTree(root));
    }

    @Test
    void reverseBetweenTest1() {
        // Create the linked list for the test case: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call the method under test
        head = ExamOneSec1And2.reverseBetween(head, 2, 4);

        // Assert each node value after the reverse operation
        assertEquals(1, head.val);
        assertEquals(4, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(2, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
    }

    @Test
    void reverseBetweenTest2() {
        // Create the linked list for the test case: 5
        ListNode head = new ListNode(5);

        // Call the method under test
        head = ExamOneSec1And2.reverseBetween(head, 1, 1);

        // Assert the node value remains the same after the reverse operation
        assertEquals(5, head.val);
    }

    @Test
    void reverseBetweenTest3() {
        // Create the linked list for the test case: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call the method under test
        head = ExamOneSec1And2.reverseBetween(head, 1, 5);

        // Assert each node value after the reverse operation
        assertEquals(5, head.val);
        assertEquals(4, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(2, head.next.next.next.val);
        assertEquals(1, head.next.next.next.next.val);
    }

    @Test
    void reverseBetweenTest4() {
        // Create the linked list for the test case: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call the method under test
        head = ExamOneSec1And2.reverseBetween(head, 3, 3);

        // Assert the list remains unchanged after the reverse operation
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
    }

}
