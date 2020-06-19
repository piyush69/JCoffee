import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2067426 {
public MyHelperClass NULL;
	public MyHelperClass decodeParams(MyHelperClass o0, PreparedStatement o1){ return null; }
public MyHelperClass connect(RowSetInternal o0){ return null; }
public MyHelperClass getCloseConnection(){ return null; }

    public void readData(RowSetInternal caller) throws Throwable, SQLException {
        Connection con = null;
        try {
            CachedRowSet crs = (CachedRowSet)(CachedRowSet)(Object) caller;
            if ((int)(Object)crs.getPageSize() == 0 &&(int)(Object) crs.size() > 0) {
                crs.close();
            }
            int writerCalls =(int)(Object) NULL; //new int();
            writerCalls = 0;
            boolean userCon =(boolean)(Object) NULL; //new boolean();
            userCon = false;
            con =(Connection)(Object) this.connect(caller);
            MyHelperClass resBundle = new MyHelperClass();
            if (con == null || crs.getCommand() == null) throw new SQLException(resBundle.handleGetObject("crsreader.connecterr").toString());
            try {
                con.setTransactionIsolation(crs.getTransactionIsolation());
            } catch (Exception ex) {
                ;
            }
            PreparedStatement pstmt =(PreparedStatement)(Object) con.prepareStatement(crs.getCommand());
            decodeParams(caller.getParams(), pstmt);
            try {
                pstmt.setMaxRows(crs.getMaxRows());
                pstmt.setMaxFieldSize(crs.getMaxFieldSize());
                pstmt.setEscapeProcessing(crs.getEscapeProcessing());
                pstmt.setQueryTimeout(crs.getQueryTimeout());
            } catch (Exception ex) {
                throw new SQLException(ex.getMessage());
            }
            if ((int)(Object)crs.getCommand().toLowerCase().indexOf("select") != -1) {
                ResultSet rs =(ResultSet)(Object) pstmt.executeQuery();
                if ((int)(Object)crs.getPageSize() == 0) {
                    crs.populate(rs);
                } else {
                    MyHelperClass ResultSet = new MyHelperClass();
                    pstmt =(PreparedStatement)(Object) con.prepareStatement(crs.getCommand(), ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    decodeParams(caller.getParams(), pstmt);
                    try {
                        pstmt.setMaxRows(crs.getMaxRows());
                        pstmt.setMaxFieldSize(crs.getMaxFieldSize());
                        pstmt.setEscapeProcessing(crs.getEscapeProcessing());
                        pstmt.setQueryTimeout(crs.getQueryTimeout());
                    } catch (Exception ex) {
                        throw new SQLException(ex.getMessage());
                    }
                    rs =(ResultSet)(Object) pstmt.executeQuery();
                    MyHelperClass startPosition = new MyHelperClass();
                    crs.populate(rs, startPosition);
                }
                rs.close();
            } else {
                pstmt.executeUpdate();
            }
            pstmt.close();
            try {
                con.commit();
            } catch (ArithmeticException ex) {
                ;
            }
            if ((boolean)(Object)getCloseConnection() == true) con.close();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            try {
                if (con != null &&(boolean)(Object) getCloseConnection() == true) {
                    try {
                        if (!(Boolean)(Object)con.getAutoCommit()) {
                            con.rollback();
                        }
                    } catch (Exception dummy) {
                    }
                    con.close();
                    con = null;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_SCROLL_INSENSITIVE;
	public MyHelperClass CONCUR_UPDATABLE;
public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass handleGetObject(String o0){ return null; }}

class RowSetInternal {

public MyHelperClass getParams(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setTransactionIsolation(MyHelperClass o0){ return null; }}

class CachedRowSet {

public MyHelperClass getPageSize(){ return null; }
	public MyHelperClass getMaxFieldSize(){ return null; }
	public MyHelperClass getEscapeProcessing(){ return null; }
	public MyHelperClass getMaxRows(){ return null; }
	public MyHelperClass getCommand(){ return null; }
	public MyHelperClass getQueryTimeout(){ return null; }
	public MyHelperClass getTransactionIsolation(){ return null; }
	public MyHelperClass populate(ResultSet o0, MyHelperClass o1){ return null; }
	public MyHelperClass populate(ResultSet o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setMaxRows(MyHelperClass o0){ return null; }
	public MyHelperClass setQueryTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setMaxFieldSize(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setEscapeProcessing(MyHelperClass o0){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }}
