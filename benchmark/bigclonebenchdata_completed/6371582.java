import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371582 {

    public void deleteDomain(final List<Integer> domainIds)  throws Throwable {
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            MyHelperClass cmDB = new MyHelperClass();
            final int defaultDomainId =(int)(Object) ((DomainDb)(DomainDb)(Object) cmDB.getDefaultDomain()).getDomainId();
//            MyHelperClass connection = new MyHelperClass();
            boolean defaultDomainDeleted = (Boolean) (Boolean)(Object)new ProcessEnvelope().executeObject(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public Object executeProcessReturnObject() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    MyHelperClass sqlCommands = new MyHelperClass();
                    MyHelperClass connImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("domain.delete"));
                    Iterator<Integer> iter = domainIds.iterator();
                    int domainId;
                    boolean defaultDomainDeleted = false;
                    while (iter.hasNext()) {
                        domainId = iter.next();
                        if (!defaultDomainDeleted) defaultDomainDeleted = defaultDomainId == domainId;
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(1, domainId);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.executeUpdate();
                    }
                    return defaultDomainDeleted;
                }
            });
            if (defaultDomainDeleted) {
//                MyHelperClass connection = new MyHelperClass();
                new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                    @Override
                    public void executeProcessReturnNull() throws SQLException {
                        MyHelperClass psImpl = new MyHelperClass();
                        MyHelperClass sqlCommands = new MyHelperClass();
                        MyHelperClass connImpl = new MyHelperClass();
                        psImpl = connImpl.prepareStatement(sqlCommands.getProperty("domain.setDefaultDomainId"));
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(1, -1);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.executeUpdate();
                    }
                });
            }
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
//            MyHelperClass cmDB = new MyHelperClass();
            cmDB.updateDomains(null, null);
            if (defaultDomainDeleted) {
                MyHelperClass cm = new MyHelperClass();
                cm.updateDefaultDomain();
            }
        } catch (UncheckedIOException sqle) {
            MyHelperClass log = new MyHelperClass();
            log.error((SQLException)(Object)sqle);
            MyHelperClass connection = new MyHelperClass();
            if (connection != null) {
                try {
//                    MyHelperClass connection = new MyHelperClass();
                    connection.rollback();
                } catch (UncheckedIOException ex) {
                }
            }
        } finally {
            MyHelperClass connection = new MyHelperClass();
            if (connection != null) {
                try {
//                    MyHelperClass connection = new MyHelperClass();
                    connection.setAutoCommit(true);
                } catch (UncheckedIOException ex) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getDefaultDomain(){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass updateDefaultDomain(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass updateDomains(Object o0, Object o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }}

class DomainDb {

public MyHelperClass getDomainId(){ return null; }}

class ExecuteProcessAbstractImpl {

ExecuteProcessAbstractImpl(){}
	ExecuteProcessAbstractImpl(MyHelperClass o0, boolean o1, boolean o2, boolean o3, boolean o4){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ProcessEnvelope {

public MyHelperClass executeNull(){ return null; }
	public MyHelperClass executeNull( ExecuteProcessAbstractImpl o0){ return null; }
	public MyHelperClass executeObject( ExecuteProcessAbstractImpl o0){ return null; }
	public MyHelperClass executeObject(){ return null; }}
