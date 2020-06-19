import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371601 {

    public void removeForwardAddress(final List<NewUser> forwardAddresses)  throws Throwable {
        try {
            final List<Integer> usersToRemoveFromCache = new ArrayList<Integer>();
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
//            MyHelperClass connection = new MyHelperClass();
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public void executeProcessReturnNull() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("userForwardAddresses.delete"));
                    Iterator<NewUser> iter = forwardAddresses.iterator();
                    Iterator<Integer> iter2;
                    NewUser newUser;
                    while (iter.hasNext()) {
                        newUser = iter.next();
                        iter2 = newUser.forwardAddressIds.iterator();
                        while (iter2.hasNext()) {
                            MyHelperClass psImpl = new MyHelperClass();
                            psImpl.setInt(1, iter2.next());
                            MyHelperClass psImpl = new MyHelperClass();
                            psImpl.executeUpdate();
                        }
                        usersToRemoveFromCache.add(newUser.userId);
                    }
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
            MyHelperClass cmDB = new MyHelperClass();
            cmDB.removeUsers(usersToRemoveFromCache);
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
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass removeUsers(List<Integer o0){ return null; }}

class NewUser {
public MyHelperClass forwardAddressIds;
	public MyHelperClass userId;
}

class ExecuteProcessAbstractImpl {

ExecuteProcessAbstractImpl(MyHelperClass o0, boolean o1, boolean o2, boolean o3, boolean o4){}
	ExecuteProcessAbstractImpl(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ProcessEnvelope {

}
