/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.UTS_DivaFisensaVemasSugharto;

import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class BarangMain {
    public int jumlah;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah;
        
        
        Scanner input = new Scanner(System.in);
        boolean keeprunning = true;
        
        while(keeprunning) {
        
        System.out.println("1. Input Barang");
        System.out.println("2. Penjualan Barang");
        System.out.println("3. Cek Stok Barang Terbanyak");
        System.out.println("4. Cek Stok Barang Terlaris");
        System.out.println("5. Tampil Barang");
            System.out.println("");
        System.out.print("Silakan Pilih Menu : ");
        int choise = input.nextInt();
        
            switch (choise) {
                case 1:
                    menuA();
                    break;
                    
                case 2:
                    menuB();
                default:
                    throw new AssertionError();
            }
        
        }
        
    }
        public static void menuA(){
            Scanner sc = new Scanner(System.in);
            boolean backToMenu = false;
            
        System.out.print("Masukan Jumlah Barang : ");
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        Barang[] Br = new Barang[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Barang ke -#" + (i+1));
            System.out.print("Masukan Kode Barang : ");
            String kd = input.next();
            System.out.print("Masukan Nama Barang : ");
            String nB = input.next();
            System.out.print("Masukan Stok : ");
            int stk = input.nextInt();
            System.out.print("Masukan Harga Satuan : ");
            float hS = input.nextFloat();
            System.out.println("");
            
            Br[i] = new Barang(kd, nB, stk, hS, jumlah);
            
        }   System.out.println("Apakah anda ingin mengulang Y = 1 / T = 2 ?");
            System.out.println("Pilih 1 / 2");
                int yorn = input.nextInt();

            while(!backToMenu){
                switch (yorn) {
                    case 1:
                        backToMenu = true;
                        break;
                        
                    case 2:
                        backToMenu = false;
                        break;
                    default:
                        System.out.println("Data Tidak Valid");
                }
            }
        }
        
        public static void menuB(){
            int jumlah ;
            Barang[] Br = new Barang[1];
            
            System.out.println("Penjualan Barang");
            System.out.println("Kode    \t  Nama Barang \t  Stok \t  Harga Satuan");
            for (int i = 0; i < Br.length; i++) {
            System.out.println(Br[i].kode + "  \t  " + Br[i].namaBarang + "   \t  " + Br[i].stok + " \t  " + Br[i].hargaSatuan);
            }
            
        }
        
    }

