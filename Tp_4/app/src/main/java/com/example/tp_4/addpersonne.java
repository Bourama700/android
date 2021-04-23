package com.example.tp_4;

import java.util.ArrayList;
import java.util.List;

public class addpersonne {

    List<Imc_Calcul> mylist;

    public addpersonne(List<Imc_Calcul> mylist) {
        this.mylist = mylist;
    }

    public addpersonne() {
        String[] nom={""};
        String[] prenom={""};
        String[] categorie={""};
        float [] imc={};

        this.mylist=new ArrayList<>();
        for(int i=0;i<nom.length;i++){

            Imc_Calcul compte=new Imc_Calcul(nom[i],prenom[i],imc[i],categorie[i]);
            mylist.add(compte);
        }
    }

    public List<Imc_Calcul> getMylist() {
        return mylist;
    }

    public void setMylist(List<Imc_Calcul> mylist) {
        this.mylist = mylist;
    }
}

