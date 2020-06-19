
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23498321 {

    static final void saveModule(Module module, DBConnector connector) throws IOException {
        String type = "pre";
        if ((boolean)(Object)module.isPreModule()) type = "pre"; else if ((boolean)(Object)module.isPostModule()) type = "post"; else if ((boolean)(Object)module.isExceptionModule()) type = "exception"; else throw new IllegalArgumentException("Module must be of a known type.");
        Properties props =(Properties)(Object) module.getState();
        Connection con = null;
        PreparedStatement ps = null;
        Statement st = null;
        try {
            con =(Connection)(Object) connector.getDB();
            con.setAutoCommit(false);
            st =(Statement)(Object) con.createStatement();
            st.executeUpdate("DELETE FROM instance where id=" + module.getId());
            st.executeUpdate("DELETE FROM instance_property where instance_id=" + module.getId());
            ps =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO instance VALUES (?, ?, ?, ?)");
            ps.setInt(1, module.getId());
            ps.setBoolean(2, module.getActive());
            ps.setString(3, module.getClass().getName());
            ps.setString(4, type);
            ps.executeUpdate();
            ps.close();
            ps =(PreparedStatement)(Object) con.prepareStatement("INSERT INTO instance_property values(?, ?, ?)");
            for (Enumeration keys =(Enumeration)(Object) props.keys();(boolean)(Object) keys.hasMoreElements(); ) {
                String key = (String)(String)(Object) keys.nextElement();
                String value =(String)(Object) props.getProperty(key);
                ps.setInt(1, module.getId());
                ps.setString(2, key);
                ps.setString(3, value);
                ps.addBatch();
            }
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

class Module {

public MyHelperClass isPreModule(){ return null; }
	public MyHelperClass isExceptionModule(){ return null; }
	public MyHelperClass getActive(){ return null; }
	public MyHelperClass getState(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass isPostModule(){ return null; }}

class DBConnector {

public MyHelperClass getDB(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass keys(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass addBatch(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBoolean(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
