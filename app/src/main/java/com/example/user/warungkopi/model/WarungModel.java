package com.example.user.warungkopi.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.user.warungkopi.konfigurasi.KonstantaDatabase;

import java.util.ArrayList;

/**
 * Created by Microsoft on 19/11/2017.
 */

public class WarungModel {
    private SQLiteDatabase database;
    private DatabaseHelper helper;

    public WarungModel(Context context) {
        this.helper = new DatabaseHelper(context,"WarungDB", null, 2);
    }

    private SQLiteDatabase buka () throws SQLException {
        database = helper.getWritableDatabase();
        return database;
    }

    private void tutup() {
        helper.close();
    }

    public void tambah(ContentValues Values){
        database = buka();
        long hasil = database.insert(KonstantaDatabase.NAMA_TABEL, null, Values);
        Log.d("hasil", hasil+"sd");

    }
    public void ubah(String id){

    }

    public void hapus(String id){

    }

    public Warung ambilSatu(String id) {
    return null;
    }

    public ArrayList<Warung> ambilSemuaWarung(){

        ArrayList<Warung> daftarWarung = new ArrayList<>();
        database = buka();

    Cursor cursor = database.rawQuery("SELECT * FROM " + KonstantaDatabase.NAMA_TABEL, null);


    if (cursor.moveToFirst()){
        while (!cursor.isAfterLast())
        {
            String namaWarung = cursor.getString(cursor.getColumnIndex(KonstantaDatabase.NAMA_WARUNG));
            String namaPemilik = cursor.getString(cursor.getColumnIndex(KonstantaDatabase.NAMA_PEMILIK));
            String alamat = cursor.getString(cursor.getColumnIndex(KonstantaDatabase.ALAMAT));

            Warung warung = new Warung(namaWarung, namaPemilik, alamat);

            daftarWarung.add(warung);

            cursor.moveToNext(); //arahin cursor ke baris selanjutnya
        }
    }

    return daftarWarung;
    }
}
