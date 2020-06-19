import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2517852 {
public MyHelperClass _contentType;
	public MyHelperClass UTType;
	public MyHelperClass url(){ return null; }

    public String contentType()  throws Throwable {
        MyHelperClass _contentType = new MyHelperClass();
        if (_contentType != null) {
//            MyHelperClass _contentType = new MyHelperClass();
            return (String)(String)(Object) _contentType;
        }
        String uti = null;
        URL url =(URL)(Object) url();
        System.out.println("OKIOSIDManagedObject.contentType(): url = " + url + "\n");
        if (url != null) {
            String contentType = null;
            try {
                contentType = url.openConnection().getContentType();
            } catch (java.io.IOException e) {
                System.out.println("OKIOSIDManagedObject.contentType(): couldn't open URL connection!\n");
                return(String)(Object) UTType.Item;
            }
            if (contentType != null) {
                System.out.println("OKIOSIDManagedObject.contentType(): contentType = " + contentType + "\n");
                uti =(String)(Object) UTType.preferredIdentifierForTag(UTType.MIMETypeTagClass, contentType, null);
            }
            if (uti == null) {
                uti =(String)(Object) UTType.Item;
            }
        } else {
            uti =(String)(Object) UTType.Item;
        }
        _contentType =(MyHelperClass)(Object) uti;
        System.out.println("OKIOSIDManagedObject.contentType(): uti = " + uti + "\n");
        return uti;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Item;
	public MyHelperClass MIMETypeTagClass;
public MyHelperClass preferredIdentifierForTag(MyHelperClass o0, String o1, Object o2){ return null; }}
