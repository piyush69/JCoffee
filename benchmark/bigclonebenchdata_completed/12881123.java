


class c12881123 {

    ServerInfo getServerInfo(String key, String protocol) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, IOException, ClassNotFoundException, IllegalBlockSizeException, BadPaddingException {
        MyHelperClass Base64 = new MyHelperClass();
        DESedeKeySpec ks = new DESedeKeySpec(Base64.decode(key));
        MyHelperClass SecretKeyFactory = new MyHelperClass();
        SecretKeyFactory skf =(SecretKeyFactory)(Object) SecretKeyFactory.getInstance("DESede");
        SecretKey sk =(SecretKey)(Object) skf.generateSecret(ks);
        MyHelperClass Cipher = new MyHelperClass();
        Cipher cipher =(Cipher)(Object) Cipher.getInstance("DESede");
//        MyHelperClass Cipher = new MyHelperClass();
        cipher.init(Cipher.DECRYPT_MODE, sk);
        ClassLoader cl = this.getClass().getClassLoader();
        URL url =(URL)(Object) cl.getResource(protocol + ".sobj");
        JarURLConnection jc = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
        ObjectInputStream os = new ObjectInputStream(jc.getInputStream());
        SealedObject so = (SealedObject)(SealedObject)(Object) os.readObject();
        return (ServerInfo)(ServerInfo)(Object) so.getObject(cipher);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DECRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass decode(String o0){ return null; }}

class ServerInfo {

}

class InvalidKeyException extends Exception{
	public InvalidKeyException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class InvalidKeySpecException extends Exception{
	public InvalidKeySpecException(String errorMessage) { super(errorMessage); }
}

class NoSuchPaddingException extends Exception{
	public NoSuchPaddingException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IllegalBlockSizeException extends Exception{
	public IllegalBlockSizeException(String errorMessage) { super(errorMessage); }
}

class BadPaddingException extends Exception{
	public BadPaddingException(String errorMessage) { super(errorMessage); }
}

class DESedeKeySpec {

DESedeKeySpec(MyHelperClass o0){}
	DESedeKeySpec(){}}

class SecretKeyFactory {

public MyHelperClass generateSecret(DESedeKeySpec o0){ return null; }}

class SecretKey {

}

class Cipher {

public MyHelperClass init(MyHelperClass o0, SecretKey o1){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class JarURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class ObjectInputStream {

ObjectInputStream(MyHelperClass o0){}
	ObjectInputStream(){}
	public MyHelperClass readObject(){ return null; }}

class SealedObject {

public MyHelperClass getObject(Cipher o0){ return null; }}
