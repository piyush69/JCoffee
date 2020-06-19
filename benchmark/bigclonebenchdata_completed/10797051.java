


class c10797051 {

    private static void copy(File in, File out) throws IOException {
        if (!(Boolean)(Object)out.getParentFile().isDirectory()) out.getParentFile().mkdirs();
        FileChannel ic =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        FileChannel oc =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        ic.transferTo(0, ic.size(), oc);
        ic.close();
        oc.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

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

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
