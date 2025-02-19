package com.easy;

public class TreeNode {
    int val;
    InorderTraversal.TreeNode left;
    InorderTraversal.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, InorderTraversal.TreeNode left, InorderTraversal.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
