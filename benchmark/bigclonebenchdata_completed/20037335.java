


class c20037335 {
public static MyHelperClass IOUtils;
	public static MyHelperClass rmr(String o0){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass rmr(String o0){ return null; }

    public static void copyFromHDFSMerge(String hdfsDir, String local) throws IOException {
        rmr(local);
        File f = new File(local);
        f.getAbsoluteFile().getParentFile().mkdirs();
        HDFSDirInputStream inp = new HDFSDirInputStream(hdfsDir);
        FileOutputStream oup = new FileOutputStream(local);
        IOUtils.copyBytes(inp, oup, 65 * 1024 * 1024, true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass copyBytes(HDFSDirInputStream o0, FileOutputStream o1, int o2, boolean o3){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsoluteFile(){ return null; }}

class HDFSDirInputStream {

HDFSDirInputStream(String o0){}
	HDFSDirInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
