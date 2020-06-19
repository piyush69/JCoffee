import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23126304 {
public MyHelperClass tsaPassword;
public MyHelperClass proxy;
	public MyHelperClass tsaUsername;
	public MyHelperClass tsaURL;

    protected byte[] getTSAResponse(byte[] requestBytes) throws SinaduraCoreException {
        byte[] respBytes = null;
        try {
            URL url = new URL((String)(Object)this.tsaURL);
            URLConnection tsaConnection = null;
            if (this.proxy == null) tsaConnection = url.openConnection(); else tsaConnection = url.openConnection((Proxy)(Object)this.proxy);
            tsaConnection.setDoInput(true);
            tsaConnection.setDoOutput(true);
            tsaConnection.setUseCaches(false);
            tsaConnection.setRequestProperty("Content-Type", "application/timestamp-query");
            tsaConnection.setRequestProperty("Content-Transfer-Encoding", "binary");
            if ((this.tsaUsername != null) && !this.tsaUsername.equals("")) {
                String userPassword = this.tsaUsername + ":" + this.tsaPassword;
                tsaConnection.setRequestProperty("Authorization", "Basic " + new String(new sun.misc.BASE64Encoder().encode(userPassword.getBytes())));
            }
            OutputStream out = tsaConnection.getOutputStream();
            out.write(requestBytes);
            out.close();
            InputStream inp = tsaConnection.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = inp.read(buffer, 0, buffer.length)) >= 0) {
                baos.write(buffer, 0, bytesRead);
            }
            respBytes = baos.toByteArray();
            String encoding = tsaConnection.getContentEncoding();
            if (encoding != null && encoding.equalsIgnoreCase("base64")) {
                sun.misc.BASE64Decoder dec = new sun.misc.BASE64Decoder();
                respBytes = dec.decodeBuffer(new String(respBytes));
            }
        } catch (MalformedURLException e) {
            throw new SinaduraCoreException("URL malformed " + e.getMessage(), e);
        } catch (IOException e) {
            throw new SinaduraCoreException("Connection Error " + e.getMessage(), e);
        }
        return respBytes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SinaduraCoreException extends Exception{
	public SinaduraCoreException(String errorMessage) { super(errorMessage); }
	SinaduraCoreException(String o0, IOException o1){}
	SinaduraCoreException(String o0, MalformedURLException o1){}
	SinaduraCoreException(){}
}
