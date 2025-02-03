package com.all;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> integerList = new ArrayList<>();
        if (root != null) {
            integerList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);

        }
        return integerList;


    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> integerList = new ArrayList<>();

        if (root != null) {
            postorderTraversal(root.left);

            postorderTraversal(root.right);

            integerList.add(root.val);
        }
        return integerList;

    }
}