package com.prog2.labs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author adinashby
 *
 */
public class ExamOneSec1And2 {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
        public static List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> last = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            last.put(s.charAt(i), i);
        }
        List result = new ArrayList<Integer>();
        int size = 1;
        int endPoint = 0;
        int tempPoint;
        for (int i = 0; i < s.length(); i++) {
            tempPoint = last.get(s.charAt(i));
            if (tempPoint > endPoint) {
                endPoint = tempPoint;
            }
            if (i == endPoint) {
                result.add(size);
                size = 1;
            } else {
                size++;
            }
        }
        return result;
    }

    public static void recursiveTraverse(TreeNode node, int layer, ArrayList<ArrayList<Integer>> layers) {
        System.out.println(layers.get(layer));
        if (layers.get(layer) == null) {
            layers.add(new ArrayList<>());
        }
        layers.get(layer).add(node.val);
        if (node.left != null) {
            recursiveTraverse(node.left, layer + 1, layers);
        }
        if (node.right != null) {
            recursiveTraverse(node.right, layer + 1, layers);
        }
    }
        
    public static int[] traverseTree(TreeNode root) {
        TreeNode node = root;
        ArrayList<ArrayList<Integer>> layers = new ArrayList<>();
        int layer = 0;
        recursiveTraverse(node, 0, layers);
        //while (node.left == null && node.right == null) {
            
        //}
        System.out.println("test");
        
        return null;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        return null;
    }
}
