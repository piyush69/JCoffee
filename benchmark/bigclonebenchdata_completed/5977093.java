import java.io.*;
import java.lang.*;
import java.util.*;



class c5977093 {
public MyHelperClass getDataSource(MyHelperClass o0){ return null; }
	public MyHelperClass closeRessources(Connection o0, PreparedStatement o1){ return null; }

    public FileBean create(MimeTypeBean mimeType, SanBean san) throws SQLException {
        long fileId = 0;
        MyHelperClass DEFAULT_DATASOURCE = new MyHelperClass();
        DataSource ds =(DataSource)(Object) getDataSource(DEFAULT_DATASOURCE);
        Connection conn =(Connection)(Object) ds.getConnection();
        try {
            conn.setAutoCommit(false);
            Statement stmt =(Statement)(Object) conn.createStatement();
            MyHelperClass NEXT_FILE_ID = new MyHelperClass();
            stmt.execute(NEXT_FILE_ID);
            ResultSet rs =(ResultSet)(Object) stmt.getResultSet();
            while ((boolean)(Object)rs.next()) {
                MyHelperClass NEXTVAL = new MyHelperClass();
                fileId =(long)(Object) rs.getLong(NEXTVAL);
            }
            MyHelperClass INSERT_FILE = new MyHelperClass();
            PreparedStatement pstmt =(PreparedStatement)(Object) conn.prepareStatement(INSERT_FILE);
            pstmt.setLong(1, fileId);
            pstmt.setLong(2, mimeType.getId());
            pstmt.setLong(3, san.getId());
            MyHelperClass WORKFLOW_ATTENTE_VALIDATION = new MyHelperClass();
            pstmt.setLong(4, WORKFLOW_ATTENTE_VALIDATION);
            int nbrow =(int)(Object) pstmt.executeUpdate();
            if (nbrow == 0) {
                throw new SQLException();
            }
            conn.commit();
            closeRessources(conn, pstmt);
        } catch (SQLException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Can't FileDAOImpl.create " + e.getMessage());
            conn.rollback();
            throw e;
        }
        FileBean fileBean = new FileBean();
        return fileBean;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class MimeTypeBean {

public MyHelperClass getId(){ return null; }}

class SanBean {

public MyHelperClass getId(){ return null; }}

class FileBean {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
	SQLException(){}
}

class DataSource {

public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class Statement {

public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass getResultSet(){ return null; }}

class ResultSet {

public MyHelperClass getLong(MyHelperClass o0){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass setLong(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
