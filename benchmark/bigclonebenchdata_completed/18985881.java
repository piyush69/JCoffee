


class c18985881 {
public static MyHelperClass to64(long o0, int o1){ return null; }
	public static MyHelperClass bytes2u(byte o0){ return null; }
	public static MyHelperClass clearbits(byte[] o0){ return null; }
public MyHelperClass MessageDigest;
//	public MyHelperClass bytes2u(byte o0){ return null; }
//	public MyHelperClass clearbits(byte[] o0){ return null; }
//	public MyHelperClass to64(long o0, int o1){ return null; }

    public static final String crypt(String password, String salt) throws NoSuchAlgorithmException {
        String magic = "$1$";
        byte finalState[];
        MessageDigest ctx, ctx1;
        long l;
        if (salt.startsWith(magic)) {
            salt = salt.substring(magic.length());
        }
        if (salt.indexOf('$') != -1) {
            salt = salt.substring(0, salt.indexOf('$'));
        }
        if (salt.length() > 8) {
            salt = salt.substring(0, 8);
        }
        MyHelperClass MessageDigest = new MyHelperClass();
        ctx =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        ctx.update(password.getBytes());
        ctx.update(magic.getBytes());
        ctx.update(salt.getBytes());
//        MyHelperClass MessageDigest = new MyHelperClass();
        ctx1 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        ctx1.update(password.getBytes());
        ctx1.update(salt.getBytes());
        ctx1.update(password.getBytes());
        finalState =(byte[])(Object) ctx1.digest();
        for (int pl = password.length(); pl > 0; pl -= 16) {
            for (int i = 0; i < (pl > 16 ? 16 : pl); i++) ctx.update(finalState[i]);
        }
        clearbits(finalState);
        for (int i = password.length(); i != 0; i >>>= 1) {
            if ((i & 1) != 0) {
                ctx.update(finalState[0]);
            } else {
                ctx.update(password.getBytes()[0]);
            }
        }
        finalState =(byte[])(Object) ctx.digest();
        for (int i = 0; i < 1000; i++) {
            ctx1 =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            if ((i & 1) != 0) {
                ctx1.update(password.getBytes());
            } else {
                for (int c = 0; c < 16; c++) ctx1.update(finalState[c]);
            }
            if ((i % 3) != 0) {
                ctx1.update(salt.getBytes());
            }
            if ((i % 7) != 0) {
                ctx1.update(password.getBytes());
            }
            if ((i & 1) != 0) {
                for (int c = 0; c < 16; c++) ctx1.update(finalState[c]);
            } else {
                ctx1.update(password.getBytes());
            }
            finalState =(byte[])(Object) ctx1.digest();
        }
        StringBuffer result = new StringBuffer();
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

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass update(byte o0){ return null; }}
