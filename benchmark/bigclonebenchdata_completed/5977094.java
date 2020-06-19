
import java.io.UncheckedIOException;


class c5977094 {
public MyHelperClass closeRessources(Connection o0, PreparedStatement o1, ResultSet o2){ return null; }
	public MyHelperClass getDataSource(MyHelperClass o0){ return null; }

    public int deleteFile(Integer[] fileID) throws SQLException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Connection conn = null;
        int nbrow = 0;
        try {
            MyHelperClass DEFAULT_DATASOURCE = new MyHelperClass();
            DataSource ds =(DataSource)(Object) getDataSource(DEFAULT_DATASOURCE);
            conn =(Connection)(Object) ds.getConnection();
            conn.setAutoCommit(false);
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) {
                MyHelperClass DELETE_FILES_LOGIC = new MyHelperClass();
                log.debug("FileDAOImpl.deleteFile() " + DELETE_FILES_LOGIC);
            }
            for (int i = 0; i < fileID.length; i++) {
                MyHelperClass DELETE_FILES_LOGIC = new MyHelperClass();
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(DELETE_FILES_LOGIC);
                pstmt.setInt(1, fileID[i].intValue());
                nbrow =(int)(Object) pstmt.executeUpdate();
            }
        } catch (UncheckedIOException e) {
            conn.rollback();
            MyHelperClass log = new MyHelperClass();
            log.error("FileDAOImpl.deleteFile() : erreur technique",(SQLException)(Object) e);
            throw e;
        } finally {
            conn.commit();
            closeRessources(conn, pstmt, rs);
        }
        return nbrow;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, SQLException o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class DataSource {

public MyHelperClass getConnection(){ return null; }}
