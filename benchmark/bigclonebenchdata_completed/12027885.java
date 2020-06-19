
import java.io.UncheckedIOException;


class c12027885 {
public MyHelperClass DB;
	public MyHelperClass DebugFile;
	public MyHelperClass ResultSet;
	public MyHelperClass getParent(){ return null; }

    public void removeBodyPart(int iPart) throws MessagingException, ArrayIndexOutOfBoundsException {
        MyHelperClass DebugFile = new MyHelperClass();
        if ((boolean)(Object)DebugFile.trace) {
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.writeln("Begin DBMimeMultipart.removeBodyPart(" + String.valueOf(iPart) + ")");
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.incIdent();
        }
        DBMimeMessage oMsg = (DBMimeMessage)(DBMimeMessage)(Object) getParent();
        DBFolder oFldr = ((DBFolder)(DBFolder)(Object) oMsg.getFolder());
        Statement oStmt = null;
        ResultSet oRSet = null;
        String sDisposition = null, sFileName = null;
        boolean bFound;
        try {
            oStmt =(Statement)(Object) oFldr.getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Statement.executeQuery(SELECT " + DB.id_disposition + "," + DB.file_name + " FROM " + DB.k_mime_parts + " WHERE " + DB.gu_mimemsg + "='" + oMsg.getMessageGuid() + "' AND " + DB.id_part + "=" + String.valueOf(iPart) + ")");
            oRSet =(ResultSet)(Object) oStmt.executeQuery("SELECT " + DB.id_disposition + "," + DB.file_name + " FROM " + DB.k_mime_parts + " WHERE " + DB.gu_mimemsg + "='" + oMsg.getMessageGuid() + "' AND " + DB.id_part + "=" + String.valueOf(iPart));
            bFound =(boolean)(Object) oRSet.next();
            if (bFound) {
                sDisposition =(String)(Object) oRSet.getString(1);
                if ((boolean)(Object)oRSet.wasNull()) sDisposition = "inline";
                sFileName =(String)(Object) oRSet.getString(2);
            }
            oRSet.close();
            oRSet = null;
            oStmt.close();
            oStmt = null;
            if (!bFound) {
                if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                throw new MessagingException("Part not found");
            }
            if (!sDisposition.equals("reference") && !sDisposition.equals("pointer")) {
                if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                throw new MessagingException("Only parts with reference or pointer disposition can be removed from a message");
            } else {
                if (sDisposition.equals("reference")) {
                    try {
                        File oRef = new File(sFileName);
                        if ((boolean)(Object)oRef.exists()) oRef.delete();
                    } catch (SecurityException se) {
                        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("SecurityException " + sFileName + " " + se.getMessage());
                        if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                        throw new MessagingException("SecurityException " + sFileName + " " + se.getMessage(), se);
                    }
                }
                oStmt =(Statement)(Object) oFldr.getConnection().createStatement();
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Statement.executeUpdate(DELETE FROM " + DB.k_mime_parts + " WHERE " + DB.gu_mimemsg + "='" + oMsg.getMessageGuid() + "' AND " + DB.id_part + "=" + String.valueOf(iPart) + ")");
                oStmt.executeUpdate("DELETE FROM " + DB.k_mime_parts + " WHERE " + DB.gu_mimemsg + "='" + oMsg.getMessageGuid() + "' AND " + DB.id_part + "=" + String.valueOf(iPart));
                oStmt.close();
                oStmt = null;
                oFldr.getConnection().commit();
            }
        } catch (UncheckedIOException sqle) {
            if (oRSet != null) {
                try {
                    oRSet.close();
                } catch (Exception ignore) {
                }
            }
            if (oStmt != null) {
                try {
                    oStmt.close();
                } catch (Exception ignore) {
                }
            }
            try {
                oFldr.getConnection().rollback();
            } catch (Exception ignore) {
            }
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new MessagingException(sqle.getMessage(),(SecurityException)(Object) sqle);
        }
        if ((boolean)(Object)DebugFile.trace) {
            DebugFile.decIdent();
            DebugFile.writeln("End DBMimeMultipart.removeBodyPart()");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass file_name;
	public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass id_disposition;
	public MyHelperClass id_part;
	public MyHelperClass TYPE_FORWARD_ONLY;
	public MyHelperClass gu_mimemsg;
	public MyHelperClass trace;
	public MyHelperClass k_mime_parts;
public MyHelperClass decIdent(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass writeln(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass incIdent(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(){}
	MessagingException(String o0, SecurityException o1){}
	MessagingException(String o0, SQLException o1){}
}

class DBMimeMessage {

public MyHelperClass getFolder(){ return null; }
	public MyHelperClass getMessageGuid(){ return null; }}

class DBFolder {

public MyHelperClass getConnection(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass wasNull(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
