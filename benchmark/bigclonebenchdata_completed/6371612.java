import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371612 {

    public void removeUserFromRealm(final List<NewUser> users)  throws Throwable {
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
//            MyHelperClass connection = new MyHelperClass();
            final List<Integer> removeFromNullRealm = (List<Integer>) new ProcessEnvelope().executeObject(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public Object executeProcessReturnObject() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    MyHelperClass sqlCommands = new MyHelperClass();
                    MyHelperClass connImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("realm.removeUser"));
                    Iterator<NewUser> iter = users.iterator();
                    NewUser user;
                    int realmId;
                    Iterator<Integer> iter2;
                    List<Integer> removeFromNullRealm = new ArrayList<Integer>();
                    while (iter.hasNext()) {
                        user = iter.next();
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(1, user.userId);
                        iter2 =(Iterator<Integer>)(Object) user.realmIds.iterator();
                        while (iter2.hasNext()) {
                            realmId = iter2.next();
                            if (realmId == 0) {
                                removeFromNullRealm.add((Integer)(Object)user.userId);
                                continue;
                            }
//                            MyHelperClass psImpl = new MyHelperClass();
                            psImpl.setInt(2, realmId);
//                            MyHelperClass psImpl = new MyHelperClass();
                            psImpl.executeUpdate();
                        }
                        MyHelperClass cmDB = new MyHelperClass();
                        cmDB.removeUser(user.userId);
                    }
                    return removeFromNullRealm;
                }
            });
            if (!removeFromNullRealm.isEmpty()) {
//                MyHelperClass connection = new MyHelperClass();
                new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                    @Override
                    public void executeProcessReturnNull() throws SQLException {
                        MyHelperClass psImpl = new MyHelperClass();
                        MyHelperClass sqlCommands = new MyHelperClass();
                        MyHelperClass connImpl = new MyHelperClass();
                        psImpl = connImpl.prepareStatement(sqlCommands.getProperty("realm.removeUserFromNullRealm"));
                        Iterator<Integer> iter2 = removeFromNullRealm.iterator();
                        while (iter2.hasNext()) {
//                            MyHelperClass psImpl = new MyHelperClass();
                            psImpl.setInt(1, iter2.next());
//                            MyHelperClass psImpl = new MyHelperClass();
                            psImpl.executeUpdate();
                        }
                    }
                });
            }
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

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass removeUser(MyHelperClass o0){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }}

class NewUser {
public MyHelperClass userId;
	public MyHelperClass realmIds;
}

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
