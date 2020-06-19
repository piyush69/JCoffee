import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c5794877 {
public MyHelperClass NULL;
	public MyHelperClass computeUserPassword(byte[] o0, byte[] o1, int o2, MyHelperClass o3, MyHelperClass o4, int o5){ return null; }
	public MyHelperClass computeEncryptedKey(byte[] o0, byte[] o1, int o2, MyHelperClass o3, MyHelperClass o4, int o5){ return null; }
public MyHelperClass computeOwnerPassword(byte[] o0, byte[] o1, MyHelperClass o2, int o3){ return null; }
	public MyHelperClass computeRevisionNumber(){ return null; }
	public MyHelperClass computeVersionNumber(){ return null; }

    public void prepareDocumentForEncryption(PDDocument doc) throws CryptographyException, IOException {
        PDDocument document =(PDDocument)(Object) NULL; //new PDDocument();
        document = doc;
//        MyHelperClass document = new MyHelperClass();
        PDEncryptionDictionary encryptionDictionary =(PDEncryptionDictionary)(Object) document.getEncryptionDictionary();
        if (encryptionDictionary == null) {
            encryptionDictionary = new PDEncryptionDictionary();
        }
        MyHelperClass version = new MyHelperClass();
        version = computeVersionNumber();
        MyHelperClass revision = new MyHelperClass();
        revision = computeRevisionNumber();
        MyHelperClass FILTER = new MyHelperClass();
        encryptionDictionary.setFilter(FILTER);
//        MyHelperClass version = new MyHelperClass();
        encryptionDictionary.setVersion(version);
//        MyHelperClass revision = new MyHelperClass();
        encryptionDictionary.setRevision(revision);
        MyHelperClass keyLength = new MyHelperClass();
        encryptionDictionary.setLength(keyLength);
        MyHelperClass policy = new MyHelperClass();
        String ownerPassword =(String)(Object) policy.getOwnerPassword();
//        MyHelperClass policy = new MyHelperClass();
        String userPassword =(String)(Object) policy.getUserPassword();
        if (ownerPassword == null) {
            ownerPassword = "";
        }
        if (userPassword == null) {
            userPassword = "";
        }
//        MyHelperClass policy = new MyHelperClass();
        int permissionInt =(int)(Object) policy.getPermissions().getPermissionBytes();
        encryptionDictionary.setPermissions(permissionInt);
//        MyHelperClass keyLength = new MyHelperClass();
        int length =(int)(Object) keyLength / 8;
//        MyHelperClass document = new MyHelperClass();
        COSArray idArray =(COSArray)(Object) document.getDocument().getDocumentID();
        if (idArray == null ||(int)(Object) idArray.size() < 2) {
            idArray = new COSArray();
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                MyHelperClass BigInteger = new MyHelperClass();
                BigInteger time =(BigInteger)(Object) BigInteger.valueOf(System.currentTimeMillis());
                md.update((byte[])(Object)time.toByteArray());
                md.update(ownerPassword.getBytes());
                md.update(userPassword.getBytes());
//                MyHelperClass document = new MyHelperClass();
                md.update(document.getDocument().toString().getBytes());
                byte[] id =(byte[])(Object) md.digest(this.toString().getBytes());
                COSString idString = new COSString();
                idString.append(id);
                idArray.add(idString);
                idArray.add(idString);
//                MyHelperClass document = new MyHelperClass();
                document.getDocument().setDocumentID(idArray);
            } catch (UncheckedIOException e) {
                throw new CryptographyException((String)(Object)e);
            } catch (ArithmeticException e) {
                throw new CryptographyException((String)(Object)e);
            }
        }
        COSString id = (COSString)(COSString)(Object) idArray.getObject(0);
//        MyHelperClass revision = new MyHelperClass();
        byte[] o =(byte[])(Object) computeOwnerPassword(ownerPassword.getBytes("ISO-8859-1"), userPassword.getBytes("ISO-8859-1"), revision, length);
//        MyHelperClass revision = new MyHelperClass();
        byte[] u =(byte[])(Object) computeUserPassword(userPassword.getBytes("ISO-8859-1"), o, permissionInt, id.getBytes(), revision, length);
        MyHelperClass encryptionKey = new MyHelperClass();
        encryptionKey = computeEncryptedKey(userPassword.getBytes("ISO-8859-1"), o, permissionInt, id.getBytes(), revision, length);
        encryptionDictionary.setOwnerKey(o);
        encryptionDictionary.setUserKey(u);
//        MyHelperClass document = new MyHelperClass();
        document.setEncryptionDictionary(encryptionDictionary);
//        MyHelperClass document = new MyHelperClass();
        document.getDocument().setEncryptionDictionary((PDEncryptionDictionary)(Object)encryptionDictionary.getCOSDictionary());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDocument(){ return null; }
	public MyHelperClass setDocumentID(COSArray o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getUserPassword(){ return null; }
	public MyHelperClass getEncryptionDictionary(){ return null; }
	public MyHelperClass valueOf(long o0){ return null; }
	public MyHelperClass getPermissionBytes(){ return null; }
	public MyHelperClass getOwnerPassword(){ return null; }
	public MyHelperClass setEncryptionDictionary(PDEncryptionDictionary o0){ return null; }
	public MyHelperClass getDocumentID(){ return null; }
	public MyHelperClass getPermissions(){ return null; }}

class PDDocument {

public MyHelperClass getDocument(){ return null; }
	public MyHelperClass setEncryptionDictionary(PDEncryptionDictionary o0){ return null; }
	public MyHelperClass getEncryptionDictionary(){ return null; }}

class CryptographyException extends Exception{
	public CryptographyException(String errorMessage) { super(errorMessage); }
}

class PDEncryptionDictionary {

public MyHelperClass setUserKey(byte[] o0){ return null; }
	public MyHelperClass setRevision(MyHelperClass o0){ return null; }
	public MyHelperClass setVersion(MyHelperClass o0){ return null; }
	public MyHelperClass setFilter(MyHelperClass o0){ return null; }
	public MyHelperClass setLength(MyHelperClass o0){ return null; }
	public MyHelperClass getCOSDictionary(){ return null; }
	public MyHelperClass setPermissions(int o0){ return null; }
	public MyHelperClass setOwnerKey(byte[] o0){ return null; }}

class COSArray {

public MyHelperClass add(COSString o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getObject(int o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }}

class BigInteger {

public MyHelperClass toByteArray(){ return null; }}

class COSString {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass append(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
