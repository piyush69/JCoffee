


class c13361852 {

    public static File copyFile(File from, File to) throws IOException {
        FileOutputStream fos = new FileOutputStream(to);
        FileInputStream fis = new FileInputStream(from);
        FileChannel foc =(FileChannel)(Object) fos.getChannel();
        FileChannel fic =(FileChannel)(Object) fis.getChannel();
        foc.transferFrom(fic, 0, fic.size());
        foc.close();
        fic.close();
        return to;
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

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
