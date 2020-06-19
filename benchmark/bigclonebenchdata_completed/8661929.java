
import java.io.UncheckedIOException;


class c8661929 {
public MyHelperClass endProsess(Connection o0, PreparedStatement o1, Object o2, Object o3){ return null; }
public MyHelperClass log;
	public MyHelperClass getConnection(){ return null; }

    public int addLocationInfo(int id, double lattitude, double longitude) {
        int ret = 0;
        Connection conn = null;
        PreparedStatement psmt = null;
        try {
            String sql = "insert into kddb.location_info (user_id, latitude, longitude) values(?, ?, ?)";
            conn =(Connection)(Object) getConnection();
            psmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            psmt.setInt(1, id);
            psmt.setDouble(2, lattitude);
            psmt.setDouble(3, longitude);
            ret =(int)(Object) psmt.executeUpdate();
            if (ret == 1) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (UncheckedIOException ex) {
            log.error("[addLocationInfo]",(SQLException)(Object) ex);
        } finally {
            endProsess(conn, psmt, null, null);
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, SQLException o1){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setDouble(int o0, double o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
