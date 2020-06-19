


class c16506848 {

    public static void copy(File src, File dst) throws IOException {
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
        try {
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        } finally {
            try {
                srcChannel.close();
            } finally {
                dstChannel.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
