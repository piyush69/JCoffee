
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4982455 {

    static final void saveStatus(JWAIMStatus status, DBConnector connector) throws IOException {
        Connection con = null;
        PreparedStatement ps = null;
        Statement st = null;
        try {
            con =(Connection)(Object) connector.getDB();
            con.setAutoCommit(false);
            st =(Statement)(Object) con.createStatement();
            st.executeUpdate("DELETE FROM status");
            ps =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO status VALUES (?, ?)");
            ps.setString(1, "jwaim.status");
            ps.setBoolean(2, status.getJWAIMStatus());
            ps.addBatch();
            ps.setString(1, "logging.status");
            ps.setBoolean(2, status.getLoggingStatus());
            ps.addBatch();
            ps.setString(1, "stats.status");
            ps.setBoolean(2, status.getStatsStatus());
            ps.addBatch();
            ps.executeBatch();
            con.commit();
        } catch (UncheckedIOException e) {
            try {
                con.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            throw new IOException(e.getMessage());
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (UncheckedIOException ignore) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (UncheckedIOException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (UncheckedIOException ignore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JWAIMStatus {

public MyHelperClass getStatsStatus(){ return null; }
	public MyHelperClass getLoggingStatus(){ return null; }
	public MyHelperClass getJWAIMStatus(){ return null; }}

class DBConnector {

public MyHelperClass getDB(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class PreparedStatement {

public MyHelperClass addBatch(){ return null; }
	public MyHelperClass setBoolean(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
