/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.Minggu3.LatihanPraktikum.praktikum1;

/**
 *
 * @author DVvemsss
 */
public class Tabung {
    private double jarijari;
    private double tinggi;
    
    public Tabung (double jarijari, double tinggi){
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }
    
    public double hitungLuasPermukaan(){
        return 2 * Math.PI * jarijari * (jarijari + tinggi);
    }
    
    public double hitungVolume(){
        return Math.PI * jarijari * jarijari * tinggi;
    }
}
