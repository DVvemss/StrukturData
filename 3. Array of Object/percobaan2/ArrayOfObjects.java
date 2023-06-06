/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.Minggu3.percobaan2;

import com.mycompany.stukturdata.Minggu3.percobaan1.*;
import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class ArrayOfObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {

        ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukan Panjang : ");
            ppArray[i].panjang  = sc.nextInt();
            System.out.print("Masukan Lebar : ");
            ppArray[i].lebar = sc.nextInt();
            
        }        
        for (int i = 0; i < 3; i++) {

        System.out.println("Persegi Panjang ke-0, Panjang" + ppArray[i].panjang + ", Lebar " + ppArray[i].lebar);
        
        }
    }
    
}
