import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7300264 {
public MyHelperClass getPartsBoundary(MimeMessage o0){ return null; }
public MyHelperClass JDCConnection;
	public MyHelperClass iOpenMode;
	public MyHelperClass MimeUtility;
	public MyHelperClass DebugFile;
	public MyHelperClass MODE_MBOX;
	public MyHelperClass Types;
	public MyHelperClass oConn;
	public MyHelperClass Gadgets;
	public MyHelperClass MODE_BLOB;
	public MyHelperClass getStore(){ return null; }

    private void saveMimeParts(MimeMessage oMsg, String sMsgCharSeq, String sBoundary, String sMsgGuid, String sMsgId, int iPgMessage, int iOffset) throws Throwable, MessagingException, OutOfMemoryError {
        MyHelperClass DebugFile = new MyHelperClass();
        if ((boolean)(Object)DebugFile.trace) {
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.writeln("Begin DBFolder.saveMimeParts([Connection], [MimeMessage], " + sBoundary + ", " + sMsgGuid + "," + sMsgId + ", " + String.valueOf(iPgMessage) + ", " + String.valueOf(iOffset) + ", [Properties])");
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.incIdent();
        }
        PreparedStatement oStmt = null;
        Blob oContentTxt;
        ByteArrayOutputStream byOutPart;
        int iPrevPart = 0, iThisPart = 0, iNextPart = 0, iPartStart = 0;
        try {
            MimeMultipart oParts = (MimeMultipart)(MimeMultipart)(Object) oMsg.getContent();
            final int iParts =(int)(Object) oParts.getCount();
//            MyHelperClass DebugFile = new MyHelperClass();
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("message has " + String.valueOf(iParts) + " parts");
            if (iParts > 0) {
                MyHelperClass iOpenMode = new MyHelperClass();
                if (sMsgCharSeq != null && sBoundary != null && (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0)) {
                    iPrevPart = sMsgCharSeq.indexOf(sBoundary, iPrevPart);
                    if (iPrevPart > 0) {
                        iPrevPart += sBoundary.length();
//                        MyHelperClass DebugFile = new MyHelperClass();
                        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("found message boundary token at " + String.valueOf(iPrevPart));
                    }
                }
                MyHelperClass DB = new MyHelperClass();
                String sSQL = "INSERT INTO " + DB.k_mime_parts + "(gu_mimemsg,id_message,pg_message,nu_offset,id_part,id_content,id_type,id_disposition,len_part,de_part,tx_md5,file_name,by_content) VALUES ('" + sMsgGuid + "',?,?,?,?,?,?,?,?,?,NULL,?,?)";
//                MyHelperClass DebugFile = new MyHelperClass();
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Connection.prepareStatement(" + sSQL + ")");
                MyHelperClass oConn = new MyHelperClass();
                oStmt =(PreparedStatement)(Object) oConn.prepareStatement(sSQL);
                for (int p = 0; p < iParts; p++) {
//                    MyHelperClass DebugFile = new MyHelperClass();
                    if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("processing part " + String.valueOf(p));
                    BodyPart oPart =(BodyPart)(Object) oParts.getBodyPart(p);
                    byOutPart = new ByteArrayOutputStream((int)(Object)oPart.getSize() > 0 ? oPart.getSize() : 131072);
                    oPart.writeTo(byOutPart);
                    if (sMsgCharSeq != null && sBoundary != null && iPrevPart > 0) {
                        iThisPart = sMsgCharSeq.indexOf(sBoundary, iPrevPart);
                        if (iThisPart > 0) {
//                            MyHelperClass DebugFile = new MyHelperClass();
                            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("found part " + String.valueOf(p + iOffset) + " boundary at " + String.valueOf(iThisPart));
                            iPartStart = iThisPart + sBoundary.length();
                            while (iPartStart < sMsgCharSeq.length()) {
                                if (sMsgCharSeq.charAt(iPartStart) != ' ' && sMsgCharSeq.charAt(iPartStart) != '\r' && sMsgCharSeq.charAt(iPartStart) != '\n' && sMsgCharSeq.charAt(iPartStart) != '\t') break; else iPartStart++;
                            }
                        }
                        iNextPart = sMsgCharSeq.indexOf(sBoundary, iPartStart);
                        if (iNextPart < 0) {
//                            MyHelperClass DebugFile = new MyHelperClass();
                            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("no next part found");
                            iNextPart = sMsgCharSeq.length();
                        } else {
//                            MyHelperClass DebugFile = new MyHelperClass();
                            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("next part boundary found at " + String.valueOf(iNextPart));
                        }
                    }
                    String sContentType =(String)(Object) oPart.getContentType();
                    MyHelperClass MimeUtility = new MyHelperClass();
                    if (sContentType != null) sContentType =(String)(Object) MimeUtility.decodeText(sContentType);
                    boolean bForwardedAttachment = false;
                    if ((null != sContentType) && (null != ((DBStore)(DBStore)(Object) getStore()).getSession())) {
                        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Part Content-Type: " + sContentType.replace('\r', ' ').replace('\n', ' '));
                        if (sContentType.toUpperCase().startsWith("MULTIPART/ALTERNATIVE") || sContentType.toUpperCase().startsWith("MULTIPART/RELATED") || sContentType.toUpperCase().startsWith("MULTIPART/SIGNED")) {
                            try {
                                ByteArrayInputStream byInStrm = new ByteArrayInputStream(byOutPart.toByteArray());
                                MimeMessage oForwarded = new MimeMessage(((DBStore)(DBStore)(Object) getStore()).getSession(), byInStrm);
                                saveMimeParts(oForwarded, sMsgCharSeq,(String)(Object) getPartsBoundary(oForwarded), sMsgGuid, sMsgId, iPgMessage, iOffset + iParts);
                                byInStrm.close();
                                byInStrm = null;
                                bForwardedAttachment = true;
                            } catch (Exception e) {
                                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln(e.getClass().getName() + " " + e.getMessage());
                            }
                        }
                    }
                    if (!bForwardedAttachment) {
                        oStmt.setString(1, sMsgId);
                        oStmt.setBigDecimal(2, new BigDecimal(iPgMessage));
                        if ((iPartStart > 0) && (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0)) oStmt.setBigDecimal(3, new BigDecimal(iPartStart)); else oStmt.setNull(3, oConn.getDataBaseProduct() == JDCConnection.DBMS_ORACLE ? Types.NUMERIC : Types.DECIMAL);
                        oStmt.setInt(4, p + iOffset);
                        oStmt.setString(5,(String)(Object) ((MimeBodyPart)(MimeBodyPart)(Object) oPart).getContentID());
                        oStmt.setString(6,(String)(Object) Gadgets.left(sContentType, 254));
                        oStmt.setString(7,(String)(Object) Gadgets.left((String)(Object)oPart.getDisposition(), 100));
                        if (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0) oStmt.setInt(8, iNextPart - iPartStart); else oStmt.setInt(8,(int)(Object) oPart.getSize() > 0 ? oPart.getSize() : byOutPart.size());
                        if (oPart.getDescription() != null) oStmt.setString(9,(String)(Object) Gadgets.left((String)(Object)MimeUtility.decodeText((String)(Object)oPart.getDescription()), 254)); else oStmt.setNull(9, Types.VARCHAR);
                        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("file name is " + oPart.getFileName());
                        if (oPart.getFileName() != null) oStmt.setString(10,(String)(Object) Gadgets.left((String)(Object)MimeUtility.decodeText((String)(Object)oPart.getFileName()), 254)); else oStmt.setNull(10, Types.VARCHAR);
                        if (((int)(Object)iOpenMode & (int)(Object)MODE_BLOB) != 0) oStmt.setBinaryStream(11, new ByteArrayInputStream(byOutPart.toByteArray()), byOutPart.size()); else oStmt.setNull(11, Types.LONGVARBINARY);
                        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("PreparedStatement.executeUpdate()");
                        oStmt.executeUpdate();
                    }
                    byOutPart.close();
                    byOutPart = null;
                    oContentTxt = null;
                    if (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0) iPrevPart = iNextPart;
                }
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("PreparedStatement.close()");
                oStmt.close();
            }
        } catch (SQLException e) {
            if ((boolean)(Object)DebugFile.trace) {
                DebugFile.writeln("SQLException " + e.getMessage());
                DebugFile.decIdent();
            }
            if (null != oStmt) {
                try {
                    oStmt.close();
                } catch (Exception ignore) {
                }
            }
            try {
                if (null != oConn) oConn.rollback();
            } catch (Exception ignore) {
            }
            throw new MessagingException(e.getMessage(), e);
        } catch (IOException e) {
            if ((boolean)(Object)DebugFile.trace) {
                DebugFile.writeln("IOException " + e.getMessage());
                DebugFile.decIdent();
            }
            if (null != oStmt) {
                try {
                    oStmt.close();
                } catch (Exception ignore) {
                }
            }
            throw new MessagingException(e.getMessage(),(SQLException)(Object) e);
        } catch (Exception e) {
            if ((boolean)(Object)DebugFile.trace) {
                DebugFile.writeln(e.getClass().getName() + " " + e.getMessage());
                DebugFile.decIdent();
            }
            if (null != oStmt) {
                try {
                    oStmt.close();
                } catch (Exception ignore) {
                }
            }
            throw new MessagingException(e.getMessage(),(SQLException)(Object) e);
        }
        if ((boolean)(Object)DebugFile.trace) {
            DebugFile.decIdent();
            DebugFile.writeln("End DBFolder.saveMimeParts()");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass trace;
	public MyHelperClass k_mime_parts;
	public MyHelperClass NUMERIC;
	public MyHelperClass VARCHAR;
	public MyHelperClass DECIMAL;
	public MyHelperClass DBMS_ORACLE;
	public MyHelperClass LONGVARBINARY;
public MyHelperClass decodeText(String o0){ return null; }
	public MyHelperClass left(String o0, int o1){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass incIdent(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass decIdent(){ return null; }
	public MyHelperClass writeln(String o0){ return null; }
	public MyHelperClass getDataBaseProduct(){ return null; }}

class MimeMessage {

MimeMessage(){}
	MimeMessage(MyHelperClass o0, ByteArrayInputStream o1){}
	public MyHelperClass getContent(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(String o0, SQLException o1){}
	MessagingException(){}
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setBinaryStream(int o0, ByteArrayInputStream o1, int o2){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setBigDecimal(int o0, BigDecimal o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class Blob {

}

class MimeMultipart {

public MyHelperClass getCount(){ return null; }
	public MyHelperClass getBodyPart(int o0){ return null; }}

class BodyPart {

public MyHelperClass writeTo(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass getDisposition(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getDescription(){ return null; }}

class DBStore {

public MyHelperClass getSession(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class MimeBodyPart {

public MyHelperClass getContentID(){ return null; }}
