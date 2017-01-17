package duong;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by d on 17/01/2017.
 */

public class DuongSQLite {
    public DuongSQLite() {
    }

    public void cloneDatabase() {
        database.close();
    }

    public void createTable(String tbname,String clum) {
        database.execSQL("CREATE TABLE IF NOT EXISTS "+tbname+" (" +
                "`stt`INTEGER PRIMARY KEY AUTOINCREMENT," +
                        clum+
                ");");
    }

    private SQLiteDatabase database;

    public SQLiteDatabase getDatabase() {
        return database;
    }

    public void setDatabase(SQLiteDatabase database) {
        this.database = database;
    }

    public void createOrOpenDataBases(Context context,String nameDatabases) {
        database=context.openOrCreateDatabase(nameDatabases+".sqlite",Context.MODE_APPEND,null);
    }

}
