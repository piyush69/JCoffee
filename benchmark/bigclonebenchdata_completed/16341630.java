import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16341630 {
public MyHelperClass LOG;
	public MyHelperClass NSPathUtilities;
	public MyHelperClass UTType;
	public MyHelperClass _contentType;
	public MyHelperClass url(){ return null; }

    public String contentType()  throws Throwable {
        MyHelperClass _contentType = new MyHelperClass();
        if (_contentType != null) {
//            MyHelperClass _contentType = new MyHelperClass();
            return (String)(String)(Object) _contentType;
        }
        String uti = null;
        URL url =(URL)(Object) url();
        LOG.info("OKIOSIDManagedObject.contentType(): url = " + url + "\n");
        if (url != null) {
            String contentType = null;
            try {
                contentType = url.openConnection().getContentType();
            } catch (java.io.IOException e) {
                LOG.info("OKIOSIDManagedObject.contentType(): couldn't open URL connection!\n");
                String urlString = url.getPath();
                LOG.info("OKIOSIDManagedObject.contentType(): urlString = " + urlString + "\n");
                if (urlString != null) {
                    uti =(String)(Object) UTType.preferredIdentifierForTag(UTType.FilenameExtensionTagClass,(String)(Object) (NSPathUtilities.pathExtension(urlString)).toLowerCase(), null);
                }
                if (uti == null) {
                    uti =(String)(Object) UTType.Item;
                }
                return uti;
            }
            if (contentType != null) {
                LOG.info("OKIOSIDManagedObject.contentType(): contentType = " + contentType + "\n");
                uti =(String)(Object) UTType.preferredIdentifierForTag(UTType.MIMETypeTagClass, contentType, null);
            }
            if (uti == null) {
                uti =(String)(Object) UTType.Item;
            }
        } else {
            uti =(String)(Object) UTType.Item;
        }
        _contentType =(MyHelperClass)(Object) uti;
        LOG.info("OKIOSIDManagedObject.contentType(): uti = " + uti + "\n");
        return uti;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Item;
	public MyHelperClass FilenameExtensionTagClass;
	public MyHelperClass MIMETypeTagClass;
public MyHelperClass pathExtension(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass preferredIdentifierForTag(MyHelperClass o0, String o1, Object o2){ return null; }
	public MyHelperClass toLowerCase(){ return null; }}
