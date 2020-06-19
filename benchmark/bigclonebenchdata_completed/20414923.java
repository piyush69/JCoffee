
import java.io.UncheckedIOException;


class c20414923 {
public MyHelperClass cleanup(PreparedStatement o0){ return null; }

    protected int deleteBitstreamInfo(int id, Connection conn) {
        PreparedStatement stmt = null;
        int numDeleted = 0;
        try {
            MyHelperClass DELETE_BITSTREAM_INFO = new MyHelperClass();
            stmt =(PreparedStatement)(Object) conn.prepareStatement(DELETE_BITSTREAM_INFO);
            stmt.setInt(1, id);
            numDeleted =(int)(Object) stmt.executeUpdate();
            if (numDeleted > 1) {
                conn.rollback();
                throw new IllegalStateException("Too many rows deleted! Number of rows deleted: " + numDeleted + " only one row should be deleted for bitstream id " + id);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("Problem deleting bitstream. " + e.getMessage(),(SQLException)(Object) e);
            throw new RuntimeException("Problem deleting bitstream. " + e.getMessage(), e);
        } finally {
            cleanup(stmt);
        }
        return numDeleted;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
