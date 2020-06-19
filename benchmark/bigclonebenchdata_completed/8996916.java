import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8996916 {
public MyHelperClass savePersonInfo(PreparedStatement o0, Connection o1, RecvDto o2, String o3){ return null; }
	public MyHelperClass drawOutRecvSql(EXTSSPHeader o0, String o1){ return null; }
	public MyHelperClass saveClobMessage(PreparedStatement o0, Connection o1, ResultSet o2, String o3, String o4){ return null; }



    private void recvMessage(String from, String to) throws Throwable, Exception {
        ConnectionFactoryImpl factory = new ConnectionFactoryImpl();
        Receiver receiver = null;
        ProviderConnection connection =(ProviderConnection)(Object) factory.createConnection(from, to);
        MyHelperClass DBUtil = new MyHelperClass();
        Connection conn =(Connection)(Object) DBUtil.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "";
        try {
            MyHelperClass Receiver = new MyHelperClass();
            receiver =(Receiver)(Object) Receiver.createReceiver(connection);
            receiver.open();
            EXTSSPMessage message = (EXTSSPMessage)(EXTSSPMessage)(Object) receiver.receiveEX();
            if (message == null) {
                System.out.println("no message");
            } else {
                conn.setAutoCommit(false);
                EXTSSPHeader header =(EXTSSPHeader)(Object) message.getEXHeader();
                UUIDHexGenerator u = new UUIDHexGenerator();
                String id = u.generate().toString();
                pstmt =(PreparedStatement)(Object) conn.prepareStatement((String)(Object)drawOutRecvSql(header, id));
                pstmt.executeUpdate();
                String xml = "";
                TSSPBody body =(TSSPBody)(Object) message.getBody();
                xml =(String)(Object) body.getDomAsString();
                xml = xml.replaceAll("ns1:", "");
                saveClobMessage(pstmt, conn, rs, xml, id);
                String notify_id = "";
                Iterator iter =(Iterator)(Object) message.getAttachments();
                while (iter.hasNext()) {
                    AttachmentPart a = (AttachmentPart) iter.next();
                    String contentId =(String)(Object) a.getContentId();
                    MyHelperClass Constant = new MyHelperClass();
                    if (contentId.startsWith((String)(Object)Constant.PREFIX_PERSON)) {
                        DataHandler dh =(DataHandler)(Object) a.getDataHandler();
                        InputStream is =(InputStream)(Object) dh.getInputStream();
                        MyHelperClass FileCopyUtils = new MyHelperClass();
                        byte[] temp =(byte[])(Object) FileCopyUtils.copyToByteArray(is);
                        String content = new String(temp);
                        MyHelperClass XStreamConvert = new MyHelperClass();
                        RecvDto recv = (RecvDto)(RecvDto)(Object) XStreamConvert.xmlToBean(content);
                        if (recv == null) throw new Exception("接收方信息对象转换错误！请检查存入的信息对象xml字符串是否正确:" + content);
                        if (notify_id.equals("")) {
                            notify_id = u.generate().toString();
//                            MyHelperClass Constant = new MyHelperClass();
                            header.setType(Constant.MESSAGETYPE_NOTIFY);
                            pstmt =(PreparedStatement)(Object) conn.prepareStatement((String)(Object)drawOutRecvSql(header, notify_id));
                            pstmt.executeUpdate();
                            String notify_content =(String)(Object) header.getNotifyContent();
                            if (notify_content == null) notify_content = "接收到新的esb消息，但未定义通知消息内容!";
                            saveClobMessage(pstmt, conn, rs, notify_content, notify_id);
                        }
                        savePersonInfo(pstmt, conn, recv, notify_id);
                    } else {
                        DataHandler dh =(DataHandler)(Object) a.getDataHandler();
                        InputStream is =(InputStream)(Object) dh.getInputStream();
                        String attid = u.generate().toString();
                        sql = "insert into message_recv_attachment(ATTACHMENTID," + "VERSION,MRECVID,BUSS_ID,ATTACHMENT) values('" + attid + "',0,'" + id + "','" + contentId + "',empty_blob())";
                        pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
                        pstmt.executeUpdate();
                        sql = "select attachment from message_recv_attachment" + " where attachmentid = '" + attid + "' for update";
                        pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
                        rs =(ResultSet)(Object) pstmt.executeQuery();
                        rs.next();
                        Blob blob =(Blob)(Object) rs.getBlob(1);
                        OutputStream blobOutputStream =(OutputStream)(Object) ((BLOB)(BLOB)(Object) blob).getBinaryOutputStream();
                        MyHelperClass FileCopyUtils = new MyHelperClass();
                        FileCopyUtils.copy(is, blobOutputStream);
                        is.close();
                        blobOutputStream.close();
                    }
                }
                conn.commit();
                conn.setAutoCommit(true);
            }
            receiver.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                System.out.println("received message, rollback");
                if (receiver != null) {
                    receiver.rollback();
                }
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
        } finally {
//            MyHelperClass DBUtil = new MyHelperClass();
            DBUtil.close(rs, pstmt, conn);
            if (receiver != null) {
                try {
                    receiver.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
}
}
}
}

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PREFIX_PERSON;
	public MyHelperClass MESSAGETYPE_NOTIFY;
public MyHelperClass close(ResultSet o0, PreparedStatement o1, Connection o2){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass createReceiver(ProviderConnection o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass copyToByteArray(InputStream o0){ return null; }
	public MyHelperClass xmlToBean(String o0){ return null; }}

class ConnectionFactoryImpl {

public MyHelperClass createConnection(String o0, String o1){ return null; }}

class Receiver {

public MyHelperClass commit(){ return null; }
	public MyHelperClass receiveEX(){ return null; }
	public MyHelperClass open(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }}

class ProviderConnection {

public MyHelperClass close(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getBlob(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class EXTSSPMessage {

public MyHelperClass getEXHeader(){ return null; }
	public MyHelperClass getBody(){ return null; }
	public MyHelperClass getAttachments(){ return null; }}

class EXTSSPHeader {

public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass getNotifyContent(){ return null; }}

class UUIDHexGenerator {

public MyHelperClass generate(){ return null; }}

class TSSPBody {

public MyHelperClass getDomAsString(){ return null; }}

class AttachmentPart {

public MyHelperClass getDataHandler(){ return null; }
	public MyHelperClass getContentId(){ return null; }}

class DataHandler {

public MyHelperClass getInputStream(){ return null; }}

class RecvDto {

}

class Blob {

}

class JAXMException extends Exception{
	public JAXMException(String errorMessage) { super(errorMessage); }
}

class BLOB {

public MyHelperClass getBinaryOutputStream(){ return null; }}
