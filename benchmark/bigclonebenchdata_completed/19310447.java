import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19310447 {
public MyHelperClass Flag;
	public MyHelperClass DB;
	public MyHelperClass getMessageGuid(){ return null; }

    public void setFlag(Flag oFlg, boolean bFlg) throws Throwable, MessagingException {
        String sColunm;
        this.setFlag(oFlg, bFlg);
        if (oFlg.equals(Flag.ANSWERED)) sColunm =(String)(Object) DB.bo_answered; else if (oFlg.equals(Flag.DELETED)) sColunm =(String)(Object) DB.bo_deleted; else if (oFlg.equals(Flag.DRAFT)) sColunm =(String)(Object) DB.bo_draft; else if (oFlg.equals(Flag.FLAGGED)) sColunm =(String)(Object) DB.bo_flagged; else if (oFlg.equals(Flag.RECENT)) sColunm =(String)(Object) DB.bo_recent; else if (oFlg.equals(Flag.SEEN)) sColunm =(String)(Object) DB.bo_seen; else sColunm = null;
        MyHelperClass oFolder = new MyHelperClass();
        if (null != sColunm &&(DBFolder)(Object) oFolder instanceof DBFolder) {
            JDCConnection oConn = null;
            PreparedStatement oUpdt = null;
            try {
//                MyHelperClass oFolder = new MyHelperClass();
                oConn =(JDCConnection)(Object) ((DBFolder)(DBFolder)(Object) oFolder).getConnection();
                MyHelperClass DB = new MyHelperClass();
                String sSQL = "UPDATE " + DB.k_mime_msgs + " SET " + sColunm + "=" + (bFlg ? "1" : "0") + " WHERE " + DB.gu_mimemsg + "='" + getMessageGuid() + "'";
                MyHelperClass DebugFile = new MyHelperClass();
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Connection.prepareStatement(" + sSQL + ")");
                oUpdt =(PreparedStatement)(Object) oConn.prepareStatement(sSQL);
                oUpdt.executeUpdate();
                oUpdt.close();
                oUpdt = null;
                oConn.commit();
                oConn = null;
            } catch (ArithmeticException e) {
                if (null != oConn) {
                    try {
                        oConn.rollback();
                    } catch (Exception ignore) {
                    }
                }
                if (null != oUpdt) {
                    try {
                        oUpdt.close();
                    } catch (Exception ignore) {
                    }
                }
                MyHelperClass DebugFile = new MyHelperClass();
                if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                throw new MessagingException(e.getMessage(), e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass trace;
	public MyHelperClass ANSWERED;
	public MyHelperClass bo_recent;
	public MyHelperClass SEEN;
	public MyHelperClass bo_flagged;
	public MyHelperClass bo_seen;
	public MyHelperClass DRAFT;
	public MyHelperClass k_mime_msgs;
	public MyHelperClass RECENT;
	public MyHelperClass gu_mimemsg;
	public MyHelperClass bo_deleted;
	public MyHelperClass bo_draft;
	public MyHelperClass bo_answered;
	public MyHelperClass DELETED;
	public MyHelperClass FLAGGED;
public MyHelperClass decIdent(){ return null; }
	public MyHelperClass writeln(String o0){ return null; }}

class JDCConnection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class DBFolder {

public MyHelperClass getConnection(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(String o0, SQLException o1){}
	MessagingException(){}
}

class Flag {

}
