package com.example.user.warungkopi.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.user.warungkopi.R;
import com.example.user.warungkopi.model.Warung;
import com.example.user.warungkopi.preseenter.MainPresenter;
import com.example.user.warungkopi.preseenter.MainPresenterImpl;
import com.example.user.warungkopi.preseenter.TambahWarungPresenter;
import com.example.user.warungkopi.view.adapter.DaftarWarungAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainView{

    private MainPresenter presenter;
    private RecyclerView rvDaftarWarung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDaftarWarung = (RecyclerView) findViewById(R.id.rv_daftar_warung);

        presenter = new MainPresenterImpl(this, this);

        presenter.ambilDataWarung();
    }

    @Override
    public void tampilkanDaftarWarung(ArrayList<Warung> daftarWarung) {
        LinearLayoutManager manager = new LinearLayoutManager(getBaseContext());
        rvDaftarWarung.setLayoutManager(manager);
        rvDaftarWarung.setAdapter(new DaftarWarungAdapter(daftarWarung, this));
    }

    public void bukaTambahWarung(View view) {
        Intent intent = new Intent(MainActivity.this, TambahWarungActivity.class);
        startActivity(intent);
        finish();
    }
}
