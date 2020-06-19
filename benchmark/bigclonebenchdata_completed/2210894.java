import java.io.*;
import java.lang.*;
import java.util.*;



class c2210894 {
public MyHelperClass connection;
	public MyHelperClass FieldUtils;
	public MyHelperClass lastError;
	public MyHelperClass Level;
	public MyHelperClass LogUtils;
	public MyHelperClass isAutoCommit(){ return null; }

    protected int doExecuteInsert(PreparedStatement statement, Table data) throws SQLException {
        ResultSet rs = null;
        int result = -1;
        try {
            MyHelperClass lastError = new MyHelperClass();
            lastError = null;
            result =(int)(Object) statement.executeUpdate();
            if (!(Boolean)(Object)isAutoCommit()) connection.commit();
            rs =(ResultSet)(Object) statement.getGeneratedKeys();
            while ((boolean)(Object)rs.next()) {
                FieldUtils.setValue(data, data.key, rs.getObject(1));
            }
        } catch (UncheckedIOException ex) {
            if (!(Boolean)(Object)isAutoCommit()) {
                lastError =(MyHelperClass)(Object) ex;
                connection.rollback();
                LogUtils.log(Level.SEVERE, "Transaction is being rollback. Error: " + ex.toString());
            } else {
                throw ex;
            }
        } finally {
            if (statement != null) statement.close();
            if (rs != null) rs.close();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass setValue(Table o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass getGeneratedKeys(){ return null; }}

class Table {
public MyHelperClass key;
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getObject(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
