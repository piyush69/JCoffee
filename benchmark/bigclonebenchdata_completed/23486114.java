
import java.io.UncheckedIOException;


class c23486114 {

    public void createTableIfNotExisting(Connection conn) throws SQLException {
        MyHelperClass tableName = new MyHelperClass();
        String sql = "select * from " + tableName;
        PreparedStatement ps = null;
        try {
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.executeQuery();
        } catch (UncheckedIOException sqle) {
            ps.close();
//            MyHelperClass tableName = new MyHelperClass();
            sql = "create table " + tableName + " ( tableName varchar(255) not null primary key, " + "   lastId numeric(18) not null)";
            ps =(PreparedStatement)(Object) conn.prepareStatement(sql);
            ps.executeUpdate();
        } finally {
            ps.close();
            try {
                if (!(Boolean)(Object)conn.getAutoCommit()) conn.commit();
            } catch (Exception e) {
                conn.rollback();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Connection {

public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
