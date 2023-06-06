/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu7.InsertionSortTest;

/**
 *
 * @author DVvemsss
 */
public class Insertion {
    public int []data;
    public int jumData;
    
    
    public Insertion(int Data[], int jmlData){
        jumData = jmlData;
        data = new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data [i] = Data[i];
        }
    }
    
    void tampilData(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
    
    void InsertionSort(){
        for (int i = 1; i < data.length - 1; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {                
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }
    }
}
