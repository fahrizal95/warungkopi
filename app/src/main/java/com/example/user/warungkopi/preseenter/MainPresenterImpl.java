package com.example.user.warungkopi.preseenter;

import android.app.Activity;

import com.example.user.warungkopi.model.Warung;
import com.example.user.warungkopi.model.WarungModel;
import com.example.user.warungkopi.view.MainActivity;
import com.example.user.warungkopi.view.MainView;

import java.util.ArrayList;

/**
 * Created by user on 11/5/2017.
 */

public class MainPresenterImpl implements MainPresenter {

    private Activity activity;
    private MainView view;
    private WarungModel model;

    public MainPresenterImpl(MainActivity activity, MainView view) {
        this.view = view;
        this.activity = activity;
        this.model = new WarungModel(activity);
    }

    @Override
    public void ambilDataWarung() {

        //deklarasi arraylist daftar warung
        ArrayList<Warung> daftarWarung = new ArrayList<>();
        daftarWarung = model.ambilSemuaWarung();
        view.tampilkanDaftarWarung(daftarWarung);

    }
}
