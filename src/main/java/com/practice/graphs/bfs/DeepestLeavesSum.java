package com.practice.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

/* https://leetcode.com/problems/deepest-leaves-sum/
 Given the root of a binary tree, return the sum of values of its deepest leaves.
 Example 1:
Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15
Example 2:

Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
Output: 19*
 */
public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        int levelSum = 0,queueSize;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            levelSum = 0;
            queueSize = queue.size();
           for(int i = 0; i<queueSize;i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }if(node.right != null){
                    queue.offer(node.right);
                }
                levelSum = levelSum + node.val;
            }
        }
        return levelSum;
    }

    public static void main(String[] args) {
        Integer[] arr = {6,7,8,2,7,1,3,9,null,1,4,null,null,null,5};
        TreeNode treeNode = TreeUtils.arrayToTree (arr, 0);
        DeepestLeavesSum deepestLeavesSum = new DeepestLeavesSum();
            int result = deepestLeavesSum.deepestLeavesSum(treeNode);
        System.out.println("sum of values of deepest leaves"+result);
    }
}
