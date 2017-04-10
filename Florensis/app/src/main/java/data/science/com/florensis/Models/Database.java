package data.science.com.florensis.Models;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import data.science.com.florensis.DataContract;


public class Database extends SQLiteOpenHelper {

    public Database(Context context)
    {
        super(context, "Florensis.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String tableEmp="create table tablePest(pestid,pestname)";
        String tableGreenHouse="create table tableGreenHouse(greenhouseid,greenhousename)";
        String tableGreenBeds="create table tableGreenBeds(bedid,bedname,greenhousename)";
        String CREATE_QUERY="create table " + DataContract.productEntry.TABLE_NAME+"("+DataContract.productEntry.GREENHOUSENAME+" text,"+DataContract.productEntry.BEDID+" text);";
        db.execSQL(tableEmp);
        db.execSQL(tableGreenHouse);
        db.execSQL(tableGreenBeds);
        db.execSQL(CREATE_QUERY);
    }

    public void addInformations(SQLiteDatabase db, String greenhouse, String bedID){
        ContentValues values=new ContentValues();
       values.put(DataContract.productEntry.GREENHOUSENAME,greenhouse);
        values.put(DataContract.productEntry.BEDID,bedID);
        db.insert(DataContract.productEntry.TABLE_NAME,null,values);
    }


    public Cursor getInformations(SQLiteDatabase db){
        String[] projections = {DataContract.productEntry.GREENHOUSENAME, DataContract.productEntry.BEDID};
         Cursor cursor;
        cursor = db.query(DataContract.productEntry.TABLE_NAME, projections,

                null, null,null,null,null);
        return cursor;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    public void insertPest(int pestid, String pestname)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("pestid",pestid);
        values.put("pestname",pestname);

        sqLiteDatabase.insert("tablePest",null,values);
    }
    public void insertGreenHouse(int greenhouseid,String greenhousename)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("greenhouseid",greenhouseid);
        values.put("greenhousename",greenhousename);
        sqLiteDatabase.insert("tableGreenHouse",null,values);
    }
    public void insertGreenBeds(int bedid,String bedname, String greenhousename)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("bedid",bedid);
        values.put("bedname",bedname);
        values.put("greenhousename",greenhousename);
        sqLiteDatabase.insert("tableGreenBeds",null,values);
    }
//    public String[] getPests() {
//        ArrayList<String>stringArrayList=new ArrayList<String>();
//        String getPest="select * from tablePest";
//        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
//        Cursor cursor=sqLiteDatabase.rawQuery(getPest, null);
//        if(cursor.moveToFirst()){
//            do{
//                stringArrayList.add(cursor.getString(1));
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//
//        String[] allSpinner = new String[stringArrayList.size()];
//        allSpinner = stringArrayList.toArray(allSpinner);
//
//        return allSpinner;
//    }

    /**
     * Getting all greenhouses
     * returns list of greenhouses
     * */
    public List<String> getGreenHouses(){
        List<String> greenhouses = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM tableGreenHouse";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                greenhouses.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning greenhouses
        return greenhouses;
    }
    /**
     * Getting all Pest
     * returns list of Pest
     * */
    public List<String> getPest(){
        List<String> pest = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM tablePest";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                pest.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning pest
        return pest;
    }
    /**
     * Getting all greenhousebeds
     * returns list of greenhousebeds
     * */
    public List<String> getGreenHouseBeds(String greenhouse){
        List<String> greenhousebeds = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM tableGreenBeds  WHERE greenhousename = '"+greenhouse+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                greenhousebeds.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning greenhousebeds
        return greenhousebeds;
    }
}

