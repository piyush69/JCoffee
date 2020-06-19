import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9952202 {
public MyHelperClass assertEquals(String o0, Class<ConstraintViolationException o1, Class o2){ return null; }
public MyHelperClass JDBCExceptionReporter;
	public MyHelperClass openSession(){ return null; }
	public MyHelperClass reportSkip(String o0, String o1){ return null; }
	public MyHelperClass fail(String o0){ return null; }
	public MyHelperClass getDialect(){ return null; }

    public void testIntegrityViolation() throws Throwable, Exception {
        if ((MySQLMyISAMDialect)(Object)getDialect() instanceof MySQLMyISAMDialect) {
            reportSkip("MySQL (ISAM) does not support FK violation checking", "exception conversion");
            return;
        }
        SQLExceptionConverter converter = getDialect().buildSQLExceptionConverter();
        Session session =(Session)(Object) openSession();
        session.beginTransaction();
        Connection connection = session.connection();
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("INSERT INTO T_MEMBERSHIP (user_id, group_id) VALUES (?, ?)");
            ps.setLong(1, 52134241);
            ps.setLong(2, 5342);
            ps.executeUpdate();
            fail("INSERT should have failed");
        } catch (SQLException sqle) {
            JDBCExceptionReporter.logExceptions(sqle, "Just output!!!!");
            JDBCException jdbcException = converter.convert(sqle, null, null);
            assertEquals("Bad conversion [" + sqle.getMessage() + "]", ConstraintViolationException.class, jdbcException.getClass());
            ConstraintViolationException ex = (ConstraintViolationException)(ConstraintViolationException)(Object) jdbcException;
            System.out.println("Violated constraint name: " + ex.getConstraintName());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (Throwable ignore) {
                }
            }
        }
        session.getTransaction().rollback();
        session.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass buildSQLExceptionConverter(){ return null; }
	public MyHelperClass logExceptions(SQLException o0, String o1){ return null; }}

class MySQLMyISAMDialect {

}

class SQLExceptionConverter {

public MyHelperClass convert(SQLException o0, Object o1, Object o2){ return null; }}

class Session {

public MyHelperClass close(){ return null; }
	public MyHelperClass getTransaction(){ return null; }
	public MyHelperClass connection(){ return null; }
	public MyHelperClass beginTransaction(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, int o1){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class JDBCException extends Exception{
	public JDBCException(String errorMessage) { super(errorMessage); }
}

class ConstraintViolationException extends Exception{
	public ConstraintViolationException(String errorMessage) { super(errorMessage); }
}
