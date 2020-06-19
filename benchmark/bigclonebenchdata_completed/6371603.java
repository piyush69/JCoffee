import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371603 {

    public void setDefaultMailBox(final int domainId, final int userId)  throws Throwable {
        MyHelperClass cmDB = new MyHelperClass();
        final EmailAddress defaultMailbox =(EmailAddress)(Object) cmDB.getDefaultMailbox(domainId);
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
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty(defaultMailbox == null ? "domain.setDefaultMailbox" : "domain.updateDefaultMailbox"));
                    if (defaultMailbox == null) {
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(1, domainId);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(2, userId);
                    } else {
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(1, userId);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(2, domainId);
                    }
//                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl.executeUpdate();
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
//            MyHelperClass cmDB = new MyHelperClass();
            cmDB.updateDomains(null, null);
        } catch (SQLException sqle) {
            MyHelperClass log = new MyHelperClass();
            log.error(sqle);
            MyHelperClass connection = new MyHelperClass();
            if (connection != null) {
                try {
//                    MyHelperClass connection = new MyHelperClass();
                    connection.rollback();
                } catch (SQLException ex) {
                }
            }
        } finally {
            MyHelperClass connection = new MyHelperClass();
            if (connection != null) {
                try {
//                    MyHelperClass connection = new MyHelperClass();
                    connection.setAutoCommit(true);
                } catch (SQLException ex) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getDefaultMailbox(int o0){ return null; }
	public MyHelperClass updateDomains(Object o0, Object o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class EmailAddress {

}

class ExecuteProcessAbstractImpl {

ExecuteProcessAbstractImpl(MyHelperClass o0, boolean o1, boolean o2, boolean o3, boolean o4){}
	ExecuteProcessAbstractImpl(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ProcessEnvelope {

public MyHelperClass executeNull(<anonymous ExecuteProcessAbstractImpl> o0){ return null; }
	public MyHelperClass executeNull(){ return null; }}
