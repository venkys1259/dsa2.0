package com.practice.graphs.bfs;

public class TreeUtils {
    public static TreeNode arrayToTree(Integer[] arr,int i){
        int n = arr.length;
        TreeNode  root = null;
        if(i<n && arr[i]!=null){
            root = new TreeNode (arr[i]);
            root.left = arrayToTree(arr,(2*i)+1);
            root.right = arrayToTree(arr,(2*i)+2);
            if(i!=0 & i<n){
                //   root.parent=new TreeNode (arr[i/2]);
            }
        }
        return  root;
    }
}
