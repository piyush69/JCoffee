import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17586130 {
public MyHelperClass setParameters(PreparedStatement o0, Object[] o1){ return null; }

    protected N save(String sql, Object[] args)  throws Throwable {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            MyHelperClass JdbcUtils = new MyHelperClass();
            conn =(Connection)(Object) JdbcUtils.getConnection();
            conn.setAutoCommit(false);
            MyHelperClass Statement = new MyHelperClass();
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            this.setParameters(pstmt, args);
            pstmt.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
            rs =(ResultSet)(Object) pstmt.getGeneratedKeys();
            return (N)(N)(Object) rs.getObject(1);
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
            JdbcUtils.free(rs, pstmt, conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RETURN_GENERATED_KEYS;
public MyHelperClass free(ResultSet o0, PreparedStatement o1, Connection o2){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class N {

}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass getGeneratedKeys(){ return null; }}

class ResultSet {

public MyHelperClass getObject(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class JdbcDaoException extends Exception{
	public JdbcDaoException(String errorMessage) { super(errorMessage); }
	JdbcDaoException(){}
	JdbcDaoException(String o0, SQLException o1){}
}
