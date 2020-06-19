import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22328843 {
public MyHelperClass factory;
	public MyHelperClass close(DBOperation o0, PreparedStatement o1, ResultSet o2){ return null; }
public MyHelperClass versionNO;

    protected void doBackupOrganizeTypeRelation() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet result = null;
        MyHelperClass Common = new MyHelperClass();
        String strSelQuery = "SELECT parent_organize_type,child_organize_type " + "FROM " + Common.ORGANIZE_TYPE_RELATION_TABLE;
//        MyHelperClass Common = new MyHelperClass();
        String strInsQuery = "INSERT INTO " + Common.ORGANIZE_TYPE_RELATION_B_TABLE + " " + "(version_no,parent_organize_type,child_organize_type) " + "VALUES (?,?,?)";
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
                    ps.setString(2, result.getString("parent_organize_type"));
                    ps.setString(3, result.getString("child_organize_type"));
                    int resultCount =(int)(Object) ps.executeUpdate();
                    if (resultCount != 1) {
                        con.rollback();
                        throw new CesSystemException("Organize_backup.doBackupOrganizeTypeRelation(): ERROR Inserting data " + "in T_SYS_ORGANIZE_TYPE_RELATION_B INSERT !! resultCount = " + resultCount);
                    }
                }
                con.commit();
            } catch (UncheckedIOException se) {
                con.rollback();
                throw new CesSystemException("Organize_backup.doBackupOrganizeTypeRelation(): SQLException:  " + se);
            } finally {
                con.setAutoCommit(true);
                close(dbo, ps, result);
            }
        } catch (UncheckedIOException se) {
            throw new CesSystemException("Organize_backup.doBackupOrganizeTypeRelation(): SQLException while committing or rollback");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ORGANIZE_TYPE_RELATION_TABLE;
	public MyHelperClass ORGANIZE_TYPE_RELATION_B_TABLE;
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
	public MyHelperClass getString(String o0){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class CesSystemException extends Exception{
	public CesSystemException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
