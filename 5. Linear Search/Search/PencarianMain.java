/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu5.Search;

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
        double[] data = {2.7, 2.9, 3.04, 3.12, 3.54, 3.87, 3.9};
        OrderedSearch os = new OrderedSearch(data);
        System.out.println("Isi elemen Array : ");
        os.tampilkan();
        double key = 4;
        int index = os.cari(key);
        if (index != -1) {
            System.out.println("Data " + key + " pada Index " + index);
        }else {
            System.out.println("Data " + key + " tidak ditemukan");
        }
    }
    
}
