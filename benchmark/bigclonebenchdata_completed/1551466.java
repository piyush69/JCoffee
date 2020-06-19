


class c1551466 {

    public static void test2() throws Exception {
        int keySize = 1024;
        int dBlockSize = keySize / 8;
        int eBlockSize = dBlockSize - 8 - 3;
        CertAndKeyGen certAndKeyGen = new CertAndKeyGen("RSA", "MD5WithRSA");
        certAndKeyGen.generate(keySize);
        PublicKey publicKey =(PublicKey)(Object) certAndKeyGen.getPublicKey();
        PrivateKey privateKey =(PrivateKey)(Object) certAndKeyGen.getPrivateKey();
        MyHelperClass Cipher = new MyHelperClass();
        Cipher cipher1 =(Cipher)(Object) Cipher.getInstance("RSA/ECB/PKCS1Padding");
//        MyHelperClass Cipher = new MyHelperClass();
        cipher1.init(Cipher.ENCRYPT_MODE, publicKey);
        String fileA = "C:/temp/a.txt";
        String fileB = "C:/temp/b.txt";
        String fileC = "C:/temp/c.txt";
        FileInputStream fis = new FileInputStream(fileA);
        FileOutputStream fos = new FileOutputStream(fileB, false);
        CipherOutputStream eos = new CipherOutputStream(fos, cipher1, eBlockSize);
        byte[] b = new byte[128];
        int i =(int)(Object) fis.read(b);
        while (i != -1) {
            eos.write(b, 0, i);
            i =(int)(Object) fis.read(b);
        }
        eos.flush();
        eos.close();
        fos.close();
//        MyHelperClass Cipher = new MyHelperClass();
        Cipher cipher2 =(Cipher)(Object) Cipher.getInstance("RSA/ECB/PKCS1Padding");
//        MyHelperClass Cipher = new MyHelperClass();
        cipher2.init(Cipher.DECRYPT_MODE, privateKey);
        fis = new FileInputStream(fileB);
        CipherInputStream cis = new CipherInputStream(fis, cipher2, dBlockSize);
        FileOutputStream decodedFile = new FileOutputStream(fileC, false);
        int read = -1;
        while ((read =(int)(Object) cis.read()) > -1) {
            decodedFile.write(read);
        }
        decodedFile.close();
        fis.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ENCRYPT_MODE;
	public MyHelperClass DECRYPT_MODE;
public MyHelperClass getInstance(String o0){ return null; }}

class CertAndKeyGen {

CertAndKeyGen(){}
	CertAndKeyGen(String o0, String o1){}
	public MyHelperClass getPrivateKey(){ return null; }
	public MyHelperClass generate(int o0){ return null; }
	public MyHelperClass getPublicKey(){ return null; }}

class PublicKey {

}

class PrivateKey {

}

class Cipher {

public MyHelperClass init(MyHelperClass o0, PublicKey o1){ return null; }
	public MyHelperClass init(MyHelperClass o0, PrivateKey o1){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0, boolean o1){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class CipherOutputStream {

CipherOutputStream(FileOutputStream o0, Cipher o1, int o2){}
	CipherOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class CipherInputStream {

CipherInputStream(FileInputStream o0, Cipher o1, int o2){}
	CipherInputStream(){}
	public MyHelperClass read(){ return null; }}
