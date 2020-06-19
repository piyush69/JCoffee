import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4897872 {

    protected int executeUpdates(List<UpdateStatement> statements, OlVersionCheck olVersionCheck) throws Throwable, DaoException {
        MyHelperClass LOGGER = new MyHelperClass();
        if (LOGGER.isDebugEnabled()) {
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.debug("start executeUpdates");
        }
        PreparedStatement stmt = null;
        Connection conn = null;
        int rowsAffected = 0;
        try {
            MyHelperClass ds = new MyHelperClass();
            conn = ds.getConnection();
            conn.setAutoCommit(false);
            conn.rollback();
            MyHelperClass Connection = new MyHelperClass();
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            if (olVersionCheck != null) {
                stmt = conn.prepareStatement(olVersionCheck.getQuery());
                stmt.setObject(1, olVersionCheck.getId());
                ResultSet rs = stmt.executeQuery();
                rs.next();
                Number olVersion = (Number) rs.getObject("olVersion");
                stmt.close();
                stmt = null;
                if (olVersion.intValue() != olVersionCheck.getOlVersionToCheck().intValue()) {
                    rowsAffected = -1;
                }
            }
            if (rowsAffected >= 0) {
                for (UpdateStatement query : statements) {
                    stmt = conn.prepareStatement(query.getQuery());
                    if (query.getParams() != null) {
                        for (int parameterIndex = 1; parameterIndex <= query.getParams().length; parameterIndex++) {
                            Object object = query.getParams()[parameterIndex - 1];
                            stmt.setObject(parameterIndex, object);
                        }
                    }
//                    MyHelperClass LOGGER = new MyHelperClass();
                    if (LOGGER.isDebugEnabled()) {
//                        MyHelperClass LOGGER = new MyHelperClass();
                        LOGGER.debug(" **** Sending statement:\n" + query.getQuery());
                    }
                    rowsAffected += stmt.executeUpdate();
                    stmt.close();
                    stmt = null;
                }
            }
            conn.commit();
            conn.close();
            conn = null;
        } catch (SQLException e) {
            if ("23000".equals(e.getSQLState())) {
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.info("Integrity constraint violation", e);
                throw new UniqueConstaintException();
            }
            throw new DaoException("error.databaseError", e);
        } finally {
            try {
                if (stmt != null) {
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.debug("closing open statement!");
                    stmt.close();
                }
            } catch (SQLException e) {
                throw new DaoException("error.databaseError", e);
            } finally {
                stmt = null;
            }
            try {
                if (conn != null) {
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.debug("rolling back open connection!");
                    conn.rollback();
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException e) {
                throw new DaoException("error.databaseError", e);
            } finally {
                conn = null;
            }
        }
//        MyHelperClass LOGGER = new MyHelperClass();
        if (LOGGER.isDebugEnabled()) {
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.debug("finish executeUpdates");
        }
        return rowsAffected;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRANSACTION_READ_COMMITTED;
public MyHelperClass info(String o0, SQLException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class UpdateStatement {

public MyHelperClass getQuery(){ return null; }
	public MyHelperClass getParams(){ return null; }}

class OlVersionCheck {

public MyHelperClass getQuery(){ return null; }
	public MyHelperClass getOlVersionToCheck(){ return null; }
	public MyHelperClass getId(){ return null; }}

class DaoException extends Exception{
	public DaoException(String errorMessage) { super(errorMessage); }
	DaoException(){}
	DaoException(String o0, SQLException o1){}
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setObject(int o0, Object o1){ return null; }
	public MyHelperClass close(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass commit(){ return null; }}

class ResultSet {

public MyHelperClass getObject(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class UniqueConstaintException extends Exception{
	public UniqueConstaintException(String errorMessage) { super(errorMessage); }
	UniqueConstaintException(){}
}
