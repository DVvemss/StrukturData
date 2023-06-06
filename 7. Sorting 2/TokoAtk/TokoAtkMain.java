/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu7.TokoAtk;



/**
 *
 * @author DVvemsss
 */
public class TokoAtkMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nb = {"Pensil", "Buku", "Penggaris", "Bulpen"};
        int[] stk = {35, 20, 50, 25};
        int[] hrg = {1000, 5000, 1500, 2000};
        
        TokoAtk data = new TokoAtk(nb, stk, hrg, nb.length);
        
        System.out.println("Data Sebelum Urut");
        data.tampilData();
    }
    
}
