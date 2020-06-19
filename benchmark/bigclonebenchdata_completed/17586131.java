import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17586131 {
public MyHelperClass setParameters(PreparedStatement o0, Object[] o1){ return null; }

    protected void update(String sql, Object[] args)  throws Throwable {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            MyHelperClass JdbcUtils = new MyHelperClass();
            conn =(Connection)(Object) JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            this.setParameters(pstmt, args);
            pstmt.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
        } catch (UncheckedIOException e) {
            try {
                if (conn != null) {
                    conn.rollback();
                    conn.setAutoCommit(true);
                }
            } catch (UncheckedIOException ex) {
                ex.printStackTrace();
            }
            throw new JdbcDaoException(e.getMessage(),(SQLException)(Object) e);
        } finally {
            MyHelperClass JdbcUtils = new MyHelperClass();
            JdbcUtils.free(pstmt, conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(){ return null; }
	public MyHelperClass free(PreparedStatement o0, Connection o1){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class JdbcDaoException extends Exception{
	public JdbcDaoException(String errorMessage) { super(errorMessage); }
	JdbcDaoException(){}
	JdbcDaoException(String o0, SQLException o1){}
}
