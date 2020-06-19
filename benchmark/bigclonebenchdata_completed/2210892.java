import java.io.*;
import java.lang.*;
import java.util.*;



class c2210892 {
public MyHelperClass connection;
	public MyHelperClass lastError;
	public MyHelperClass Level;
	public MyHelperClass LogUtils;
	public MyHelperClass isAutoCommit(){ return null; }

    protected int doExecuteUpdate(PreparedStatement statement) throws SQLException {
        connection.setAutoCommit(isAutoCommit());
        int rs = -1;
        try {
            lastError = null;
            rs =(int)(Object) statement.executeUpdate();
            if (!(Boolean)(Object)isAutoCommit()) connection.commit();
        } catch (Exception ex) {
            if (!(Boolean)(Object)isAutoCommit()) {
                lastError =(MyHelperClass)(Object) ex;
                connection.rollback();
                LogUtils.log(Level.SEVERE, "Transaction is being rollback. Error: " + ex.toString());
            }
        } finally {
            if (statement != null) statement.close();
        }
        return rs;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
