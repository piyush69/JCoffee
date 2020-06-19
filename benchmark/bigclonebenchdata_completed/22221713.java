


class c22221713 {

    private void copyFile(String sourceFilename, String targetFilename) throws IOException {
        File source = new File(sourceFilename);
        File target = new File(targetFilename);
        InputStream in =(InputStream)(Object) new FileInputStream(source);
        OutputStream out =(OutputStream)(Object) new FileOutputStream(target);
        byte[] buf = new byte[1024];
        int len;
        while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
