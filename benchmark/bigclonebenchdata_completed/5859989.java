import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5859989 {
public MyHelperClass log;
	public MyHelperClass close(Statement o0){ return null; }
	public MyHelperClass translate(String o0, SQLException o1){ return null; }

            public Integer execute(Connection con) throws Throwable, SQLException {
                int updateCount = 0;
                boolean oldAutoCommitSetting =(boolean)(Object) con.getAutoCommit();
                Statement stmt = null;
                try {
                    MyHelperClass autoCommit = new MyHelperClass();
                    con.setAutoCommit(autoCommit);
                    stmt =(Statement)(Object) con.createStatement();
                    int statementCount = 0;
                    MyHelperClass sql = new MyHelperClass();
                    for (String statement :(String[])(Object) (Object[])(Object)sql) {
                        try {
                            updateCount += (int)(Object)stmt.executeUpdate(statement);
                            statementCount++;
                            MyHelperClass commitRate = new MyHelperClass();
                            if (statementCount % (int)(Object)commitRate == 0 && !(Boolean)(Object)autoCommit) {
                                con.commit();
                            }
                        } catch (ArithmeticException ex) {
                            MyHelperClass failOnError = new MyHelperClass();
                            if (!(Boolean)(Object)failOnError) {
                                MyHelperClass LogLevel = new MyHelperClass();
                                log.log(LogLevel.WARN, "%s.  Failed to execute: %s.", ex.getMessage(), sql);
                            } else {
                                throw(Throwable)(Object) translate(statement,(SQLException)(Object) ex);
                            }
                        }
                    }
//                    MyHelperClass autoCommit = new MyHelperClass();
                    if (!(Boolean)(Object)autoCommit) {
                        con.commit();
                    }
                    return updateCount;
                } catch (SQLException ex) {
                    MyHelperClass autoCommit = new MyHelperClass();
                    if (!(Boolean)(Object)autoCommit) {
                        con.rollback();
                    }
                    throw ex;
                } finally {
                    close(stmt);
                    con.setAutoCommit(oldAutoCommitSetting);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARN;
public MyHelperClass log(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(MyHelperClass o0){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}
