/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.Minggu3.LatihanPraktikum.praktikum1;

/**
 *
 * @author DVvemsss
 */
public class Kubus {
    private double sisi;
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    
    public double hitungLuasPermukaan(){
        return 6 * sisi * sisi;
    }
    
    public double hitungVolume(){
        return sisi * sisi * sisi;
    }
}
