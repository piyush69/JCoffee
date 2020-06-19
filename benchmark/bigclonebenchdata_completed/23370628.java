


class c23370628 {

    private byte[] digestFile(File file, MessageDigest digest) throws IOException {
        DigestInputStream in = new DigestInputStream(new FileInputStream(file), digest);
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, new NullOutputStream());
        in.close();
        return(byte[])(Object) in.getMessageDigest().digest();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(DigestInputStream o0, NullOutputStream o1){ return null; }
	public MyHelperClass digest(){ return null; }}

class File {

}

class MessageDigest {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DigestInputStream {

DigestInputStream(FileInputStream o0, MessageDigest o1){}
	DigestInputStream(){}
	public MyHelperClass getMessageDigest(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class NullOutputStream {

}
