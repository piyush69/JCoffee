


class c7396682 {

    public static boolean copy(FileSystem srcFS, Path src, File dst, boolean deleteSource, Configuration conf) throws IOException {
        if ((boolean)(Object)srcFS.getFileStatus(src).isDir()) {
            if (!(Boolean)(Object)dst.mkdirs()) {
                return false;
            }
            FileStatus contents[] =(FileStatus[])(Object) srcFS.listStatus(src);
            for (int i = 0; i < contents.length; i++) {
                copy(srcFS,(Path)(Object) contents[i].getPath(), new File(dst, contents[i].getPath().getName()), deleteSource, conf);
            }
        } else if ((boolean)(Object)srcFS.isFile(src)) {
            InputStream in =(InputStream)(Object) srcFS.open(src);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyBytes(in, new FileOutputStream(dst), conf);
        } else {
            throw new IOException(src.toString() + ": No such file or directory");
        }
        if (deleteSource) {
            return(boolean)(Object) srcFS.delete(src, true);
        } else {
            return true;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDir(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass copyBytes(InputStream o0, FileOutputStream o1, Configuration o2){ return null; }}

class FileSystem {

public MyHelperClass listStatus(Path o0){ return null; }
	public MyHelperClass getFileStatus(Path o0){ return null; }
	public MyHelperClass open(Path o0){ return null; }
	public MyHelperClass isFile(Path o0){ return null; }
	public MyHelperClass delete(Path o0, boolean o1){ return null; }}

class Path {

}

class File {

File(File o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }}

class Configuration {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileStatus {

public MyHelperClass getPath(){ return null; }}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
