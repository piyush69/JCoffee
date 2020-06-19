import java.io.*;
import java.lang.*;
import java.util.*;



class c7687037 {
public MyHelperClass AppLayerDatabase;
	public MyHelperClass logger;
	public MyHelperClass INSERT_ERROR;
	public MyHelperClass Level;
	public MyHelperClass INSERT_DUPLICATE;
	public MyHelperClass INSERT_OK;
	public MyHelperClass getBoardAttachmentsTableName(){ return null; }
	public MyHelperClass getContentTableName(){ return null; }
	public MyHelperClass getMessageTableName(){ return null; }
	public MyHelperClass getFileAttachmentsTableName(){ return null; }

    public synchronized int insertMessage(FrostMessageObject mo) {
        MyHelperClass Attachment = new MyHelperClass();
        AttachmentList files =(AttachmentList)(Object) mo.getAttachmentsOfType(Attachment.FILE);
//        MyHelperClass Attachment = new MyHelperClass();
        AttachmentList boards =(AttachmentList)(Object) mo.getAttachmentsOfType(Attachment.BOARD);
        MyHelperClass AppLayerDatabase = new MyHelperClass();
        Connection conn =(Connection)(Object) AppLayerDatabase.getInstance().getPooledConnection();
        try {
            conn.setAutoCommit(false);
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO " + getMessageTableName() + " (" + "primkey,messageid,inreplyto,isvalid,invalidreason,msgdatetime,msgindex,board,fromname,subject,recipient,signature," + "signaturestatus,publickey,isdeleted,isnew,isreplied,isjunk,isflagged,isstarred,hasfileattachment,hasboardattachment,idlinepos,idlinelen" + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            Long identity = null;
            Statement stmt =(Statement)(Object) AppLayerDatabase.getInstance().createStatement();
            ResultSet rs =(ResultSet)(Object) stmt.executeQuery("select UNIQUEKEY('" + getMessageTableName() + "')");
            if ((boolean)(Object)rs.next()) {
                identity = new Long((long)(Object)rs.getLong(1));
            } else {
                logger.log(Level.SEVERE, "Could not retrieve a new unique key!");
            }
            rs.close();
            stmt.close();
            int i = 1;
            ps.setLong(i++, identity.longValue());
            ps.setString(i++, mo.getMessageId());
            ps.setString(i++, mo.getInReplyTo());
            ps.setBoolean(i++, mo.isValid());
            ps.setString(i++, mo.getInvalidReason());
            ps.setLong(i++,(long)(Object) mo.getDateAndTime().getMillis());
            ps.setInt(i++, mo.getIndex());
            ps.setInt(i++, mo.getBoard().getPrimaryKey().intValue());
            ps.setString(i++, mo.getFromName());
            ps.setString(i++, mo.getSubject());
            ps.setString(i++, ((mo.getRecipientName() != null &&(int)(Object) mo.getRecipientName().length() == 0) ? null : mo.getRecipientName()));
            if (mo.getSignatureV2() == null ||(int)(Object) mo.getSignatureV2().length() == 0) {
                ps.setString(i++, mo.getSignatureV1());
            } else {
                ps.setString(i++, mo.getSignatureV2());
            }
            ps.setInt(i++, mo.getSignatureStatus());
            ps.setString(i++, mo.getPublicKey());
            ps.setBoolean(i++, mo.isDeleted());
            ps.setBoolean(i++, mo.isNew());
            ps.setBoolean(i++, mo.isReplied());
            ps.setBoolean(i++, mo.isJunk());
            ps.setBoolean(i++, mo.isFlagged());
            ps.setBoolean(i++, mo.isStarred());
            ps.setBoolean(i++,(MyHelperClass)(Object) ((int)(Object)files.size() > 0));
            ps.setBoolean(i++,(MyHelperClass)(Object) ((int)(Object)boards.size() > 0));
            ps.setInt(i++, mo.getIdLinePos());
            ps.setInt(i++, mo.getIdLineLen());
            int inserted;
            try {
                inserted =(int)(Object) ps.executeUpdate();
            } finally {
                ps.close();
            }
            if (inserted == 0) {
                logger.log(Level.SEVERE, "message insert returned 0 !!!");
                throw new Exception("message insert returned 0 !!!");
            }
            mo.setMsgIdentity(identity.longValue());
            PreparedStatement pc =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO " + getContentTableName() + " (msgref,msgcontent) VALUES (?,?)");
            pc.setLong(1,(long)(Object) mo.getMsgIdentity());
            pc.setString(2, mo.getContent());
            try {
                inserted =(int)(Object) pc.executeUpdate();
            } finally {
                pc.close();
            }
            if (inserted == 0) {
                logger.log(Level.SEVERE, "message content insert returned 0 !!!");
                throw new Exception("message content insert returned 0 !!!");
            }
            if ((int)(Object)files.size() > 0) {
                PreparedStatement p =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO " + getFileAttachmentsTableName() + " (msgref,filename,filesize,filekey)" + " VALUES (?,?,?,?)");
                try {
                    for (Iterator it =(Iterator)(Object) files.iterator(); it.hasNext(); ) {
                        FileAttachment fa = (FileAttachment) it.next();
                        int ix = 1;
                        p.setLong(ix++,(long)(Object) mo.getMsgIdentity());
                        p.setString(ix++, fa.getFilename());
                        p.setLong(ix++,(long)(Object) fa.getFileSize());
                        p.setString(ix++, fa.getKey());
                        int ins =(int)(Object) p.executeUpdate();
                        if (ins == 0) {
                            logger.log(Level.SEVERE, "fileattachment insert returned 0 !!!");
                            throw new Exception("fileattachment insert returned 0 !!!");
                        }
                    }
                } finally {
                    p.close();
                }
            }
            if ((int)(Object)boards.size() > 0) {
                PreparedStatement p =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO " + getBoardAttachmentsTableName() + " (msgref,boardname,boardpublickey,boardprivatekey,boarddescription)" + " VALUES (?,?,?,?,?)");
                try {
                    for (Iterator it =(Iterator)(Object) boards.iterator(); it.hasNext(); ) {
                        BoardAttachment ba = (BoardAttachment) it.next();
                        Board b =(Board)(Object) ba.getBoardObj();
                        int ix = 1;
                        p.setLong(ix++,(long)(Object) mo.getMsgIdentity());
                        p.setString(ix++, b.getNameLowerCase());
                        p.setString(ix++, b.getPublicKey());
                        p.setString(ix++, b.getPrivateKey());
                        p.setString(ix++, b.getDescription());
                        int ins =(int)(Object) p.executeUpdate();
                        if (ins == 0) {
                            logger.log(Level.SEVERE, "boardattachment insert returned 0 !!!");
                            throw new Exception("boardattachment insert returned 0 !!!");
                        }
                    }
                } finally {
                    p.close();
                }
            }
            conn.commit();
            conn.setAutoCommit(true);
            return (int)(Object)INSERT_OK;
        } catch (Throwable t) {
            boolean isDuplicate;
            if (t.getMessage().indexOf("constraint violation") > 0 && t.getMessage().indexOf("MSG_ID_UNIQUE_ONLY") > 0) {
                isDuplicate = true;
                logger.warning("Duplicate message id, not added to database table: msgid='" + mo.getMessageId() + "', board=" + mo.getBoard().getName() + ", date='" + mo.getDateAndTimeString() + "', index=" + mo.getIndex());
            } else if (t.getMessage().indexOf("constraint violation") > 0 && t.getMessage().indexOf("MSG_UNIQUE_ONLY") > 0) {
                isDuplicate = true;
                logger.warning("Duplicate msgdatetime,index,board, not added to database table: msgid='" + mo.getMessageId() + "', board=" + mo.getBoard().getName() + ", date='" + mo.getDateAndTimeString() + "', index=" + mo.getIndex());
            } else {
                isDuplicate = false;
                logger.log(Level.SEVERE, "Exception during insert of message: msgid='" + mo.getMessageId() + "', board=" + mo.getBoard().getName() + ", date='" + mo.getDateAndTimeString() + "', index=" + mo.getIndex(), t);
                try {
                    conn.rollback();
                } catch (Throwable t1) {
                    logger.log(Level.SEVERE, "Exception during rollback", t1);
                }
            }
            try {
                conn.setAutoCommit(true);
            } catch (Throwable t1) {
            }
            if (isDuplicate) {
                return (int)(Object)INSERT_DUPLICATE;
            } else {
                return (int)(Object)INSERT_ERROR;
            }
        } finally {
            AppLayerDatabase.getInstance().givePooledConnection(conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BOARD;
	public MyHelperClass SEVERE;
	public MyHelperClass FILE;
public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }
	public MyHelperClass getPooledConnection(){ return null; }
	public MyHelperClass givePooledConnection(Connection o0){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getMillis(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass intValue(){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class FrostMessageObject {

public MyHelperClass getSignatureStatus(){ return null; }
	public MyHelperClass isValid(){ return null; }
	public MyHelperClass isStarred(){ return null; }
	public MyHelperClass isNew(){ return null; }
	public MyHelperClass isReplied(){ return null; }
	public MyHelperClass getAttachmentsOfType(MyHelperClass o0){ return null; }
	public MyHelperClass isFlagged(){ return null; }
	public MyHelperClass isDeleted(){ return null; }
	public MyHelperClass getMessageId(){ return null; }
	public MyHelperClass getIndex(){ return null; }
	public MyHelperClass getInReplyTo(){ return null; }
	public MyHelperClass isJunk(){ return null; }
	public MyHelperClass getSignatureV1(){ return null; }
	public MyHelperClass getInvalidReason(){ return null; }
	public MyHelperClass getSignatureV2(){ return null; }
	public MyHelperClass getPublicKey(){ return null; }
	public MyHelperClass getIdLineLen(){ return null; }
	public MyHelperClass getDateAndTimeString(){ return null; }
	public MyHelperClass getRecipientName(){ return null; }
	public MyHelperClass setMsgIdentity(long o0){ return null; }
	public MyHelperClass getBoard(){ return null; }
	public MyHelperClass getFromName(){ return null; }
	public MyHelperClass getMsgIdentity(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getDateAndTime(){ return null; }
	public MyHelperClass getIdLinePos(){ return null; }
	public MyHelperClass getSubject(){ return null; }}

class AttachmentList {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass size(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setBoolean(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setString(int o0, Object o1){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class FileAttachment {

public MyHelperClass getFileSize(){ return null; }
	public MyHelperClass getFilename(){ return null; }
	public MyHelperClass getKey(){ return null; }}

class BoardAttachment {

public MyHelperClass getBoardObj(){ return null; }}

class Board {

public MyHelperClass getPrivateKey(){ return null; }
	public MyHelperClass getNameLowerCase(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getPublicKey(){ return null; }}
