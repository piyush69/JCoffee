


class c8644603 {
public static MyHelperClass Init;
//public MyHelperClass Init;

    public static void main(String args[]) {
        Init.init();
        String signatureFileName = args[0];
        javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        dbf.setAttribute("http://xml.org/sax/features/namespaces", Boolean.TRUE);
        try {
            long start = System.currentTimeMillis();
            Init.init();
            File f = new File(signatureFileName);
            System.out.println("Verifying " + signatureFileName);
            javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
            org.w3c.dom.Document doc = db.parse(new java.io.FileInputStream((String)(Object)f));
            VerifyExampleTest vf = new VerifyExampleTest();
            vf.verify((Document)(Object)doc);
            MyHelperClass Constants = new MyHelperClass();
            Constants.setSignatureSpecNSprefix("dsig");
            Element sigElement = null;
            NodeList nodes =(NodeList)(Object) doc.getElementsByTagNameNS((String)(Object)Constants.SignatureSpecNS, "Signature");
            if ((int)(Object)nodes.getLength() != 0) {
                System.out.println("Found " + nodes.getLength() + " Signature  elements.");
                for (int i = 0; i < (int)(Object)nodes.getLength(); i++) {
                    sigElement = (Element)(Element)(Object) nodes.item(i);
                    XMLSignature signature = new XMLSignature(sigElement, "");
                    KeyInfo ki =(KeyInfo)(Object) signature.getKeyInfo();
                    signature.addResourceResolver(new OfflineResolver());
                    if (ki != null) {
                        if ((boolean)(Object)ki.containsX509Data()) {
                            System.out.println("Could find a X509Data element in the  KeyInfo");
                        }
                        KeyInfo kinfo =(KeyInfo)(Object) signature.getKeyInfo();
                        X509Certificate cert = null;
                        if ((boolean)(Object)kinfo.containsRetrievalMethod()) {
                            RetrievalMethod m =(RetrievalMethod)(Object) kinfo.itemRetrievalMethod(0);
                            URL url = new URL(m.getURI());
                            MyHelperClass CertificateFactory = new MyHelperClass();
                            CertificateFactory cf =(CertificateFactory)(Object) CertificateFactory.getInstance("X.509");
                            cert = (X509Certificate)(X509Certificate)(Object) cf.generateCertificate(url.openStream());
                        } else {
                            cert =(X509Certificate)(Object) signature.getKeyInfo().getX509Certificate();
                        }
                        if (cert != null) {
                            System.out.println("The XML signature is " + ((boolean)(Object)signature.checkSignatureValue(cert) ? "valid (good)" : "invalid !!!!! (bad)"));
                        } else {
                            System.out.println("Did not find a Certificate");
                            PublicKey pk =(PublicKey)(Object) signature.getKeyInfo().getPublicKey();
                            if (pk != null) {
                                System.out.println("The XML signatur is " + ((boolean)(Object)signature.checkSignatureValue(pk) ? "valid (good)" : "invalid !!!!! (bad)"));
                            } else {
                                System.out.println("Did not find a public key, so I can't check the signature");
                            }
                        }
                    } else {
                        System.out.println("Did not find a KeyInfo");
                    }
                }
            }
            long end = System.currentTimeMillis();
            double elapsed = end - start;
            System.out.println("verified:" + elapsed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SignatureSpecNS;
public MyHelperClass setSignatureSpecNSprefix(String o0){ return null; }
	public MyHelperClass init(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getPublicKey(){ return null; }
	public MyHelperClass getX509Certificate(){ return null; }}

class File {

File(String o0){}
	File(){}}

class VerifyExampleTest {

public MyHelperClass verify(Document o0){ return null; }}

class Element {

}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class XMLSignature {

XMLSignature(){}
	XMLSignature(Element o0, String o1){}
	public MyHelperClass getKeyInfo(){ return null; }
	public MyHelperClass checkSignatureValue(PublicKey o0){ return null; }
	public MyHelperClass checkSignatureValue(X509Certificate o0){ return null; }
	public MyHelperClass addResourceResolver(OfflineResolver o0){ return null; }}

class KeyInfo {

public MyHelperClass itemRetrievalMethod(int o0){ return null; }
	public MyHelperClass containsX509Data(){ return null; }
	public MyHelperClass containsRetrievalMethod(){ return null; }}

class OfflineResolver {

}

class X509Certificate {

}

class RetrievalMethod {

public MyHelperClass getURI(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class CertificateFactory {

public MyHelperClass generateCertificate(MyHelperClass o0){ return null; }}

class PublicKey {

}

class Document {

}
