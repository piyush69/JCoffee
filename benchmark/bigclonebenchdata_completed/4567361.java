import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4567361 {

    private Attachment setupSimpleAttachment(Context context, long messageId, boolean withBody) throws Throwable, IOException {
        Attachment attachment = new Attachment();
        attachment.mFileName =(MyHelperClass)(Object) "the file.jpg";
        attachment.mMimeType =(MyHelperClass)(Object) "image/jpg";
        attachment.mSize =(MyHelperClass)(Object) 0;
        attachment.mContentId = null;
        attachment.mContentUri =(MyHelperClass)(Object) "content://com.android.email/1/1";
        attachment.mMessageKey =(MyHelperClass)(Object) messageId;
        attachment.mLocation = null;
        attachment.mEncoding = null;
        if (withBody) {
            MyHelperClass TEST_STRING = new MyHelperClass();
            InputStream inStream = new ByteArrayInputStream((byte[])(Object)TEST_STRING.getBytes());
            File cacheDir =(File)(Object) context.getCacheDir();
            File tmpFile = File.createTempFile("setupSimpleAttachment", "tmp", cacheDir);
            OutputStream outStream = new FileOutputStream(tmpFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inStream, outStream);
            attachment.mContentUri = "file://"(MyHelperClass)(Object) + tmpFile.getAbsolutePath();
        }
        return attachment;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class Context {

public MyHelperClass getCacheDir(){ return null; }}

class Attachment {
public MyHelperClass mContentUri;
	public MyHelperClass mEncoding;
	public MyHelperClass mFileName;
	public MyHelperClass mMessageKey;
	public MyHelperClass mLocation;
	public MyHelperClass mMimeType;
	public MyHelperClass mSize;
	public MyHelperClass mContentId;
}
