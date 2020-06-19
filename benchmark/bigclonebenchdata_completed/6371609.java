import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371609 {

    public void addUserToRealm(final NewUser user)  throws Throwable {
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            final String pass, salt;
            final List<RealmWithEncryptedPass> realmPass = new ArrayList<RealmWithEncryptedPass>();
            Realm realm;
            String username;
            MyHelperClass locale = new MyHelperClass();
            username =(String)(Object) user.username.toLowerCase(locale);
            MyHelperClass PasswordFactory = new MyHelperClass();
            PasswordHasher ph =(PasswordHasher)(Object) PasswordFactory.getInstance().getPasswordHasher();
            pass =(String)(Object) ph.hashPassword(user.password);
            salt =(String)(Object) ph.getSalt();
            MyHelperClass cm = new MyHelperClass();
            realmPass.add(new RealmWithEncryptedPass(cm.getRealm("null"), PasswordFactory.getInstance().getPasswordHasher().hashRealmPassword(username, "", user.password)));
            if (user.realms != null) {
                for (String realmName :(String[])(Object) (Object[])(Object)user.realms) {
//                    MyHelperClass cm = new MyHelperClass();
                    realm =(Realm)(Object) cm.getRealm(realmName);
//                    MyHelperClass PasswordFactory = new MyHelperClass();
                    realmPass.add(new RealmWithEncryptedPass(realm, PasswordFactory.getInstance().getPasswordHasher().hashRealmPassword(username, realm.getFullRealmName(), user.password)));
                }
                user.realms = null;
            }
//            MyHelperClass connection = new MyHelperClass();
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public void executeProcessReturnNull() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    MyHelperClass sqlCommands = new MyHelperClass();
                    MyHelperClass connImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("user.updatePassword"));
//                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl.setString(1, pass);
//                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl.setString(2, salt);
//                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl.setInt(3, user.userId);
//                    MyHelperClass psImpl = new MyHelperClass();
                    psImpl.executeUpdate();
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public void executeProcessReturnNull() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    MyHelperClass sqlCommands = new MyHelperClass();
                    MyHelperClass connImpl = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("realm.addUser"));
                    RealmWithEncryptedPass rwep;
                    RealmDb realm;
                    Iterator<RealmWithEncryptedPass> iter1 = realmPass.iterator();
                    while (iter1.hasNext()) {
                        rwep = iter1.next();
                        realm = (RealmDb)(RealmDb)(Object) rwep.realm;
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(1, realm.getRealmId());
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(2, user.userId);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(3, user.domainId);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setString(4, rwep.password);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.executeUpdate();
                    }
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
            MyHelperClass cmDB = new MyHelperClass();
            cmDB.removeUser(user.userId);
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

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getPasswordHasher(){ return null; }
	public MyHelperClass getRealm(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass error(GeneralSecurityException o0){ return null; }
	public MyHelperClass removeUser(MyHelperClass o0){ return null; }
	public MyHelperClass hashRealmPassword(String o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass toLowerCase(MyHelperClass o0){ return null; }
	public MyHelperClass hashRealmPassword(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class NewUser {
public MyHelperClass realms;
	public MyHelperClass domainId;
	public MyHelperClass userId;
	public MyHelperClass password;
	public MyHelperClass username;
}

class RealmWithEncryptedPass {
public MyHelperClass realm;
	public MyHelperClass password;
}

class Realm {

public MyHelperClass getFullRealmName(){ return null; }}

class PasswordHasher {

public MyHelperClass hashPassword(MyHelperClass o0){ return null; }
	public MyHelperClass getSalt(){ return null; }}

class ExecuteProcessAbstractImpl {

ExecuteProcessAbstractImpl(MyHelperClass o0, boolean o1, boolean o2, boolean o3, boolean o4){}
	ExecuteProcessAbstractImpl(){}}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ProcessEnvelope {

public MyHelperClass executeNull(<anonymous ExecuteProcessAbstractImpl> o0){ return null; }
	public MyHelperClass executeNull(){ return null; }}

class RealmDb {

public MyHelperClass getRealmId(){ return null; }}
