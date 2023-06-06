/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu2.latihanPraktikum1;

/**
 *
 * @author DVvemsss
 */
public class PraktikumBarang {
    String nama;
    int hargaSatuan, jumlah;
    
    void tampilPraktikumBarang(){
        System.out.println("Nama Barang = " + nama);
        System.out.println("Harga Satuan = " + hargaSatuan);
        System.out.println("Jumlah = " + jumlah);
        System.out.println("Total Harga = " + hitungHargaTotal());
        System.out.println("Diskon = " + hitungHargaDiskon());
        System.out.println("Total Bayar = " + hitungHargaBayar());
    }
    
    int hitungHargaTotal(){
       return hargaSatuan*jumlah;
    }
    
    int hitungHargaDiskon(){
        double diskon = 0;
        if (hitungHargaTotal() > 100000) {
            diskon = 0.10;
        } else if(hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000){
            diskon = 0.05;
        }else{
            diskon = 0;
        }
        return (int) (hitungHargaTotal()*diskon);
    }
    
    int hitungHargaBayar(){
        return hitungHargaTotal() - hitungHargaDiskon();
    }
}
