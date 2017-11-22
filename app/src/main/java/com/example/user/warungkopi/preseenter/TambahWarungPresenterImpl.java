package com.example.user.warungkopi.preseenter;

import android.app.Activity;
import android.content.ContentValues;
import android.renderscript.Sampler;

import com.example.user.warungkopi.konfigurasi.KonstantaDatabase;
import com.example.user.warungkopi.model.Warung;
import com.example.user.warungkopi.model.WarungModel;
import com.example.user.warungkopi.view.TambahWarungView;

/**
 * Created by Microsoft on 19/11/2017.
 */

public class TambahWarungPresenterImpl implements TambahWarungPresenter {

    private Activity activity;
    private TambahWarungView view;
    private WarungModel model;

    public TambahWarungPresenterImpl(Activity activity, TambahWarungView view) {
        this.activity = activity;
        this.view = view;
        this.model = new WarungModel(activity);
    }

    @Override
    public void tambahWarung(Warung warung) {
        ContentValues Values = new ContentValues();
        Values.put(KonstantaDatabase.NAMA_WARUNG, warung.getNamaWarung());
        Values.put(KonstantaDatabase.NAMA_PEMILIK, warung.getNamaPemilik());
        Values.put(KonstantaDatabase.ALAMAT, warung.getAlamat());

        model.tambah(Values);
        view.berhasilTambah();
    }
}
