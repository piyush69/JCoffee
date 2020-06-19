import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6009527 {
public MyHelperClass getString(MyHelperClass o0){ return null; }
public MyHelperClass createUniqueFile(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass string;
	public MyHelperClass Toast;
	public MyHelperClass startActivity(Intent o0){ return null; }
public MyHelperClass Intent;
	public MyHelperClass AttachmentProvider;
	public MyHelperClass mHandler;
	public MyHelperClass mLoadAttachmentSave;
	public MyHelperClass Environment;
	public MyHelperClass IOUtils;
	public MyHelperClass getContentResolver(){ return null; }

    private void doFinishLoadAttachment(long attachmentId)  throws Throwable {
        MyHelperClass mLoadAttachmentId = new MyHelperClass();
        if (attachmentId != (long)(Object)mLoadAttachmentId) {
            return;
        }
        MyHelperClass Attachment = new MyHelperClass();
        Attachment attachment = Attachment.restoreAttachmentWithId(MessageView.this, attachmentId);
        MyHelperClass mAccountId = new MyHelperClass();
        Uri attachmentUri =(Uri)(Object) AttachmentProvider.getAttachmentUri(mAccountId, attachment.mId);
        Uri contentUri =(Uri)(Object) AttachmentProvider.resolveAttachmentIdToContentUri(getContentResolver(), attachmentUri);
        if ((boolean)(Object)mLoadAttachmentSave) {
            try {
                File file =(File)(Object) createUniqueFile(Environment.getExternalStorageDirectory(), attachment.mFileName);
                InputStream in =(InputStream)(Object) getContentResolver().openInputStream(contentUri);
                OutputStream out = new FileOutputStream(file);
                IOUtils.copy(in, out);
                out.flush();
                out.close();
                in.close();
                Toast.makeText(MessageView.this, String.format((String)(Object)getString(string.message_view_status_attachment_saved), file.getName()), Toast.LENGTH_LONG).show();
                new MediaScannerNotifier(this, file, mHandler);
            } catch (IOException ioe) {
                Toast.makeText(MessageView.this, getString(string.message_view_status_attachment_not_saved), Toast.LENGTH_LONG).show();
            }
        } else {
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(contentUri);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
                mHandler.attachmentViewError();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FLAG_GRANT_READ_URI_PERMISSION;
	public MyHelperClass LENGTH_LONG;
	public MyHelperClass message_view_status_attachment_not_saved;
	public MyHelperClass ACTION_VIEW;
	public MyHelperClass message_view_status_attachment_saved;
public MyHelperClass attachmentViewError(){ return null; }
	public MyHelperClass resolveAttachmentIdToContentUri(MyHelperClass o0, Uri o1){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass openInputStream(Uri o0){ return null; }
	public MyHelperClass getExternalStorageDirectory(){ return null; }
	public MyHelperClass getAttachmentUri(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Attachment {
public MyHelperClass mFileName;
	public MyHelperClass mId;
}

class MessageView {

}

class Uri {

}

class MediaScannerNotifier {

MediaScannerNotifier(c6009527 o0, File o1, MyHelperClass o2){}
	MediaScannerNotifier(){}}

class Intent {

Intent(MyHelperClass o0){}
	Intent(){}
	public MyHelperClass addFlags(MyHelperClass o0){ return null; }
	public MyHelperClass setData(Uri o0){ return null; }}

class ActivityNotFoundException extends Exception{
	public ActivityNotFoundException(String errorMessage) { super(errorMessage); }
}
