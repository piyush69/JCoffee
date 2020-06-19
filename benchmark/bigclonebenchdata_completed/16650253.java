import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16650253 {
public MyHelperClass getConnection(){ return null; }

    public int visitStatement(String statement) throws Throwable, SQLException {
        MyHelperClass mySQLLogger = new MyHelperClass();
        mySQLLogger.info(statement);
        if (getConnection() == null) {
            throw new JdbcException("cannot exec: " + statement + ", because 'not connected to database'");
        }
        Statement stmt =(Statement)(Object) getConnection().createStatement();
        try {
            return(int)(Object) stmt.executeUpdate(statement);
        } catch (UncheckedIOException ex) {
            getConnection().rollback();
            throw ex;
        } finally {
            stmt.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class JdbcException extends Exception{
	public JdbcException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass close(){ return null; }}
