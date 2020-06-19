import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7300257 {
public MyHelperClass MODE_BLOB;
	public MyHelperClass READ_WRITE;
	public MyHelperClass MODE_MBOX;
public MyHelperClass ResultSet;
	public MyHelperClass DebugFile;
	public MyHelperClass MboxFile;
	public MyHelperClass oCatg;
	public MyHelperClass DB;
	public MyHelperClass oConn;
	public MyHelperClass JDCConnection;
	public MyHelperClass getCategory(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }

    public Message[] expunge() throws Throwable, MessagingException {
        Statement oStmt = null;
        CallableStatement oCall = null;
        PreparedStatement oUpdt = null;
        ResultSet oRSet;
        MyHelperClass DebugFile = new MyHelperClass();
        if ((boolean)(Object)DebugFile.trace) {
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.writeln("Begin DBFolder.expunge()");
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.incIdent();
        }
        MyHelperClass iOpenMode = new MyHelperClass();
        if (0 == ((int)(Object)iOpenMode & (int)(Object)READ_WRITE)) {
//            MyHelperClass DebugFile = new MyHelperClass();
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new FolderClosedException(this, "Folder is not open is READ_WRITE mode");
        }
//        MyHelperClass iOpenMode = new MyHelperClass();
        if ((0 == ((int)(Object)iOpenMode & (int)(Object)MODE_MBOX)) && (0 == ((int)(Object)iOpenMode & (int)(Object)MODE_BLOB))) {
//            MyHelperClass DebugFile = new MyHelperClass();
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new FolderClosedException(this, "Folder is not open in MBOX nor BLOB mode");
        }
        MboxFile oMBox = null;
        MyHelperClass DB = new MyHelperClass();
        DBSubset oDeleted = new DBSubset(DB.k_mime_msgs, DB.gu_mimemsg + "," + DB.pg_message, DB.bo_deleted + "=1 AND " + DB.gu_category + "='" + oCatg.getString(DB.gu_category) + "'", 100);
        try {
            int iDeleted =(int)(Object) oDeleted.load(getConnection());
            File oFile =(File)(Object) getFile();
            if (oFile.exists() && iDeleted > 0) {
                oMBox = new MboxFile(oFile, MboxFile.READ_WRITE);
                int[] msgnums = new int[iDeleted];
                for (int m = 0; m < iDeleted; m++) msgnums[m] =(int)(Object) oDeleted.getInt(1, m);
                oMBox.purge(msgnums);
                oMBox.close();
            }
            oStmt =(Statement)(Object) oConn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            oRSet =(ResultSet)(Object) oStmt.executeQuery("SELECT p." + DB.file_name + " FROM " + DB.k_mime_parts + " p," + DB.k_mime_msgs + " m WHERE p." + DB.gu_mimemsg + "=m." + DB.gu_mimemsg + " AND m." + DB.id_disposition + "='reference' AND m." + DB.bo_deleted + "=1 AND m." + DB.gu_category + "='" + oCatg.getString(DB.gu_category) + "'");
            while ((boolean)(Object)oRSet.next()) {
                String sFileName =(String)(Object) oRSet.getString(1);
                if (!(Boolean)(Object)oRSet.wasNull()) {
                    try {
                        File oRef = new File(sFileName);
                        oRef.delete();
                    } catch (SecurityException se) {
                        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("SecurityException " + sFileName + " " + se.getMessage());
                    }
                }
            }
            oRSet.close();
            oRSet = null;
            oStmt.close();
            oStmt = null;
            oFile =(File)(Object) getFile();
            oStmt =(Statement)(Object) oConn.createStatement();
            oStmt.executeUpdate("UPDATE " + DB.k_categories + " SET " + DB.len_size + "=" + String.valueOf(oFile.length()) + " WHERE " + DB.gu_category + "='" + getCategory().getString(DB.gu_category) + "'");
            oStmt.close();
            oStmt = null;
            if (oConn.getDataBaseProduct() == JDCConnection.DBMS_POSTGRESQL) {
                oStmt =(Statement)(Object) oConn.createStatement();
                for (int d = 0; d < iDeleted; d++) oStmt.executeQuery("SELECT k_sp_del_mime_msg('" + oDeleted.getString(0, d) + "')");
                oStmt.close();
                oStmt = null;
            } else {
                oCall =(CallableStatement)(Object) oConn.prepareCall("{ call k_sp_del_mime_msg(?) }");
                for (int d = 0; d < iDeleted; d++) {
                    oCall.setString(1, oDeleted.getString(0, d));
                    oCall.execute();
                }
                oCall.close();
                oCall = null;
            }
            if (oFile.exists() && iDeleted > 0) {
                BigDecimal oUnit = new BigDecimal(1);
                oStmt =(Statement)(Object) oConn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                oRSet =(ResultSet)(Object) oStmt.executeQuery("SELECT MAX(" + DB.pg_message + ") FROM " + DB.k_mime_msgs + " WHERE " + DB.gu_category + "='getCategory().getString(DB.gu_category)'");
                oRSet.next();
                BigDecimal oMaxPg =(BigDecimal)(Object) oRSet.getBigDecimal(1);
                if ((boolean)(Object)oRSet.wasNull()) oMaxPg = new BigDecimal(0);
                oRSet.close();
                oRSet = null;
                oStmt.close();
                oStmt = null;
                oMaxPg = oMaxPg.add(oUnit);
                oStmt =(Statement)(Object) oConn.createStatement();
                oStmt.executeUpdate("UPDATE " + DB.k_mime_msgs + " SET " + DB.pg_message + "=" + DB.pg_message + "+" + oMaxPg.toString() + " WHERE " + DB.gu_category + "='" + getCategory().getString(DB.gu_category) + "'");
                oStmt.close();
                oStmt = null;
                DBSubset oMsgSet = new DBSubset(DB.k_mime_msgs, DB.gu_mimemsg + "," + DB.pg_message, DB.gu_category + "='" + getCategory().getString(DB.gu_category) + "' ORDER BY " + DB.pg_message, 1000);
                int iMsgCount =(int)(Object) oMsgSet.load(oConn);
                oMBox = new MboxFile(oFile, MboxFile.READ_ONLY);
                long[] aPositions =(long[])(Object) oMBox.getMessagePositions();
                oMBox.close();
                if (iMsgCount != aPositions.length) {
                    throw new IOException("DBFolder.expunge() Message count of " + String.valueOf(aPositions.length) + " at MBOX file " + oFile.getName() + " does not match message count at database index of " + String.valueOf(iMsgCount));
                }
                oMaxPg = new BigDecimal(0);
                oUpdt =(PreparedStatement)(Object) oConn.prepareStatement("UPDATE " + DB.k_mime_msgs + " SET " + DB.pg_message + "=?," + DB.nu_position + "=? WHERE " + DB.gu_mimemsg + "=?");
                for (int m = 0; m < iMsgCount; m++) {
                    oUpdt.setBigDecimal(1, oMaxPg);
                    oUpdt.setBigDecimal(2, new BigDecimal(aPositions[m]));
                    oUpdt.setString(3, oMsgSet.getString(0, m));
                    oUpdt.executeUpdate();
                    oMaxPg = oMaxPg.add(oUnit);
                }
                oUpdt.close();
            }
            oConn.commit();
        } catch (ArithmeticException sqle) {
            try {
                if (oMBox != null) oMBox.close();
            } catch (Exception e) {
            }
            try {
                if (oStmt != null) oStmt.close();
            } catch (Exception e) {
            }
            try {
                if (oCall != null) oCall.close();
            } catch (Exception e) {
            }
            try {
                if (oConn != null) oConn.rollback();
            } catch (Exception e) {
            }
            throw new MessagingException(sqle.getMessage(),(SQLException)(Object) sqle);
        } catch (IOException sqle) {
            try {
                if (oMBox != null) oMBox.close();
            } catch (Exception e) {
            }
            try {
                if (oStmt != null) oStmt.close();
            } catch (Exception e) {
            }
            try {
                if (oCall != null) oCall.close();
            } catch (Exception e) {
            }
            try {
                if (oConn != null) oConn.rollback();
            } catch (Exception e) {
            }
            throw new MessagingException(sqle.getMessage(), sqle);
        }
        if ((boolean)(Object)DebugFile.trace) {
            DebugFile.decIdent();
            DebugFile.writeln("End DBFolder.expunge()");
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass id_disposition;
	public MyHelperClass gu_category;
	public MyHelperClass TYPE_FORWARD_ONLY;
	public MyHelperClass k_categories;
	public MyHelperClass file_name;
	public MyHelperClass READ_WRITE;
	public MyHelperClass nu_position;
	public MyHelperClass k_mime_msgs;
	public MyHelperClass k_mime_parts;
	public MyHelperClass gu_mimemsg;
	public MyHelperClass pg_message;
	public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass len_size;
	public MyHelperClass DBMS_POSTGRESQL;
	public MyHelperClass bo_deleted;
	public MyHelperClass READ_ONLY;
	public MyHelperClass trace;
public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass decIdent(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass createStatement(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass incIdent(){ return null; }
	public MyHelperClass getDataBaseProduct(){ return null; }
	public MyHelperClass prepareCall(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass writeln(String o0){ return null; }}

class Message {

}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(){}
	MessagingException(String o0, SQLException o1){}
	MessagingException(String o0, IOException o1){}
}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class CallableStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass execute(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setBigDecimal(int o0, BigDecimal o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getBigDecimal(int o0){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass wasNull(){ return null; }
	public MyHelperClass close(){ return null; }}

class MboxFile {

MboxFile(){}
	MboxFile(File o0, MyHelperClass o1){}
	public MyHelperClass getMessagePositions(){ return null; }
	public MyHelperClass purge(int[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class DBSubset {

DBSubset(){}
	DBSubset(MyHelperClass o0, String o1, String o2, int o3){}
	public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass getInt(int o0, int o1){ return null; }
	public MyHelperClass getString(int o0, int o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class FolderClosedException extends Exception{
	public FolderClosedException(String errorMessage) { super(errorMessage); }
	FolderClosedException(c7300257 o0, String o1){}
	FolderClosedException(){}
}
