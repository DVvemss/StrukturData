/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu6.Tugas;

/**
 *
 * @author DVvemsss
 */
public class Paskibraka {
    String nama;
    String kelas;
    double tinggi;
    
    Paskibraka(String nm, String kls, double t){
        nama = nm;
        kelas = kls;
        tinggi = t;
    }
    
    void tampilIdentitas(){
        System.out.println("Nama        : " + nama);
        System.out.println("Kelas       : " + kelas);
        System.out.println("Tinggi      : " + tinggi + " cm");
    }
    
    public double getTinggi(){
        return tinggi;
    }
}




