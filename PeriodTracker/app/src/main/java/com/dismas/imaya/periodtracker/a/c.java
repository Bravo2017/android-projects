package com.dismas.imaya.periodtracker.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by imaya on 1/30/17.
 */

public class c
        extends SQLiteOpenHelper
{
    private final String a = "CREATE TABLE period (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,menses_start INTEGER DEFAULT 0,menses_length INTEGER DEFAULT 3,period_length INTEGER DEFAULT 28,pregnancy INTEGER DEFAULT 0,uid INTEGER DEFAULT 0,temp1 TEXT,temp2 TEXT,temp3 TEXT)";
    private final String b = "CREATE TABLE note (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,uid INTEGER DEFAULT 0,date INTEGER DEFAULT 0,intimate INTEGER DEFAULT 0,note TEXT,pill TEXT,temperature REAL DEFAULT 0,weight REAL DEFAULT 0,symptoms TEXT,moods TEXT,temp1 TEXT,temp2 TEXT,temp3 TEXT)";
    private final String c = "CREATE TABLE user (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,uid INTEGER DEFAULT 0,username TEXT,password TEXT,email TEXT,question TEXT,answer TEXT,setting TEXT,temp1 TEXT,temp2 TEXT,temp3 TEXT)";

    public c(Context paramContext)
    {
        super(paramContext, "PC.db", null, 1);
    }

    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
        paramSQLiteDatabase.execSQL("CREATE TABLE period (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,menses_start INTEGER DEFAULT 0,menses_length INTEGER DEFAULT 3,period_length INTEGER DEFAULT 28,pregnancy INTEGER DEFAULT 0,uid INTEGER DEFAULT 0,temp1 TEXT,temp2 TEXT,temp3 TEXT)");
        paramSQLiteDatabase.execSQL("CREATE TABLE note (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,uid INTEGER DEFAULT 0,date INTEGER DEFAULT 0,intimate INTEGER DEFAULT 0,note TEXT,pill TEXT,temperature REAL DEFAULT 0,weight REAL DEFAULT 0,symptoms TEXT,moods TEXT,temp1 TEXT,temp2 TEXT,temp3 TEXT)");
        paramSQLiteDatabase.execSQL("CREATE TABLE user (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,uid INTEGER DEFAULT 0,username TEXT,password TEXT,email TEXT,question TEXT,answer TEXT,setting TEXT,temp1 TEXT,temp2 TEXT,temp3 TEXT)");
    }

    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}