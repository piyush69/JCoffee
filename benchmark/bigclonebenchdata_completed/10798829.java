import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10798829 {
public MyHelperClass checkCriteria(Part o0){ return null; }

    private boolean handlePart(Part p) throws Throwable, MessagingException, GetterException {
        String filename =(String)(Object) p.getFileName();
        if (!(Boolean)(Object)p.isMimeType("multipart/*")) {
            String disp =(String)(Object) p.getDisposition();
            MyHelperClass Part = new MyHelperClass();
            if (disp == null || disp.equalsIgnoreCase((String)(Object)Part.ATTACHMENT)) {
                if ((boolean)(Object)checkCriteria(p)) {
                    MyHelperClass attnum = new MyHelperClass();
                    if (filename == null) filename = "Attachment" + attnum++;
                    MyHelperClass result = new MyHelperClass();
                    if (result == null) {
                        try {
                            File f = File.createTempFile("amorph_pop3-", ".tmp");
                            f.deleteOnExit();
                            OutputStream os = new BufferedOutputStream(new FileOutputStream(f));
                            InputStream is =(InputStream)(Object) p.getInputStream();
                            int c;
                            while ((c = is.read()) != -1) os.write(c);
                            os.close();
//                            MyHelperClass result = new MyHelperClass();
                            result =(MyHelperClass)(Object) new FileInputStream(f);
                            System.out.println("saved attachment to file: " + f.getAbsolutePath());
                            return true;
                        } catch (IOException ex) {
                            throw new GetterException(ex, "Failed to save attachment: " + ex);
                        }
                    }
                }
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int attnum;
	public MyHelperClass ATTACHMENT;
}

class Part {

public MyHelperClass isMimeType(String o0){ return null; }
	public MyHelperClass getDisposition(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getFileName(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class GetterException extends Exception{
	public GetterException(String errorMessage) { super(errorMessage); }
	GetterException(IOException o0, String o1){}
	GetterException(){}
}
