import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4652514 {
public MyHelperClass loadCredential(MyHelperClass o0){ return null; }
public MyHelperClass certificate;

    public  void Certificate(URL url) throws Throwable, CertificateException {
        try {
            URLConnection con = url.openConnection();
            InputStream in2 = con.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(in2));
            String inputLine;
            StringBuffer cert = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                cert.append(inputLine);
                cert.append("\n");
            }
            in.close();
            this.certificate =(MyHelperClass)(Object) cert.toString();
        } catch (IOException ex) {
            throw new CertificateException("Unable to read in credential: " + ex.getMessage(), ex);
        }
        loadCredential(this.certificate);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CertificateException extends Exception{
	public CertificateException(String errorMessage) { super(errorMessage); }
	CertificateException(String o0, IOException o1){}
	CertificateException(){}
}
