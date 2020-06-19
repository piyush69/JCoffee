


class c18288467 {
public static MyHelperClass setFilePermissions(File o0, Permissions o1){ return null; }
	public static MyHelperClass getFilePermissons(File o0){ return null; }
//public MyHelperClass getFilePermissons(File o0){ return null; }
//	public MyHelperClass setFilePermissions(File o0, Permissions o1){ return null; }

    public static void copyFile(File in, File out) throws Exception {
        Permissions before =(Permissions)(Object) getFilePermissons(in);
        FileChannel inFile =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        FileChannel outFile =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        inFile.transferTo(0, inFile.size(), outFile);
        inFile.close();
        outFile.close();
        setFilePermissions(out, before);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class Permissions {

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
