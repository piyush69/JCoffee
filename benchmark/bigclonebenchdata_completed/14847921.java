


class c14847921 {

    protected static void copyFile(File from, File to) throws IOException {
        if (!(Boolean)(Object)from.isFile() || !(Boolean)(Object)to.isFile()) {
            throw new IOException("Both parameters must be files. from is " + from.isFile() + ", to is " + to.isFile());
        }
        FileChannel in =(FileChannel)(Object) (new FileInputStream(from)).getChannel();
        FileChannel out =(FileChannel)(Object) (new FileOutputStream(to)).getChannel();
        in.transferTo(0, from.length(), out);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass isFile(){ return null; }
	public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
