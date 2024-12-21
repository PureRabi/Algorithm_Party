package leetcode.editor.cn.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {
    // 前序遍历: 根 -> 左 -> 右
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);        // 访问根节点
        preorder(root.left, result); // 遍历左子树
        preorder(root.right, result);// 遍历右子树
    }

    // 中序遍历: 左 -> 根 -> 右
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorder(root.left, result);  // 遍历左子树
        result.add(root.val);        // 访问根节点
        inorder(root.right, result); // 遍历右子树
    }

    // 后序遍历: 左 -> 右 -> 根
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorder(root.left, result);  // 遍历左子树
        postorder(root.right, result); // 遍历右子树
        result.add(root.val);          // 访问根节点
    }

    public static void main(String[] args) {
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // 创建遍历器实例
        TreeTraversal traversal = new TreeTraversal();

        // 测试前序遍历 (预期结果: 1,2,4,5,3)
        System.out.println("前序遍历结果: " + traversal.preorderTraversal(root));

        // 测试中序遍历 (预期结果: 4,2,5,1,3)
        System.out.println("中序遍历结果: " + traversal.inorderTraversal(root));

        // 测试后序遍历 (预期结果: 4,5,2,3,1)
        System.out.println("后序遍历结果: " + traversal.postorderTraversal(root));
    }
}