


class c3246556 {

    public static void copyFile(File source, String target) throws FileNotFoundException, IOException {
        File fout = new File(target);
        fout.mkdirs();
        fout.delete();
        fout = new File(target);
        FileChannel in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
        FileChannel out =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
        in.transferTo(0, in.size(), out);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass delete(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
