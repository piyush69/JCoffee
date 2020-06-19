import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5066508 {
public MyHelperClass fields;
	public MyHelperClass getFields(ISOMsg o0){ return null; }
public MyHelperClass ISOUtil;
	public MyHelperClass ISOMsg;
	public MyHelperClass getKey(){ return null; }

    public ISOMsg filter(ISOChannel channel, ISOMsg m, LogEvent evt) throws Throwable, VetoException {
        MyHelperClass key = new MyHelperClass();
        if (key == null || fields == null) throw new VetoException("MD5Filter not configured");
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((byte)(Object)getKey());
            int[] f =(int[])(Object) getFields(m);
            for (int i = 0; i < f.length; i++) {
                int fld = f[i];
                if ((boolean)(Object)m.hasField(fld)) {
                    ISOComponent c =(ISOComponent)(Object) m.getComponent(fld);
                    if ((ISOBinaryField)(Object)c instanceof ISOBinaryField) md.update((byte[]) c.getValue()); else md.update(((String) c.getValue()).getBytes());
                }
            }
            byte[] digest = md.digest();
            if (m.getDirection() == ISOMsg.OUTGOING) {
                m.set(new ISOBinaryField(64, digest, 0, 8));
                m.set(new ISOBinaryField(128, digest, 8, 8));
            } else {
                byte[] rxDigest = new byte[16];
                if ((boolean)(Object)m.hasField(64)) System.arraycopy((byte[]) m.getValue(64), 0, rxDigest, 0, 8);
                if ((boolean)(Object)m.hasField(128)) System.arraycopy((byte[]) m.getValue(128), 0, rxDigest, 8, 8);
                if (!Arrays.equals(digest, rxDigest)) {
                    evt.addMessage(m);
                    evt.addMessage("MAC expected: "(ISOMsg)(Object) + ISOUtil.hexString(digest));
                    evt.addMessage("MAC received: "(ISOMsg)(Object) + ISOUtil.hexString(rxDigest));
                    throw new VetoException("invalid MAC");
                }
                m.unset(64);
                m.unset(128);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new VetoException((String)(Object)e);
        } catch (ISOException e) {
            throw new VetoException((String)(Object)e);
        }
        return m;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OUTGOING;
public MyHelperClass hexString(byte[] o0){ return null; }}

class ISOChannel {

}

class ISOMsg {

public MyHelperClass hasField(int o0){ return null; }
	public MyHelperClass getValue(int o0){ return null; }
	public MyHelperClass unset(int o0){ return null; }
	public MyHelperClass getComponent(int o0){ return null; }
	public MyHelperClass set(ISOBinaryField o0){ return null; }
	public MyHelperClass getDirection(){ return null; }}

class LogEvent {

public MyHelperClass addMessage(ISOMsg o0){ return null; }}

class VetoException extends Exception{
	public VetoException(String errorMessage) { super(errorMessage); }
}

class ISOComponent {

public MyHelperClass getValue(){ return null; }}

class ISOBinaryField {

ISOBinaryField(int o0, byte[] o1, int o2, int o3){}
	ISOBinaryField(){}}

class ISOException extends Exception{
	public ISOException(String errorMessage) { super(errorMessage); }
}
