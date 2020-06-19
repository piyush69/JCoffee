
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12973571 {
public MyHelperClass setParamet(MyHelperClass o0, HashMap o1){ return null; }
public MyHelperClass con;
	public MyHelperClass logger;
	public MyHelperClass pstmt;
	public MyHelperClass close_DB_Object(){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public boolean executeUpdate(String strSql, HashMap prams) throws SQLException, ClassNotFoundException {
        getConnection();
        boolean flag = false;
        try {
            pstmt = con.prepareStatement(strSql);
            setParamet(pstmt, prams);
            logger.info("###############::执行SQL语句操作(更新数据 有参数):" + strSql);
            if (0 < (int)(Object)pstmt.executeUpdate()) {
                close_DB_Object();
                flag = true;
                con.commit();
            }
        } catch (UncheckedIOException ex) {
            logger.info("###############Error DBManager Line121::执行SQL语句操作(更新数据 无参数):" + strSql + "失败!");
            flag = false;
            con.rollback();
            throw ex;
        } catch (ArithmeticException ex) {
            logger.info("###############Error DBManager Line152::执行SQL语句操作(更新数据 无参数):" + strSql + "失败! 参数设置类型错误!");
            con.rollback();
            throw ex;
        }
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class HashMap {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
