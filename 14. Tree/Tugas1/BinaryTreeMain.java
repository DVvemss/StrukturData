/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu13.Tugas1;

import com.mycompany.stukturdata.minggu13.Praktikum1.*;
import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        
        
        // Menambahkan node ke dalam tree
        
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(8);
        tree.add(3);
        tree.add(12);
        tree.add(20);

        System.out.println("===========================");
        // Menampilkan nilai paling kecil dan paling besar
        int smallest = tree.findSmallest();
        int largest = tree.findLargest();
        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);

        System.out.println("===========================");
        // Menampilkan data di leaf
        System.out.println("Leaf nodes:");
        tree.displayLeafNodes();
        
        System.out.println("===========================");
        // Menampilkan jumlah leaf nodes
        int leafCount = tree.countLeafNodes();
        System.out.println("Leaf count: " + leafCount);
        
        System.out.println("===========================");
        // Traversal pre-order
        System.out.println("Pre-order traversal:");
        tree.traversePreOrder();

        System.out.println("===========================");
        // Traversal post-order
        System.out.println("Post-order traversal:");
        tree.traversePostOrder();
        
        System.out.println("===========================");
    }
}

