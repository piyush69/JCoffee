import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23651203 {
public MyHelperClass factory;
	public MyHelperClass close(DBOperation o0, PreparedStatement o1, ResultSet o2){ return null; }
public MyHelperClass provider;
	public MyHelperClass AssignLog;

    public void doDelete(Role role) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet result = null;
        MyHelperClass Common = new MyHelperClass();
        String strEdQuery = "SELECT authority_id from " + Common.ROLE_AUTHORITY_TABLE + " WHERE role_id = ?";
//        MyHelperClass Common = new MyHelperClass();
        String strQuery = "DELETE FROM " + Common.ROLE_AUTHORITY_TABLE + " WHERE role_id = ?";
        MyHelperClass POOL_NAME = new MyHelperClass();
        DBOperation dbo =(DBOperation)(Object) factory.createDBOperation(POOL_NAME);
        try {
            try {
                con =(Connection)(Object) dbo.getConnection();
                con.setAutoCommit(false);
                ps =(PreparedStatement)(Object) con.prepareStatement(strEdQuery);
                ps.setInt(1, role.getRoleID());
                result =(ResultSet)(Object) ps.executeQuery();
                while ((boolean)(Object)result.next()) {
                    int authID =(int)(Object) result.getInt("authority_id");
                    Authority auth = new Authority(authID);
                    auth.load();
                    AssignLog aLog = new AssignLog();
                    aLog.setLogNO(aLog.getNewLogNo());
                    aLog.setID(authID);
                    aLog.setName(auth.getAuthorityName());
                    MyHelperClass AssignLog = new MyHelperClass();
                    aLog.setAssignType(AssignLog.ASSIGN_AUTHORITY);
                    MyHelperClass Translate = new MyHelperClass();
                    aLog.setAssignDate(Translate.getSysTime());
                    aLog.setAssignFrom(this.provider.getUserID());
                    aLog.setAssignFromName(this.provider.getUserName());
                    aLog.setAssignTo(role.getRoleID());
                    aLog.setAssignToName(role.getRoleName());
                    aLog.setReceiverType(AssignLog.RECEIVER_ROLE);
                    aLog.setInfo("ɾ���ɫ�е�Ȩ��");
                    aLog.setPath("");
                    aLog.setPathName("");
                    aLog.doUpdateOrNew(con);
                }
                ps =(PreparedStatement)(Object) con.prepareStatement(strQuery);
                ps.setInt(1, role.getRoleID());
                int resultCount =(int)(Object) ps.executeUpdate();
                if (resultCount < 0) {
                    con.rollback();
                    throw new CesSystemException("RoleAuthority.doDelete(role): ERROR deleting data in T_SYS_ROLE_AUTHORITY!! " + "resultCount = " + resultCount);
                }
                con.commit();
            } catch (UncheckedIOException se) {
                con.rollback();
                throw new CesSystemException("RoleAuthority.doDelete(role): SQLException while deleting Role_authority; " + " role_id = " + role.getRoleID() + " :\n\t" + se);
            } finally {
                con.setAutoCommit(true);
                close(dbo, ps, result);
            }
        } catch (UncheckedIOException sqle) {
            throw new CesSystemException("RoleAuthority.doDelete(role): SQLException while committing or rollback");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ASSIGN_AUTHORITY;
	public MyHelperClass ROLE_AUTHORITY_TABLE;
	public MyHelperClass RECEIVER_ROLE;
public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getSysTime(){ return null; }
	public MyHelperClass createDBOperation(MyHelperClass o0){ return null; }
	public MyHelperClass getUserID(){ return null; }}

class Role {

public MyHelperClass getRoleID(){ return null; }
	public MyHelperClass getRoleName(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }
	public MyHelperClass getInt(String o0){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class Authority {

Authority(int o0){}
	Authority(){}
	public MyHelperClass load(){ return null; }
	public MyHelperClass getAuthorityName(){ return null; }}

class AssignLog {

public MyHelperClass setAssignToName(MyHelperClass o0){ return null; }
	public MyHelperClass setAssignFrom(MyHelperClass o0){ return null; }
	public MyHelperClass setID(int o0){ return null; }
	public MyHelperClass doUpdateOrNew(Connection o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }
	public MyHelperClass setAssignType(MyHelperClass o0){ return null; }
	public MyHelperClass setAssignFromName(MyHelperClass o0){ return null; }
	public MyHelperClass setAssignTo(MyHelperClass o0){ return null; }
	public MyHelperClass setReceiverType(MyHelperClass o0){ return null; }
	public MyHelperClass setInfo(String o0){ return null; }
	public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass setAssignDate(MyHelperClass o0){ return null; }
	public MyHelperClass getNewLogNo(){ return null; }
	public MyHelperClass setPathName(String o0){ return null; }
	public MyHelperClass setLogNO(MyHelperClass o0){ return null; }}

class CesSystemException extends Exception{
	public CesSystemException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
