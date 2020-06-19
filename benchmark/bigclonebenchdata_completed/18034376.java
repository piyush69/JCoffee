


class c18034376 {
public static MyHelperClass nfh;
//public MyHelperClass nfh;

    public static File gzipLog() throws IOException {
        nfh.flush();
        MyHelperClass RunnerClass = new MyHelperClass();
        File log = new File(RunnerClass.homedir + "pj.log");
        GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(new File(log.getCanonicalPath() + ".pjl")));
        FileInputStream in = new FileInputStream(log);
        int bufferSize = 4 * 1024;
        byte[] buffer = new byte[bufferSize];
        int bytesRead;
        while ((bytesRead =(int)(Object) in.read(buffer)) >= 0) out.write(buffer, 0, bytesRead);
        out.close();
        in.close();
        return new File(log.getCanonicalPath() + ".pjl");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass homedir;
public MyHelperClass flush(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getCanonicalPath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
