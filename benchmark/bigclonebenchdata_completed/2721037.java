


class c2721037 {

    public void SplitFile(File in, File out0, File out1, long pos) throws IOException {
        FileInputStream fis = new FileInputStream(in);
        FileOutputStream fos = new FileOutputStream(out0);
        FileChannel fic =(FileChannel)(Object) fis.getChannel();
        FileChannel foc =(FileChannel)(Object) fos.getChannel();
        foc.transferFrom(fic, 0, pos);
        foc.close();
        fos = new FileOutputStream(out1);
        foc =(FileChannel)(Object) fos.getChannel();
        foc.transferFrom(fic, 0,(long)(Object) fic.size() - pos);
        foc.close();
        fic.close();
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

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, long o2){ return null; }}
