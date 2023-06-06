/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu5.praktikum1;

import com.mycompany.stukturdata.minggu5.Search.*;

/**
 *
 * @author DVvemsss
 */
public class OrderedSearch {
    public int[] arr;
    
    public OrderedSearch(int arrayNilai[]) {
        arr = new int [arrayNilai.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayNilai[i];
        }
    }
    
    public int cari(int keyword) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (keyword == arr[i]) {
                index = i;
                break;
            } else {
                if (keyword < arr[i]) {
                    break;
                }
            }
        }
            return index;
    }
    
    public void tampilkan() {
        System.out.print("Index \t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " \t");
        }
        
        System.out.println("");
        System.out.print("Array \t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " \t");
        }
        System.out.println("");
    }
}
