package com.challenge.main;

public class challenge1 {
    public static void main(String[] args) {

        tree test_tree= new tree();

        test_tree.root.data=10;

        test_tree.root.left_child=new node();
        test_tree.root.right_child=new node();

        test_tree.root.left_child.data=20;
        test_tree.root.right_child.data=30;

        test_tree.root.left_child.left_child=new node();
        test_tree.root.left_child.right_child=new node();

        test_tree.root.left_child.left_child.data=40;
        test_tree.root.left_child.right_child.data=50;

        traversal(test_tree);
    }

    public static class node{
        int data;
        node left_child;
        node right_child;

    }

    public static class tree{

        node root= new node();
    }
    public static void traversal(tree test_tree){
        if(test_tree.root==null){
            System.out.println("Empty tree");
        }
        else {
            node level= test_tree.root;
            System.out.println(level.data);
            while(level!=null) {
                if (level.left_child != null) {
                    System.out.println(level.left_child.data);
                }
                if (level.right_child != null) {
                    System.out.println(level.right_child.data);
                }
                if (level.left_child != null) {
                    level = level.left_child;
                } else if (level.right_child != null) {
                    level = level.right_child;
                }
                else{
                    level=null;
                }
            }

        }
    }
}
