/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu13.Praktikum2;

/**
 *
 * @author DVvemsss
 */
public class BinaryTreeArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7 , 9, 0, 0, 0};
        int idxLast = 6;
        
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
        
    }
    
}
