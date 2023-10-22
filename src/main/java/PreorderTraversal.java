import javax.swing.tree.TreeNode;
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
       if (root != null){
           integerList.add(root.val);
          integerList.addAll(preorderTraversal(root.left));
          integerList.addAll(preorderTraversal(root.right));

       }
      return integerList;
    }
}
