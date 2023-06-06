/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu6.Praktikum2;

import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;
        
        System.out.println("Masukan Data Mahasiswa");
        for (int i = 0; i < jumMhs; i++) {
            
            System.out.println("Data mahasiswa ke-" + (i+1));
            
            System.out.print("Nama      : ");
            String nama = s1.next();
            System.out.print("Thn Masuk : ");
            int thn = s.nextInt();
            System.out.print("Umur      : ");
            int umur = s.nextInt();
            System.out.print("IPK       : ");
            double ipk = s.nextDouble();
            
            System.out.println("");
            
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
            
        }
            
            System.out.println("");
            
            System.out.println("-----------------------------------");
            System.out.println("Data Mahasiswa sebelum sorting");
            data.tampil();
            
            System.out.println("");
           
            System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk :");
            data.bubblSort();
            data.tampil();
            
            System.out.println("");
            
            System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk  :");
            data.selectionSort();
            data.tampil();
    }
    
}
