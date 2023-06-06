/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu5.praktikum1;

import com.mycompany.stukturdata.minggu5.Search.*;
import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class PencarianMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] data = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        OrderedSearch os = new OrderedSearch(data);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Isi elemen Array : ");
        os.tampilkan();
        
        System.out.print("Masukan data yang ingin di cari : ");
        int key = input.nextInt();
        int index = os.cari(key);
        if (index != -1) {
            System.out.println("Data " + key + " pada Index " + index);
        }else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
    
}
