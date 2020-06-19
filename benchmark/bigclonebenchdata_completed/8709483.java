import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8709483 {
public MyHelperClass Utility;

        private void saveAttachment(long messageId, Part attachment, boolean saveAsNew) throws Throwable, IOException, MessagingException {
            long attachmentId = -1;
            Uri contentUri = null;
            int size = -1;
            File tempAttachmentFile = null;
            if ((!saveAsNew) && ((LocalAttachmentBodyPart)(Object)attachment instanceof LocalAttachmentBodyPart)) {
                attachmentId =(long)(Object) ((LocalAttachmentBodyPart)(LocalAttachmentBodyPart)(Object) attachment).getAttachmentId();
            }
            if (attachment.getBody() != null) {
                Body body =(Body)(Object) attachment.getBody();
                if ((LocalAttachmentBody)(Object)body instanceof LocalAttachmentBody) {
                    contentUri =(Uri)(Object) ((LocalAttachmentBody)(LocalAttachmentBody)(Object) body).getContentUri();
                } else {
                    InputStream in =(InputStream)(Object) attachment.getBody().getInputStream();
                    MyHelperClass mAttachmentsDir = new MyHelperClass();
                    tempAttachmentFile = File.createTempFile("att", null,(File)(Object) mAttachmentsDir);
                    FileOutputStream out = new FileOutputStream(tempAttachmentFile);
                    MyHelperClass IOUtils = new MyHelperClass();
                    size =(int)(Object) IOUtils.copy(in, out);
                    in.close();
                    out.close();
                }
            }
            if (size == -1) {
                String disposition =(String)(Object) attachment.getDisposition();
                if (disposition != null) {
                    MyHelperClass MimeUtility = new MyHelperClass();
                    String s =(String)(Object) MimeUtility.getHeaderParameter(disposition, "size");
                    if (s != null) {
                        size = Integer.parseInt(s);
                    }
                }
            }
            if (size == -1) {
                size = 0;
            }
            MyHelperClass MimeHeader = new MyHelperClass();
            String storeData =(String)(Object) Utility.combine(attachment.getHeader(MimeHeader.HEADER_ANDROID_ATTACHMENT_STORE_DATA), ',');
            MyHelperClass MimeUtility = new MyHelperClass();
            String name =(String)(Object) MimeUtility.getHeaderParameter((String)(Object)attachment.getContentType(), "name");
            String contentId =(String)(Object) attachment.getContentId();
            if (attachmentId == -1) {
                ContentValues cv = new ContentValues();
                cv.put("message_id", messageId);
                cv.put("content_uri", contentUri != null ? contentUri.toString() : null);
                cv.put("store_data", storeData);
                cv.put("size", size);
                cv.put("name", name);
                cv.put("mime_type",(String)(Object) attachment.getMimeType());
                cv.put("content_id", contentId);
                MyHelperClass mDb = new MyHelperClass();
                attachmentId =(long)(Object) mDb.insert("attachments", "message_id", cv);
            } else {
                ContentValues cv = new ContentValues();
                cv.put("content_uri", contentUri != null ? contentUri.toString() : null);
                cv.put("size", size);
                cv.put("content_id", contentId);
                cv.put("message_id", messageId);
                MyHelperClass mDb = new MyHelperClass();
                mDb.update("attachments", cv, "id = ?", new String[] { Long.toString(attachmentId) });
            }
            if (tempAttachmentFile != null) {
                MyHelperClass mAttachmentsDir = new MyHelperClass();
                File attachmentFile = new File((String)(Object)mAttachmentsDir, Long.toString(attachmentId));
                tempAttachmentFile.renameTo(attachmentFile);
                MyHelperClass mContext = new MyHelperClass();
                attachment.setBody(new LocalAttachmentBody(contentUri, mContext));
                ContentValues cv = new ContentValues();
                cv.put("content_uri", contentUri != null ? contentUri.toString() : null);
                MyHelperClass mDb = new MyHelperClass();
                mDb.update("attachments", cv, "id = ?", new String[] { Long.toString(attachmentId) });
            }
            if ((LocalAttachmentBodyPart)(Object)attachment instanceof LocalAttachmentBodyPart) {
                ((LocalAttachmentBodyPart)(LocalAttachmentBodyPart)(Object) attachment).setAttachmentId(attachmentId);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HEADER_ANDROID_ATTACHMENT_STORE_DATA;
public MyHelperClass update(String o0, ContentValues o1, String o2, String[] o3){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass insert(String o0, String o1, ContentValues o2){ return null; }
	public MyHelperClass combine(MyHelperClass o0, char o1){ return null; }
	public MyHelperClass getHeaderParameter(String o0, String o1){ return null; }}

class Part {

public MyHelperClass getHeader(MyHelperClass o0){ return null; }
	public MyHelperClass getContentId(){ return null; }
	public MyHelperClass getMimeType(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setBody(LocalAttachmentBody o0){ return null; }
	public MyHelperClass getDisposition(){ return null; }
	public MyHelperClass getBody(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class Uri {

}

class LocalAttachmentBodyPart {

public MyHelperClass setAttachmentId(long o0){ return null; }
	public MyHelperClass getAttachmentId(){ return null; }}

class Body {

}

class LocalAttachmentBody {

LocalAttachmentBody(){}
	LocalAttachmentBody(Uri o0, MyHelperClass o1){}
	public MyHelperClass getContentUri(){ return null; }}

class ContentValues {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass put(String o0, long o1){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }}
