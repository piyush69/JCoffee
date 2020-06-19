


class c20019847 {

    public static void copyFile(File source, File target) throws IOException {
        FileChannel in =(FileChannel)(Object) (new FileInputStream(source)).getChannel();
        FileChannel out =(FileChannel)(Object) (new FileOutputStream(target)).getChannel();
        in.transferTo(0, source.length(), out);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

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
