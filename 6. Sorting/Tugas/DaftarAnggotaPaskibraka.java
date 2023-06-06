/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu6.Tugas;

/**
 *
 * @author DVvemsss
 */
public class DaftarAnggotaPaskibraka {
    
    Paskibraka[] listPeserta;
    int id;
    
    DaftarAnggotaPaskibraka(){
        listPeserta = new Paskibraka[5];
        id = 0;
    }
    
    void tambah(Paskibraka peserta){
        if (id < listPeserta.length) {
            listPeserta[id] = peserta;
            id++;
        }else {
            System.out.println("Daftar Sudah Penuh");
        }
    }
    
    void tampil(){
        System.out.println("Daftar Anggota Paskibraka");
        for (int i = 0; i < id; i++) {
                System.out.println("Peserta #" + (i+1));
                listPeserta[i].tampilIdentitas();
        }
    } 
    
    void sorting(){
        for (int i = 0; i < id - 1; i++) {
            for (int j = i + 1; j < id; j++) {
                if (listPeserta[i].getTinggi() < listPeserta[j].getTinggi()) {
                    //swap position
                    Paskibraka temp = listPeserta[i];
                    listPeserta[i] = listPeserta[j];
                    listPeserta[j] = temp;
                }
            }
        }
    }
}
