


class c4462296 {
public MyHelperClass logger;

    public synchronized void insertMessage(FrostUnsentMessageObject mo) throws SQLException {
        MyHelperClass Attachment = new MyHelperClass();
        AttachmentList files =(AttachmentList)(Object) mo.getAttachmentsOfType(Attachment.FILE);
//        MyHelperClass Attachment = new MyHelperClass();
        AttachmentList boards =(AttachmentList)(Object) mo.getAttachmentsOfType(Attachment.BOARD);
        MyHelperClass AppLayerDatabase = new MyHelperClass();
        Connection conn =(Connection)(Object) AppLayerDatabase.getInstance().getPooledConnection();
        try {
            conn.setAutoCommit(false);
            PreparedStatement ps =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO UNSENDMESSAGES (" + "primkey,messageid,inreplyto,board,sendafter,idlinepos,idlinelen,fromname,subject,recipient,msgcontent," + "hasfileattachment,hasboardattachment,timeAdded" + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            Long identity = null;
//            MyHelperClass AppLayerDatabase = new MyHelperClass();
            Statement stmt =(Statement)(Object) AppLayerDatabase.getInstance().createStatement();
            ResultSet rs =(ResultSet)(Object) stmt.executeQuery("select UNIQUEKEY('UNSENDMESSAGES')");
            if ((boolean)(Object)rs.next()) {
                identity = new Long((long)(Object)rs.getLong(1));
            } else {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.SEVERE, "Could not retrieve a new unique key!");
            }
            rs.close();
            stmt.close();
            mo.setMsgIdentity(identity.longValue());
            int i = 1;
            ps.setLong(i++,(int)(Object) mo.getMsgIdentity());
            ps.setString(i++, mo.getMessageId());
            ps.setString(i++, mo.getInReplyTo());
            ps.setInt(i++, mo.getBoard().getPrimaryKey().intValue());
            ps.setLong(i++, 0);
            ps.setInt(i++, mo.getIdLinePos());
            ps.setInt(i++, mo.getIdLineLen());
            ps.setString(i++, mo.getFromName());
            ps.setString(i++, mo.getSubject());
            ps.setString(i++, mo.getRecipientName());
            ps.setString(i++, mo.getContent());
            ps.setBoolean(i++, ((int)(Object)files.size() > 0));
            ps.setBoolean(i++, ((int)(Object)boards.size() > 0));
            ps.setLong(i++,(int)(Object) mo.getTimeAdded());
            int inserted = 0;
            try {
                inserted =(int)(Object) ps.executeUpdate();
            } finally {
                ps.close();
            }
            if (inserted == 0) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.SEVERE, "message insert returned 0 !!!");
                return;
            }
            mo.setMsgIdentity(identity.longValue());
            if ((int)(Object)files.size() > 0) {
                PreparedStatement p =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO UNSENDFILEATTACHMENTS" + " (msgref,filename,filesize,filekey)" + " VALUES (?,?,?,?)");
                for (Iterator it =(Iterator)(Object) files.iterator();(boolean)(Object) it.hasNext(); ) {
                    FileAttachment fa = (FileAttachment)(FileAttachment)(Object) it.next();
                    int ix = 1;
                    p.setLong(ix++,(int)(Object) mo.getMsgIdentity());
                    p.setString(ix++, fa.getInternalFile().getPath());
                    p.setLong(ix++,(int)(Object) fa.getFileSize());
                    p.setString(ix++, fa.getKey());
                    int ins =(int)(Object) p.executeUpdate();
                    if (ins == 0) {
                        MyHelperClass Level = new MyHelperClass();
                        logger.log(Level.SEVERE, "fileattachment insert returned 0 !!!");
                    }
                }
                p.close();
            }
            if ((int)(Object)boards.size() > 0) {
                PreparedStatement p =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO UNSENDBOARDATTACHMENTS" + " (msgref,boardname,boardpublickey,boardprivatekey,boarddescription)" + " VALUES (?,?,?,?,?)");
                for (Iterator it =(Iterator)(Object) boards.iterator();(boolean)(Object) it.hasNext(); ) {
                    BoardAttachment ba = (BoardAttachment)(BoardAttachment)(Object) it.next();
                    Board b =(Board)(Object) ba.getBoardObj();
                    int ix = 1;
                    p.setLong(ix++,(int)(Object) mo.getMsgIdentity());
                    p.setString(ix++, b.getNameLowerCase());
                    p.setString(ix++, b.getPublicKey());
                    p.setString(ix++, b.getPrivateKey());
                    p.setString(ix++, b.getDescription());
                    int ins =(int)(Object) p.executeUpdate();
                    if (ins == 0) {
                        MyHelperClass Level = new MyHelperClass();
                        logger.log(Level.SEVERE, "boardattachment insert returned 0 !!!");
                    }
                }
                p.close();
            }
            conn.commit();
            conn.setAutoCommit(true);
        } catch (Throwable t) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "Exception during insert of unsent message", t);
            try {
                conn.rollback();
            } catch (Throwable t1) {
//                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.SEVERE, "Exception during rollback", t1);
            }
            try {
                conn.setAutoCommit(true);
            } catch (Throwable t1) {
            }
        } finally {
//            MyHelperClass AppLayerDatabase = new MyHelperClass();
            AppLayerDatabase.getInstance().givePooledConnection(conn);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILE;
	public MyHelperClass SEVERE;
	public MyHelperClass BOARD;
public MyHelperClass getPooledConnection(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass givePooledConnection(Connection o0){ return null; }
	public MyHelperClass intValue(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }
	public MyHelperClass getPrimaryKey(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class FrostUnsentMessageObject {

public MyHelperClass getIdLineLen(){ return null; }
	public MyHelperClass getRecipientName(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getMsgIdentity(){ return null; }
	public MyHelperClass getMessageId(){ return null; }
	public MyHelperClass getTimeAdded(){ return null; }
	public MyHelperClass getInReplyTo(){ return null; }
	public MyHelperClass getSubject(){ return null; }
	public MyHelperClass setMsgIdentity(long o0){ return null; }
	public MyHelperClass getIdLinePos(){ return null; }
	public MyHelperClass getBoard(){ return null; }
	public MyHelperClass getFromName(){ return null; }
	public MyHelperClass getAttachmentsOfType(MyHelperClass o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class AttachmentList {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass size(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setLong(int o0, int o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass close(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class ResultSet {

public MyHelperClass getLong(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class FileAttachment {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getFileSize(){ return null; }
	public MyHelperClass getInternalFile(){ return null; }}

class BoardAttachment {

public MyHelperClass getBoardObj(){ return null; }}

class Board {

public MyHelperClass getNameLowerCase(){ return null; }
	public MyHelperClass getPublicKey(){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getPrivateKey(){ return null; }}
