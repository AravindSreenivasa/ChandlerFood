package DatabaseHelperClass;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import DatabaseHelperClass.DbStrings;

/**
 * Created by Aravind on 10/5/2015.
 */
public class SQLiteHelperClass extends SQLiteOpenHelper {


    public SQLiteHelperClass(Context context) {
        super(context, DbStrings.DATABASE_NAME, null, DbStrings.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        DbStrings dbs = new DbStrings();
        db.execSQL(dbs.CREATE_TABLE_CATEGORIES);
        db.execSQL(dbs.CREATE_TABLE_EVENT);
        db.execSQL(dbs.CREATE_TABLE_PROGRAMS);
        db.execSQL(dbs.CREATE_TABLE_HELP);
        db.execSQL(dbs.CREATE_TABLE_JOB);
        db.execSQL(dbs.CREATE_TABLE_ACCOUNT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
