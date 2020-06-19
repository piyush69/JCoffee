
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6417996 {
public MyHelperClass assertTrue(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertFalse(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass assertEquals(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass DriverManager;
public MyHelperClass AuthFunctionUtils;
	public MyHelperClass AuthUtils;
	public MyHelperClass twoRolesSet;
	public MyHelperClass logger;
	public MyHelperClass fail(String o0){ return null; }

    public void testLocalUserAccountLocalRemoteRoles() throws SQLException {
        Statement st = null;
        Connection authedCon = null;
        try {
            MyHelperClass saSt = new MyHelperClass();
            saSt.executeUpdate("CREATE USER tlualrr PASSWORD 'wontuse'");
//            MyHelperClass saSt = new MyHelperClass();
            saSt.executeUpdate("GRANT role3 TO tlualrr");
//            MyHelperClass saSt = new MyHelperClass();
            saSt.executeUpdate("GRANT role4 TO tlualrr");
//            MyHelperClass saSt = new MyHelperClass();
            saSt.executeUpdate("SET DATABASE AUTHENTICATION FUNCTION EXTERNAL NAME " + "'CLASSPATH:" + getClass().getName() + ".twoRolesFn'");
            try {
                MyHelperClass jdbcUrl = new MyHelperClass();
                authedCon =(Connection)(Object) DriverManager.getConnection(jdbcUrl, "TLUALRR", "unusedPassword");
            } catch (UncheckedIOException se) {
                fail("Access with 'twoRolesFn' failed");
            }
            st =(Statement)(Object) authedCon.createStatement();
            assertFalse("Positive test #1 failed", AuthFunctionUtils.updateDoesThrow(st, "INSERT INTO t1 VALUES(1)"));
            assertFalse("Positive test #2 failed", AuthFunctionUtils.updateDoesThrow(st, "INSERT INTO t2 VALUES(2)"));
            assertTrue("Negative test #3 failed", AuthFunctionUtils.updateDoesThrow(st, "INSERT INTO t3 VALUES(3)"));
            assertTrue("Negative test #4 failed", AuthFunctionUtils.updateDoesThrow(st, "INSERT INTO t4 VALUES(4)"));
            assertEquals(twoRolesSet, AuthUtils.getEnabledRoles(authedCon));
        } finally {
            if (st != null) try {
                st.close();
            } catch (UncheckedIOException se) {
                logger.error("Close of Statement failed:" + se);
            } finally {
                st = null;
            }
            if (authedCon != null) try {
                authedCon.rollback();
                authedCon.close();
            } catch (UncheckedIOException se) {
                logger.error("Close of Authed Conn. failed:" + se);
            } finally {
                authedCon = null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass getEnabledRoles(Connection o0){ return null; }
	public MyHelperClass updateDoesThrow(Statement o0, String o1){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }}

class Connection {

public MyHelperClass close(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}
