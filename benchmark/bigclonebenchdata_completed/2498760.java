


class c2498760 {
public MyHelperClass cipher;
	public MyHelperClass InitializeCipher(boolean o0, char[] o1){ return null; }

    public void Main(String[] args) {
        boolean encrypt = false;
        if (args[0].compareTo("-e") == 0) {
            encrypt = true;
        } else if (args[0].compareTo("-d") == 0) {
            encrypt = false;
        } else {
            System.out.println("first argument is invalid");
            System.exit(-2);
        }
        char[] password = new char[args[2].length()];
        for (int i = 0; i < args[2].length(); i++) {
            password[i] = (char) args[2].getBytes()[i];
        }
        try {
            InitializeCipher(encrypt, password);
        } catch (Exception e) {
            System.out.println("error initializing cipher");
            System.exit(-3);
        }
        try {
            InputStream is =(InputStream)(Object) new FileInputStream(args[1]);
            OutputStream os;
            int read, max = 10;
            byte[] buffer = new byte[max];
            if (encrypt) {
                os =(OutputStream)(Object) new FileOutputStream(args[1] + ".enc");
                os =(OutputStream)(Object) new CipherOutputStream(os, cipher);
            } else {
                os =(OutputStream)(Object) new FileOutputStream(args[1] + ".dec");
                is =(InputStream)(Object) new CipherInputStream(is, cipher);
            }
            read =(int)(Object) is.read(buffer);
            while (read != -1) {
                os.write(buffer, 0, read);
                read =(int)(Object) is.read(buffer);
            }
            while (read == max) ;
            os.close();
            is.close();
            System.out.println(new String(buffer));
        } catch (Exception e) {
            System.out.println("error encrypting/decrypting message:");
            e.printStackTrace();
            System.exit(-4);
        }
        System.out.println("done");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class CipherOutputStream {

CipherOutputStream(){}
	CipherOutputStream(OutputStream o0, MyHelperClass o1){}}

class CipherInputStream {

CipherInputStream(){}
	CipherInputStream(InputStream o0, MyHelperClass o1){}}
