/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.Quizz2.nasabah;

/**
 *
 * @author DVvemsss
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Tambah Data Nasabah");
            System.out.println("2. Cetak Data Nasabah");
            System.out.println("3. Cari Data Nasabah");
            System.out.println("4. Kondisi Setelah Transaksi");
            System.out.println("5. Tambah Nasabah Darurat");
            System.out.println("6. Kondisi Nasabah Darurat");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membaca karakter baru setelah membaca angka

            switch (pilihan) {
                case 1:
                    tambahDataNasabah(scanner, linkedList);
                    break;
                case 2:
                    cetakDataNasabah(linkedList);
                    break;
                case 3:
                    cariDataNasabah(scanner, linkedList);
                    break;
                case 4:
                    kondisiSetelahTransaksi(linkedList);
                    break;
                case 5:
                    tambahNasabahDarurat(scanner, linkedList);
                    break;
                case 6:
                    kondisiNasabahDarurat(linkedList);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    private static void tambahDataNasabah(Scanner scanner, LinkedList linkedList) {
        System.out.println("Input Data Nasabah");
        System.out.print("No Rekening: ");
        int noRekening = scanner.nextInt();
        scanner.nextLine(); // Membaca karakter baru setelah membaca angka
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        linkedList.tambahData(noRekening, nama);
        System.out.println("Data nasabah berhasil ditambahkan.");
    }

    private static void cetakDataNasabah(LinkedList linkedList) {
        System.out.println("Data Nasabah");
        linkedList.cetakData();
    }

    private static void cariDataNasabah(Scanner scanner, LinkedList linkedList) {
        System.out.print("Cari Nama Nasabah: ");
        String namaCari = scanner.nextLine();
        linkedList.cariData(namaCari);
    }

    private static void kondisiSetelahTransaksi(LinkedList linkedList) {
        System.out.println("Kondisi Setelah Transaksi");
        linkedList.kondisiSetelahTransaksi();
    }

    private static void tambahNasabahDarurat(Scanner scanner, LinkedList linkedList) {
        System.out.println("Input Data Nasabah Darurat");
        System.out.print("No Rekening: ");
        int noRekeningDarurat = scanner.nextInt();
        scanner.nextLine(); // Membaca karakter baru setelah membaca angka
        System.out.print("Nama: ");
        String namaDarurat = scanner.nextLine();

        linkedList.tambahNasabahDarurat(noRekeningDarurat, namaDarurat);
        System.out.println("Data nasabah darurat berhasil ditambahkan.");
    }

    private static void kondisiNasabahDarurat(LinkedList linkedList) {
        System.out.println("Kondisi Nasabah Darurat");
        linkedList.kondisiNasabahDarurat();
    }
}

