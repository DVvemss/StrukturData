/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.UAS_DivaFisensaVemasSugiharto.UAS;

/**
 *
 * @author DVvemsss
 */
public class Kendaraan {
    String TNBK;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String tnbk, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.TNBK = tnbk;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }
}

