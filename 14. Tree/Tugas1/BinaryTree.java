/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu13.Tugas1;

import java.util.NoSuchElementException;

/**
 *
 * @author DVvemsss
 */
public class BinaryTree {
    Node root;
    
    // ... constructor, isEmpty(), find(), delete(), getSuccessor() ...

    void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    int findSmallest() {
        if (root == null) {
            throw new NoSuchElementException("Tree is empty");
        }

        Node current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    int findLargest() {
        if (root == null) {
            throw new NoSuchElementException("Tree is empty");
        }

        Node current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    void displayLeafNodes() {
        displayLeafNodesRecursive(root);
    }

    private void displayLeafNodesRecursive(Node node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            System.out.println(node.data);
        }

        displayLeafNodesRecursive(node.left);
        displayLeafNodesRecursive(node.right);
    }

    int countLeafNodes() {
        return countLeafNodesRecursive(root);
    }

    private int countLeafNodesRecursive(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return countLeafNodesRecursive(node.left) + countLeafNodesRecursive(node.right);
    }

    void traversePreOrder() {
        traversePreOrderRecursive(root);
    }

    private void traversePreOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);
        traversePreOrderRecursive(node.left);
        traversePreOrderRecursive(node.right);
    }

    void traversePostOrder() {
        traversePostOrderRecursive(root);
    }

    private void traversePostOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        traversePostOrderRecursive(node.left);
        traversePostOrderRecursive(node.right);
        System.out.println(node.data);
    }
}

