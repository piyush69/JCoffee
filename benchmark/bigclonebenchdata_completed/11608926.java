import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11608926 {
public MyHelperClass con;
	public MyHelperClass ProcessQuery(String o0, PrintStream o1){ return null; }

    void ProcessRequests(DataInputStream in, PrintStream out) {
        String sQuery;
        while (true) {
            try {
                sQuery = in.readLine();
                if (sQuery == null) return;
                if (sQuery.startsWith("select")) {
                    ProcessQuery(sQuery, out);
                } else if (sQuery.startsWith("insert")) {
                    Statement stmt =(Statement)(Object) con.createStatement();
                    stmt.executeUpdate(sQuery);
                } else if (sQuery.startsWith("update")) {
                    Statement stmt =(Statement)(Object) con.createStatement();
                    stmt.executeUpdate(sQuery);
                } else if (sQuery.startsWith("commit")) {
                    con.commit();
                } else if (sQuery.startsWith("autocommit true")) {
                    con.setAutoCommit(true);
                } else if (sQuery.startsWith("autocommit false")) {
                    con.setAutoCommit(false);
                } else if (sQuery.startsWith("delete")) {
                    Statement stmt =(Statement)(Object) con.createStatement();
                    stmt.executeUpdate(sQuery);
                } else if (sQuery.startsWith("rollback")) {
                    con.rollback();
                } else {
                    out.println("What ?");
                }
                out.println(">");
            } catch (SQLException ex) {
                out.println("\n*** SQLException caught ***\n");
                while (ex != null) {
                    out.println("SQLState: " + ex.getSQLState());
                    out.println("Message:  " + ex.getMessage());
                    out.println("Vendor:   " + ex.getErrorCode());
                    ex = ex.getNextException();
                    out.println("");
                }
            } catch (java.lang.Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
