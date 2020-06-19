


class c2721034 {
public MyHelperClass createNewFile(String o0, String o1){ return null; }

    public File takeFile(File f, String prefix, String suffix) throws IOException {
        File nf =(File)(Object) createNewFile(prefix, suffix);
        FileInputStream fis = new FileInputStream(f);
        FileChannel fic =(FileChannel)(Object) fis.getChannel();
        FileOutputStream fos = new FileOutputStream(nf);
        FileChannel foc =(FileChannel)(Object) fos.getChannel();
        foc.transferFrom(fic, 0, fic.size());
        foc.close();
        fic.close();
        f.delete();
        return nf;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass delete(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
