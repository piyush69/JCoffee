import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371605 {

    public void insertRealm(final List<NewRealms> newRealms)  throws Throwable {
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
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("realm.add"));
                    Iterator<NewRealms> iter = newRealms.iterator();
                    NewRealms newRealm;
                    String realm;
                    Iterator<String> iter2;
                    while (iter.hasNext()) {
                        newRealm = iter.next();
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(3, newRealm.domainId);
                        iter2 =(Iterator<String>)(Object) newRealm.realms.iterator();
                        while (iter2.hasNext()) {
                            realm = iter2.next();
//                            MyHelperClass psImpl = new MyHelperClass();
                            psImpl.setString(1, realm);
                            MyHelperClass locale = new MyHelperClass();
                            psImpl.setString(2, realm.toLowerCase((Locale)(Object)locale));
//                            MyHelperClass psImpl = new MyHelperClass();
                            psImpl.executeUpdate();
                        }
                    }
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
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

public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }}

class NewRealms {
public MyHelperClass domainId;
	public MyHelperClass realms;
}

class ExecuteProcessAbstractImpl {

ExecuteProcessAbstractImpl(){}
	ExecuteProcessAbstractImpl(MyHelperClass o0, boolean o1, boolean o2, boolean o3, boolean o4){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ProcessEnvelope {

public MyHelperClass executeNull(){ return null; }
	public MyHelperClass executeNull( ExecuteProcessAbstractImpl o0){ return null; }}
