package com.example.user.warungkopi.view.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.warungkopi.R;
import com.example.user.warungkopi.model.Warung;

import java.util.ArrayList;

/**
 * Created by user on 11/5/2017.
 */

public class DaftarWarungAdapter extends RecyclerView.Adapter<DaftarWarungAdapter.ViewHolder> {

    public DaftarWarungAdapter(ArrayList<Warung> daftarWarung, Activity activity) {
        this.daftarWarung = daftarWarung;
        this.activity = activity;
    }

    private ArrayList<Warung> daftarWarung;
    private Activity activity;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(activity).inflate(R.layout.adapter_daftar_warung, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.namaWarung.setText(daftarWarung.get(position).getNamaWarung());
        holder.alamat.setText(daftarWarung.get(position).getAlamat());
        holder.namaPemilik.setText(daftarWarung.get(position).getNamaPemilik());
    }

    @Override
    public int getItemCount() {
        return daftarWarung.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView namaWarung;
        private TextView alamat;
        private TextView namaPemilik;
        ViewHolder(View itemView) {
            super(itemView);

            namaWarung = (TextView) itemView.findViewById(R.id.txt_nama_warun);
            alamat = (TextView) itemView.findViewById(R.id.txt_alamat);
            namaPemilik = (TextView) itemView.findViewById(R.id.txt_nama_pemilik);
        }
    }
}
