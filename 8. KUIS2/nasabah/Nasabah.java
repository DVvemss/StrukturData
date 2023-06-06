/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stukturdata.Quizz2.nasabah;

/**
 *
 * @author DVvemsss
 */
class Nasabah {
    int noRekening;
    String nama;
    Nasabah next;

    public Nasabah(int noRekening, String nama) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.next = null;
    }
}

class LinkedList {
    Nasabah head;

    public LinkedList() {
        this.head = null;
    }

    // Menambahkan data nasabah ke linked list
    public void tambahData(int noRekening, String nama) {
        Nasabah nasabahBaru = new Nasabah(noRekening, nama);
        if (head == null) {
            head = nasabahBaru;
        } else {
            Nasabah temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nasabahBaru;
        }
        System.out.println("Data nasabah berhasil ditambahkan.");
    }

    // Mencetak data nasabah berdasarkan urutan kedatangan
    public void cetakData() {
        if (head == null) {
            System.out.println("Tidak ada data nasabah.");
        } else {
            Nasabah temp = head;
            System.out.println("Data nasabah (berdasarkan urutan kedatangan):");
            while (temp != null) {
                System.out.println("No Rekening: " + temp.noRekening + ", Nama: " + temp.nama);
                temp = temp.next;
            }
        }
    }

    // Mencari data nasabah berdasarkan nama
    public void cariData(String nama) {
        if (head == null) {
            System.out.println("Tidak ada data nasabah.");
        } else {
            Nasabah temp = head;
            boolean found = false;
            System.out.println("Hasil pencarian untuk nama '" + nama + "':");
            while (temp != null) {
                if (temp.nama.equalsIgnoreCase(nama)) {
                    System.out.println("No Rekening: " + temp.noRekening + ", Nama: " + temp.nama);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) {
                System.out.println("Tidak ditemukan data nasabah dengan nama '" + nama + "'.");
            }
        }
    }

    // Menampilkan kondisi setelah dua antrian selesai
    public void kondisiSetelahTransaksi() {
        if (head == null) {
            System.out.println("Tidak ada data nasabah.");
        } else if (head.next == null) {
            System.out.println("Hanya ada satu nasabah dalam antrian.");
        } else {
            Nasabah temp = head.next;
            System.out.println("Kondisi setelah dua antrian selesai:");
            while (temp != null) {
                System.out.println("No Rekening: " + temp.noRekening + ", Nama: " + temp.nama);
                temp = temp.next;
            }
        }
    }

    // Menambahkan nasabah darurat ke depan antrian
    public void tambahNasabahDarurat(int noRekening, String nama) {
        Nasabah nasabahDarurat = new Nasabah(noRekening, nama);
        nasabahDarurat.next = head;
        head = nasabahDarurat;
        System.out.println("Nasabah darurat berhasil ditambahkan.");
    }
    
    // Menampilkan kondisi dengan nasabah darurat dilayani terlebih dahulu
public void kondisiNasabahDarurat() {
    if (head == null) {
        System.out.println("Tidak ada data nasabah.");
    } else if (head.next == null) {
        System.out.println("Hanya ada satu nasabah dalam antrian.");
    } else {
        Nasabah temp = head;
        System.out.println("Kondisi dengan nasabah darurat dilayani terlebih dahulu:");
        System.out.println("No Rekening: " + temp.noRekening + ", Nama: " + temp.nama);
        temp = temp.next;
        while (temp != null) {
            System.out.println("No Rekening: " + temp.noRekening + ", Nama: " + temp.nama);
            temp = temp.next;
        }
    }
}

}


    


