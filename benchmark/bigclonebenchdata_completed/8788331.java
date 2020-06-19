


class c8788331 {
public MyHelperClass IOUtils;
	public MyHelperClass getConf(){ return null; }

    private void copyFromStdin(Path dst, FileSystem dstFs) throws IOException {
        if ((boolean)(Object)dstFs.isDirectory(dst)) {
            throw new IOException("When source is stdin, destination must be a file.");
        }
        if ((boolean)(Object)dstFs.exists(dst)) {
            throw new IOException("Target " + dst.toString() + " already exists.");
        }
        FSDataOutputStream out =(FSDataOutputStream)(Object) dstFs.create(dst);
        try {
            IOUtils.copyBytes((InputStream)(Object)System.in, out, getConf(), false);
        } finally {
            out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyBytes(InputStream o0, FSDataOutputStream o1, MyHelperClass o2, boolean o3){ return null; }}

class Path {

}

class FileSystem {

public MyHelperClass isDirectory(Path o0){ return null; }
	public MyHelperClass create(Path o0){ return null; }
	public MyHelperClass exists(Path o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FSDataOutputStream {

public MyHelperClass close(){ return null; }}

class InputStream {

}
