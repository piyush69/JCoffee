import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19760848 {

    public static void main(String[] args)  throws Throwable {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("HSQL Driver not found.");
            System.exit(1);
        }
        Connection con = null;
        try {
            MyHelperClass DriverManager = new MyHelperClass();
            con =(Connection)(Object) DriverManager.getConnection("jdbc:hsqldb:.", "sa", "");
            con.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
            System.exit(e.getErrorCode());
        }
        String createTable = "CREATE TABLE NAMES (NAME VARCHAR(100))";
        Statement stmt = null;
        try {
            stmt =(Statement)(Object) con.createStatement();
            con.commit();
            stmt.executeUpdate(createTable);
            con.commit();
        } catch (SQLException e) {
            System.out.println("Create table error: " + e.getMessage());
            try {
                con.rollback();
                con.close();
                System.exit(e.getErrorCode());
            } catch (SQLException ex) {
            }
        }
        Vector names = new Vector(4);
        names.addElement("FRANK");
        names.addElement("FRED");
        names.addElement("JACK");
        names.addElement("JIM");
        String ins = "INSERT INTO NAMES VALUES (?)";
        PreparedStatement pstmt = null;
        try {
            con.commit();
            pstmt =(PreparedStatement)(Object) con.prepareStatement(ins);
            for (int i = 0; i < names.size(); i++) {
                pstmt.setString(1, (String) names.elementAt(i));
                pstmt.executeUpdate();
            }
            con.commit();
        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
            try {
                con.rollback();
                con.close();
                System.exit(e.getErrorCode());
            } catch (SQLException ex) {
            }
        }
        String selAll = "SELECT * FROM NAMES";
        ResultSet rs = null;
        stmt = null;
        try {
            stmt =(Statement)(Object) con.createStatement();
            rs =(ResultSet)(Object) stmt.executeQuery(selAll);
            System.out.println("SELECT * FROM NAMES");
            while ((boolean)(Object)rs.next()) {
                String name =(String)(Object) rs.getString(1);
                System.out.println("\t" + name);
            }
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Select All error: " + e.getMessage());
            try {
                con.close();
                System.exit(e.getErrorCode());
            } catch (SQLException ex) {
            }
        }
        String selectLike = "SELECT * FROM NAMES WHERE NAME LIKE 'F%'";
        rs = null;
        stmt = null;
        try {
            stmt =(Statement)(Object) con.createStatement();
            rs =(ResultSet)(Object) stmt.executeQuery(selectLike);
            System.out.println("SELECT * FROM NAMES WHERE NAME LIKE 'F%'");
            while ((boolean)(Object)rs.next()) {
                String name =(String)(Object) rs.getString(1);
                System.out.println("\t" + name);
            }
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Select Like error: " + e.getMessage());
            try {
                con.close();
                System.exit(e.getErrorCode());
            } catch (SQLException ex) {
            }
        }
        try {
            con.close();
        } catch (SQLException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
