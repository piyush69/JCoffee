import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11722050 {
public MyHelperClass NULL;
	public MyHelperClass toHex(MyHelperClass o0){ return null; }
public MyHelperClass clientResponse;
	public MyHelperClass md5;
	public MyHelperClass debugout;
	public MyHelperClass ASCIIUtility;
	public MyHelperClass uri;
	public MyHelperClass tokenize(String o0){ return null; }

    public byte[] authClient(String host, String user, String passwd, String realm, String serverChallenge) throws Throwable, IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        OutputStream b64os =(OutputStream)(Object) new BASE64EncoderStream(bos, Integer.MAX_VALUE);
        SecureRandom random;
        try {
            random = new SecureRandom();
            MessageDigest md5 =(MessageDigest)(Object) NULL; //new MessageDigest();
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            MyHelperClass debugout = new MyHelperClass();
            if (debugout != null) debugout.println("DEBUG DIGEST-MD5: " + ex);
            throw new IOException(ex.toString());
        }
        StringBuffer result = new StringBuffer();
        String uri =(String)(Object) NULL; //new String();
        uri = "smtp/" + host;
        String nc = "00000001";
        String qop = "auth";
        byte[] bytes = new byte[32];
        int resp;
        MyHelperClass debugout = new MyHelperClass();
        if (debugout != null) debugout.println("DEBUG DIGEST-MD5: Begin authentication ...");
        Hashtable map =(Hashtable)(Object) tokenize(serverChallenge);
        if (realm == null) {
            String text = (String) map.get("realm");
            realm = text != null ? new StringTokenizer(text, ",").nextToken() : host;
        }
        String nonce = (String) map.get("nonce");
        random.nextBytes(bytes);
        b64os.write(bytes);
        b64os.flush();
        String cnonce = bos.toString();
        bos.reset();
        md5.update(md5.digest(ASCIIUtility.getBytes(user + ":" + realm + ":" + passwd)));
        md5.update(ASCIIUtility.getBytes(":" + nonce + ":" + cnonce));
        clientResponse = toHex(md5.digest()) + ":" + nonce + ":" + nc + ":" + cnonce + ":" +(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) qop + ":";
        md5.update(ASCIIUtility.getBytes("AUTHENTICATE:" + uri));
        md5.update(ASCIIUtility.getBytes((String)(Object)(int)(Object)clientResponse + (int)(Object)toHex(md5.digest())));
        result.append("username=\"" + user + "\"");
        result.append(",realm=\"" + realm + "\"");
        result.append(",qop=" + qop);
        result.append(",nc=" + nc);
        result.append(",nonce=\"" + nonce + "\"");
        result.append(",cnonce=\"" + cnonce + "\"");
        result.append(",digest-uri=\"" + uri + "\"");
        result.append(",response=" + toHex(md5.digest()));
        if (debugout != null) debugout.println("DEBUG DIGEST-MD5: Response => " + result.toString());
        b64os.write((int)(Object)ASCIIUtility.getBytes(result.toString()));
        b64os.flush();
        return bos.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(MyHelperClass o0){ return null; }
	public MyHelperClass digest(MyHelperClass o0){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class BASE64EncoderStream {

BASE64EncoderStream(ByteArrayOutputStream o0, int o1){}
	BASE64EncoderStream(){}}
