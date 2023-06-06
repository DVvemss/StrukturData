/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu13.Praktikum2;

/**
 *
 * @author DVvemsss
 */
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    
    public BinaryTreeArray(){
        data = new int[10];
    }
    
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if(idxStart < idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);  
        }
    }
}
