
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12393199 {
public MyHelperClass Level;
	public MyHelperClass tablename;
	public MyHelperClass logger;
	public MyHelperClass getTablename(){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public int getDBVersion() throws MigrationException {
        int dbVersion;
        PreparedStatement ps;
        try {
            Connection conn =(Connection)(Object) getConnection();
            ps =(PreparedStatement)(Object) conn.prepareStatement("SELECT version FROM " + getTablename());
            try {
                ResultSet rs =(ResultSet)(Object) ps.executeQuery();
                try {
                    if ((boolean)(Object)rs.next()) {
                        dbVersion =(int)(Object) rs.getInt(1);
                        if ((boolean)(Object)rs.next()) {
                            throw new MigrationException("Too many version in table: " + getTablename());
                        }
                    } else {
                        ps.close();
                        ps =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO " + getTablename() + " (version) VALUES (?)");
                        ps.setInt(1, 1);
                        try {
                            ps.executeUpdate();
                        } finally {
                            ps.close();
                        }
                        dbVersion = 1;
                    }
                } finally {
                    rs.close();
                }
            } finally {
                ps.close();
            }
        } catch (UncheckedIOException e) {
            logger.log(Level.WARNING, "Could not access " + tablename + ": " + e);
            dbVersion = 0;
            Connection conn =(Connection)(Object) getConnection();
            try {
                if (!(Boolean)(Object)conn.getAutoCommit()) {
                    conn.rollback();
                }
                conn.setAutoCommit(false);
            } catch (UncheckedIOException e1) {
                throw new MigrationException("Could not reset transaction state",(SQLException)(Object) e1);
            }
        }
        return dbVersion;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class MigrationException extends Exception{
	public MigrationException(String errorMessage) { super(errorMessage); }
	MigrationException(String o0, SQLException o1){}
	MigrationException(){}
}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class Connection {

public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
