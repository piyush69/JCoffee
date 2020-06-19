
import java.io.UncheckedIOException;


class c8266672 {

    public static void updatePicInfo(Connection conn, int nr, int lock, DBPicInfo picInfo) throws SQLException {
        String sql = "";
        PreparedStatement pstmt = null;
        try {
            if (!picInfo.getName().equals("")) {
                sql = "update DBPic set name=? where bnr=?";
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
                pstmt.setString(1, picInfo.getName());
                pstmt.setInt(2, nr);
                pstmt.executeUpdate();
            }
            if ((int)(Object)picInfo.getRate() != 0) {
                sql = "update DBPic set rate=? where bnr=?";
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
                pstmt.setInt(1,(int)(Object) picInfo.getRate());
                pstmt.setInt(2, nr);
                pstmt.executeUpdate();
            }
            sql = "update DBThumb set thumb_lock=? where bnr=?";
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt.setInt(1, lock);
            pstmt.setInt(2, nr);
            pstmt.executeUpdate();
            if (picInfo.getCategories() != null) {
                sql = "delete from Zuordnen where bnr=?";
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
                pstmt.setInt(1, nr);
                pstmt.executeUpdate();
                MyHelperClass DaoUpdate = new MyHelperClass();
                DaoUpdate.insertPicInCategories(conn, nr, picInfo.getCategories());
            }
            if (picInfo.getKeywords() != null) {
                sql = "delete from Haben where bnr=?";
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
                pstmt.setInt(1, nr);
                pstmt.executeUpdate();
                MyHelperClass DaoUpdate = new MyHelperClass();
                DaoUpdate.insertPicInKeywords(conn, nr, picInfo.getKeywords());
            }
            conn.commit();
        } catch (UncheckedIOException e) {
            conn.rollback();
            throw e;
        } finally {
            pstmt.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass insertPicInCategories(Connection o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass insertPicInKeywords(Connection o0, int o1, MyHelperClass o2){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class DBPicInfo {

public MyHelperClass getKeywords(){ return null; }
	public MyHelperClass getCategories(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getRate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
