/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu6.Praktikum1;

/**
 *
 * @author DVvemsss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {15, 10, 7, 22, 5};
        
        Sort urut = new Sort(a, a.length);
        
        System.out.println("Data sebelum urut");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("");
        
        System.out.println("Data sesudah urut Bubble Sort   (ASC)");
        urut.bubbleSort();
        urut.tampilData();
        
        System.out.println("");
        
        System.out.println("Data sesudah urut Selection Sort    (ASC)");
        urut.selectionSort();
        urut.tampilData();
    }
    
}
