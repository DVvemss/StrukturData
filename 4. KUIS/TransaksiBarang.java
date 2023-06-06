/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.KUIS_DivaFisensaVemasSugiharto;

import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class TransaksiBarang {
    private Barang[] barangs;

    public TransaksiBarang(Barang[] barangs) {
        this.barangs = barangs;
    }

    public void tampilkanBarang() {
        System.out.println("Daftar Barang");
        System.out.println("-------------");
        System.out.printf("%-5s%-20s%-10s%s%n", "Kode", "Nama", "Harga", "Stok");
        for (Barang barang : barangs) {
            System.out.printf("%-5s%-20sRp%d   %d%n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
        System.out.println();
    }

    public void tampilkanBarangPembelian(Barang[] barangPembelian) {
        System.out.println("Barang yang dibeli");
        System.out.println("------------------");
        System.out.printf("%-20s%-10s%s%n", "Nama", "Harga", "Jumlah");
        for (Barang barang : barangPembelian) {
            System.out.printf("%-20sRp%d   %d%n", barang.getNama(), barang.getHarga(), 1);
        }
        System.out.println();
    }
    
    public void tampilkanDaftarPembelian() {
    System.out.println("Daftar Pembelian");
    System.out.println("----------------");
//    for (Pembelian pembelian : daftarPembelian) {
//        System.out.println("Kode Barang: " + pembelian.getBarang().getKode());
//        System.out.println("Nama Barang: " + pembelian.getBarang().getNama());
//        System.out.println("Harga Barang: " + pembelian.getBarang().getHarga());
//        System.out.println("Jumlah Beli: " + pembelian.getJumlahBeli());
//        System.out.println("Total Harga: " + pembelian.getTotalHarga());
//        System.out.println("----------------");
//    }
//    System.out.println();
}


    public void lakukanPembelian(String kodeBarang, int jumlah) {
        Barang barangDibeli = null;
        for (Barang barang : barangs) {
            if (barang.getKode().equals(kodeBarang)) {
                barangDibeli = barang;
                break;
            }
        }
        if (barangDibeli == null) {
            System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
            return;
        }
        if (barangDibeli.getStok() < jumlah) {
            System.out.println("Stok barang tidak mencukupi.");
            return;
        }
        Barang[] barangPembelian = new Barang[jumlah];
        for (int i = 0; i < jumlah; i++) {
            barangPembelian[i] = new Barang(barangDibeli.getKode(), barangDibeli.getNama(), barangDibeli.getHarga(), 1);
        }
        barangDibeli.setStok(barangDibeli.getStok() - jumlah);
        tampilkanBarangPembelian(barangPembelian);
    }

    
}

