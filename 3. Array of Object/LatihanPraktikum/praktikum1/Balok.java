/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.Minggu3.LatihanPraktikum.praktikum1;

/**
 *
 * @author DVvemsss
 */
public class Balok {
    
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Balok (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double hitungLuasPermukaan(){
        return 2 * ( panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
    public double hitungVolume(){
        return panjang * lebar * tinggi;
    }
}
