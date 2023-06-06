/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu1;

/**
 *
 * @author DVvemsss
 */
import java.util.Scanner;

public class tugas2 {
    public static double rumusKecepatan() {
        double jarak, waktu;
        Scanner input = new Scanner(System.in);
        System.out.println("======= HITUNG KECEPATAN =======");
        System.out.print("Masukkan Jarak    : ");
        jarak = input.nextDouble();
        System.out.print("Masukkan Waktu    : ");
        waktu = input.nextDouble();
        System.out.println("================================");
        return (jarak / waktu);
    }
    public static double rumusJarak() {
        double waktu, kecepatan;
        Scanner input = new Scanner(System.in);
        System.out.println("========= HITUNG JARAK =========");
        System.out.print("Input Waktu       : ");
        waktu = input.nextDouble();
        System.out.print("Input Kecepatan   : ");
        kecepatan = input.nextDouble();
        System.out.println("================================");
        return (kecepatan * waktu);
    }
    public static double rumusWaktu() {
        double kecepatan, jarak;
        Scanner input = new Scanner(System.in);
        System.out.println("========= HITUNG WAKTU =========");
        System.out.print("Input Kecepatan   : ");
        kecepatan = input.nextDouble();
        System.out.print("Input Jarak       : ");
        jarak = input.nextDouble();
        System.out.println("================================");
        return (jarak / kecepatan);
    }
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int menu;
        menu = input.nextInt();
        if (menu == 1 || menu == 2 || menu == 3) {
            return menu;
        }
        else {
            System.out.print("Masukkan Salah Satu (1-3) : ");
            return menu();
        }
    }
    public static void main(String[] args) {
        int pilih;

        System.out.println("Anda Ingin Menghitung Apa?");
        System.out.println("========== RUMUS =========");
        System.out.println("1. Rumus Kecepatan");
        System.out.println("2. Rumus Jarak");
        System.out.println("3. Rumus Waktu");
        System.out.println("========== PILIH =========");
        System.out.print("Masukan Pilihan Rumus : ");
        pilih = menu();
        
        switch (pilih) {
            case 1 :
            System.out.println("Hasil Hitung Rumus Kecepatan " + rumusKecepatan());
            break;
            case 2 :
            System.out.println("Hasil Hitung Rumus Jarak " + rumusJarak());
            break;
            case 3 :
            System.out.println("Hasil Hitung Rumus Waktu " + rumusWaktu());
            break;
        }
    }
}
