/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.minggu6.Praktikum2;

/**
 *
 * @author DVvemsss
 */
public class DaftarMahasiswaBerprestasi {
   Mahasiswa listMhs[] = new Mahasiswa[5];
   int idx;
   
   void tambah(Mahasiswa m){
       if (idx < listMhs.length) {
           listMhs[idx] = m;
           idx++;
       }else {
           System.out.println("Sata sudah penuh!!");
       }
   }
   
   void tampil(){
       for(Mahasiswa m : listMhs){
           m.Tampil();
           System.out.println("------------------------");
       }
   }
   
   void bubblSort(){
       
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 0; j < listMhs.length-1; j++){
                if (listMhs[j].ipk > listMhs[j+1].ipk) {
                    //swap the elements
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j+1];
                    listMhs[j+1] = tmp;
                }
            }
        }
    }
   
   void selectionSort(){
       for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j <listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap the elements
            Mahasiswa tmp = listMhs[i];
            listMhs[i] = listMhs[idxMin];
            listMhs[idxMin] = tmp;
        }
   }
}
