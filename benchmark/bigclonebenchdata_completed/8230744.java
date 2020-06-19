import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8230744 {
public MyHelperClass queryId(EntityDescriptor o0, Date o1, String o2, Connection o3, MyHelperClass o4){ return null; }
public MyHelperClass Statement;
	public MyHelperClass dbUtil;
	public MyHelperClass repository;
	public MyHelperClass assertTrue(String o0, boolean o1){ return null; }
	public MyHelperClass connect(){ return null; }

    protected void performInsertTest() throws Throwable, Exception {
        Connection conn =(Connection)(Object) connect();
        EntityDescriptor ed = repository.getEntityDescriptor(User.class);
        User testUser = new User();
        Date now = new Date();
        conn.setAutoCommit(false);
        testUser.setUsername("rednose");
        testUser.setUCreated("dbUtilTest");
        testUser.setUModified("dbUtilTest");
        testUser.setDtCreated(now);
        testUser.setDtModified(now);
        String sql = dbUtil.genInsert(ed, testUser);
        Statement st = conn.createStatement();
        long id = 0;
        System.err.println("Insert: " + sql);
        int rv = st.executeUpdate(sql, dbUtil.supportsGeneratedKeyQuery() ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS);
        if (rv > 0) {
            if (dbUtil.supportsGeneratedKeyQuery()) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) id = rs.getLong(1);
            } else {
                id = queryId(ed, now, "dbUtilTest", conn, dbUtil);
            }
            if (id > 0) testUser.setId(id); else rv = 0;
        }
        conn.rollback();
        assertTrue("oups, insert failed?", id != 0);
        System.err.println("successfully created user with id #" + id + " temporarily");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RETURN_GENERATED_KEYS;
	public MyHelperClass NO_GENERATED_KEYS;
public MyHelperClass supportsGeneratedKeyQuery(){ return null; }
	public MyHelperClass genInsert(EntityDescriptor o0, User o1){ return null; }
	public MyHelperClass getEntityDescriptor(Class<User o0){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class EntityDescriptor {

}

class User {

public MyHelperClass setUsername(String o0){ return null; }
	public MyHelperClass setDtCreated(Date o0){ return null; }
	public MyHelperClass setUCreated(String o0){ return null; }
	public MyHelperClass setUModified(String o0){ return null; }
	public MyHelperClass setId(long o0){ return null; }
	public MyHelperClass setDtModified(Date o0){ return null; }}

class Statement {

public MyHelperClass getGeneratedKeys(){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
