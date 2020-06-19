import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2145966 {
public static MyHelperClass log;
	public static MyHelperClass maxIdFromTable(String o0){ return null; }
//public MyHelperClass log;
//	public MyHelperClass maxIdFromTable(String o0){ return null; }

    private static Long getNextPkValueForEntityIncreaseBy(String ename, int count, int increaseBy)  throws Throwable {
        if (increaseBy < 1) increaseBy = 1;
        String where = "where eoentity_name = '" + ename + "'";
        MyHelperClass ERXJDBCConnectionBroker = new MyHelperClass();
        ERXJDBCConnectionBroker broker =(ERXJDBCConnectionBroker)(Object) ERXJDBCConnectionBroker.connectionBrokerForEntityNamed(ename);
        Connection con =(Connection)(Object) broker.getConnection();
        try {
            try {
                con.setAutoCommit(false);
                con.setReadOnly(false);
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error((SQLException)(Object)e,(SQLException)(Object) e);
            }
            for (int tries = 0; tries < count; tries++) {
                try {
                    ResultSet resultSet =(ResultSet)(Object) con.createStatement().executeQuery("select pk_value from pk_table " + where);
                    con.commit();
                    boolean hasNext =(boolean)(Object) resultSet.next();
                    long pk = 1;
                    if (hasNext) {
                        pk =(long)(Object) resultSet.getLong("pk_value");
                        con.createStatement().executeUpdate("update pk_table set pk_value = " + (pk + increaseBy) + " " + where);
                    } else {
                        pk =(long)(Object) maxIdFromTable(ename);
                        con.createStatement().executeUpdate("insert into pk_table (eoentity_name, pk_value) values ('" + ename + "', " + (pk + increaseBy) + ")");
                    }
                    con.commit();
                    return new Long(pk);
                } catch (UncheckedIOException ex) {
                    String s = ex.getMessage().toLowerCase();
                    boolean creationError = (s.indexOf("error code 116") != -1);
                    creationError |= (s.indexOf("pk_table") != -1 && s.indexOf("does not exist") != -1);
                    creationError |= s.indexOf("ora-00942") != -1;
                    if (creationError) {
                        try {
                            con.rollback();
                            log.info("creating pk table");
                            con.createStatement().executeUpdate("create table pk_table (eoentity_name varchar(100) not null, pk_value integer)");
                            con.createStatement().executeUpdate("alter table pk_table add primary key (eoentity_name)");
                            con.commit();
                        } catch (UncheckedIOException ee) {
                            throw new NSForwardException((SQLException)(Object)ee, "could not create pk table");
                        }
                    } else {
                        throw new NSForwardException((SQLException)(Object)ex, "Error fetching PK");
                    }
                }
            }
        } finally {
            broker.freeConnection(con);
        }
        throw new IllegalStateException("Couldn't get PK");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(SQLException o0, SQLException o1){ return null; }
	public MyHelperClass connectionBrokerForEntityNamed(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class ERXJDBCConnectionBroker {

public MyHelperClass freeConnection(Connection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setReadOnly(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ResultSet {

public MyHelperClass getLong(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class NSForwardException extends Exception{
	public NSForwardException(String errorMessage) { super(errorMessage); }
	NSForwardException(SQLException o0, String o1){}
	NSForwardException(){}
}
