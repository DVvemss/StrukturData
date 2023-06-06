/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.Minggu3.LatihanPraktikum.praktikum1;
import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukan jumlah Bangun ruang yang diinginkan : ");
        int jumlahBangunRuang = input.nextInt();
        
        Balok[] balokArr = new Balok[jumlahBangunRuang];
        Kubus[] kubusArr = new Kubus[jumlahBangunRuang];
        Tabung[] tabungArr = new Tabung[jumlahBangunRuang];
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Masukkan atribut-atribut Balok ke-" + (i+1));
            System.out.print("Panjang: ");
            double balokPanjang = input.nextDouble();
            System.out.print("Lebar: ");
            double balokLebar = input.nextDouble();
            System.out.print("Tinggi: ");
            double balokTinggi = input.nextDouble();
            balokArr[i] = new Balok(balokPanjang, balokLebar, balokTinggi);
            
            System.out.println("Masukkan atribut-atribut Kubus ke-" + (i+1));
            System.out.print("Sisi: ");
            double kubusSisi = input.nextDouble();
            kubusArr[i] = new Kubus(kubusSisi);
            
            System.out.println("Masukkan atribut-atribut Tabung ke-" + (i+1));
            System.out.print("Jari-jari: ");
            double tabungJariJari = input.nextDouble();
            System.out.print("Tinggi: ");
            double tabungTinggi = input.nextDouble();
            tabungArr[i] = new Tabung(tabungJariJari, tabungTinggi);
        }
        
        System.out.println("Hasil perhitungan: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Balok ke-" + (i+1));
            System.out.println("Luas permukaan: " + balokArr[i].hitungLuasPermukaan());
            System.out.println("Volume: " + balokArr[i].hitungVolume());
            
            System.out.println("Kubus ke-" + (i+1));
            System.out.println("Luas permukaan: " + kubusArr[i].hitungLuasPermukaan());
            System.out.println("Volume: " + kubusArr[i].hitungVolume());
            
            System.out.println("Tabung ke-" + (i+1));
            System.out.println("Luas permukaan: " + tabungArr[i].hitungLuasPermukaan());
            System.out.println("Volume: " + tabungArr[i].hitungVolume());
        }
    }
    
}
