package com.dismas.imaya.periodtracker.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by imaya on 1/30/17.
 */

public class d
        extends SQLiteOpenHelper
{
    private final String a = "CREATE TABLE IF NOT EXISTS pill (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uid INTEGER,name TEXT,classify INTEGER,date INTEGER,memo TEXT,pill_extension_json TEXT,notification_switch INTEGER DEFAULT 0,start_date INTEGER,end_date INTEGER,pill_type INTEGER,pill_type_json TEXT,temp1 TEXT,temp2 TEXT,temp3 TEXT)";
    private final String b = "CREATE TABLE IF NOT EXISTS pill_record (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,pill_id INTEGER,uid INTEGER,take_state INTEGER,take_time INTEGER,take_count INTEGER,feel INTEGER,note TEXT,extension_json TEXT,temp1 TEXT,temp2 TEXT,temp3 TEXT)";

    public d(Context paramContext)
    {
        super(paramContext, "PC_PILL.db", null, 1);
    }

    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
        paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS pill (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uid INTEGER,name TEXT,classify INTEGER,date INTEGER,memo TEXT,pill_extension_json TEXT,notification_switch INTEGER DEFAULT 0,start_date INTEGER,end_date INTEGER,pill_type INTEGER,pill_type_json TEXT,temp1 TEXT,temp2 TEXT,temp3 TEXT)");
        paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS pill_record (_id INTEGER PRIMARY KEY AUTOINCREMENT  NOT NULL,pill_id INTEGER,uid INTEGER,take_state INTEGER,take_time INTEGER,take_count INTEGER,feel INTEGER,note TEXT,extension_json TEXT,temp1 TEXT,temp2 TEXT,temp3 TEXT)");
    }

    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}

