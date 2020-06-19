import java.io.*;
import java.lang.*;
import java.util.*;



class c4533931 {
public MyHelperClass NULL;

    public void initForEncryption() throws CryptographyException, IOException {
        MyHelperClass pdDocument = new MyHelperClass();
        String ownerPassword =(String)(Object) pdDocument.getOwnerPasswordForEncryption();
//        MyHelperClass pdDocument = new MyHelperClass();
        String userPassword =(String)(Object) pdDocument.getUserPasswordForEncryption();
        if (ownerPassword == null) {
            ownerPassword = "";
        }
        if (userPassword == null) {
            userPassword = "";
        }
//        MyHelperClass pdDocument = new MyHelperClass();
        PDStandardEncryption encParameters = (PDStandardEncryption)(PDStandardEncryption)(Object) pdDocument.getEncryptionDictionary();
        int permissionInt =(int)(Object) encParameters.getPermissions();
        int revision =(int)(Object) encParameters.getRevision();
        int length =(int)(Object) encParameters.getLength() / 8;
        MyHelperClass document = new MyHelperClass();
        COSArray idArray =(COSArray)(Object) document.getDocumentID();
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
                md.update(document.toString().getBytes());
                byte[] id =(byte[])(Object) md.digest(this.toString().getBytes());
                COSString idString = new COSString();
                idString.append(id);
                idArray.add(idString);
                idArray.add(idString);
//                MyHelperClass document = new MyHelperClass();
                document.setDocumentID(idArray);
            } catch (UncheckedIOException e) {
                throw new CryptographyException((String)(Object)e);
            }
        }
        COSString id = (COSString)(COSString)(Object) idArray.getObject(0);
        PDFEncryption encryption =(PDFEncryption)(Object) NULL; //new PDFEncryption();
        encryption = new PDFEncryption();
//        MyHelperClass encryption = new MyHelperClass();
        byte[] o =(byte[])(Object) encryption.computeOwnerPassword(ownerPassword.getBytes("ISO-8859-1"), userPassword.getBytes("ISO-8859-1"), revision, length);
//        MyHelperClass encryption = new MyHelperClass();
        byte[] u =(byte[])(Object) encryption.computeUserPassword(userPassword.getBytes("ISO-8859-1"), o, permissionInt, id.getBytes(), revision, length);
        MyHelperClass encryptionKey = new MyHelperClass();
        encryptionKey = encryption.computeEncryptedKey(userPassword.getBytes("ISO-8859-1"), o, permissionInt, id.getBytes(), revision, length);
        encParameters.setOwnerKey(o);
        encParameters.setUserKey(u);
//        MyHelperClass document = new MyHelperClass();
        document.setEncryptionDictionary(encParameters.getCOSDictionary());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDocumentID(COSArray o0){ return null; }
	public MyHelperClass setEncryptionDictionary(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getEncryptionDictionary(){ return null; }
	public MyHelperClass computeUserPassword(byte[] o0, byte[] o1, int o2, MyHelperClass o3, int o4, int o5){ return null; }
	public MyHelperClass getOwnerPasswordForEncryption(){ return null; }
	public MyHelperClass computeEncryptedKey(byte[] o0, byte[] o1, int o2, MyHelperClass o3, int o4, int o5){ return null; }
	public MyHelperClass computeOwnerPassword(byte[] o0, byte[] o1, int o2, int o3){ return null; }
	public MyHelperClass valueOf(long o0){ return null; }
	public MyHelperClass getUserPasswordForEncryption(){ return null; }
	public MyHelperClass getDocumentID(){ return null; }}

class CryptographyException extends Exception{
	public CryptographyException(String errorMessage) { super(errorMessage); }
}

class PDStandardEncryption {

public MyHelperClass setUserKey(byte[] o0){ return null; }
	public MyHelperClass getLength(){ return null; }
	public MyHelperClass getCOSDictionary(){ return null; }
	public MyHelperClass getRevision(){ return null; }
	public MyHelperClass setOwnerKey(byte[] o0){ return null; }
	public MyHelperClass getPermissions(){ return null; }}

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

class PDFEncryption {

public MyHelperClass computeEncryptedKey(byte[] o0, byte[] o1, int o2, MyHelperClass o3, int o4, int o5){ return null; }
	public MyHelperClass computeOwnerPassword(byte[] o0, byte[] o1, int o2, int o3){ return null; }
	public MyHelperClass computeUserPassword(byte[] o0, byte[] o1, int o2, MyHelperClass o3, int o4, int o5){ return null; }}
