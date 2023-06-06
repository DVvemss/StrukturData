/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu1;

/**
 *
 * @author DVvemsss
 */
public class tugas1 {
    public static double[] pendapatan (int[] beratCucian, int harga){
        double[] total = new double[beratCucian.length];
        for (int i = 0; i < beratCucian.length; i++){
            total[i] = beratCucian[i] * harga;
        }
        for (int i = 0; i < beratCucian.length; i++){
            if (beratCucian[i] > 10){
                total[i] = total[i] - (total[i] * 0.05);
            }
        }
        return total;
    }
    public static double jumlahTotal(double[] total) {
        double totalPenghasilan = 0;
        for (int i = 0; i < total.length; i++){
            totalPenghasilan += total[i];
        }
        return totalPenghasilan;
    }
    public static void main(String[] args) {
        String[] customer = {"Ani", "Budi", "Bina", "Cita"};
        int[] beratCucian = {4, 15, 6, 11};
        int biayaPerKg = 4500;
        
        System.out.println("==========Smile Laundry==========");
        double[] totalPenghasilan = pendapatan(beratCucian, biayaPerKg);
        System.out.println("Nama               Total Harga");
        for (int i = 0; i < beratCucian.length; i++){
            System.out.println(customer[i] + "         \t   Rp. " + totalPenghasilan[i]);
        }
        System.out.println("=================================");
        System.out.print("Total Pengasilan : ");
        System.out.println("Rp. " + jumlahTotal(totalPenghasilan));
    }
}
