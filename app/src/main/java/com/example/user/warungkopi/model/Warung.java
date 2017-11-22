package com.example.user.warungkopi.model;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 11/5/2017.
 */

public class Warung {
    private String namaWarung;
    private String alamat;
    private String namaPemilik;

    public Warung() {
    }

    public Warung(String namaWarung, String alamat, String namaPemilik) {
        this.namaWarung = namaWarung;
        this.alamat = alamat;
        this.namaPemilik = namaPemilik;
    }

    public String getNamaWarung() {
        return namaWarung;
    }

    public void setNamaWarung(String namaWarung) {
        this.namaWarung = namaWarung;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }
}
