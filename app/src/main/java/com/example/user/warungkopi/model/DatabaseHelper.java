package com.example.user.warungkopi.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.warungkopi.konfigurasi.KonstantaDatabase;

/**
 * Kelas ini merupakan representasi dari database lokal.
 * representasi berarti, apapun yang ditulis dikelas ini
 * akan menjadi apapun yang dapat dilihat secara visual di database.
 * Kelas ini digunakan untuk membuat database.
 * !! PERHATIAN !!
 * KELAS INI TIDAK DIGUNAKAN UNTUK BERINTERAKSI DENGAN DATABASE
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ KonstantaDatabase.NAMA_TABEL+"(" +
                KonstantaDatabase.ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                KonstantaDatabase.NAMA_WARUNG+" TEXT,"+
                KonstantaDatabase.NAMA_PEMILIK+" TEXT,"+
                KonstantaDatabase.ALAMAT+" TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+KonstantaDatabase.NAMA_TABEL+"");
        onCreate(db);
    }
}
