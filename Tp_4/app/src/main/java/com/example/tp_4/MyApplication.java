package com.example.tp_4;

import android.app.Application;

public class MyApplication {


   public class Myapplication extends Application {
        private addpersonne mylist=new addpersonne();

        public addpersonne getMylist() {
            return mylist;
        }

        public void setMylist(addpersonne mylist) {
            this.mylist = mylist;
        }

    }

}
