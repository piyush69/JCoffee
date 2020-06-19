


class c3058818 {

    public static void encryptFile(String input, String output, String pwd) throws Exception {
        CipherOutputStream out;
        InputStream in;
        Cipher cipher;
        SecretKey key;
        byte[] byteBuffer;
        MyHelperClass Cipher = new MyHelperClass();
        cipher =(Cipher)(Object) Cipher.getInstance("DES");
        key =(SecretKey)(Object) new SecretKeySpec(pwd.getBytes(), "DES");
//        MyHelperClass Cipher = new MyHelperClass();
        cipher.init(Cipher.ENCRYPT_MODE, key);
        in =(InputStream)(Object) new FileInputStream(input);
        out = new CipherOutputStream(new FileOutputStream(output), cipher);
        byteBuffer = new byte[1024];
        for (int n; (n =(int)(Object) in.read(byteBuffer)) != -1; out.write(byteBuffer, 0, n)) ;
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }}

class CipherOutputStream {

CipherOutputStream(){}
	CipherOutputStream(FileOutputStream o0, Cipher o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Cipher {

public MyHelperClass init(MyHelperClass o0, SecretKey o1){ return null; }}

class SecretKey {

}

class SecretKeySpec {

SecretKeySpec(){}
	SecretKeySpec(byte[] o0, String o1){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
