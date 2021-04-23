package com.example.admin.calculator;

import android.app.Application;

public class Myapplication extends Application {


    private addpersonne mylist=new addpersonne();

    public addpersonne getMylist() {
        return mylist;
    }

    public void setMylist(addpersonne mylist) {
        this.mylist = mylist;
    }
}
