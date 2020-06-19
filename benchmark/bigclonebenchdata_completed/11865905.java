import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11865905 {
public MyHelperClass Assert;

//    @Test
    public void testRegister()  throws Throwable {
        try {
            String username = "muchu";
            String password = "123";
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            String passwordMd5 = new String(md5.digest());
            MyHelperClass EasyMock = new MyHelperClass();
            LogService logServiceMock =(LogService)(Object) EasyMock.createMock((DbService)(Object)LogService.class);
//            MyHelperClass EasyMock = new MyHelperClass();
            DbService dbServiceMock =(DbService)(Object) EasyMock.createMock((DbService)(Object)DbService.class);
            MyHelperClass userServ = new MyHelperClass();
            userServ.setDbServ(dbServiceMock);
//            MyHelperClass userServ = new MyHelperClass();
            userServ.setLogger(logServiceMock);
            IFeelerUser user =(IFeelerUser)(Object) new FeelerUserImpl();
            user.setUsername(username);
            user.setPassword(passwordMd5);
            logServiceMock.info((DbUserServiceImpl)(Object)DbUserServiceImpl.class, ">>>rigister " + username + "<<<");
//            MyHelperClass EasyMock = new MyHelperClass();
            EasyMock.expect(dbServiceMock.queryFeelerUser(username)).andReturn(null);
            dbServiceMock.addFeelerUser(username, passwordMd5);
            logServiceMock.info((DbUserServiceImpl)(Object)DbUserServiceImpl.class, ">>>identification " + username + "<<<");
//            MyHelperClass EasyMock = new MyHelperClass();
            EasyMock.expect(dbServiceMock.queryFeelerUser(username)).andReturn(user);
//            MyHelperClass EasyMock = new MyHelperClass();
            EasyMock.replay(dbServiceMock, logServiceMock);
//            MyHelperClass userServ = new MyHelperClass();
            Assert.assertTrue(userServ.register(username, password));
//            MyHelperClass EasyMock = new MyHelperClass();
            EasyMock.verify(dbServiceMock, logServiceMock);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass andReturn(Object o0){ return null; }
	public MyHelperClass replay(DbService o0, LogService o1){ return null; }
	public MyHelperClass createMock(DbService o0){ return null; }
	public MyHelperClass register(String o0, String o1){ return null; }
	public MyHelperClass verify(DbService o0, LogService o1){ return null; }
	public MyHelperClass expect(MyHelperClass o0){ return null; }
	public MyHelperClass setLogger(LogService o0){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
	public MyHelperClass createMock(LogService o0){ return null; }
	public MyHelperClass setDbServ(DbService o0){ return null; }
	public MyHelperClass andReturn(IFeelerUser o0){ return null; }}

class Test {

}

class LogService {

public MyHelperClass info(DbUserServiceImpl o0, String o1){ return null; }}

class DbService {

public MyHelperClass queryFeelerUser(String o0){ return null; }
	public MyHelperClass addFeelerUser(String o0, String o1){ return null; }}

class IFeelerUser {

public MyHelperClass setPassword(String o0){ return null; }
	public MyHelperClass setUsername(String o0){ return null; }}

class FeelerUserImpl {

}

class DbUserServiceImpl {

}
