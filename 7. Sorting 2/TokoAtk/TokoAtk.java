/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu7.TokoAtk;

/**
 *
 * @author DVvemsss
 */
public class TokoAtk {
    public String[] namaBarang;
    public int[] stok;
    public int[] harga;
    public int jumlah;
    
    public TokoAtk(String[] nb, int[] stk, int[] hrg, int jlh){
        namaBarang = nb;
        stok = stk;
        harga = hrg;
        jumlah = jlh;
        stok = new int[jlh];
        for (int i = 0; i < jlh; i++) {
            namaBarang[i] = nb[i];
            stok[i] = stk[i];
            harga[i] = hrg[i];
        }
    }
    
    void tampilData(){
        System.out.println("Nama Barang \t   \t Stok \t     \t Harga");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(namaBarang[i] + "\t\t" + stok[i] + "\t\t" + harga[i]);
        }
        System.out.println("");
    }
}
