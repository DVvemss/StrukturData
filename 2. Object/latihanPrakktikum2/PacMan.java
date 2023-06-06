/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu2.latihanPrakktikum2;

/**
 *
 * @author DVvemsss
 */
public class PacMan {
    int x =0 , y = 0, width, height;
    
    void printPosition(){
        System.out.println("===========");
        System.out.println("== Arena ==");
        System.out.println("===========");
        
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        
        System.out.println("=================");
        System.out.println("= Lokasi PacMan =");
        System.out.println("=================");
        System.out.println("Horizontal Position = " + x);
        System.out.println("Vertikal Position = " + y);
        
    }
    
    void moveLeft(int n){
        if (x > 0 && x >= width) {
            width = width + x;
        }else{
            width = + 0;
        }
    }
    
    void moveRight(int n){
        if (x < 0 && x <= width) {
            width = width + x;
        } else {
            width = width + 0;
        }
    }
    
    void moveUp(int n){
        if (y > 0 && y >= height) {
            height = height + y;
        } else {
            height = height + 0;
        }
    }
    
    void moveDown(int n){
        if (y < 0 && y <= height) {
            height = height + y;
        } else {
            height = height + 0;
        }
    }
    
    
}
