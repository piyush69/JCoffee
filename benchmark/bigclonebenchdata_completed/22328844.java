import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22328844 {
public MyHelperClass factory;
	public MyHelperClass close(DBOperation o0, PreparedStatement o1, ResultSet o2){ return null; }
public MyHelperClass versionNO;

    protected void doBackupOrganize() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet result = null;
        MyHelperClass Common = new MyHelperClass();
        String strSelQuery = "SELECT organize_id,organize_type_id,organize_name,organize_manager," + "organize_describe,work_type,show_order,position_x,position_y " + "FROM " + Common.ORGANIZE_TABLE;
//        MyHelperClass Common = new MyHelperClass();
        String strInsQuery = "INSERT INTO " + Common.ORGANIZE_B_TABLE + " " + "(version_no,organize_id,organize_type_id,organize_name,organize_manager," + "organize_describe,work_type,show_order,position_x,position_y) " + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        MyHelperClass POOL_NAME = new MyHelperClass();
        DBOperation dbo =(DBOperation)(Object) factory.createDBOperation(POOL_NAME);
        try {
            try {
                con =(Connection)(Object) dbo.getConnection();
                con.setAutoCommit(false);
                ps =(PreparedStatement)(Object) con.prepareStatement(strSelQuery);
                result =(ResultSet)(Object) ps.executeQuery();
                ps =(PreparedStatement)(Object) con.prepareStatement(strInsQuery);
                while ((boolean)(Object)result.next()) {
                    ps.setInt(1, this.versionNO);
                    ps.setString(2, result.getString("organize_id"));
                    ps.setString(3, result.getString("organize_type_id"));
                    ps.setString(4, result.getString("organize_name"));
                    ps.setString(5, result.getString("organize_manager"));
                    ps.setString(6, result.getString("organize_describe"));
                    ps.setString(7, result.getString("work_type"));
                    ps.setInt(8, result.getInt("show_order"));
                    ps.setInt(9, result.getInt("position_x"));
                    ps.setInt(10, result.getInt("position_y"));
                    int resultCount =(int)(Object) ps.executeUpdate();
                    if (resultCount != 1) {
                        con.rollback();
                        throw new CesSystemException("Organize_backup.doBackupOrganize(): ERROR Inserting data " + "in T_SYS_ORGANIZE_B INSERT !! resultCount = " + resultCount);
                    }
                }
                con.commit();
            } catch (UncheckedIOException se) {
                con.rollback();
                throw new CesSystemException("Organize_backup.doBackupOrganize(): SQLException:  " + se);
            } finally {
                con.setAutoCommit(true);
                close(dbo, ps, result);
            }
        } catch (UncheckedIOException se) {
            throw new CesSystemException("Organize_backup.doBackupOrganize(): SQLException while committing or rollback");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORGANIZE_B_TABLE;
	public MyHelperClass ORGANIZE_TABLE;
public MyHelperClass createDBOperation(MyHelperClass o0){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class CesSystemException extends Exception{
	public CesSystemException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
