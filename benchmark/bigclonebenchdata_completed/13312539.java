import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13312539 {

    private void executeScript(SQLiteDatabase sqlDatabase, InputStream input)  throws Throwable {
        StringWriter writer = new StringWriter();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, writer);
        } catch (UncheckedIOException e) {
            throw new ComixException("Could not read the database script",(IOException)(Object) e);
        }
        String multipleSql = writer.toString();
        String[] split = multipleSql.split("-- SCRIPT_SPLIT --");
        for (String sql : split) {
            if (!sql.trim().equals("")) {
                sqlDatabase.execSQL(sql);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }}

class SQLiteDatabase {

public MyHelperClass execSQL(String o0){ return null; }}

class ComixException extends Exception{
	public ComixException(String errorMessage) { super(errorMessage); }
	ComixException(){}
	ComixException(String o0, IOException o1){}
}
