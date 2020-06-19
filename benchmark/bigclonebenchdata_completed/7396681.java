
import java.io.UncheckedIOException;


class c7396681 {
public static MyHelperClass checkDest(MyHelperClass o0, FileSystem o1, Path o2, boolean o3){ return null; }
//public MyHelperClass checkDest(MyHelperClass o0, FileSystem o1, Path o2, boolean o3){ return null; }

    public static boolean copy(File src, FileSystem dstFS, Path dst, boolean deleteSource, Configuration conf) throws IOException {
        dst =(Path)(Object) checkDest(src.getName(), dstFS, dst, false);
        if ((boolean)(Object)src.isDirectory()) {
            if (!(Boolean)(Object)dstFS.mkdirs(dst)) {
                return false;
            }
            File contents[] =(File[])(Object) src.listFiles();
            for (int i = 0; i < contents.length; i++) {
                copy(contents[i], dstFS, new Path(dst, contents[i].getName()), deleteSource, conf);
            }
        } else if ((boolean)(Object)src.isFile()) {
            InputStream in = null;
            OutputStream out = null;
            try {
                in =(InputStream)(Object) new FileInputStream(src);
                out =(OutputStream)(Object) dstFS.create(dst);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyBytes(in, out, conf);
            } catch (UncheckedIOException e) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeStream(out);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeStream(in);
                throw e;
            }
        } else {
            throw new IOException(src.toString() + ": No such file or directory");
        }
        if (deleteSource) {
            MyHelperClass FileUtil = new MyHelperClass();
            return(boolean)(Object) FileUtil.fullyDelete(src);
        } else {
            return true;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeStream(OutputStream o0){ return null; }
	public MyHelperClass closeStream(InputStream o0){ return null; }
	public MyHelperClass copyBytes(InputStream o0, OutputStream o1, Configuration o2){ return null; }
	public MyHelperClass fullyDelete(File o0){ return null; }}

class File {

public MyHelperClass isFile(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class FileSystem {

public MyHelperClass mkdirs(Path o0){ return null; }
	public MyHelperClass create(Path o0){ return null; }}

class Path {

Path(Path o0, MyHelperClass o1){}
	Path(){}}

class Configuration {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class OutputStream {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
