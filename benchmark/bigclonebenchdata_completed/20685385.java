import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20685385 {
public MyHelperClass log;
	public MyHelperClass maxIdFromTable(String o0){ return null; }

    private Long getNextPkValueForEntityIncreaseBy(String entityName, int count, int increasePkBy)  throws Throwable {
        if (increasePkBy < 1) increasePkBy = 1;
        String where = "where eoentity_name = '" + entityName + "'";
        if (false) {
            MyHelperClass ERXEC = new MyHelperClass();
            EOEditingContext ec =(EOEditingContext)(Object) ERXEC.newEditingContext();
            ec.lock();
            try {
                MyHelperClass ERXEOAccessUtilities = new MyHelperClass();
                EODatabaseContext dbc =(EODatabaseContext)(Object) ERXEOAccessUtilities.databaseContextForEntityNamed((EOObjectStoreCoordinator)(EOObjectStoreCoordinator)(Object) ec.rootObjectStore(), entityName);
                dbc.lock();
                try {
//                    MyHelperClass ERXEOAccessUtilities = new MyHelperClass();
                    EOEntity entity =(EOEntity)(Object) ERXEOAccessUtilities.entityNamed(ec, entityName);
                    EOAdaptorChannel channel = (EOAdaptorChannel)(EOAdaptorChannel)(Object) dbc.adaptorContext().channels().lastObject();
                    NSArray result =(NSArray)(Object) channel.primaryKeysForNewRowsWithEntity(increasePkBy, entity);
                    return (Long)(Long)(Object) ((NSDictionary)(NSDictionary)(Object) result.lastObject()).allValues().lastObject();
                } finally {
                    dbc.unlock();
                }
            } finally {
                ec.unlock();
            }
        } else {
            MyHelperClass ERXJDBCConnectionBroker = new MyHelperClass();
            ERXJDBCConnectionBroker broker =(ERXJDBCConnectionBroker)(Object) ERXJDBCConnectionBroker.connectionBrokerForEntityNamed(entityName);
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
                            con.createStatement().executeUpdate("update pk_table set pk_value = " + (pk + increasePkBy) + " " + where);
                        } else {
                            pk =(long)(Object) maxIdFromTable(entityName);
                            con.createStatement().executeUpdate("insert into pk_table (eoentity_name, pk_value) values ('" + entityName + "', " + (pk + increasePkBy) + ")");
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
        }
        throw new IllegalStateException("Couldn't get PK");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass entityNamed(EOEditingContext o0, String o1){ return null; }
	public MyHelperClass channels(){ return null; }
	public MyHelperClass error(SQLException o0, SQLException o1){ return null; }
	public MyHelperClass newEditingContext(){ return null; }
	public MyHelperClass connectionBrokerForEntityNamed(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass databaseContextForEntityNamed(EOObjectStoreCoordinator o0, String o1){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass lastObject(){ return null; }}

class EOEditingContext {

public MyHelperClass lock(){ return null; }
	public MyHelperClass rootObjectStore(){ return null; }
	public MyHelperClass unlock(){ return null; }}

class EODatabaseContext {

public MyHelperClass lock(){ return null; }
	public MyHelperClass adaptorContext(){ return null; }
	public MyHelperClass unlock(){ return null; }}

class EOObjectStoreCoordinator {

}

class EOEntity {

}

class EOAdaptorChannel {

public MyHelperClass primaryKeysForNewRowsWithEntity(int o0, EOEntity o1){ return null; }}

class NSArray {

public MyHelperClass lastObject(){ return null; }}

class NSDictionary {

public MyHelperClass allValues(){ return null; }}

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
