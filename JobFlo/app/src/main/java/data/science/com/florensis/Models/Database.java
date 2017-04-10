package data.science.com.florensis.Models;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import data.science.com.florensis.DataContract;

import static data.science.com.florensis.R.id.pestname;


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
        String tableRecordnames="create table tableRecordnames(_id INTEGER PRIMARY KEY AUTOINCREMENT, pestname, bedname, greenhouse,value,time_stamp,userid)";
        String tableRecords="create table tableRecords(pestid, bedid,value,time_stamp,userid)";
        String CREATE_QUERY="create table " + DataContract.productEntry.TABLE_NAME+"("+DataContract.productEntry.GREENHOUSENAME+" text,"+DataContract.productEntry.BEDID+" text);";
        db.execSQL(tableEmp);
        db.execSQL(tableGreenHouse);
        db.execSQL(tableGreenBeds);
        db.execSQL(tableRecords);
        db.execSQL(tableRecordnames);
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
        values.put("bedid", bedid);
        values.put("bedname",bedname);
        values.put("greenhousename",greenhousename);
        sqLiteDatabase.insert("tableGreenBeds",null,values);
    }
    public void insertRecords(String pestid, String bedid, String value, String time_stamp, String userid)
    {


        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("pestid",pestid);
        values.put("bedid",bedid);
        values.put("value",value);
        values.put("time_stamp",time_stamp);
        values.put("userid",userid);
        sqLiteDatabase.insert("tableRecords",null,values);
    }
    public void insertRecordNames(String pestname, String bedname, String greenhouse, String value, String time_stamp, String userid)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("pestname",pestname);
        values.put("bedname",bedname);
        values.put("greenhouse",greenhouse);
        values.put("value",value);
        values.put("time_stamp",time_stamp);
        values.put("userid",userid);
        sqLiteDatabase.insert("tableRecordnames",null,values);
    }
    public List<String> getRecords(){
        List<String> records = new ArrayList<String>();

        // Select All Query
        String selectQuery = "SELECT  * FROM tablePest WHERE pestid = '"+pestname+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                records.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning pest
        return records;
    }

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
    public String getPestID(String pest_name){
        // Select All Query
        String selectQuery = "SELECT  * FROM tablePest";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                if (cursor.getString(1).equals(pest_name))
                {
                    return cursor.getString(0);
                }
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning pest
        return String.valueOf(0);
    }
    public String getBedID(String bed_name, String greenhouse){
        // Select All Query
        // Select All Query
        String selectQuery = "SELECT  * FROM tableGreenBeds  WHERE greenhousename = '"+greenhouse+"'";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                if (cursor.getString(1).equals(bed_name))
                {
                    return cursor.getString(0);
                }
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        return String.valueOf(0);
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
    public Cursor queryAll() {
        String selectQuery = "SELECT * FROM tableRecordnames";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        return cursor;

    }
    public JSONArray getSavedRecords()
    {
        String selectQuery = "SELECT * FROM tableRecords";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null );

        JSONArray resultSet     = new JSONArray();

        cursor.moveToFirst();
        while (cursor.isAfterLast() == false) {

            int totalColumn = cursor.getColumnCount();
            JSONObject rowObject = new JSONObject();

            for( int i=0 ;  i< totalColumn ; i++ )
            {
                if( cursor.getColumnName(i) != null )
                {
                    try
                    {
                        if( cursor.getString(i) != null )
                        {
//                            Log.v("TAG_NAME", cursor.getString(i) );
                            rowObject.put(cursor.getColumnName(i) ,  cursor.getString(i) );
                        }
                        else
                        {
                            rowObject.put( cursor.getColumnName(i) ,  "" );
                        }
                    }
                    catch( Exception e )
                    {
//                        Log.v("TAG_NAME", e.getMessage()  );
                    }
                }
            }
            resultSet.put(rowObject);
            cursor.moveToNext();
        }
        cursor.close();
//        Log.v("TAG_NAME", resultSet.toString() );

        return resultSet;
    }
    public void emptyTables() {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("delete from tableRecords");
        db.execSQL("delete from tableRecordnames");

    }
}

