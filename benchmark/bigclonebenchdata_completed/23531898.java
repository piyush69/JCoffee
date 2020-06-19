import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23531898 {
public MyHelperClass closePreparedStatement(PreparedStatement o0){ return null; }
	public MyHelperClass closeConnection(DBOperation o0){ return null; }
public MyHelperClass Common;
	public MyHelperClass factory;
	public MyHelperClass ipAddress;
	public MyHelperClass user;
	public MyHelperClass POOL_NAME;
	public MyHelperClass loginID;
	public MyHelperClass beginDate;
	public MyHelperClass sessionID;
	public MyHelperClass macNO;
	public MyHelperClass isValidate(){ return null; }

    public void doUpdateByLoginID() throws Exception {
        if (!(Boolean)(Object)isValidate()) {
            throw new CesSystemException("User_session.doUpdateByLoginID(): Illegal data values for update");
        }
        Connection con = null;
        PreparedStatement ps = null;
        String strQuery = "UPDATE " + Common.USER_SESSION_TABLE + " SET " + "session_id = ?, user_id = ?, begin_date = ? , " + "ip_address = ?, mac_no = ? " + "WHERE  login_id= ?";
        DBOperation dbo =(DBOperation)(Object) factory.createDBOperation(POOL_NAME);
        try {
            con =(Connection)(Object) dbo.getConnection();
            con.setAutoCommit(false);
            ps =(PreparedStatement)(Object) con.prepareStatement(strQuery);
            ps.setString(1, this.sessionID);
            ps.setInt(2, this.user.getUserID());
            ps.setTimestamp(3, this.beginDate);
            ps.setString(4, this.ipAddress);
            ps.setString(5, this.macNO);
            ps.setString(6, this.loginID);
            int resultCount =(int)(Object) ps.executeUpdate();
            if (resultCount != 1) {
                con.rollback();
                throw new CesSystemException("User_session.doUpdateByLoginID(): ERROR updating data in T_SYS_USER_SESSION!! " + "resultCount = " + resultCount);
            }
            con.commit();
        } catch (UncheckedIOException se) {
            if (con != null) {
                con.rollback();
            }
            throw new CesSystemException("User_session.doUpdateByLoginID(): SQLException while updating user_session; " + "session_id = " + this.sessionID + " :\n\t" + se);
        } finally {
            con.setAutoCommit(true);
            closePreparedStatement(ps);
            closeConnection(dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass USER_SESSION_TABLE;
public MyHelperClass createDBOperation(MyHelperClass o0){ return null; }
	public MyHelperClass getUserID(){ return null; }}

class CesSystemException extends Exception{
	public CesSystemException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setTimestamp(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class DBOperation {

public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
