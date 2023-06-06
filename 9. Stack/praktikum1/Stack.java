/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu9.praktikum1;

/**
 *
 * @author DVvemsss
 */
public class Stack {
    int size;
    int top;
    Pakaian data[];
    
    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }
    
    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    
    public void push(Pakaian pkn){
        if (!IsFull()){
            top++;
            data[top] = pkn;
        } else {
            System.out.println ("Isi stack penuh!");
        }
    }
    
    public void pop(){
        if (!IsEmpty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }
    
}
