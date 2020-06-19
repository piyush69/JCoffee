
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14293059 {
public static MyHelperClass MessageDigest;
	public static MyHelperClass to64(long o0, int o1){ return null; }
	public static MyHelperClass bytes2u(byte o0){ return null; }
	public static MyHelperClass clearbits(byte[] o0){ return null; }
//public MyHelperClass MessageDigest;
//	public MyHelperClass bytes2u(byte o0){ return null; }
//	public MyHelperClass clearbits(byte[] o0){ return null; }
//	public MyHelperClass to64(long o0, int o1){ return null; }

    public static final String crypt(final String password, String salt, final String magic) {
        if (password == null) throw new IllegalArgumentException("Null password!");
        if (salt == null) throw new IllegalArgumentException("Null salt!");
        if (magic == null) throw new IllegalArgumentException("Null salt!");
        byte finalState[];
        long l;
        MessageDigest ctx, ctx1;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            ctx =(MessageDigest)(Object) MessageDigest.getInstance("md5");
//            MyHelperClass MessageDigest = new MyHelperClass();
            ctx1 =(MessageDigest)(Object) MessageDigest.getInstance("md5");
        } catch (final UncheckedIOException ex) {
            System.err.println(ex);
            return null;
        }
        if (salt.startsWith(magic)) {
            salt = salt.substring(magic.length());
        }
        if (salt.indexOf('$') != -1) {
            salt = salt.substring(0, salt.indexOf('$'));
        }
        if (salt.length() > 8) {
            salt = salt.substring(0, 8);
        }
        ctx.update(password.getBytes());
        ctx.update(magic.getBytes());
        ctx.update(salt.getBytes());
        ctx1.update(password.getBytes());
        ctx1.update(salt.getBytes());
        ctx1.update(password.getBytes());
        finalState =(byte[])(Object) ctx1.digest();
        for (int pl = password.length(); pl > 0; pl -= 16) {
            ctx.update(finalState, 0, pl > 16 ? 16 : pl);
        }
        clearbits(finalState);
        for (int i = password.length(); i != 0; i >>>= 1) {
            if ((i & 1) != 0) {
                ctx.update(finalState, 0, 1);
            } else {
                ctx.update(password.getBytes(), 0, 1);
            }
        }
        finalState =(byte[])(Object) ctx.digest();
        for (int i = 0; i < 1000; i++) {
            try {
                ctx1 =(MessageDigest)(Object) MessageDigest.getInstance("md5");
            } catch (final UncheckedIOException e0) {
                return null;
            }
            if ((i & 1) != 0) {
                ctx1.update(password.getBytes());
            } else {
                ctx1.update(finalState, 0, 16);
            }
            if ((i % 3) != 0) {
                ctx1.update(salt.getBytes());
            }
            if ((i % 7) != 0) {
                ctx1.update(password.getBytes());
            }
            if ((i & 1) != 0) {
                ctx1.update(finalState, 0, 16);
            } else {
                ctx1.update(password.getBytes());
            }
            finalState =(byte[])(Object) ctx1.digest();
        }
        final StringBuffer result = new StringBuffer();
        result.append(magic);
        result.append(salt);
        result.append("$");
        l = ((int)(Object)bytes2u(finalState[0]) << 16) | ((int)(Object)bytes2u(finalState[6]) << 8) | (int)(Object)bytes2u(finalState[12]);
        result.append(to64(l, 4));
        l = ((int)(Object)bytes2u(finalState[1]) << 16) | ((int)(Object)bytes2u(finalState[7]) << 8) | (int)(Object)bytes2u(finalState[13]);
        result.append(to64(l, 4));
        l = ((int)(Object)bytes2u(finalState[2]) << 16) | ((int)(Object)bytes2u(finalState[8]) << 8) | (int)(Object)bytes2u(finalState[14]);
        result.append(to64(l, 4));
        l = ((int)(Object)bytes2u(finalState[3]) << 16) | ((int)(Object)bytes2u(finalState[9]) << 8) | (int)(Object)bytes2u(finalState[15]);
        result.append(to64(l, 4));
        l = ((int)(Object)bytes2u(finalState[4]) << 16) | ((int)(Object)bytes2u(finalState[10]) << 8) | (int)(Object)bytes2u(finalState[5]);
        result.append(to64(l, 4));
        l =(long)(Object) bytes2u(finalState[11]);
        result.append(to64(l, 2));
        clearbits(finalState);
        return result.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
