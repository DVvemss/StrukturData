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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4, 5, 6);
        Tabung tabung = new Tabung(2, 8);

        System.out.println("Kubus");
        System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());
        System.out.println("Volume: " + kubus.hitungVolume());

        System.out.println("\nBalok");
        System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan());
        System.out.println("Volume: " + balok.hitungVolume());

        System.out.println("\nTabung");
        System.out.println("Luas Permukaan: " + tabung.hitungLuasPermukaan());
        System.out.println("Volume: " + tabung.hitungVolume());
    }
    
}
