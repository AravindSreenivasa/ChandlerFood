package DatabaseHelperClass;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import DetailsClass.Categories;

/**
 * Created by Aravind on 10/5/2015.
 */
public class DataSource {
    private SQLiteDatabase database;
    private SQLiteHelperClass dbhelper;
    private String[] allColoumnns = {DbStrings.COLUMN_ID, DbStrings.COLUMN_NAME};
    private String[] signedIn = {DbStrings.COLUMN_SIGNEDIN};

    public DataSource(Context context){
        dbhelper = new SQLiteHelperClass(context);
    }

    public void open() throws SQLException {
        database = dbhelper.getWritableDatabase();
    }

    public void prePopulateCategories()
    {
        ContentValues contentValue = new ContentValues();
        contentValue.put(DbStrings.COLUMN_NAME, "I CAN HELP");
        long insertId = database.insert(DbStrings.TABLE_CATRGORES, null, contentValue);

        contentValue.put(DbStrings.COLUMN_NAME, "I NEED HELP");
        insertId = database.insert(DbStrings.TABLE_CATRGORES, null, contentValue);

        contentValue.put(DbStrings.COLUMN_NAME, "UPCOMING EVENTS");
        insertId = database.insert(DbStrings.TABLE_CATRGORES, null, contentValue);

        contentValue.put(DbStrings.COLUMN_NAME, "JOB OPPORTUNITIES");
        insertId = database.insert(DbStrings.TABLE_CATRGORES, null, contentValue);
    }

    public void prePopulateEvents()
    {
        ContentValues contentValue = new ContentValues();
        contentValue.put(DbStrings.COLUMN_NAME, "I CAN HELP");
        long insertId = database.insert(DbStrings.TABLE_CATRGORES, null, contentValue);

        contentValue.put(DbStrings.COLUMN_NAME, "I NEED HELP");
        insertId = database.insert(DbStrings.TABLE_CATRGORES, null, contentValue);

        contentValue.put(DbStrings.COLUMN_NAME, "UPCOMING EVENTS");
        insertId = database.insert(DbStrings.TABLE_CATRGORES, null, contentValue);

        contentValue.put(DbStrings.COLUMN_NAME, "JOB OPPORTUNITIES");
        insertId = database.insert(DbStrings.TABLE_CATRGORES, null, contentValue);
    }

    public void AddUser(String username, String password){
        ContentValues contentValue = new ContentValues();
        contentValue.put(DbStrings.COLUMN_USERNAME, username);
        contentValue.put(DbStrings.COLUMN_PASSWORD, password);
        contentValue.put(DbStrings.COLUMN_SIGNEDIN, 1);
        long insertId = database.insert(DbStrings.TABLE_ACCOUNT, null, contentValue);
    }
    public boolean isLoggedIn(){
        Cursor cursor = database.query(DbStrings.TABLE_ACCOUNT,signedIn ,null,null,null,null,null);
        cursor.moveToFirst();
        int b = cursor.getCount();
        if(b==0)
            return false;
        int a = cursor.getInt(0);
        if(a==1)
            return true;
        else
            return false;
    }

    public void close(){
        dbhelper.close();
    }

//    public KharchClass createNewKharch(String reason, Double amount){
//        ContentValues contentValue = new ContentValues();
//        contentValue.put(SQLiteHelperClass.COLUMN_REASON,reason);
//        contentValue.put(SQLiteHelperClass.COLUMN_AMOUNT, amount);
//        long insertId = database.insert(SQLiteHelperClass.TABLE_NAME, null, contentValue);
//
//        Cursor cursor = database.query(SQLiteHelperClass.TABLE_NAME, allColoumnns,SQLiteHelperClass.COLUMN_ID + "=" + insertId,null,null,null,null);
//
//        cursor.moveToFirst();
//        KharchClass kharch = new KharchClass();
//        kharch.setId(cursor.getLong(0));
//        kharch.setReason(cursor.getString(1));
//        kharch.setAmount(cursor.getDouble(2));
//
//        return kharch;
//
//    }

    public ArrayList<String> GetCategories() {
        ArrayList<String> categories = new ArrayList<String>();
        Cursor cursor = database.query(DbStrings.TABLE_CATRGORES, allColoumnns,null,null,null,null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()){

            categories.add(cursor.getString(1));
            cursor.moveToNext();
        }

        return categories;
    }
}
