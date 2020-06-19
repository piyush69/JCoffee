import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7300267 {
public MyHelperClass getCategory(){ return null; }
public MyHelperClass ResultSet;
	public MyHelperClass saveMimeParts(MimeMessage o0, String o1, String o2, String o3, String o4, int o5, int o6){ return null; }
public MyHelperClass sFolderDir;
	public MyHelperClass JDCConnection;
public MyHelperClass MboxFile;
	public MyHelperClass oCatg;
	public MyHelperClass Types;
	public MyHelperClass oConn;
	public MyHelperClass getFile(){ return null; }
public MyHelperClass RecipientType;
	public MyHelperClass getPartsBoundary(MimeMessage o0){ return null; }
public MyHelperClass READ_WRITE;
	public MyHelperClass iOpenMode;
	public MyHelperClass MimeUtility;
	public MyHelperClass DebugFile;
	public MyHelperClass DB;
	public MyHelperClass MODE_MBOX;
	public MyHelperClass Gadgets;
	public MyHelperClass MODE_BLOB;
	public MyHelperClass getNextMessage(){ return null; }
	public MyHelperClass getStore(){ return null; }

    public void appendMessage(MimeMessage oMsg) throws Throwable, FolderClosedException, StoreClosedException, MessagingException {
        MyHelperClass DebugFile = new MyHelperClass();
        if ((boolean)(Object)DebugFile.trace) {
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.writeln("Begin DBFolder.appendMessage()");
//            MyHelperClass DebugFile = new MyHelperClass();
            DebugFile.incIdent();
        }
        final String EmptyString = "";
        if (!(Boolean)(Object)((DBStore)(DBStore)(Object) getStore()).isConnected()) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new StoreClosedException(getStore(), "Store is not connected");
        }
        if (0 == ((int)(Object)iOpenMode & (int)(Object)READ_WRITE)) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new FolderClosedException(this, "Folder is not open is READ_WRITE mode");
        }
        if ((0 == ((int)(Object)iOpenMode & (int)(Object)MODE_MBOX)) && (0 == ((int)(Object)iOpenMode & (int)(Object)MODE_BLOB))) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new FolderClosedException(this, "Folder is not open in MBOX nor BLOB mode");
        }
        String gu_mimemsg;
        if (oMsg.getClass().getName().equals("com.knowgate.hipermail.DBMimeMessage")) {
            gu_mimemsg =(String)(Object) ((DBMimeMessage)(DBMimeMessage)(Object) oMsg).getMessageGuid();
            if (((DBMimeMessage)(DBMimeMessage)(Object) oMsg).getFolder() == null) ((DBMimeMessage)(DBMimeMessage)(Object) oMsg).setFolder(this);
        } else {
            gu_mimemsg =(String)(Object) Gadgets.generateUUID();
        }
        String gu_workarea =(String)(Object) ((DBStore)(DBStore)(Object) getStore()).getUser().getString(DB.gu_workarea);
        int iSize =(int)(Object) oMsg.getSize();
        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("MimeMessage.getSize() = " + String.valueOf(iSize));
        String sContentType, sContentID, sMessageID, sDisposition, sContentMD5, sDescription, sFileName, sEncoding, sSubject, sPriority, sMsgCharSeq;
        long lPosition = -1;
        try {
            sMessageID =(String)(Object) oMsg.getMessageID();
            if (sMessageID == null || EmptyString.equals(sMessageID)) {
                try {
                    sMessageID =(String)(Object) oMsg.getHeader("X-Qmail-Scanner-Message-ID", null);
                } catch (Exception ignore) {
                }
            }
            if (sMessageID != null) sMessageID =(String)(Object) MimeUtility.decodeText(sMessageID);
            sContentType =(String)(Object) oMsg.getContentType();
            if (sContentType != null) sContentType =(String)(Object) MimeUtility.decodeText(sContentType);
            sContentID =(String)(Object) oMsg.getContentID();
            if (sContentID != null) sContentID =(String)(Object) MimeUtility.decodeText(sContentID);
            sDisposition =(String)(Object) oMsg.getDisposition();
            if (sDisposition != null) sDisposition =(String)(Object) MimeUtility.decodeText(sDisposition);
            sContentMD5 =(String)(Object) oMsg.getContentMD5();
            if (sContentMD5 != null) sContentMD5 =(String)(Object) MimeUtility.decodeText(sContentMD5);
            sDescription =(String)(Object) oMsg.getDescription();
            if (sDescription != null) sDescription =(String)(Object) MimeUtility.decodeText(sDescription);
            sFileName =(String)(Object) oMsg.getFileName();
            if (sFileName != null) sFileName =(String)(Object) MimeUtility.decodeText(sFileName);
            sEncoding =(String)(Object) oMsg.getEncoding();
            if (sEncoding != null) sEncoding =(String)(Object) MimeUtility.decodeText(sEncoding);
            sSubject =(String)(Object) oMsg.getSubject();
            if (sSubject != null) sSubject =(String)(Object) MimeUtility.decodeText(sSubject);
            sPriority = null;
            sMsgCharSeq = null;
        } catch (UnsupportedEncodingException uee) {
            throw new MessagingException(uee.getMessage(), uee);
        }
        BigDecimal dPgMessage = null;
        try {
            dPgMessage =(BigDecimal)(Object) getNextMessage();
        } catch (SQLException sqle) {
            throw new MessagingException(sqle.getMessage(), sqle);
        }
        String sBoundary =(String)(Object) getPartsBoundary(oMsg);
        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("part boundary is \"" + (sBoundary == null ? "null" : sBoundary) + "\"");
        if (sMessageID == null) sMessageID = gu_mimemsg; else if (sMessageID.length() == 0) sMessageID = gu_mimemsg;
        Timestamp tsSent;
        if (oMsg.getSentDate() != null) tsSent = new Timestamp((long)(Object)oMsg.getSentDate().getTime()); else tsSent = null;
        Timestamp tsReceived;
        if (oMsg.getReceivedDate() != null) tsReceived = new Timestamp((long)(Object)oMsg.getReceivedDate().getTime()); else tsReceived = new Timestamp(new java.util.Date().getTime());
        try {
            String sXPriority =(String)(Object) oMsg.getHeader("X-Priority", null);
            if (sXPriority == null) sPriority = null; else {
                sPriority = "";
                for (int x = 0; x < sXPriority.length(); x++) {
                    char cAt = sXPriority.charAt(x);
                    if (cAt >= (char) 48 || cAt <= (char) 57) sPriority += cAt;
                }
                sPriority =(String)(Object) Gadgets.left(sPriority, 10);
            }
        } catch (MessagingException msge) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("MessagingException " + msge.getMessage());
        }
        boolean bIsSpam = false;
        try {
            String sXSpam =(String)(Object) oMsg.getHeader("X-Spam-Flag", null);
            if (sXSpam != null) bIsSpam = (sXSpam.toUpperCase().indexOf("YES") >= 0 || sXSpam.toUpperCase().indexOf("TRUE") >= 0 || sXSpam.indexOf("1") >= 0);
        } catch (MessagingException msge) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("MessagingException " + msge.getMessage());
        }
        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("MimeMessage.getFrom()");
        Address[] aFrom = null;
        try {
            aFrom =(Address[])(Object) oMsg.getFrom();
        } catch (AddressException adre) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("From AddressException " + adre.getMessage());
        }
        InternetAddress oFrom;
        if (aFrom != null) {
            if (aFrom.length > 0) oFrom = (InternetAddress)(InternetAddress)(Object) aFrom[0]; else oFrom = null;
        } else oFrom = null;
        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("MimeMessage.getReplyTo()");
        Address[] aReply = null;
        InternetAddress oReply;
        try {
            aReply =(Address[])(Object) oMsg.getReplyTo();
        } catch (AddressException adre) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Reply-To AddressException " + adre.getMessage());
        }
        if (aReply != null) {
            if (aReply.length > 0) oReply = (InternetAddress)(InternetAddress)(Object) aReply[0]; else oReply = null;
        } else {
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("no reply-to address found");
            oReply = null;
        }
        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("MimeMessage.getRecipients()");
        Address[] oTo = null;
        Address[] oCC = null;
        Address[] oBCC = null;
        try {
            oTo =(Address[])(Object) oMsg.getRecipients(RecipientType.TO);
            oCC =(Address[])(Object) oMsg.getRecipients(RecipientType.CC);
            oBCC =(Address[])(Object) oMsg.getRecipients(RecipientType.BCC);
        } catch (AddressException adre) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Recipient AddressException " + adre.getMessage());
        }
        Properties pFrom = new Properties(), pTo = new Properties(), pCC = new Properties(), pBCC = new Properties();
        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("MimeMessage.getFlags()");
        Flags oFlgs =(Flags)(Object) oMsg.getFlags();
        if (oFlgs == null) oFlgs = new Flags();
        MimePart oText = null;
        ByteArrayOutputStream byOutStrm = null;
        File oFile = null;
        MboxFile oMBox = null;
        if (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0) {
            try {
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("new File(" + Gadgets.chomp(sFolderDir, File.separator) + oCatg.getStringNull(DB.nm_category, "null") + ".mbox)");
                oFile =(File)(Object) getFile();
                lPosition = oFile.length();
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("message position is " + String.valueOf(lPosition));
                oMBox = new MboxFile(oFile, MboxFile.READ_WRITE);
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("new ByteArrayOutputStream(" + String.valueOf(iSize > 0 ? iSize : 16000) + ")");
                byOutStrm = new ByteArrayOutputStream(iSize > 0 ? iSize : 16000);
                oMsg.writeTo(byOutStrm);
                sMsgCharSeq = byOutStrm.toString("ISO8859_1");
                byOutStrm.close();
            } catch (IOException ioe) {
                try {
                    if (oMBox != null) oMBox.close();
                } catch (Exception ignore) {
                }
                if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
                throw new MessagingException(ioe.getMessage(),(UnsupportedEncodingException)(Object) ioe);
            }
        }
        try {
            if (oMsg.getClass().getName().equals("com.knowgate.hipermail.DBMimeMessage")) oText =(MimePart)(Object) ((DBMimeMessage)(DBMimeMessage)(Object) oMsg).getBody(); else {
                oText = (MimePart)(Object)new DBMimeMessage(oMsg).getBody();
            }
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("ByteArrayOutputStream byOutStrm = new ByteArrayOutputStream(" + oText.getSize() + ")");
            byOutStrm = new ByteArrayOutputStream((int)(Object)oText.getSize() > 0 ? oText.getSize() : 8192);
            oText.writeTo(byOutStrm);
            if (null == sContentMD5) {
                MD5 oMd5 = new MD5();
                oMd5.Init();
                oMd5.Update(byOutStrm.toByteArray());
                sContentMD5 =(String)(Object) Gadgets.toHexString(oMd5.Final());
                oMd5 = null;
            }
        } catch (IOException ioe) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new MessagingException("IOException " + ioe.getMessage(),(UnsupportedEncodingException)(Object) ioe);
        } catch (OutOfMemoryError oom) {
            if ((boolean)(Object)DebugFile.trace) DebugFile.decIdent();
            throw new MessagingException("OutOfMemoryError " + oom.getMessage());
        }
        String sSQL = "INSERT INTO " + DB.k_mime_msgs + "(gu_mimemsg,gu_workarea,gu_category,id_type,id_content,id_message,id_disposition,len_mimemsg,tx_md5,de_mimemsg,file_name,tx_encoding,tx_subject,dt_sent,dt_received,tx_email_from,nm_from,tx_email_reply,nm_to,id_priority,bo_answered,bo_deleted,bo_draft,bo_flagged,bo_recent,bo_seen,bo_spam,pg_message,nu_position,by_content) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Connection.prepareStatement(" + sSQL + ")");
        PreparedStatement oStmt = null;
        try {
            oStmt =(PreparedStatement)(Object) oConn.prepareStatement(sSQL);
            oStmt.setString(1, gu_mimemsg);
            oStmt.setString(2, gu_workarea);
            if ((boolean)(Object)oCatg.isNull(DB.gu_category)) oStmt.setNull(3, Types.CHAR); else oStmt.setString(3, oCatg.getString(DB.gu_category));
            oStmt.setString(4, Gadgets.left(sContentType, 254));
            oStmt.setString(5, Gadgets.left(sContentID, 254));
            oStmt.setString(6, Gadgets.left(sMessageID, 254));
            oStmt.setString(7, Gadgets.left(sDisposition, 100));
            if (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0) {
                iSize = sMsgCharSeq.length();
                oStmt.setInt(8, iSize);
            } else {
                if (iSize >= 0) oStmt.setInt(8, iSize); else oStmt.setNull(8, Types.INTEGER);
            }
            oStmt.setString(9, Gadgets.left(sContentMD5, 32));
            oStmt.setString(10, Gadgets.left(sDescription, 254));
            oStmt.setString(11, Gadgets.left(sFileName, 254));
            oStmt.setString(12, Gadgets.left(sEncoding, 16));
            oStmt.setString(13, Gadgets.left(sSubject, 254));
            oStmt.setTimestamp(14, tsSent);
            oStmt.setTimestamp(15, tsReceived);
            if (null == oFrom) {
                oStmt.setNull(16, Types.VARCHAR);
                oStmt.setNull(17, Types.VARCHAR);
            } else {
                oStmt.setString(16, Gadgets.left((String)(Object)oFrom.getAddress(), 254));
                oStmt.setString(17, Gadgets.left((String)(Object)oFrom.getPersonal(), 254));
            }
            if (null == oReply) oStmt.setNull(18, Types.VARCHAR); else oStmt.setString(18, Gadgets.left((String)(Object)oReply.getAddress(), 254));
            Address[] aRecipients;
            String sRecipientName;
            aRecipients =(Address[])(Object) oMsg.getRecipients(MimeMessage.RecipientType.TO);
            if (null != aRecipients) if (aRecipients.length == 0) aRecipients = null;
            if (null != aRecipients) {
                sRecipientName =(String)(Object) ((InternetAddress)(InternetAddress)(Object) aRecipients[0]).getPersonal();
                if (null == sRecipientName) sRecipientName =(String)(Object) ((InternetAddress)(InternetAddress)(Object) aRecipients[0]).getAddress();
                oStmt.setString(19, Gadgets.left(sRecipientName, 254));
            } else {
                aRecipients =(Address[])(Object) oMsg.getRecipients(MimeMessage.RecipientType.CC);
                if (null != aRecipients) {
                    if (aRecipients.length > 0) {
                        sRecipientName =(String)(Object) ((InternetAddress)(InternetAddress)(Object) aRecipients[0]).getPersonal();
                        if (null == sRecipientName) sRecipientName =(String)(Object) ((InternetAddress)(InternetAddress)(Object) aRecipients[0]).getAddress();
                        oStmt.setString(19, Gadgets.left(sRecipientName, 254));
                    } else oStmt.setNull(19, Types.VARCHAR);
                } else {
                    aRecipients =(Address[])(Object) oMsg.getRecipients(MimeMessage.RecipientType.BCC);
                    if (null != aRecipients) {
                        if (aRecipients.length > 0) {
                            sRecipientName =(String)(Object) ((InternetAddress)(InternetAddress)(Object) aRecipients[0]).getPersonal();
                            if (null == sRecipientName) sRecipientName =(String)(Object) ((InternetAddress)(InternetAddress)(Object) aRecipients[0]).getAddress();
                            oStmt.setString(19, Gadgets.left(sRecipientName, 254));
                        } else oStmt.setNull(19, Types.VARCHAR);
                    } else {
                        oStmt.setNull(19, Types.VARCHAR);
                    }
                }
            }
            if (null == sPriority) oStmt.setNull(20, Types.VARCHAR); else oStmt.setString(20, sPriority);
            if (oConn.getDataBaseProduct() == JDCConnection.DBMS_ORACLE) {
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("PreparedStatement.setBigDecimal(21, ...)");
                oStmt.setBigDecimal(21, new BigDecimal((boolean)(Object)oFlgs.contains(Flags.Flag.ANSWERED) ? "1" : "0"));
                oStmt.setBigDecimal(22, new BigDecimal((boolean)(Object)oFlgs.contains(Flags.Flag.DELETED) ? "1" : "0"));
                oStmt.setBigDecimal(23, new BigDecimal(0));
                oStmt.setBigDecimal(24, new BigDecimal((boolean)(Object)oFlgs.contains(Flags.Flag.FLAGGED) ? "1" : "0"));
                oStmt.setBigDecimal(25, new BigDecimal((boolean)(Object)oFlgs.contains(Flags.Flag.RECENT) ? "1" : "0"));
                oStmt.setBigDecimal(26, new BigDecimal((boolean)(Object)oFlgs.contains(Flags.Flag.SEEN) ? "1" : "0"));
                oStmt.setBigDecimal(27, new BigDecimal(bIsSpam ? "1" : "0"));
                oStmt.setBigDecimal(28, dPgMessage);
                if (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0) oStmt.setBigDecimal(29, new BigDecimal(lPosition)); else oStmt.setNull(29, Types.NUMERIC);
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("PreparedStatement.setBinaryStream(30, new ByteArrayInputStream(" + String.valueOf(byOutStrm.size()) + "))");
                if (byOutStrm.size() > 0) oStmt.setBinaryStream(30, new ByteArrayInputStream(byOutStrm.toByteArray()), byOutStrm.size()); else oStmt.setNull(30, Types.LONGVARBINARY);
            } else {
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("PreparedStatement.setShort(21, ...)");
                oStmt.setShort(21, (short) ((boolean)(Object)oFlgs.contains(Flags.Flag.ANSWERED) ? 1 : 0));
                oStmt.setShort(22, (short) ((boolean)(Object)oFlgs.contains(Flags.Flag.DELETED) ? 1 : 0));
                oStmt.setShort(23, (short) (0));
                oStmt.setShort(24, (short) ((boolean)(Object)oFlgs.contains(Flags.Flag.FLAGGED) ? 1 : 0));
                oStmt.setShort(25, (short) ((boolean)(Object)oFlgs.contains(Flags.Flag.RECENT) ? 1 : 0));
                oStmt.setShort(26, (short) ((boolean)(Object)oFlgs.contains(Flags.Flag.SEEN) ? 1 : 0));
                oStmt.setShort(27, (short) (bIsSpam ? 1 : 0));
                oStmt.setBigDecimal(28, dPgMessage);
                if (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0) oStmt.setBigDecimal(29, new BigDecimal(lPosition)); else oStmt.setNull(29, Types.NUMERIC);
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("PreparedStatement.setBinaryStream(30, new ByteArrayInputStream(" + String.valueOf(byOutStrm.size()) + "))");
                if (byOutStrm.size() > 0) oStmt.setBinaryStream(30, new ByteArrayInputStream(byOutStrm.toByteArray()), byOutStrm.size()); else oStmt.setNull(30, Types.LONGVARBINARY);
            }
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Statement.executeUpdate()");
            oStmt.executeUpdate();
            oStmt.close();
            oStmt = null;
        } catch (SQLException sqle) {
            try {
                if (oMBox != null) oMBox.close();
            } catch (Exception ignore) {
            }
            try {
                if (null != oStmt) oStmt.close();
                oStmt = null;
            } catch (Exception ignore) {
            }
            try {
                if (null != oConn) oConn.rollback();
            } catch (Exception ignore) {
            }
            throw new MessagingException(DB.k_mime_msgs + " " + sqle.getMessage(), sqle);
        }
        if (((int)(Object)iOpenMode & (int)(Object)MODE_BLOB) != 0) {
            try {
                byOutStrm.close();
            } catch (IOException ignore) {
            }
            byOutStrm = null;
        }
        try {
            Object oContent = oMsg.getContent();
            if (oContent instanceof MimeMultipart) {
                try {
                    saveMimeParts(oMsg, sMsgCharSeq, sBoundary, gu_mimemsg, sMessageID, dPgMessage.intValue(), 0);
                } catch (MessagingException msge) {
                    try {
                        if (oMBox != null) oMBox.close();
                    } catch (Exception ignore) {
                    }
                    try {
                        oConn.rollback();
                    } catch (Exception ignore) {
                    }
                    throw new MessagingException(msge.getMessage(), msge.getNextException());
                }
            }
        } catch (Exception xcpt) {
            try {
                if (oMBox != null) oMBox.close();
            } catch (Exception ignore) {
            }
            try {
                oConn.rollback();
            } catch (Exception ignore) {
            }
            throw new MessagingException("MimeMessage.getContent() " + xcpt.getMessage(),(UnsupportedEncodingException)(Object) xcpt);
        }
        sSQL = "SELECT " + DB.gu_contact + "," + DB.gu_company + "," + DB.tx_name + "," + DB.tx_surname + "," + DB.tx_surname + " FROM " + DB.k_member_address + " WHERE " + DB.tx_email + "=? AND " + DB.gu_workarea + "=? UNION SELECT " + DB.gu_user + ",'****************************USER'," + DB.nm_user + "," + DB.tx_surname1 + "," + DB.tx_surname2 + " FROM " + DB.k_users + " WHERE (" + DB.tx_main_email + "=? OR " + DB.tx_alt_email + "=?) AND " + DB.gu_workarea + "=?";
        if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Connection.prepareStatement(" + sSQL + ")");
        PreparedStatement oAddr = null;
        try {
            oAddr =(PreparedStatement)(Object) oConn.prepareStatement(sSQL, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ResultSet oRSet;
            InternetAddress oInetAdr;
            String sTxEmail, sGuCompany, sGuContact, sGuUser, sTxName, sTxSurname1, sTxSurname2, sTxPersonal;
            if (oFrom != null) {
                oAddr.setString(1, oFrom.getAddress());
                oAddr.setString(2, gu_workarea);
                oAddr.setString(3, oFrom.getAddress());
                oAddr.setString(4, oFrom.getAddress());
                oAddr.setString(5, gu_workarea);
                oRSet =(ResultSet)(Object) oAddr.executeQuery();
                if ((boolean)(Object)oRSet.next()) {
                    sGuContact =(String)(Object) oRSet.getString(1);
                    if ((boolean)(Object)oRSet.wasNull()) sGuContact = "null";
                    sGuCompany =(String)(Object) oRSet.getString(2);
                    if ((boolean)(Object)oRSet.wasNull()) sGuCompany = "null";
                    if (sGuCompany.equals("****************************USER")) {
                        sTxName =(String)(Object) oRSet.getString(3);
                        if ((boolean)(Object)oRSet.wasNull()) sTxName = "";
                        sTxSurname1 =(String)(Object) oRSet.getString(4);
                        if ((boolean)(Object)oRSet.wasNull()) sTxSurname1 = "";
                        sTxSurname2 =(String)(Object) oRSet.getString(4);
                        if ((boolean)(Object)oRSet.wasNull()) sTxSurname2 = "";
                        sTxPersonal =(String)(Object) Gadgets.left(sTxName + " " + sTxSurname1 + " " + sTxSurname2, 254).replace(',', ' ').trim();
                    } else sTxPersonal = "null";
                    pFrom.put(oFrom.getAddress(), sGuContact + "," + sGuCompany + "," + sTxPersonal);
                } else pFrom.put(oFrom.getAddress(), "null,null,null");
                oRSet.close();
            }
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("from count = " + pFrom.size());
            if (oTo != null) {
                for (int t = 0; t < oTo.length; t++) {
                    oInetAdr = (InternetAddress)(InternetAddress)(Object) oTo[t];
                    sTxEmail =(String)(Object) Gadgets.left((String)(Object)oInetAdr.getAddress(), 254);
                    oAddr.setString(1, sTxEmail);
                    oAddr.setString(2, gu_workarea);
                    oAddr.setString(3, sTxEmail);
                    oAddr.setString(4, sTxEmail);
                    oAddr.setString(5, gu_workarea);
                    oRSet =(ResultSet)(Object) oAddr.executeQuery();
                    if ((boolean)(Object)oRSet.next()) {
                        sGuContact =(String)(Object) oRSet.getString(1);
                        if ((boolean)(Object)oRSet.wasNull()) sGuContact = "null";
                        sGuCompany =(String)(Object) oRSet.getString(2);
                        if ((boolean)(Object)oRSet.wasNull()) sGuCompany = "null";
                        if (sGuCompany.equals("****************************USER")) {
                            sTxName =(String)(Object) oRSet.getString(3);
                            if ((boolean)(Object)oRSet.wasNull()) sTxName = "";
                            sTxSurname1 =(String)(Object) oRSet.getString(4);
                            if ((boolean)(Object)oRSet.wasNull()) sTxSurname1 = "";
                            sTxSurname2 =(String)(Object) oRSet.getString(4);
                            if ((boolean)(Object)oRSet.wasNull()) sTxSurname2 = "";
                            sTxPersonal =(String)(Object) Gadgets.left(sTxName + " " + sTxSurname1 + " " + sTxSurname2, 254).replace(',', ' ').trim();
                        } else sTxPersonal = "null";
                        pTo.put(sTxEmail, sGuContact + "," + sGuCompany + "," + sTxPersonal);
                    } else pTo.put(sTxEmail, "null,null,null");
                    oRSet.close();
                }
            }
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("to count = " + pTo.size());
            if (oCC != null) {
                for (int c = 0; c < oCC.length; c++) {
                    oInetAdr = (InternetAddress)(InternetAddress)(Object) oCC[c];
                    sTxEmail =(String)(Object) Gadgets.left((String)(Object)oInetAdr.getAddress(), 254);
                    oAddr.setString(1, sTxEmail);
                    oAddr.setString(2, gu_workarea);
                    oAddr.setString(3, sTxEmail);
                    oAddr.setString(4, sTxEmail);
                    oAddr.setString(5, gu_workarea);
                    oRSet =(ResultSet)(Object) oAddr.executeQuery();
                    if ((boolean)(Object)oRSet.next()) {
                        sGuContact =(String)(Object) oRSet.getString(1);
                        if ((boolean)(Object)oRSet.wasNull()) sGuContact = "null";
                        sGuCompany =(String)(Object) oRSet.getString(2);
                        if ((boolean)(Object)oRSet.wasNull()) sGuCompany = "null";
                        if (sGuCompany.equals("****************************USER")) {
                            sTxName =(String)(Object) oRSet.getString(3);
                            if ((boolean)(Object)oRSet.wasNull()) sTxName = "";
                            sTxSurname1 =(String)(Object) oRSet.getString(4);
                            if ((boolean)(Object)oRSet.wasNull()) sTxSurname1 = "";
                            sTxSurname2 =(String)(Object) oRSet.getString(4);
                            if ((boolean)(Object)oRSet.wasNull()) sTxSurname2 = "";
                            sTxPersonal =(String)(Object) Gadgets.left(sTxName + " " + sTxSurname1 + " " + sTxSurname2, 254).replace(',', ' ').trim();
                        } else sTxPersonal = "null";
                        pCC.put(sTxEmail, sGuContact + "," + sGuCompany + "," + sTxPersonal);
                    } else pCC.put(sTxEmail, "null,null,null");
                    oRSet.close();
                }
            }
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("cc count = " + pCC.size());
            if (oBCC != null) {
                for (int b = 0; b < oBCC.length; b++) {
                    oInetAdr = (InternetAddress)(InternetAddress)(Object) oBCC[b];
                    sTxEmail =(String)(Object) Gadgets.left((String)(Object)oInetAdr.getAddress(), 254);
                    oAddr.setString(1, sTxEmail);
                    oAddr.setString(2, gu_workarea);
                    oAddr.setString(3, sTxEmail);
                    oAddr.setString(4, sTxEmail);
                    oAddr.setString(5, gu_workarea);
                    oRSet =(ResultSet)(Object) oAddr.executeQuery();
                    if ((boolean)(Object)oRSet.next()) {
                        sGuContact =(String)(Object) oRSet.getString(1);
                        if ((boolean)(Object)oRSet.wasNull()) sGuContact = "null";
                        sGuCompany =(String)(Object) oRSet.getString(2);
                        if ((boolean)(Object)oRSet.wasNull()) sGuCompany = "null";
                        if (sGuCompany.equals("****************************USER")) {
                            sTxName =(String)(Object) oRSet.getString(3);
                            if ((boolean)(Object)oRSet.wasNull()) sTxName = "";
                            sTxSurname1 =(String)(Object) oRSet.getString(4);
                            if ((boolean)(Object)oRSet.wasNull()) sTxSurname1 = "";
                            sTxSurname2 =(String)(Object) oRSet.getString(4);
                            if ((boolean)(Object)oRSet.wasNull()) sTxSurname2 = "";
                            sTxPersonal =(String)(Object) Gadgets.left(sTxName + " " + sTxSurname1 + " " + sTxSurname2, 254).replace(',', ' ').trim();
                        } else sTxPersonal = "null";
                        pBCC.put(sTxEmail, sGuContact + "," + sGuCompany);
                    } else pBCC.put(sTxEmail, "null,null,null");
                    oRSet.close();
                }
            }
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("bcc count = " + pBCC.size());
            oAddr.close();
            sSQL = "INSERT INTO " + DB.k_inet_addrs + " (gu_mimemsg,id_message,tx_email,tp_recipient,gu_user,gu_contact,gu_company,tx_personal) VALUES ('" + gu_mimemsg + "','" + sMessageID + "',?,?,?,?,?,?)";
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Connection.prepareStatement(" + sSQL + ")");
            oStmt =(PreparedStatement)(Object) oConn.prepareStatement(sSQL);
            java.util.Enumeration oMailEnum;
            String[] aRecipient;
            if (!pFrom.isEmpty()) {
                oMailEnum = pFrom.keys();
                while (oMailEnum.hasMoreElements()) {
                    sTxEmail = (String) oMailEnum.nextElement();
                    aRecipient =(String[])(Object) Gadgets.split(pFrom.getProperty(sTxEmail), ',');
                    oStmt.setString(1, sTxEmail);
                    oStmt.setString(2, "from");
                    if (aRecipient[0].equals("null") && aRecipient[1].equals("null")) {
                        oStmt.setNull(3, Types.CHAR);
                        oStmt.setNull(4, Types.CHAR);
                        oStmt.setNull(5, Types.CHAR);
                    } else if (aRecipient[1].equals("****************************USER")) {
                        oStmt.setString(3, aRecipient[0]);
                        oStmt.setNull(4, Types.CHAR);
                        oStmt.setNull(5, Types.CHAR);
                    } else {
                        oStmt.setNull(3, Types.CHAR);
                        oStmt.setString(4, aRecipient[0].equals("null") ? null : aRecipient[0]);
                        oStmt.setString(5, aRecipient[1].equals("null") ? null : aRecipient[1]);
                    }
                    if (aRecipient[2].equals("null")) oStmt.setNull(6, Types.VARCHAR); else oStmt.setString(6, aRecipient[2]);
                    if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Statement.executeUpdate()");
                    oStmt.executeUpdate();
                }
            }
            if (!pTo.isEmpty()) {
                oMailEnum = pTo.keys();
                while (oMailEnum.hasMoreElements()) {
                    sTxEmail = (String) oMailEnum.nextElement();
                    aRecipient =(String[])(Object) Gadgets.split(pTo.getProperty(sTxEmail), ',');
                    oStmt.setString(1, sTxEmail);
                    oStmt.setString(2, "to");
                    if (aRecipient[0].equals("null") && aRecipient[1].equals("null")) {
                        oStmt.setNull(3, Types.CHAR);
                        oStmt.setNull(4, Types.CHAR);
                        oStmt.setNull(5, Types.CHAR);
                    } else if (aRecipient[1].equals("****************************USER")) {
                        oStmt.setString(3, aRecipient[0]);
                        oStmt.setNull(4, Types.CHAR);
                        oStmt.setNull(5, Types.CHAR);
                    } else {
                        oStmt.setNull(3, Types.CHAR);
                        oStmt.setString(4, aRecipient[0].equals("null") ? null : aRecipient[0]);
                        oStmt.setString(5, aRecipient[1].equals("null") ? null : aRecipient[1]);
                    }
                    if (aRecipient[2].equals("null")) oStmt.setNull(6, Types.VARCHAR); else oStmt.setString(6, aRecipient[2]);
                    if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Statement.executeUpdate()");
                    oStmt.executeUpdate();
                }
            }
            if (!pCC.isEmpty()) {
                oMailEnum = pCC.keys();
                while (oMailEnum.hasMoreElements()) {
                    sTxEmail = (String) oMailEnum.nextElement();
                    aRecipient =(String[])(Object) Gadgets.split(pCC.getProperty(sTxEmail), ',');
                    oStmt.setString(1, sTxEmail);
                    oStmt.setString(2, "cc");
                    if (aRecipient[0].equals("null") && aRecipient[1].equals("null")) {
                        oStmt.setNull(3, Types.CHAR);
                        oStmt.setNull(4, Types.CHAR);
                        oStmt.setNull(5, Types.CHAR);
                    } else if (aRecipient[1].equals("****************************USER")) {
                        oStmt.setString(3, aRecipient[0]);
                        oStmt.setString(4, null);
                        oStmt.setString(5, null);
                    } else {
                        oStmt.setString(3, null);
                        oStmt.setString(4, aRecipient[0].equals("null") ? null : aRecipient[0]);
                        oStmt.setString(5, aRecipient[1].equals("null") ? null : aRecipient[1]);
                    }
                    if (aRecipient[2].equals("null")) oStmt.setNull(6, Types.VARCHAR); else oStmt.setString(6, aRecipient[2]);
                    if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Statement.executeUpdate()");
                    oStmt.executeUpdate();
                }
            }
            if (!pBCC.isEmpty()) {
                oMailEnum = pBCC.keys();
                while (oMailEnum.hasMoreElements()) {
                    sTxEmail = (String) oMailEnum.nextElement();
                    aRecipient =(String[])(Object) Gadgets.split(pBCC.getProperty(sTxEmail), ',');
                    oStmt.setString(1, sTxEmail);
                    oStmt.setString(2, "bcc");
                    if (aRecipient[0].equals("null") && aRecipient[1].equals("null")) {
                        oStmt.setNull(3, Types.CHAR);
                        oStmt.setNull(4, Types.CHAR);
                        oStmt.setNull(5, Types.CHAR);
                    } else if (aRecipient[1].equals("****************************USER")) {
                        oStmt.setString(3, aRecipient[0]);
                        oStmt.setNull(4, Types.CHAR);
                        oStmt.setNull(5, Types.CHAR);
                    } else {
                        oStmt.setNull(3, Types.CHAR);
                        oStmt.setString(4, aRecipient[0].equals("null") ? null : aRecipient[0]);
                        oStmt.setString(5, aRecipient[1].equals("null") ? null : aRecipient[1]);
                    }
                    if (aRecipient[2].equals("null")) oStmt.setNull(6, Types.VARCHAR); else oStmt.setString(6, aRecipient[2]);
                    oStmt.executeUpdate();
                }
            }
            oStmt.close();
            oStmt = null;
            oStmt =(PreparedStatement)(Object) oConn.prepareStatement("UPDATE " + DB.k_categories + " SET " + DB.len_size + "=" + DB.len_size + "+" + String.valueOf(iSize) + " WHERE " + DB.gu_category + "=?");
            oStmt.setString(1, getCategory().getString(DB.gu_category));
            oStmt.executeUpdate();
            oStmt.close();
            oStmt = null;
            if (((int)(Object)iOpenMode & (int)(Object)MODE_MBOX) != 0) {
                if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("MboxFile.appendMessage(" + (oMsg.getContentID() != null ? oMsg.getContentID() : "") + ")");
                oMBox.appendMessage(sMsgCharSeq);
                oMBox.close();
                oMBox = null;
            }
            if ((boolean)(Object)DebugFile.trace) DebugFile.writeln("Connection.commit()");
            oConn.commit();
        } catch (SQLException sqle) {
            try {
                if (oMBox != null) oMBox.close();
            } catch (Exception ignore) {
            }
            try {
                if (null != oStmt) oStmt.close();
                oStmt = null;
            } catch (Exception ignore) {
            }
            try {
                if (null != oAddr) oAddr.close();
                oAddr = null;
            } catch (Exception ignore) {
            }
            try {
                if (null != oConn) oConn.rollback();
            } catch (Exception ignore) {
            }
            throw new MessagingException(sqle.getMessage(), sqle);
        } catch (IOException ioe) {
            try {
                if (oMBox != null) oMBox.close();
            } catch (Exception ignore) {
            }
            try {
                if (null != oStmt) oStmt.close();
                oStmt = null;
            } catch (Exception ignore) {
            }
            try {
                if (null != oAddr) oAddr.close();
                oAddr = null;
            } catch (Exception ignore) {
            }
            try {
                if (null != oConn) oConn.rollback();
            } catch (Exception ignore) {
            }
            throw new MessagingException(ioe.getMessage(),(SQLException)(Object) ioe);
        }
        if ((boolean)(Object)DebugFile.trace) {
            DebugFile.decIdent();
            DebugFile.writeln("End DBFolder.appendMessage() : " + gu_mimemsg);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass nm_user;
	public MyHelperClass gu_company;
	public MyHelperClass tx_alt_email;
	public MyHelperClass nm_category;
	public MyHelperClass RECENT;
	public MyHelperClass tx_surname;
	public MyHelperClass tx_surname2;
	public MyHelperClass CHAR;
	public MyHelperClass READ_WRITE;
	public MyHelperClass k_categories;
	public MyHelperClass gu_workarea;
	public MyHelperClass tx_email;
	public MyHelperClass TO;
	public MyHelperClass BCC;
	public MyHelperClass k_mime_msgs;
	public MyHelperClass tx_main_email;
	public MyHelperClass CONCUR_READ_ONLY;
	public MyHelperClass FLAGGED;
	public MyHelperClass ANSWERED;
	public MyHelperClass CC;
	public MyHelperClass NUMERIC;
	public MyHelperClass SEEN;
	public MyHelperClass VARCHAR;
	public MyHelperClass gu_user;
	public MyHelperClass TYPE_FORWARD_ONLY;
	public MyHelperClass k_inet_addrs;
	public MyHelperClass gu_category;
	public MyHelperClass tx_name;
	public MyHelperClass trace;
	public MyHelperClass k_member_address;
	public MyHelperClass k_users;
	public MyHelperClass len_size;
	public MyHelperClass gu_contact;
	public MyHelperClass DBMS_ORACLE;
	public MyHelperClass tx_surname1;
	public MyHelperClass INTEGER;
	public MyHelperClass LONGVARBINARY;
	public MyHelperClass DELETED;
public MyHelperClass toHexString(MyHelperClass o0){ return null; }
	public MyHelperClass split(String o0, char o1){ return null; }
	public MyHelperClass generateUUID(){ return null; }
	public MyHelperClass isNull(MyHelperClass o0){ return null; }
	public MyHelperClass chomp(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass left(String o0, int o1){ return null; }
	public MyHelperClass incIdent(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass decIdent(){ return null; }
	public MyHelperClass writeln(String o0){ return null; }
	public MyHelperClass replace(char o0, char o1){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass getDataBaseProduct(){ return null; }
	public MyHelperClass decodeText(String o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass getStringNull(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass rollback(){ return null; }}

class MimeMessage {
public static MyHelperClass RecipientType;
public MyHelperClass getDisposition(){ return null; }
	public MyHelperClass getMessageID(){ return null; }
	public MyHelperClass getHeader(String o0, Object o1){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getSubject(){ return null; }
	public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getReplyTo(){ return null; }
	public MyHelperClass getSentDate(){ return null; }
	public MyHelperClass getRecipients(MyHelperClass o0){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getFlags(){ return null; }
	public MyHelperClass getContentID(){ return null; }
	public MyHelperClass getReceivedDate(){ return null; }
	public MyHelperClass writeTo(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getContentMD5(){ return null; }
	public MyHelperClass getFrom(){ return null; }}

class FolderClosedException extends Exception{
	public FolderClosedException(String errorMessage) { super(errorMessage); }
	FolderClosedException(){}
	FolderClosedException(c7300267 o0, String o1){}
}

class StoreClosedException extends Exception{
	public StoreClosedException(String errorMessage) { super(errorMessage); }
	StoreClosedException(MyHelperClass o0, String o1){}
	StoreClosedException(){}
}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
	MessagingException(String o0, SQLException o1){}
	MessagingException(){}
	MessagingException(String o0, UnsupportedEncodingException o1){}
}

class DBStore {

public MyHelperClass getUser(){ return null; }
	public MyHelperClass isConnected(){ return null; }}

class DBMimeMessage {

DBMimeMessage(){}
	DBMimeMessage(MimeMessage o0){}
	public MyHelperClass getBody(){ return null; }
	public MyHelperClass getFolder(){ return null; }
	public MyHelperClass getMessageGuid(){ return null; }
	public MyHelperClass setFolder(c7300267 o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Timestamp {

Timestamp(long o0){}
	Timestamp(){}}

class Address {

}

class AddressException extends Exception{
	public AddressException(String errorMessage) { super(errorMessage); }
}

class InternetAddress {

public MyHelperClass getPersonal(){ return null; }
	public MyHelperClass getAddress(){ return null; }}

class Flags {
public static MyHelperClass Flag;
public MyHelperClass contains(MyHelperClass o0){ return null; }}

class MimePart {

public MyHelperClass writeTo(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass getSize(){ return null; }}

class MboxFile {

MboxFile(File o0, MyHelperClass o1){}
	MboxFile(){}
	public MyHelperClass appendMessage(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class MD5 {

public MyHelperClass Final(){ return null; }
	public MyHelperClass Init(){ return null; }
	public MyHelperClass Update(byte[] o0){ return null; }}

class PreparedStatement {

public MyHelperClass setShort(int o0, short o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setNull(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setBinaryStream(int o0, ByteArrayInputStream o1, int o2){ return null; }
	public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass setBigDecimal(int o0, BigDecimal o1){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class MimeMultipart {

}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass wasNull(){ return null; }
	public MyHelperClass next(){ return null; }}
