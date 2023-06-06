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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan Jumlah Bangun Ruang : ");
        int jumlahBangunRuang = input.nextInt();
        
        Object[] bangunRuang = new Object[jumlahBangunRuang];
        
        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nBangun Ruang ke- " + (i + 1));
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.print("Pilih jenis bangun ruang : ");
            int jenisBangunRuang = input.nextInt();
        }
    }
    
}
