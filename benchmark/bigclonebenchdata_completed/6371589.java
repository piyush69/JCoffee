import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6371589 {

    public void insertUser(final List<NewUser> newUsers)  throws Throwable {
        try {
            MyHelperClass connection = new MyHelperClass();
            connection.setAutoCommit(false);
            final Map<String, PasswordAndSalt> pass = new HashMap<String, PasswordAndSalt>();
            final Map<String, List<RealmWithEncryptedPass>> realmPass = new HashMap<String, List<RealmWithEncryptedPass>>();
            final List<String> userDirs = new ArrayList<String>();
            Iterator<NewUser> iter = newUsers.iterator();
            NewUser user;
            Realm realm;
            String username;
            PasswordHasher ph;
            while (iter.hasNext()) {
                user = iter.next();
                MyHelperClass locale = new MyHelperClass();
                username =(String)(Object) user.username.toLowerCase(locale);
                MyHelperClass PasswordFactory = new MyHelperClass();
                ph =(PasswordHasher)(Object) PasswordFactory.getInstance().getPasswordHasher();
                pass.put(user.username, new PasswordAndSalt(ph.hashPassword(user.password), ph.getSalt()));
                realmPass.put((String)(Object)user.username, new ArrayList<RealmWithEncryptedPass>());
                MyHelperClass cm = new MyHelperClass();
                realmPass.get(user.username).add(new RealmWithEncryptedPass(cm.getRealm("null"), PasswordFactory.getInstance().getPasswordHasher().hashRealmPassword(username, "", user.password)));
                if (user.realms != null) {
                    for (String realmName :(String[])(Object) (Object[])(Object)user.realms) {
//                        MyHelperClass cm = new MyHelperClass();
                        realm =(Realm)(Object) cm.getRealm(realmName);
//                        MyHelperClass PasswordFactory = new MyHelperClass();
                        realmPass.get(user.username).add(new RealmWithEncryptedPass(realm, PasswordFactory.getInstance().getPasswordHasher().hashRealmPassword(username, realm.getFullRealmName(), user.password)));
                    }
                    user.realms = null;
                }
            }
//            MyHelperClass connection = new MyHelperClass();
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

//                @Override
                public void executeProcessReturnNull() throws SQLException {
                    MyHelperClass psImpl = new MyHelperClass();
                    MyHelperClass sqlCommands = new MyHelperClass();
                    MyHelperClass Statement = new MyHelperClass();
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("user.add"), Statement.RETURN_GENERATED_KEYS);
                    Iterator<NewUser> iter = newUsers.iterator();
                    NewUser user;
                    DomainDb domain = null;
                    while (iter.hasNext()) {
                        user = iter.next();
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setString(1, user.username);
                        MyHelperClass locale = new MyHelperClass();
                        psImpl.setString(2, user.username.toLowerCase(locale));
                        if (domain == null || (domain.getDomainId() != user.domainId)) {
                            MyHelperClass cmDB = new MyHelperClass();
                            domain = (DomainDb)(DomainDb)(Object) cmDB.getDomain(user.domainId);
                        }
                        userDirs.add((char)(Object)user.username + '@' + domain.getDomainName());
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setInt(3, user.domainId);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setString(4, pass.get(user.username).password);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.setString(5, pass.get(user.username).salt);
//                        MyHelperClass psImpl = new MyHelperClass();
                        psImpl.executeUpdate();
                        MyHelperClass rsImpl = new MyHelperClass();
                        rsImpl = psImpl.getGeneratedKeys();
//                        MyHelperClass rsImpl = new MyHelperClass();
                        if ((boolean)(Object)rsImpl.next()) {
//                            MyHelperClass rsImpl = new MyHelperClass();
                            user.userId = rsImpl.getInt(1);
//                            MyHelperClass rsImpl = new MyHelperClass();
                            rsImpl.close();
                        } else {
                            throw new SQLException("Need to have a user id generated.");
                        }
                    }
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
                    Iterator<NewUser> iter = newUsers.iterator();
                    NewUser user;
                    List<RealmWithEncryptedPass> list;
                    RealmWithEncryptedPass rwep;
                    RealmDb realm;
                    while (iter.hasNext()) {
                        user = iter.next();
                        list = realmPass.get(user.username);
                        if (list != null) {
                            Iterator<RealmWithEncryptedPass> iter1 = list.iterator();
                            while (iter1.hasNext()) {
                                rwep = iter1.next();
                                realm = (RealmDb)(RealmDb)(Object) rwep.realm;
//                                MyHelperClass psImpl = new MyHelperClass();
                                psImpl.setInt(1, realm.getRealmId());
//                                MyHelperClass psImpl = new MyHelperClass();
                                psImpl.setInt(2, user.userId);
//                                MyHelperClass psImpl = new MyHelperClass();
                                psImpl.setInt(3, user.domainId);
//                                MyHelperClass psImpl = new MyHelperClass();
                                psImpl.setString(4, rwep.password);
//                                MyHelperClass psImpl = new MyHelperClass();
                                psImpl.executeUpdate();
                            }
                        }
                    }
                }
            });
//            MyHelperClass connection = new MyHelperClass();
            connection.commit();
            Iterator<String> iterator = userDirs.iterator();
            while (iterator.hasNext()) {
                MyHelperClass cm = new MyHelperClass();
                cm.requestDirCreation(new File((String)(Object)cm.getUsersDirectory(), iterator.next()).getPath());
            }
            MyHelperClass cm = new MyHelperClass();
            cm.createDirectories();
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

public MyHelperClass getGeneratedKeys(){ return null; }
	public MyHelperClass error(SQLException o0){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass hashRealmPassword(String o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass getRealm(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass error(GeneralSecurityException o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getUsersDirectory(){ return null; }
	public MyHelperClass getPasswordHasher(){ return null; }
	public MyHelperClass getDomain(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass requestDirCreation(String o0){ return null; }
	public MyHelperClass toLowerCase(MyHelperClass o0){ return null; }
	public MyHelperClass hashRealmPassword(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass createDirectories(){ return null; }}

class NewUser {
public MyHelperClass realms;
	public MyHelperClass domainId;
	public MyHelperClass userId;
	public MyHelperClass password;
	public MyHelperClass username;
}

class PasswordAndSalt {
public MyHelperClass salt;
	public MyHelperClass password;
PasswordAndSalt(MyHelperClass o0, MyHelperClass o1){}
	PasswordAndSalt(){}}

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

class DomainDb {

public MyHelperClass getDomainId(){ return null; }
	public MyHelperClass getDomainName(){ return null; }}

class ProcessEnvelope {

public MyHelperClass executeNull(<anonymous ExecuteProcessAbstractImpl> o0){ return null; }
	public MyHelperClass executeNull(){ return null; }}

class RealmDb {

public MyHelperClass getRealmId(){ return null; }}
