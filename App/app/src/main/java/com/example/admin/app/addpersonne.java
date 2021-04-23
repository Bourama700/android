package com.example.admin.app;

import java.util.ArrayList;
import java.util.List;

public class addpersonne {


    List<Imc_calcul> mylist;

    public addpersonne(List<Imc_calcul> mylist) {
        this.mylist = mylist;
    }

    public addpersonne() {
        String[] nom={};
        String[] prenom={};
        String[] categorie={};
        float [] imc={};

        this.mylist=new ArrayList<>();
        for(int i=0;i<nom.length;i++){

            Imc_calcul compte=new Imc_calcul(nom[i],prenom[i],imc[i],categorie[i]);
            mylist.add(compte);
        }
    }

    public List<Imc_calcul> getMylist() {
        return mylist;
    }

    public void setMylist(List<Imc_calcul> mylist) {
        this.mylist = mylist;
    }
}
