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

    public static HashMap<Integer, ArrayList<Integer>> recursiveTraverse(TreeNode node, int layer, HashMap<Integer, ArrayList<Integer>> layers) {
        if (!layers.containsKey(layer)) {
            layers.put(layer, new ArrayList<>());
        }
        ArrayList<Integer> list = layers.get(layer);
        list.add(node.val);
        layers.put(layer, list);
        if (node.left != null) {
            layers = recursiveTraverse(node.left, layer + 1, layers);
        }
        if (node.right != null) {
            layers = recursiveTraverse(node.right, layer + 1, layers);
        }
        return layers;
    }
        
    public static int[] traverseTree(TreeNode root) {
        TreeNode node = root;
        HashMap<Integer, ArrayList<Integer>> layers = recursiveTraverse(node, 0, new HashMap<>());
        int layer = 0;
        ArrayList<Integer> resultList = new ArrayList<>();
        while (layers.containsKey(layer)) {
            resultList.addAll(layers.get(layer));
            layer++;
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
    
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = head;
        int temp;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> reversedList = new ArrayList<>();
        arr.add(node.val);
        while (node.next != null) {
            node = node.next;
            arr.add(node.val);
        }
        for (int i = right-1; i > left-2; i--) {
            reversedList.add(arr.get(i));
        }
        for (int i = left-1; i < right; i++) {
            arr.set(i, reversedList.get(i-left+1));
        }
        head = new ListNode(arr.get(0));
        node = head;
        for (int i = 1; i < arr.size(); i++) {
            node.next = new ListNode(arr.get(i));
            node = node.next;
        }
        return head;
    }
   
}
