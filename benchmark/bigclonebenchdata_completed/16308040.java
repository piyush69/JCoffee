
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16308040 {
public MyHelperClass addParametersToQuery(Query o0, PreparedStatement o1){ return null; }
	public MyHelperClass closeConnection(Connection o0, PreparedStatement o1, Object o2){ return null; }
public MyHelperClass log;
	public MyHelperClass getDbConnection(){ return null; }

    public boolean update(String dbName, Query[] queries) throws ServiceException {
        Connection con = null;
        PreparedStatement pstmt = null;
        int rows = 0;
        try {
            con =(Connection)(Object) getDbConnection().getConnection(dbName);
            con.setAutoCommit(false);
            for (int i = 0; i < queries.length; i++) {
                Query query = queries[i];
                System.out.println(query.getSql());
                pstmt =(PreparedStatement)(Object) con.prepareStatement(query.getSql());
                addParametersToQuery(query, pstmt);
                rows += (int)(Object)pstmt.executeUpdate();
            }
            con.commit();
            return rows > 0;
        } catch (UncheckedIOException e) {
            log.error("[DAOService::update]  " + e.getMessage(),(DbException)(Object) e);
            log.error("[DAOService::update] Execute rollback " + e.getMessage(),(DbException)(Object) e);
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
                log.error("[DAOService::update] Errore durante il rollback " + e.getMessage(),(DbException)(Object) e);
                throw new ServiceException(e.getMessage());
            }
            throw new ServiceException(e.getMessage());
        } catch (ArithmeticException e) {
            log.error("[DAOService::update]  " + e.getMessage(),(DbException)(Object) e);
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
                log.error("[DAOService::update] Errore durante il rollback " + e.getMessage(),(DbException)(Object) e);
                throw new ServiceException(e.getMessage());
            }
            throw new ServiceException(e.getMessage());
        } finally {
            closeConnection(con, pstmt, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, DbException o1){ return null; }
	public MyHelperClass getConnection(String o0){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }}

class Query {

public MyHelperClass getSql(){ return null; }}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }}

class DbException extends Exception{
	public DbException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
