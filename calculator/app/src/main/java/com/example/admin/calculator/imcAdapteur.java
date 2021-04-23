package com.example.admin.calculator;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class imcAdapteur extends BaseAdapter {

    Activity myactivitie;
    addpersonne mlist;

    public imcAdapteur(Activity myactivitie, addpersonne mlist) {
        this.myactivitie = myactivitie;
        this.mlist = mlist;
    }

    @Override
    public int getCount() {
        return mlist.getMylist().size();
    }

    @Override
    public Imc_calcul getItem(int position) {
        return mlist.getMylist().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View Page1, Page2,Page3;
        Imc_calcul p=this.getItem(position);
        if(Float.valueOf(p.getImc())<16) {
            LayoutInflater inflater = (LayoutInflater) myactivitie.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            Page3 = inflater.inflate(R.layout.page3, parent, false);
            TextView text1 = Page3.findViewById(R.id.date);
            TextView text2 = Page3.findViewById(R.id.nom);
            TextView text3 = Page3.findViewById(R.id.prenom);
            TextView text4 = Page3.findViewById(R.id.imc);
            TextView text5 = Page3.findViewById(R.id.categorie);
            Calendar calendar = Calendar.getInstance();
            String dateview = DateFormat.getDateInstance().format(calendar.getTime());
            text1.setText(dateview);
            text2.setText(p.getNom());
            text3.setText(p.getPrenom());
            text4.setText(String.valueOf(p.getImc()));
            text5.setText(p.getCategorie());
            return Page3;
        }
        else if(Float.valueOf(p.getImc())<18.5){
            LayoutInflater inflater = (LayoutInflater) myactivitie.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            Page1= inflater.inflate(R.layout.page2, parent, false);
            TextView text1 = Page1.findViewById(R.id.date);
            TextView text2 = Page1.findViewById(R.id.nom);
            TextView text3 = Page1.findViewById(R.id.prenom);
            TextView text4 = Page1.findViewById(R.id.imc);
            TextView text5 = Page1.findViewById(R.id.categorie);
            Calendar calendar = Calendar.getInstance();
            String dateview = DateFormat.getDateInstance().format(calendar.getTime());
            text1.setText(dateview);
            text2.setText(p.getNom());
            text3.setText(p.getPrenom());
            text4.setText(String.valueOf(p.getImc()));
            text5.setText(p.getCategorie());
            return Page1;
        }
        else {
            LayoutInflater inflater = (LayoutInflater) myactivitie.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            Page2= inflater.inflate(R.layout.page1, parent, false);
            TextView text1 = Page2.findViewById(R.id.date);
            TextView text2 = Page2.findViewById(R.id.nom);
            TextView text3 = Page2.findViewById(R.id.prenom);
            TextView text4 = Page2.findViewById(R.id.imc);
            TextView text5 = Page2.findViewById(R.id.categorie);
            Calendar calendar = Calendar.getInstance();
            String dateview = DateFormat.getDateInstance().format(calendar.getTime());
            text1.setText(dateview);
            text2.setText(p.getNom());
            text3.setText(p.getPrenom());
            text4.setText(String.valueOf(p.getImc()));
            text5.setText(p.getCategorie());
            return Page2;
        }
    }
}
