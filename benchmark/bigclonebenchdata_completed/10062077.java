


class c10062077 {

    private void appendArchive(File instClass) throws IOException {
        FileOutputStream out = new FileOutputStream(instClass.getName(), true);
        FileInputStream zipStream = new FileInputStream("install.jar");
        byte[] buf = new byte[2048];
        int read =(int)(Object) zipStream.read(buf);
        while (read > 0) {
            out.write(buf, 0, read);
            read =(int)(Object) zipStream.read(buf);
        }
        zipStream.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0, boolean o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
