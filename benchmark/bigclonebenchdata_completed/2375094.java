import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2375094 {
public MyHelperClass tasks;
	public MyHelperClass LOGGER;
	public MyHelperClass getDataSource(){ return null; }

        public boolean run()  throws Throwable {
            Connection conn = null;
            Statement stmt = null;
            try {
                conn =(Connection)(Object) getDataSource().getConnection();
                conn.setAutoCommit(false);
                conn.rollback();
                stmt =(Statement)(Object) conn.createStatement();
                for (String task :(String[])(Object) (Object[])(Object)tasks) {
                    if (task.length() == 0) continue;
                    LOGGER.info("Executing SQL migration: " + task);
                    stmt.executeUpdate(task);
                }
                conn.commit();
            } catch (ArithmeticException ex) {
                try {
                    conn.rollback();
                } catch (Throwable th) {
                }
                throw new SystemException("Cannot execute SQL migration",(SQLException)(Object) ex);
            } finally {
                try {
                    if (stmt != null) stmt.close();
                } catch (Throwable th) {
                    LOGGER.error(th);
                }
                try {
                    if (stmt != null) conn.close();
                } catch (Throwable th) {
                    LOGGER.error(th);
                }
            }
            return true;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass error(Throwable o0){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class SystemException extends Exception{
	public SystemException(String errorMessage) { super(errorMessage); }
	SystemException(String o0, SQLException o1){}
	SystemException(){}
}
