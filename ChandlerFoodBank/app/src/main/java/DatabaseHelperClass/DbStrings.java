package DatabaseHelperClass;

/**
 * Created by Aravind on 10/10/2015.
 */
public class DbStrings {
    public static final String TABLE_CATRGORES = "categories";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";

    public static final String TABLE_EVENT = "event";
    public static final String COLUMN_TIME = "time";
    public static final String COLUMN_DAY = "day";
    public static final String COLUMN_CONTACT = "contact";
    public static final String COLUMN_DETAILS = "details";

    public static final String TABLE_PROGRAMS = "programs";

    public static final String TABLE_HELP = "help";

    public static final String TABLE_JOB = "job";
    public static final String COLUMN_COMPANY = "company";

    public static final String TABLE_ACCOUNT = "account";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_SIGNEDIN = "signedin";


    public static final String DATABASE_NAME = "FoodBank.db";
    public static final int DATABASE_VERSION = 1;

    public static final String CREATE_TABLE_CATEGORIES = "create table "
            + TABLE_CATRGORES + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_NAME
            + " text not null);";

    public static final String CREATE_TABLE_EVENT = "create table "
            + TABLE_EVENT + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_NAME
            + " text not null, " + COLUMN_TIME
            + " text, " + COLUMN_DAY
            + " text, " + COLUMN_CONTACT
            + " text, " + COLUMN_DETAILS
            + " text);";

    public static final String CREATE_TABLE_PROGRAMS = "create table "
            + TABLE_PROGRAMS + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_NAME
            + " text not null, " + COLUMN_DETAILS
            + " text);";

    public static final String CREATE_TABLE_HELP = "create table "
            + TABLE_HELP + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_NAME
            + " text not null, " + COLUMN_DETAILS
            + " text);";

    public static final String CREATE_TABLE_ACCOUNT = "create table "
            + TABLE_ACCOUNT + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_USERNAME
            + " text not null, " + COLUMN_PASSWORD
            + " text, " + COLUMN_SIGNEDIN
            + " integer);";

    public static final String CREATE_TABLE_JOB = "create table "
            + TABLE_JOB + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_NAME
            + " text not null, " + COLUMN_COMPANY
            + " text, " + COLUMN_CONTACT
            + " text);";
}
