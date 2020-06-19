import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371580 {

    public void insertDomain(final List<String> domains)  throws Throwable {
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
//            MyHelperClass connection = new MyHelperClass();
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public void executeProcessReturnNull() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    MyHelperClass sqlCommands = new MyHelperClass();
                    MyHelperClass connImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("domain.add"));
                    Iterator<String> iter = domains.iterator();
                    String domain;
                    while (iter.hasNext()) {
                        domain = iter.next();
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setString(1, domain);
                        MyHelperClass locale = new MyHelperClass();
                        psImpl.setString(2, domain.toLowerCase((Locale)(Object)locale));
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.executeUpdate();
                    }
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
            MyHelperClass cmDB = new MyHelperClass();
            cmDB.updateDomains(null, null);
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
                    MyHelperClass log = new MyHelperClass();
                    log.error((SQLException)(Object)ex);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass updateDomains(Object o0, Object o1){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }}

class ExecuteProcessAbstractImpl {

ExecuteProcessAbstractImpl(){}
	ExecuteProcessAbstractImpl(MyHelperClass o0, boolean o1, boolean o2, boolean o3, boolean o4){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ProcessEnvelope {

public MyHelperClass executeNull(){ return null; }
	public MyHelperClass executeNull( ExecuteProcessAbstractImpl o0){ return null; }}
