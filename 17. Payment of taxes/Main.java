/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.UAS_DivaFisensaVemasSugiharto.UAS;
import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class Main {
    static int totalPendapatan = 0;
    static Pajak[] transaksi = new Pajak[100];
    static int numTransaksi = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("== MENU ==");
            System.out.println("1. Tambah Transaksi Pajak");
            System.out.println("2. Tampilkan Transaksi");
            System.out.println("3. Tampilkan Total Pendapatan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");
            int pilihan = sc.nextInt();
            System.out.println("");
            
            switch (pilihan) {
                case 1:
                    tambahTransaksi(sc);
                    break;
                case 2:
                    tampilkanTransaksi();
                    break;
                case 3:
                    tampilkanTotalPendapatan();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Terimakasih Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    System.out.println("");
                    break;
            }
        }
        sc.close();
    }
    
    static void tambahTransaksi(Scanner sc){
        System.out.println("== TAMBAH TRANSAKSI PAJAK ==");
        System.out.print("TNBK : ");
        String tnbk = sc.next();
        System.out.print("Nama : ");
        String nama = sc.next();
        System.out.print("Jenis (roda2/roda4 : ");
        String jenis = sc.next();
        System.out.print("CC : ");
        int cc = sc.nextInt();
        System.out.print("Tahun : ");
        int tahun = sc.nextInt();
        System.out.print("Bulan Harus Bayar : ");
        int bulanHarusBayar = sc.nextInt();
        System.out.print("Bulan Bayar : ");
        int bulanBayar = sc.nextInt();
        System.out.println("");
        
         Kendaraan kendaraan = new Kendaraan(tnbk, nama, jenis, cc, tahun, bulanHarusBayar);
        Pajak pajak = new Pajak(kendaraan, bulanBayar);
        tambahTransaksi(pajak);
        System.out.println("Transaksi pajak telah ditambahkan.");
        System.out.println();
    }
    static void tambahTransaksi(Pajak pajak) {
        transaksi[numTransaksi] = pajak;
        numTransaksi++;
        totalPendapatan += pajak.nominal + pajak.denda;
    }

    static void tampilkanTransaksi() {
        System.out.println("== TRANSAKSI PAJAK ==");
        if (numTransaksi == 0) {
            System.out.println("Belum ada transaksi pajak.");
        } else {
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
        System.out.println();
    }

    static void tampilkanTotalPendapatan() {
        System.out.println("== TOTAL PENDAPATAN ==");
        System.out.println("Total Pendapatan: " + totalPendapatan);
        System.out.println();
    }
}
