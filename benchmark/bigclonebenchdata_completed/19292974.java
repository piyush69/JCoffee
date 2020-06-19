import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19292974 {
public MyHelperClass NULL;
public MyHelperClass document;
	public MyHelperClass willEncrypt;

    public void write(PDDocument doc) throws Throwable, COSVisitorException {
        PDDocument document =(PDDocument)(Object) NULL; //new PDDocument();
        document = doc;
//        MyHelperClass document = new MyHelperClass();
        SecurityHandler securityHandler =(SecurityHandler)(Object) document.getSecurityHandler();
        if (securityHandler != null) {
            try {
//                MyHelperClass document = new MyHelperClass();
                securityHandler.prepareDocumentForEncryption((MyHelperClass)(Object)document);
                this.willEncrypt =(MyHelperClass)(Object) true;
            } catch (ArithmeticException e) {
                throw new COSVisitorException((String)(Object)e);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new COSVisitorException((String)(Object)e);
            }
        } else {
            this.willEncrypt =(MyHelperClass)(Object) false;
        }
        COSDocument cosDoc =(COSDocument)(Object) document.getDocument();
        COSDictionary trailer =(COSDictionary)(Object) cosDoc.getTrailer();
        COSArray idArray = (COSArray)(COSArray)(Object) trailer.getDictionaryObject("ID");
        if (idArray == null) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(Long.toString(System.currentTimeMillis()).getBytes());
                COSDictionary info = (COSDictionary)(COSDictionary)(Object) trailer.getDictionaryObject("Info");
                if (info != null) {
                    Iterator values =(Iterator)(Object) info.getValues().iterator();
                    while (values.hasNext()) {
                        md.update(values.next().toString().getBytes());
                    }
                }
                idArray = new COSArray();
                COSString id = new COSString(md.digest());
                idArray.add(id);
                idArray.add(id);
                trailer.setItem("ID", idArray);
            } catch (NoSuchAlgorithmException e) {
                throw new COSVisitorException((String)(Object)e);
            }
        }
        cosDoc.accept(this);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSecurityHandler(){ return null; }
	public MyHelperClass getDocument(){ return null; }
	public MyHelperClass iterator(){ return null; }}

class PDDocument {

public MyHelperClass getSecurityHandler(){ return null; }
	public MyHelperClass getDocument(){ return null; }}

class COSVisitorException extends Exception{
	public COSVisitorException(String errorMessage) { super(errorMessage); }
}

class SecurityHandler {

public MyHelperClass prepareDocumentForEncryption(MyHelperClass o0){ return null; }}

class CryptographyException extends Exception{
	public CryptographyException(String errorMessage) { super(errorMessage); }
}

class COSDocument {

public MyHelperClass getTrailer(){ return null; }
	public MyHelperClass accept(c19292974 o0){ return null; }}

class COSDictionary {

public MyHelperClass getValues(){ return null; }
	public MyHelperClass setItem(String o0, COSArray o1){ return null; }
	public MyHelperClass getDictionaryObject(String o0){ return null; }}

class COSArray {

public MyHelperClass add(COSString o0){ return null; }}

class COSString {

COSString(byte[] o0){}
	COSString(){}}
