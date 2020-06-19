import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22625096 {
public MyHelperClass IncommingProcessor;
	public MyHelperClass Pattern;
public MyHelperClass BCUtils;
	public MyHelperClass TmpFile;
	public MyHelperClass StreamUtils;
	public MyHelperClass logger;
	public MyHelperClass Destination;
	public MyHelperClass S;
	public MyHelperClass PublicKey;
	public MyHelperClass OutFile;
	public MyHelperClass Callback;
	public MyHelperClass WaitToClose(){ return null; }
	public MyHelperClass CloseWait(){ return null; }
	public MyHelperClass close(){ return null; }

    public void run()  throws Throwable {
        long starttime = (new Date()).getTime();
        MyHelperClass Destination = new MyHelperClass();
        Matcher m =(Matcher)(Object) Pattern.compile("(\\S+);(\\d+)").matcher(Destination);
        boolean completed = false;
        MyHelperClass OutFile = new MyHelperClass();
        if ((int)(Object)OutFile.length() > (int)(Object)IncommingProcessor.MaxPayload) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Payload is too large!");
            close();
        } else {
            if ((boolean)(Object)m.find()) {
                Runnable cl = new Runnable() {

                    public void run() {
                        WaitToClose();
                    }
                };
                Thread t = new Thread(cl);
                t.start();
                S = null;
                try {
                    String ip =(String)(Object) m.group(1);
                    int port = Integer.valueOf((String)(Object)m.group(2));
                    SerpentEngine eng = new SerpentEngine();
                    byte[] keybytes = new byte[(int)(Object)eng.getBlockSize()];
                    byte[] ivbytes = new byte[(int)(Object)eng.getBlockSize()];
                    Random.nextBytes(keybytes);
                    Random.nextBytes(ivbytes);
                    KeyParameter keyparm = new KeyParameter(keybytes);
                    ParametersWithIV keyivparm = new ParametersWithIV(keyparm, ivbytes);
                    byte[] parmbytes =(byte[])(Object) BCUtils.writeParametersWithIV(keyivparm);
                    OAEPEncoding enc = new OAEPEncoding(new ElGamalEngine(), new RIPEMD128Digest());
                    enc.init(true, PublicKey);
                    byte[] encbytes =(byte[])(Object) enc.encodeBlock(parmbytes, 0, parmbytes.length);
                    PaddedBufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new SerpentEngine()));
                    cipher.init(true, keyivparm);
                    byte[] inbuffer = new byte[128];
                    byte[] outbuffer = new byte[256];
                    int readlen = 0;
                    int cryptlen = 0;
                    FileInputStream fis = new FileInputStream((String)(Object)OutFile);
                    FileOutputStream fos = new FileOutputStream((String)(Object)TmpFile);
                    readlen = fis.read(inbuffer);
                    while (readlen >= 0) {
                        if (readlen > 0) {
                            cryptlen =(int)(Object) cipher.processBytes(inbuffer, 0, readlen, outbuffer, 0);
                            fos.write(outbuffer, 0, cryptlen);
                        }
                        readlen = fis.read(inbuffer);
                    }
                    cryptlen =(int)(Object) cipher.doFinal(outbuffer, 0);
                    if (cryptlen > 0) {
                        fos.write(outbuffer, 0, cryptlen);
                    }
                    fos.close();
                    fis.close();
                    S =(MyHelperClass)(Object) new Socket(ip, port);
                    DataOutputStream dos = new DataOutputStream((OutputStream)(Object)S.getOutputStream());
                    dos.writeInt(encbytes.length);
                    dos.write(encbytes);
                    dos.writeLong((long)(Object)TmpFile.length());
                    fis = new FileInputStream((String)(Object)TmpFile);
                    readlen = fis.read(inbuffer);
                    while (readlen >= 0) {
                        dos.write(inbuffer, 0, readlen);
                        readlen = fis.read(inbuffer);
                    }
                    DataInputStream dis = new DataInputStream((InputStream)(Object)S.getInputStream());
                    byte[] encipbytes =(byte[])(Object) StreamUtils.readBytes(dis);
                    cipher.init(false, keyivparm);
                    byte[] decipbytes = new byte[encipbytes.length];
                    int len =(int)(Object) cipher.processBytes(encipbytes, 0, encipbytes.length, decipbytes, 0);
                    len += (int)(Object)cipher.doFinal(decipbytes, len);
                    byte[] realbytes = new byte[len];
                    System.arraycopy(decipbytes, 0, realbytes, 0, len);
                    String ipstr = new String(realbytes, "ISO-8859-1");
                    Callback.Success(ipstr);
                    completed = true;
                    dos.write(0);
                    dos.flush();
                    close();
                } catch (Exception e) {
                    close();
                    if (!completed) {
                        e.printStackTrace();
                        Callback.Fail(e.getMessage());
                    }
                }
            } else {
                close();
                logger.warn("Improper destination string. " + Destination);
                Callback.Fail("Improper destination string. " + Destination);
            }
        }
        CloseWait();
        long newtime = (new Date()).getTime();
        long timediff = newtime - starttime;
        logger.debug("Outgoing processor took: " + timediff);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MaxPayload;
public static MyHelperClass nextBytes(byte[] o0){ return null; }
	public MyHelperClass Success(String o0){ return null; }
	public MyHelperClass readBytes(DataInputStream o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass matcher(MyHelperClass o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass writeParametersWithIV(ParametersWithIV o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass Fail(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class SerpentEngine {

public MyHelperClass getBlockSize(){ return null; }}

class KeyParameter {

KeyParameter(byte[] o0){}
	KeyParameter(){}}

class ParametersWithIV {

ParametersWithIV(KeyParameter o0, byte[] o1){}
	ParametersWithIV(){}}

class OAEPEncoding {

OAEPEncoding(ElGamalEngine o0, RIPEMD128Digest o1){}
	OAEPEncoding(){}
	public MyHelperClass init(boolean o0, MyHelperClass o1){ return null; }
	public MyHelperClass encodeBlock(byte[] o0, int o1, int o2){ return null; }}

class ElGamalEngine {

}

class RIPEMD128Digest {

}

class PaddedBufferedBlockCipher {

PaddedBufferedBlockCipher(){}
	PaddedBufferedBlockCipher(CBCBlockCipher o0){}
	public MyHelperClass doFinal(byte[] o0, int o1){ return null; }
	public MyHelperClass init(boolean o0, ParametersWithIV o1){ return null; }
	public MyHelperClass processBytes(byte[] o0, int o1, int o2, byte[] o3, int o4){ return null; }}

class CBCBlockCipher {

CBCBlockCipher(SerpentEngine o0){}
	CBCBlockCipher(){}}
