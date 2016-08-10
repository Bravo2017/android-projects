package com.dismas.imaya.databasetrial;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by imaya on 8/2/16.
 */
public class Main extends AppCompatActivity {
    public static void main(String[] args) throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }
}
