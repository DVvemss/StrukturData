/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu6.Praktikum1;

/**
 *
 * @author DVvemsss
 */
public class Sort {
    public int[] data;
    public int jumData;
    
    public Sort(int Data[], int jmlData){
        jumData = jmlData;
        data = new int [jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }
    
    void bubbleSort(){
        int temp;
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 1; j < jumData - i; j++) {
                if (data[j - 1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j-1] = temp;
                }
   
            }
        }
    }
    
    void selectionSort(){
        for (int i = 0; i < jumData - 1; i++) {
            int min = i;
            for (int j = 1 + i; j < jumData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
    
    public void tampilData(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
    }
    
}
