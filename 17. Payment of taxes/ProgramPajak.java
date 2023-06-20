/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.UAS_DivaFisensaVemasSugiharto.UAS;

/**
 *
 * @author DVvemsss
 */
public class ProgramPajak {
    static int totalPendapatan = 0;
    static Pajak[] transaksi = new Pajak[100];
    static int numTransaksi = 0;

    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("K001", "Motor A", "roda 2", 150, 2020, 5);
        Kendaraan kendaraan2 = new Kendaraan("K002", "Mobil B", "roda 4", 1200, 2018, 4);

        Pajak pajak1 = new Pajak(kendaraan1, 6);
        Pajak pajak2 = new Pajak(kendaraan2, 3);

        tambahTransaksi(pajak1);
        tambahTransaksi(pajak2);

        tampilkanTransaksi();
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }

    static void tambahTransaksi(Pajak pajak) {
        transaksi[numTransaksi] = pajak;
        numTransaksi++;
        totalPendapatan += pajak.nominal + pajak.denda;
    }

    static void tampilkanTransaksi() {
        for (int i = 0; i < numTransaksi; i++) {
            Pajak pajak = transaksi[i];
            System.out.println("Kode: " + pajak.kode);
            System.out.println("TNBK: " + pajak.kendaraan.TNBK);
            System.out.println("Nama: " + pajak.kendaraan.nama);
            System.out.println("Jenis: " + pajak.kendaraan.jenis);
            System.out.println("CC: " + pajak.kendaraan.cc);
            System.out.println("Tahun: " + pajak.kendaraan.tahun);
            System.out.println("Bulan Harus Bayar: " + pajak.kendaraan.bulanHarusBayar);
            System.out.println("Nominal: " + pajak.nominal);
            System.out.println("Denda: " + pajak.denda);
            System.out.println("Bulan Bayar: " + pajak.bulanBayar);
            System.out.println();
        }
    }
}

