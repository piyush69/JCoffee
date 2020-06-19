import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7300247 {
public MyHelperClass DebugFile;
	public MyHelperClass MboxFile;
	public MyHelperClass DB;
	public MyHelperClass getCategory(){ return null; }
	public MyHelperClass getStore(){ return null; }
	public MyHelperClass getNextMessage(){ return null; }

    public void moveMessage(DBMimeMessage oSrcMsg) throws Throwable, MessagingException {
        MyHelperClass DebugFile = new MyHelperClass();
        if ((boolean)(Object)DebugFile.trace) {
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.writeln("Begin DBFolder.moveMessage()");
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.incIdent();
        }
        JDCConnection oConn = null;
        PreparedStatement oStmt = null;
        ResultSet oRSet = null;
        BigDecimal oPg = null;
        BigDecimal oPos = null;
        int iLen = 0;
        try {
            oConn =(JDCConnection)(Object) ((DBStore)(DBStore)(Object) getStore()).getConnection();
            oStmt =(PreparedStatement)(Object) oConn.prepareStatement("SELECT " + DB.pg_message + "," + DB.nu_position + "," + DB.len_mimemsg + " FROM " + DB.k_mime_msgs + " WHERE " + DB.gu_mimemsg + "=?");
            oStmt.setString(1,(String)(Object) oSrcMsg.getMessageGuid());
            oRSet =(ResultSet)(Object) oStmt.executeQuery();
            if ((boolean)(Object)oRSet.next()) {
                oPg =(BigDecimal)(Object) oRSet.getBigDecimal(1);
                oPos =(BigDecimal)(Object) oRSet.getBigDecimal(2);
                iLen =(int)(Object) oRSet.getInt(3);
            }
            oRSet.close();
            oRSet = null;
            oStmt.close();
            oStmt = null;
            oConn.setAutoCommit(false);
            oStmt =(PreparedStatement)(Object) oConn.prepareStatement("UPDATE " + DB.k_categories + " SET " + DB.len_size + "=" + DB.len_size + "-" + String.valueOf(iLen) + " WHERE " + DB.gu_category + "=?");
            oStmt.setString(1,(String)(Object) ((DBFolder)(DBFolder)(Object) (oSrcMsg.getFolder())).getCategory().getString(DB.gu_category));
            oStmt.executeUpdate();
            oStmt.close();
            oStmt = null;
            oStmt =(PreparedStatement)(Object) oConn.prepareStatement("UPDATE " + DB.k_categories + " SET " + DB.len_size + "=" + DB.len_size + "+" + String.valueOf(iLen) + " WHERE " + DB.gu_category + "=?");
            oStmt.setString(1,(String)(Object) getCategory().getString(DB.gu_category));
            oStmt.executeUpdate();
            oStmt.close();
            oStmt = null;
            oConn.commit();
        } catch (UncheckedIOException sqle) {
            if (null != oRSet) {
                try {
                    oRSet.close();
                } catch (Exception ignore) {
                }
            }
            if (null != oStmt) {
                try {
                    oStmt.close();
                } catch (Exception ignore) {
                }
            }
            if (null != oConn) {
                try {
                    oConn.rollback();
                } catch (Exception ignore) {
                }
            }
            throw new MessagingException(sqle.getMessage(), sqle);
        }
        if (null == oPg) throw new MessagingException("Source message not found");
        if (null == oPos) throw new MessagingException("Source message position is not valid");
        DBFolder oSrcFldr = (DBFolder)(DBFolder)(Object) oSrcMsg.getFolder();
        MboxFile oMboxSrc = null, oMboxThis = null;
        try {
            oMboxSrc = new MboxFile(oSrcFldr.getFile(), MboxFile.READ_WRITE);
            oMboxThis = new MboxFile(oSrcFldr.getFile(), MboxFile.READ_WRITE);
            oMboxThis.appendMessage(oMboxSrc, oPos.longValue(), iLen);
            oMboxThis.close();
            oMboxThis = null;
            oMboxSrc.purge(new int[] {(int)(Object) oPg.intValue() });
            oMboxSrc.close();
            oMboxSrc = null;
        } catch (Exception e) {
            if (oMboxThis != null) {
                try {
                    oMboxThis.close();
                } catch (Exception ignore) {
                }
            }
            if (oMboxSrc != null) {
                try {
                    oMboxSrc.close();
                } catch (Exception ignore) {
                }
            }
            throw new MessagingException(e.getMessage(), e);
        }
        try {
            oConn =(JDCConnection)(Object) ((DBStore)(DBStore)(Object) getStore()).getConnection();
            BigDecimal dNext =(BigDecimal)(Object) getNextMessage();
            String sCatGuid =(String)(Object) getCategory().getString(DB.gu_category);
            oStmt =(PreparedStatement)(Object) oConn.prepareStatement("UPDATE " + DB.k_mime_msgs + " SET " + DB.gu_category + "=?," + DB.pg_message + "=? WHERE " + DB.gu_mimemsg + "=?");
            oStmt.setString(1, sCatGuid);
            oStmt.setBigDecimal(2, dNext);
            oStmt.setString(3,(String)(Object) oSrcMsg.getMessageGuid());
            oStmt.executeUpdate();
            oStmt.close();
            oStmt = null;
            oConn.commit();
        } catch (UncheckedIOException sqle) {
            if (null != oStmt) {
                try {
                    oStmt.close();
                } catch (Exception ignore) {
                }
            }
            if (null != oConn) {
                try {
                    oConn.rollback();
                } catch (Exception ignore) {
                }
            }
            throw new MessagingException(sqle.getMessage(), sqle);
        }
        if ((boolean)(Object)DebugFile.trace) {
            DebugFile.decIdent();
            DebugFile.writeln("End DBFolder.moveMessage()");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass len_size;
	public MyHelperClass nu_position;
	public MyHelperClass gu_mimemsg;
	public MyHelperClass k_categories;
	public MyHelperClass gu_category;
	public MyHelperClass len_mimemsg;
	public MyHelperClass READ_WRITE;
	public MyHelperClass k_mime_msgs;
	public MyHelperClass pg_message;
	public MyHelperClass trace;
public MyHelperClass writeln(String o0){ return null; }
	public MyHelperClass decIdent(){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass incIdent(){ return null; }}

class DBMimeMessage {

public MyHelperClass getMessageGuid(){ return null; }
	public MyHelperClass getFolder(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(){}
	MessagingException(String o0, Exception o1){}
	MessagingException(String o0, SQLException o1){}
}

class JDCConnection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setBigDecimal(int o0, BigDecimal o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getBigDecimal(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class BigDecimal {

public MyHelperClass intValue(){ return null; }
	public MyHelperClass longValue(){ return null; }}

class DBStore {

public MyHelperClass getConnection(){ return null; }}

class DBFolder {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass getCategory(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class MboxFile {

MboxFile(){}
	MboxFile(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass purge(int[] o0){ return null; }
	public MyHelperClass appendMessage(MboxFile o0, MyHelperClass o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
