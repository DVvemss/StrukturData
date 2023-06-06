/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu6.Tugas;


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
        Scanner p = new Scanner(System.in);
        Scanner p1 = new Scanner(System.in);
        
        DaftarAnggotaPaskibraka data = new DaftarAnggotaPaskibraka();
        int jmlAgt = 5;
        
        for (int i = 0; i < jmlAgt; i++) {
            System.out.println("Anggota #" + (i+1));
            
            System.out.print("Nama      : ");
            String nama = p.nextLine();
            System.out.print("Kelas     : ");
            String kelas = p.nextLine();
            System.out.print("Tinggi    : ");
            double tinggi = p1.nextDouble();
            
            System.out.println("");
            
            Paskibraka peserta = new Paskibraka(nama, kelas, tinggi);
            data.tambah(peserta);
        }
        
        System.out.println("");
            
            System.out.println("-----------------------------------");
            System.out.println("Data Angota sebelum sorting");
            System.out.println("-----------------------------------");
            data.tampil();
            
            System.out.println("");
            
            System.out.println("Data Anggota setelah sorting desc berdasarkan tinggi :");
            data.sorting();
            data.tampil();
    }
    
}
