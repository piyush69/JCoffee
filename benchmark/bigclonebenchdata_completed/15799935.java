import java.io.*;
import java.lang.*;
import java.util.*;



class c15799935 {
public static MyHelperClass ContentUris;
//public MyHelperClass ContentUris;

    public static void saveAttachmentBody(Context context, Part part, Attachment localAttachment, long accountId) throws MessagingException, IOException {
        if (part.getBody() != null) {
            long attachmentId =(long)(Object) localAttachment.mId;
            InputStream in =(InputStream)(Object) part.getBody().getInputStream();
            MyHelperClass AttachmentProvider = new MyHelperClass();
            File saveIn =(File)(Object) AttachmentProvider.getAttachmentDirectory(context, accountId);
            if (!saveIn.exists()) {
                saveIn.mkdirs();
            }
//            MyHelperClass AttachmentProvider = new MyHelperClass();
            File saveAs =(File)(Object) AttachmentProvider.getAttachmentFilename(context, accountId, attachmentId);
            saveAs.createNewFile();
            FileOutputStream out = new FileOutputStream(saveAs);
            MyHelperClass IOUtils = new MyHelperClass();
            long copySize =(long)(Object) IOUtils.copy(in, out);
            in.close();
            out.close();
//            MyHelperClass AttachmentProvider = new MyHelperClass();
            String contentUriString = AttachmentProvider.getAttachmentUri(accountId, attachmentId).toString();
            localAttachment.mSize =(MyHelperClass)(Object) copySize;
            localAttachment.mContentUri =(MyHelperClass)(Object) contentUriString;
            ContentValues cv = new ContentValues();
            MyHelperClass AttachmentColumns = new MyHelperClass();
            cv.put(AttachmentColumns.SIZE, copySize);
//            MyHelperClass AttachmentColumns = new MyHelperClass();
            cv.put(AttachmentColumns.CONTENT_URI, contentUriString);
            MyHelperClass Attachment = new MyHelperClass();
            Uri uri =(Uri)(Object) ContentUris.withAppendedId(Attachment.CONTENT_URI, attachmentId);
            context.getContentResolver().update(uri, cv, null, null);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_URI;
	public MyHelperClass SIZE;
public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass update(Uri o0, ContentValues o1, Object o2, Object o3){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getAttachmentDirectory(Context o0, long o1){ return null; }
	public MyHelperClass getAttachmentFilename(Context o0, long o1, long o2){ return null; }
	public MyHelperClass getAttachmentUri(long o0, long o1){ return null; }
	public MyHelperClass withAppendedId(MyHelperClass o0, long o1){ return null; }}

class Context {

public MyHelperClass getContentResolver(){ return null; }}

class Part {

public MyHelperClass getBody(){ return null; }}

class Attachment {
public MyHelperClass mId;
	public MyHelperClass mContentUri;
	public MyHelperClass mSize;
}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class ContentValues {

public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, long o1){ return null; }}

class Uri {

}
