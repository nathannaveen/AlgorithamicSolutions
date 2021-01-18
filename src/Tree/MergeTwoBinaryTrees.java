package Tree;

import Tree.TreeNode;

import java.util.Arrays;
import java.util.Stack;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;

        t2.val += t1.val;
        t2.right = mergeTrees(t1.right, t2.right);
        t2.left = mergeTrees(t1.left, t2.left);
        return t2;
    }
}
