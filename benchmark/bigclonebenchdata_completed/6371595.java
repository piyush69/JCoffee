import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371595 {
public MyHelperClass PasswordFactory;

    public void setUserPassword(final List<NewUser> users)  throws Throwable {
        try {
            final List<Integer> usersToRemoveFromCache = new ArrayList<Integer>();
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
//            MyHelperClass connection = new MyHelperClass();
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public void executeProcessReturnNull() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("user.updatePassword"));
                    Iterator<NewUser> iter = users.iterator();
                    NewUser user;
                    PasswordHasher ph;
                    while (iter.hasNext()) {
                        user = iter.next();
                        MyHelperClass PasswordFactory = new MyHelperClass();
                        ph = PasswordFactory.getInstance().getPasswordHasher();
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setString(1, ph.hashPassword(user.password));
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setString(2, ph.getSalt());
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(3, user.userId);
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.executeUpdate();
                        usersToRemoveFromCache.add(user.userId);
                    }
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            List<JESRealmUser> list = (List<JESRealmUser>) new ProcessEnvelope().executeObject(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public Object executeProcessReturnObject() throws SQLException {
                    List<JESRealmUser> list = new ArrayList<JESRealmUser>(users.size() + 10);
                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("realms.user.load"));
                    Iterator<NewUser> iter = users.iterator();
                    NewUser user;
                    while (iter.hasNext()) {
                        user = iter.next();
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(1, user.userId);
                        MyHelperClass rsImpl = new MyHelperClass();
                        rsImpl = psImpl.executeQuery();
                        MyHelperClass rsImpl = new MyHelperClass();
                        while (rsImpl.next()) {
                            MyHelperClass rsImpl = new MyHelperClass();
                            list.add(new JESRealmUser(user.username, user.userId, rsImpl.getInt("realm_id"), rsImpl.getInt("domain_id"), user.password, rsImpl.getString("realm_name_lower_case")));
                        }
                    }
                    return list;
                }
            });
            final List<JESRealmUser> encrypted = new ArrayList<JESRealmUser>(list.size());
            Iterator<JESRealmUser> iter = list.iterator();
            JESRealmUser jesRealmUser;
            Realm realm;
            while (iter.hasNext()) {
                jesRealmUser = iter.next();
                MyHelperClass cm = new MyHelperClass();
                realm = cm.getRealm(jesRealmUser.realm);
                MyHelperClass locale = new MyHelperClass();
                encrypted.add(new JESRealmUser(null, jesRealmUser.userId, jesRealmUser.realmId, jesRealmUser.domainId, PasswordFactory.getInstance().getPasswordHasher().hashRealmPassword(jesRealmUser.username.toLowerCase(locale), realm.getFullRealmName().equals("null") ? "" : realm.getFullRealmName(), jesRealmUser.password), null));
            }
//            MyHelperClass connection = new MyHelperClass();
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public void executeProcessReturnNull() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("realms.user.update"));
                    Iterator<JESRealmUser> iter = encrypted.iterator();
                    JESRealmUser jesRealmUser;
                    while (iter.hasNext()) {
                        jesRealmUser = iter.next();
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setString(1, jesRealmUser.password);
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(2, jesRealmUser.realmId);
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(3, jesRealmUser.userId);
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(4, jesRealmUser.domainId);
                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.executeUpdate();
                    }
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
            MyHelperClass cmDB = new MyHelperClass();
            cmDB.removeUsers(usersToRemoveFromCache);
        } catch (GeneralSecurityException e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e);
            MyHelperClass connection = new MyHelperClass();
            if (connection != null) {
                try {
//                    MyHelperClass connection = new MyHelperClass();
                    connection.rollback();
                } catch (SQLException ex) {
                }
            }
            throw new RuntimeException("Error updating Realms. Unable to continue Operation.");
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
	public MyHelperClass error(GeneralSecurityException o0){ return null; }
	public MyHelperClass removeUsers(List<Integer o0){ return null; }}

class NewUser {
public MyHelperClass password;
	public MyHelperClass username;
	public MyHelperClass userId;
}

class ExecuteProcessAbstractImpl {

ExecuteProcessAbstractImpl(MyHelperClass o0, boolean o1, boolean o2, boolean o3, boolean o4){}
	ExecuteProcessAbstractImpl(){}}

class JESRealmUser {
public MyHelperClass realmId;
	public MyHelperClass domainId;
	public MyHelperClass userId;
	public MyHelperClass realm;
	public MyHelperClass password;
	public MyHelperClass username;
}

class Realm {

public MyHelperClass getFullRealmName(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PasswordHasher {

}

class ProcessEnvelope {

}
