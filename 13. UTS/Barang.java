/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.UTS_DivaFisensaVemasSugharto;

/**
 *
 * @author DVvemsss
 */
public class Barang {
    public String kode;
    public String namaBarang;
    public int stok;
    public float hargaSatuan;
    public int jumlah;
    
    public Barang(String kd, String nB, int stk, float hS, int jml){
        kode = kd;
        namaBarang = nB;
        stok = stk;
        hargaSatuan = hS;
        jumlah = jml;
        
    }

    Barang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void tampil(){
        System.out.println("Kode    \t  Nama Barang \t  Stok \t  Harga Satuan");
        for (int i = 0; i < jumlah; i++) {
        Barang[] br = new Barang[i];
            System.out.println(br[i].kode + "  \t  " + br[i].namaBarang + "   \t  " + br[i].stok + " \t  " + br[i].hargaSatuan);
        }
    }
    
    public static void menuA(){
       
    }
}
