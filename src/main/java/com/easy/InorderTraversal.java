package com.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InorderTraversal {
    public class TreeNode extends com.easy.TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> traverseInDescendingOrder(TreeNode root) {

        List<Integer> values = new ArrayList<>();
        inOrderTraversal(root, values);
        Collections.sort(values, Collections.reverseOrder());
        return values;

    }
    private void inOrderTraversal(TreeNode node, List<Integer> values) {

        if (node != null) {

            inOrderTraversal(node.left, values);
              values.add(node.val);
            inOrderTraversal(node.right, values);

        }

    }
}
