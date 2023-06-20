package com.mycompany.stukturdata.UAS_DivaFisensaVemasSugiharto.UAS;


public class Pajak {
    private static int counter = 1;
    public int kode;
    public Kendaraan kendaraan;
    public int nominal;
    public int denda;
    public int bulanBayar;

    public Pajak(Kendaraan kendaraan, int bulanBayar) {
        this.kode = counter++;
        this.kendaraan = kendaraan;
        this.bulanBayar = bulanBayar;
        hitungNominal();
        hitungDenda();
    }

    private void hitungNominal() {
        int cc = kendaraan.cc;
        String jenis = kendaraan.jenis;

        if (jenis.equals("roda2")) {
            if (cc < 100) {
                nominal = 100000;
            } else if (cc >= 100 && cc <= 250) {
                nominal = 250000;
            } else if (cc > 250) {
                nominal = 500000;
            }
        } else if (jenis.equals("roda4")) {
            if (cc < 1000) {
                nominal = 750000;
            } else if (cc >= 1000 && cc <= 2500) {
                nominal = 1000000;
            } else if (cc > 2500) {
                nominal = 1500000;
            }
        }
    }

    private void hitungDenda() {
        int bulanHarusBayar = kendaraan.bulanHarusBayar;
        int dendaPerBulan = 50000;
        int bulanTelat = bulanBayar - bulanHarusBayar;

        if (bulanTelat > 0) {
            if (bulanTelat <= 3) {
                denda = bulanTelat * dendaPerBulan;
            } else {
                denda = bulanTelat * dendaPerBulan * 3;
            }
        }
    }
}
