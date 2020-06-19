
import java.io.UncheckedIOException;


class c13604491 {

    public static int executeUpdate(EOAdaptorChannel channel, String sql, boolean autoCommit) throws SQLException {
        int rowsUpdated;
        boolean wasOpen =(boolean)(Object) channel.isOpen();
        if (!wasOpen) {
            channel.openChannel();
        }
        Connection conn =(Connection)(Object) ((JDBCContext)(JDBCContext)(Object) channel.adaptorContext()).connection();
        try {
            Statement stmt =(Statement)(Object) conn.createStatement();
            try {
                rowsUpdated =(int)(Object) stmt.executeUpdate(sql);
                if (autoCommit) {
                    conn.commit();
                }
            } catch (UncheckedIOException ex) {
                if (autoCommit) {
                    conn.rollback();
                }
                throw new RuntimeException("Failed to execute the statement '" + sql + "'.", ex);
            } finally {
                stmt.close();
            }
        } finally {
            if (!wasOpen) {
                channel.closeChannel();
            }
        }
        return rowsUpdated;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class EOAdaptorChannel {

public MyHelperClass openChannel(){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass adaptorContext(){ return null; }
	public MyHelperClass closeChannel(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class JDBCContext {

public MyHelperClass connection(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
