/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.KUIS_DivaFisensaVemasSugiharto;

import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
import java.util.Scanner;

import java.util.Scanner;

public class MainBarang {
    public static void main(String[] args) {
        Barang[] barangs = {
                new Barang("B001", "Baju", 50000, 10),
                new Barang("K001", "Kemeja", 100000, 5),
                new Barang("C001", "Celana", 75000, 8),
                new Barang("S001", "Sepatu", 200000, 3),
                new Barang("T001", "Topi", 30000, 12)
        };
        TransaksiBarang transaksiBarang = new TransaksiBarang(barangs);

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("----");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli Barang");
            System.out.println("3. Tampilkan Daftar Pembelian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksiBarang.tampilkanBarang();
                    break;
                case 2:
                    boolean beliLagi = true;
                    do {
                        System.out.print("Masukkan kode barang: ");
                        String kodeBarang = scanner.next();
                        System.out.print("Masukkan jumlah barang: ");
                        int jumlahBarang = scanner.nextInt();
                        transaksiBarang.lakukanPembelian(kodeBarang, jumlahBarang);

                        System.out.print("Beli barang lagi? (y/n) ");
                        String jawaban = scanner.next();
                        if (jawaban.equalsIgnoreCase("n")) {
                            beliLagi = false;
                        }
                    } while (beliLagi);
                    break;
                case 3:
                    transaksiBarang.tampilkanDaftarPembelian();
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan salah.");
            }
            System.out.println();
        } while (pilihan != 0);
    }
}


