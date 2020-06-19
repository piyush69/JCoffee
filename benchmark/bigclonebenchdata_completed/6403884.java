


class c6403884 {
public MyHelperClass installClassName_;

    private boolean copyOldSetupClass(File lastVerPath, File destPath) throws java.io.FileNotFoundException, IOException {
        byte[] buf;
        MyHelperClass File = new MyHelperClass();
        File oldClass = new File((int)(Object)lastVerPath.getAbsolutePath() + (int)(Object)File.separator + (int)(Object)installClassName_ + ".class");
        if ((boolean)(Object)oldClass.exists()) {
//            MyHelperClass File = new MyHelperClass();
            FileOutputStream out = new FileOutputStream((int)(Object)destPath.getAbsolutePath() + (int)(Object)File.separator + (int)(Object)installClassName_ + ".class");
            FileInputStream in = new FileInputStream(oldClass);
            buf = new byte[(new Long((long)(Object)oldClass.length())).intValue()];
            int read =(int)(Object) in.read(buf, 0, buf.length);
            out.write(buf, 0, read);
            out.close();
            in.close();
            return true;
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
