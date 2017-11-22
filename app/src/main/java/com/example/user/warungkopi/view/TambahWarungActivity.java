package com.example.user.warungkopi.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.warungkopi.R;
import com.example.user.warungkopi.model.Warung;
import com.example.user.warungkopi.preseenter.TambahWarungPresenter;
import com.example.user.warungkopi.preseenter.TambahWarungPresenterImpl;

public class TambahWarungActivity extends AppCompatActivity implements TambahWarungView{

    private EditText edtNamaWarkop;
    private EditText edtNamaPemilik;
    private EditText edtAlamat;
    private Button btnTambah;

    private TambahWarungPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_warung);

        presenter = new TambahWarungPresenterImpl(this, this);

        edtNamaWarkop = (EditText) findViewById(R.id.edit_nama_warkop);
        edtNamaPemilik = (EditText) findViewById(R.id.edit_nama_pemilik);
        edtAlamat = (EditText) findViewById(R.id.edit_alamat);
        btnTambah = (Button) findViewById(R.id.btn_tambah);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaWarkop = edtNamaWarkop.getText().toString();
                String namaPemilik = edtNamaPemilik.getText().toString();
                String alamat = edtAlamat.getText().toString();

                Warung warung = new Warung(namaWarkop, namaPemilik, alamat);
                presenter.tambahWarung(warung);
            }
        });
    }

    @Override
    public void berhasilTambah() {
        startActivity(new Intent(TambahWarungActivity.this, MainActivity.class));
        finish();
    }
}
