


class c2721038 {
public MyHelperClass createNewFile(String o0, String o1){ return null; }

    public File copyFile(File f) throws IOException {
        File t =(File)(Object) createNewFile("fm", "cpy");
        FileOutputStream fos = new FileOutputStream(t);
        FileChannel foc =(FileChannel)(Object) fos.getChannel();
        FileInputStream fis = new FileInputStream(f);
        FileChannel fic =(FileChannel)(Object) fis.getChannel();
        foc.transferFrom(fic, 0, fic.size());
        foc.close();
        fic.close();
        return t;
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

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}
