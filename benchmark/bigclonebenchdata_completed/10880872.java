import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10880872 {

//    @Override
    public final boolean delete() throws Throwable, RecordException {
        MyHelperClass frozen = new MyHelperClass();
        if ((boolean)(Object)frozen) {
            throw new RecordException("The object is frozen.");
        }
        MyHelperClass ConnectionManager = new MyHelperClass();
        Connection conn = ConnectionManager.getConnection();
        LoggableStatement pStat = null;
        Class<? extends Record> actualClass =(Record>)(Object) this.getClass();
        StatementBuilder builder = null;
        try {
            MyHelperClass TableNameResolver = new MyHelperClass();
            builder = new StatementBuilder("delete from " + TableNameResolver.getTableName(actualClass) + " where id = :id");
            MyHelperClass FieldHandler = new MyHelperClass();
            Field f = FieldHandler.findField(this.getClass(), "id");
//            MyHelperClass FieldHandler = new MyHelperClass();
            builder.set("id", FieldHandler.getValue(f, this));
            pStat = builder.getPreparedStatement(conn);
            MyHelperClass log = new MyHelperClass();
            log.log(pStat.getQueryString());
            int i = pStat.executeUpdate();
            return i == 1;
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                throw new RecordException("Error executing rollback");
            }
            throw new RecordException((String)(Object)e);
        } finally {
            try {
                if (pStat != null) {
                    pStat.close();
                }
                conn.commit();
                conn.close();
            } catch (SQLException e) {
                throw new RecordException("Error closing connection");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTableName(Class o0){ return null; }
	public MyHelperClass findField(Class o0, String o1){ return null; }
	public MyHelperClass getValue(Field o0, c10880872 o1){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class RecordException extends Exception{
	public RecordException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass commit(){ return null; }}

class LoggableStatement {

public MyHelperClass getQueryString(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class Record {

}

class StatementBuilder {

public MyHelperClass getPreparedStatement(Connection o0){ return null; }}

class Field {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
