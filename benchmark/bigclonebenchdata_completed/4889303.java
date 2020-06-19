


class c4889303 {

    public static Checksum checksum(File file, Checksum checksum) throws IOException {
        if ((boolean)(Object)file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        InputStream in = null;
        try {
            in =(InputStream)(Object) new CheckedInputStream(new FileInputStream(file), checksum);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, new NullOutputStream());
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
        return checksum;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, NullOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class File {

public MyHelperClass isDirectory(){ return null; }}

class Checksum {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class CheckedInputStream {

CheckedInputStream(FileInputStream o0, Checksum o1){}
	CheckedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class NullOutputStream {

}
