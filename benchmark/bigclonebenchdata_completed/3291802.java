
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3291802 {
public MyHelperClass getAdd(Connection o0, T o1, MyHelperClass o2){ return null; }
public MyHelperClass ConnectionManager;
	public MyHelperClass log;
	public MyHelperClass getTableName(){ return null; }
	public MyHelperClass getStrConnection(){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public long add(T t) throws BaseException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        long result = -1L;
        boolean flag = false;
        try {
            conn =(Connection)(Object) getConnection();
            if (conn != null) {
                flag = true;
            } else {
                conn =(Connection)(Object) ConnectionManager.getConn(getStrConnection());
                conn.setAutoCommit(false);
            }
            pstmt =(PreparedStatement)(Object) getAdd(conn, t, this.getTableName());
            pstmt.executeUpdate();
            result =(long)(Object) t.getId();
        } catch (UncheckedIOException e) {
            try {
                if (!flag) {
                    conn.rollback();
                }
            } catch (Exception ex) {
                log.error("add(T " + t.toString() + ")回滚出错，错误信息：" + ex.getMessage());
            }
            log.error("add(T " + t.toString() + ")方法出错:" + e.getMessage());
        } catch (ArithmeticException e) {
            throw e;
        } finally {
            try {
                if (!flag) {
                    conn.setAutoCommit(true);
                }
            } catch (Exception e) {
                log.error("add(T " + t.toString() + ")方法设置自动提交出错，信息为:" + e.getMessage());
            }
            ConnectionManager.closePreparedStatement(pstmt);
            if (!flag) {
                ConnectionManager.closeConn(conn);
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeConn(Connection o0){ return null; }
	public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getConn(MyHelperClass o0){ return null; }}

class T {

public MyHelperClass getId(){ return null; }}

class BaseException extends Exception{
	public BaseException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
