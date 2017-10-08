package duong.sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import duong.DuongLog;

/**
 * Created by d on 17/01/2017.
 */

public class DuongSQLite {
    public DuongSQLite() {

    }

    public Cursor selectAllFrom(String tableName) {
        return getDatabase().query(tableName, null, null, null, null, null, null);
    }

    public void cloneDatabase() {
        database.close();
    }

    public void createTable(String tbname, String clum) {
        database.execSQL("CREATE TABLE IF NOT EXISTS " + tbname + " (" +
                "`stt`INTEGER PRIMARY KEY AUTOINCREMENT," +
                clum +
                ");");
    }

    private SQLiteDatabase database;

    public SQLiteDatabase getDatabase() {
        return database;
    }

    public void setDatabase(SQLiteDatabase database) {
        this.database = database;
    }

    public void createOrOpenDataBases(Context context, String nameDatabases) {
        database = context.openOrCreateDatabase(nameDatabases, Context.MODE_APPEND, null);
    }

//    public boolean checkDataBase(Context context, String dataBaseName) {
//        File file = new File(getPathDatabase(context, dataBaseName));
//        return file.exists();
//    }

    public void copyDataBase(Context context, String dataBaseName) {
        byte[] buffer = new byte[1024];
        OutputStream myOutput = null;
        int length;
        InputStream myInput = null;
        try {
            File file = new File(getPathDatabase(context, dataBaseName));
            myInput = context.getAssets().open(dataBaseName);
            // outputfile
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            myOutput = new FileOutputStream(file);
            while ((length = myInput.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }
            myOutput.close();
            myOutput.flush();
            myInput.close();
        } catch (IOException e) {
            DuongLog.e(getClass(), e.getMessage());
        }
    }

    public String getPathDatabase(Context context, String dataBaseName) {
        return "/data/data/" + context.getPackageName() + "/databases/" + dataBaseName;
    }

    public boolean checkDataBase(Context context, String dataBaseName) {
        try {
            String myPath = getPathDatabase(context, dataBaseName);
            File fileDB = new File(myPath);
            return fileDB.exists();
        } catch (Exception e) {
            return false;
        }
    }

}
