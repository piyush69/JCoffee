import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3897603 {
public MyHelperClass executeSqlScript(Tasks o0, InputStream o1){ return null; }
public MyHelperClass getModelVersion(){ return null; }
	public MyHelperClass getLocalModelVersion(){ return null; }
	public MyHelperClass getConn(){ return null; }

    public void updateDBModel(Tasks task) throws Throwable, Exception {
        task.setOperationName("Updating DB Model..");
        int localVersion =(int)(Object) getLocalModelVersion();
        int currentVersion = 0;
        try {
            currentVersion =(int)(Object) getModelVersion();
        } catch (SQLException e) {
            if (e.getErrorCode() != 1146) {
                throw e;
            }
        }
        boolean autoCommit =(boolean)(Object) getConn().getAutoCommit();
        try {
            getConn().setAutoCommit(false);
            for (int version = currentVersion + 1; version <= localVersion; version++) {
                task.setStatus("Updating to version " + version);
                InputStream in = EDACCApp.class.getClassLoader().getResourceAsStream("edacc/resources/db_version/" + version + ".sql");
                if (in == null) {
                    throw new SQLQueryFileNotFoundException();
                }
                executeSqlScript(task, in);
                Statement st =(Statement)(Object) getConn().createStatement();
                st.executeUpdate("INSERT INTO `Version` VALUES (" + version + ", NOW())");
                st.close();
            }
        } catch (Exception e) {
            getConn().rollback();
            throw e;
        } finally {
            getConn().setAutoCommit(autoCommit);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Tasks {

public MyHelperClass setStatus(String o0){ return null; }
	public MyHelperClass setOperationName(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class EDACCApp {

}

class SQLQueryFileNotFoundException extends Exception{
	public SQLQueryFileNotFoundException(String errorMessage) { super(errorMessage); }
	SQLQueryFileNotFoundException(){}
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
