package com.easy;



import java.util.LinkedList;
import java.util.Queue;


public class SymmetricTree {
//    public static void main(String[] args) {
//        SymmetricTree symmetricTree = new SymmetricTree();
//        // Создание симметричного дерева
//
//        TreeNode root = symmetricTree.new TreeNode(1);
//        root.left = symmetricTree.new TreeNode(2);
//        root.right = symmetricTree.new TreeNode(2);
//        root.left.left = symmetricTree.new TreeNode(3);
//        root.left.right = symmetricTree.new TreeNode(4);
//        root.right.left = symmetricTree.new TreeNode(4);
//        root.right.right = symmetricTree.new TreeNode(3);
//        // Проверка симметричности
//
//        boolean result = symmetricTree.isSymmetric(root);
//
//        System.out.println("Дерево симметрично: " + result); // Ожидается: true
//    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode noode1 = queue.poll();
            TreeNode noode2 = queue.poll();

            if (noode1 == null && noode2 == null){
                continue;
            }
            if (noode1 == null || noode2 == null) {
                return false;
            }
            if (noode1.val != noode2.val) {
                return false;
            }
            queue.offer(noode1.left);
            queue.offer(noode2.right);
            queue.offer(noode1.right);
            queue.offer(noode2.left);

        }
        return true;
    }
}
