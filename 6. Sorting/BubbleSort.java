/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu6;

/**
 *
 * @author DVvemsss
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int[] data = {5, 3, 8, 6, 7, 2};
        int temp;
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length-1; j++){
                if (data[j] > data[j+1]) {
                    //swap the elements
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
            
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
            
        }
    }
    
}
