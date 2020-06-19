
import java.io.UncheckedIOException;


class c16503018 {
public MyHelperClass connection;

    public String getNextObjectId() throws SQLException {
        long nextserial = 1;
        String s0 = "lock table serials in exclusive mode";
        String s1 = "SELECT nextserial FROM serials WHERE tablename = 'SERVER_OIDS'";
        String s2;
        try {
            Statement stmt =(Statement)(Object) connection.createStatement();
            stmt.executeUpdate(s0);
            ResultSet rs =(ResultSet)(Object) stmt.executeQuery(s1);
            if (!(Boolean)(Object)rs.next()) {
                s2 = "insert into serials (tablename,nextserial) values ('SERVER_OIDS', " + (nextserial) + ")";
            } else {
                nextserial =(int)(Object) rs.getLong(1) + 1;
                s2 = "update serials set nextserial=" + (nextserial) + " where tablename='SERVER_OIDS'";
            }
            stmt.executeUpdate(s2);
            connection.commit();
            rs.close();
            stmt.close();
            return "" + nextserial;
        } catch (UncheckedIOException e) {
            connection.rollback();
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
