[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/d8aphGcZ)
# Programming Patterns - Exam 1 - Winter 2024

This template repository is the starter project for Programming Patterns Exam 1 Winter 2024. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Q1. You are given a string `s`. We want to partition the string into as many parts as possible so that each letter appears in at most one part.  

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be `s`.  

Return a list of integers representing the size of these parts.  

Example 1:

Input: `s = "ababcbacadefegdehijhklij"`  
Output: `[9,7,8]`  

Explanation:  
`The partition is "ababcbaca", "defegde", "hijhklij". This is a partition so that each letter appears in at most one part. A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.`

Example 2:

Input: `s = "eccbbbbdec"`  
Output: `[10]`  

**Constraints:**

- `1 <= s.length <= 500`
- `s` consists of lowercase English letters.

Q2. Given the root of a binary tree, return an array of int that contains all the node values at each level from left to right. Let’s take a look at the below binary search tree.

Example 1:
![](Q2.jpg)  

Input: `treeNode = [25,50,75,100,200,350]` (for representation purposes only, check out the test cases)  
Output: `[100,50,200,25,75,350]`  

Example 2:  

Input: `treeNode = [1,2,3]` (for representation purposes only, check out the test cases)  
Output:  `[1,2,3]`

Q3. Given the `head` of a singly linked list and two integers `left` and `right` where `left <= right`, reverse the nodes of the list from position `left` to position `right`, and return the reversed list.  

Example 1:  

![](Q3.jpg)  

Input: `head = [1,2,3,4,5], left = 2, right = 4`  
Output: `[1,4,3,2,5]`  

Example 2:  

Input: `head = [5], left = 1, right = 1`  
Output: `[5]`  

**Constraints:**

- The number of nodes in the list is `n`.  
- `1 <= n <= 500`  
- `-500 <= Node.val <= 500`  
- `1 <= left <= right <= n`  

### Setup Command

`gradle clean`

### Run Command

`gradle test`
