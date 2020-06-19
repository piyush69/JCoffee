import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6966398 {
public static MyHelperClass PdfSignatureAppearance;
	public static MyHelperClass CertificateFactory;
	public static MyHelperClass PdfPKCS7;
	public static MyHelperClass PdfStamper;
	public static MyHelperClass createPdf(){ return null; }
//public MyHelperClass PdfPKCS7;
//	public MyHelperClass PdfSignatureAppearance;
//	public MyHelperClass PdfStamper;
//	public MyHelperClass CertificateFactory;
//	public MyHelperClass createPdf(){ return null; }

    public static void main(String[] args)  throws Throwable {
        System.out.println("Chapter 16: example SignedPdf");
        System.out.println("-> Creates a signed PDF;");
        System.out.println("-> jars needed: iText.jar");
        System.out.println("-> files generated in /results subdirectory:");
        System.out.println("   Resource needed: .keystore");
        System.out.println("-> Resulting PDFs: unsigned_message.pdf, signed_message.pdf,");
        System.out.println("   corrupted_message.pdf, signed_message_invisible.pdf,");
        System.out.println("   double_signed_message.pdf, revision_1.pdf and revision_2.pdf");
        createPdf();
        PdfReader reader;
        try {
            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(new FileInputStream("resources/in_action/chapter16/.keystore"), "f00b4r".toCharArray());
            PrivateKey key = (PrivateKey) ks.getKey("foobar", "r4b00f".toCharArray());
            Certificate[] chain =(java.security.Certificate[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ks.getCertificateChain("foobar");
            reader = new PdfReader("results/in_action/chapter16/unsigned_message.pdf");
            FileOutputStream os = new FileOutputStream("results/in_action/chapter16/signed_message.pdf");
            PdfStamper stamper =(PdfStamper)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) PdfStamper.createSignature(reader, os, '\0');
            PdfSignatureAppearance appearance =(PdfSignatureAppearance)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) stamper.getSignatureAppearance();
            appearance.setCrypto(key, chain, null, PdfSignatureAppearance.SELF_SIGNED);
            appearance.setCertificationLevel(PdfSignatureAppearance.CERTIFIED_FORM_FILLING);
            appearance.setReason("It's personal.");
            appearance.setLocation("Foobar");
            appearance.setVisibleSignature(new Rectangle(30, 750, 500, 565), 1, null);
            stamper.close();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        try {
            reader = new PdfReader("results/in_action/chapter16/signed_message.pdf");
            Document document = new Document(reader.getPageSizeWithRotation(1));
            PdfCopy copy = new PdfCopy(document, new FileOutputStream("results/in_action/chapter16/corrupted_message.pdf"));
            document.open();
            copy.addPage(copy.getImportedPage(reader, 1));
            document.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (DocumentException de) {
            de.printStackTrace();
        }
        try {
            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(new FileInputStream("resources/in_action/chapter16/.keystore"), "f00b4r".toCharArray());
            PrivateKey key = (PrivateKey) ks.getKey("foobar", "r4b00f".toCharArray());
            Certificate[] chain =(java.security.Certificate[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ks.getCertificateChain("foobar");
            reader = new PdfReader("results/in_action/chapter16/unsigned_message.pdf");
            FileOutputStream os = new FileOutputStream("results/in_action/chapter16/signed_message_invisible.pdf");
            PdfStamper stamper =(PdfStamper)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) PdfStamper.createSignature(reader, os, '\0');
            PdfSignatureAppearance appearance =(PdfSignatureAppearance)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) stamper.getSignatureAppearance();
            appearance.setCrypto(key, chain, null, PdfSignatureAppearance.SELF_SIGNED);
            appearance.setReason("It's personal.");
            appearance.setLocation("Foobar");
            stamper.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            reader = new PdfReader("results/in_action/chapter16/signed_message.pdf");
            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(new FileInputStream("resources/in_action/chapter16/.keystore"), "f00b4r".toCharArray());
            PrivateKey key = (PrivateKey) ks.getKey("foobar", "r4b00f".toCharArray());
            Certificate[] chain =(java.security.Certificate[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) ks.getCertificateChain("foobar");
            FileOutputStream os = new FileOutputStream("results/in_action/chapter16/double_signed_message.pdf");
            PdfStamper stamper =(PdfStamper)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) PdfStamper.createSignature(reader, os, '\0', null, true);
            PdfSignatureAppearance appearance =(PdfSignatureAppearance)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) stamper.getSignatureAppearance();
            appearance.setCrypto(key, chain, null, PdfSignatureAppearance.SELF_SIGNED);
            appearance.setReason("Double signed.");
            appearance.setLocation("Foobar");
            appearance.setVisibleSignature(new Rectangle(300, 750, 500, 800), 1, "secondsig");
            stamper.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            CertificateFactory cf =(CertificateFactory)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) CertificateFactory.getInstance("X509");
            Collection col =(Collection)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) cf.generateCertificates(new FileInputStream("resources/in_action/chapter16/foobar.cer"));
            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(null, null);
            for (Iterator it = col.iterator(); it.hasNext(); ) {
                X509Certificate cert = (X509Certificate) it.next();
                System.out.println(cert.getIssuerDN().getName());
                ks.setCertificateEntry(cert.getSerialNumber().toString(Character.MAX_RADIX), cert);
            }
            reader = new PdfReader("results/in_action/chapter16/double_signed_message.pdf");
            AcroFields af =(AcroFields)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) reader.getAcroFields();
            ArrayList names =(ArrayList)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) af.getSignatureNames();
            String name;
            for (Iterator it = names.iterator(); it.hasNext(); ) {
                name = (String) it.next();
                System.out.println("Signature name: " + name);
                System.out.println("Signature covers whole document: " + af.signatureCoversWholeDocument(name));
                System.out.println("Document revision: " + af.getRevision(name) + " of " + af.getTotalRevisions());
                FileOutputStream os = new FileOutputStream("results/in_action/chapter16/revision_" + af.getRevision(name) + ".pdf");
                byte bb[] = new byte[8192];
                InputStream ip =(InputStream)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) af.extractRevision(name);
                int n = 0;
                while ((n = ip.read(bb)) > 0) os.write(bb, 0, n);
                os.close();
                ip.close();
                PdfPKCS7 pk =(PdfPKCS7)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) af.verifySignature(name);
                Calendar cal =(Calendar)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) pk.getSignDate();
                Certificate pkc[] =(Certificate[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) pk.getCertificates();
                System.out.println("Subject: " + PdfPKCS7.getSubjectFields(pk.getSigningCertificate()));
                System.out.println("Document modified: " + !(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)pk.verify());
                Object fails[] =(Object[])(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) PdfPKCS7.verifyCertificates(pkc, ks, null, cal);
                if (fails == null) System.out.println("Certificates verified against the KeyStore"); else System.out.println("Certificate failed: " + fails[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SELF_SIGNED;
	public MyHelperClass CERTIFIED_FORM_FILLING;
public MyHelperClass getSubjectFields(MyHelperClass o0){ return null; }
	public MyHelperClass createSignature(PdfReader o0, FileOutputStream o1, char o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass verifyCertificates(Certificate[] o0, KeyStore o1, Object o2, Calendar o3){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass createSignature(PdfReader o0, FileOutputStream o1, char o2, Object o3, boolean o4){ return null; }}

class PdfReader {

PdfReader(String o0){}
	PdfReader(){}
	public MyHelperClass getAcroFields(){ return null; }
	public MyHelperClass getPageSizeWithRotation(int o0){ return null; }}

class PdfStamper {

public MyHelperClass close(){ return null; }
	public MyHelperClass getSignatureAppearance(){ return null; }}

class PdfSignatureAppearance {

public MyHelperClass setCrypto(PrivateKey o0, Certificate[] o1, Object o2, MyHelperClass o3){ return null; }
	public MyHelperClass setLocation(String o0){ return null; }
	public MyHelperClass setReason(String o0){ return null; }
	public MyHelperClass setVisibleSignature(Rectangle o0, int o1, String o2){ return null; }
	public MyHelperClass setCertificationLevel(MyHelperClass o0){ return null; }
	public MyHelperClass setVisibleSignature(Rectangle o0, int o1, Object o2){ return null; }}

class Rectangle {

Rectangle(){}
	Rectangle(int o0, int o1, int o2, int o3){}}

class CertificateException extends Exception{
	public CertificateException(String errorMessage) { super(errorMessage); }
}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}

class Document {

Document(){}
	Document(MyHelperClass o0){}
	public MyHelperClass open(){ return null; }
	public MyHelperClass close(){ return null; }}

class PdfCopy {

PdfCopy(Document o0, FileOutputStream o1){}
	PdfCopy(){}
	public MyHelperClass getImportedPage(PdfReader o0, int o1){ return null; }
	public MyHelperClass addPage(MyHelperClass o0){ return null; }}

class CertificateFactory {

public MyHelperClass generateCertificates(FileInputStream o0){ return null; }}

class X509Certificate {

public MyHelperClass getIssuerDN(){ return null; }
	public MyHelperClass getSerialNumber(){ return null; }}

class AcroFields {

public MyHelperClass getRevision(String o0){ return null; }
	public MyHelperClass signatureCoversWholeDocument(String o0){ return null; }
	public MyHelperClass verifySignature(String o0){ return null; }
	public MyHelperClass extractRevision(String o0){ return null; }
	public MyHelperClass getTotalRevisions(){ return null; }
	public MyHelperClass getSignatureNames(){ return null; }}

class PdfPKCS7 {

public MyHelperClass getSignDate(){ return null; }
	public MyHelperClass getCertificates(){ return null; }
	public MyHelperClass verify(){ return null; }
	public MyHelperClass getSigningCertificate(){ return null; }}

class Object {

public MyHelperClass toString(int o0){ return null; }}
