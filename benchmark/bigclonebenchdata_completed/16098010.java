


class c16098010 {

    public static void copyFile(String src, String target) throws IOException {
        FileChannel ic =(FileChannel)(Object) (new FileInputStream(src).getChannel());
        FileChannel oc =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
        ic.transferTo(0, ic.size(), oc);
        ic.close();
        oc.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
