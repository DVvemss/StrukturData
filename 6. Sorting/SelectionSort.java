/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu6;

/**
 *
 * @author DVvemsss
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] data = {5, 3, 8, 6, 7, 2};
        int temp;
        for (int i = 0; i < data.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j <data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            //swap the elements
            temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
            
        }
    }
    
}
