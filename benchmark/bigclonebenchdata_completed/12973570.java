
import java.io.UncheckedIOException;


class c12973570 {
public MyHelperClass stmt;
	public MyHelperClass con;
	public MyHelperClass logger;
	public MyHelperClass close_DB_Object(){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public boolean executeUpdate(String strSql) throws SQLException {
        getConnection();
        boolean flag = false;
        stmt = con.createStatement();
        logger.info("###############::执行SQL语句操作(更新数据 无参数):" + strSql);
        try {
            if (0 < (int)(Object)stmt.executeUpdate(strSql)) {
                close_DB_Object();
                flag = true;
                con.commit();
            }
        } catch (UncheckedIOException ex) {
            logger.info("###############Error DBManager Line126::执行SQL语句操作(更新数据 无参数):" + strSql + "失败!");
            flag = false;
            con.rollback();
            throw ex;
        }
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
