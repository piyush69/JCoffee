import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9016775 {
public MyHelperClass conn;
	public MyHelperClass Categories;
	public MyHelperClass executeUpdate(String o0){ return null; }

    private int saveToTempTable(ArrayList cons, String tempTableName, boolean truncateFirst) throws SQLException {
        if (truncateFirst) {
            this.executeUpdate("TRUNCATE TABLE " + tempTableName);
            Categories.dataDb().debug("TABLE " + tempTableName + " TRUNCATED.");
        }
        PreparedStatement ps = null;
        int rows = 0;
        try {
            String insert = "INSERT INTO " + tempTableName + " VALUES (?)";
            ps =(PreparedStatement)(Object) this.conn.prepareStatement(insert);
            for (int i = 0; i < cons.size(); i++) {
                ps.setLong(1, ((Long) cons.get(i)).longValue());
                rows =(int)(Object) ps.executeUpdate();
                if ((i % 500) == 0) {
                    this.conn.commit();
                }
            }
            this.conn.commit();
        } catch (UncheckedIOException sqle) {
            this.conn.rollback();
            throw sqle;
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
        return rows;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass dataDb(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }}
