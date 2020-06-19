


class c19565153 {

    private void copy(File fin, File fout) throws IOException {
        FileOutputStream out = new FileOutputStream(fout);
        FileInputStream in = new FileInputStream(fin);
        byte[] buf = new byte[2048];
        int read =(int)(Object) in.read(buf);
        while (read > 0) {
            out.write(buf, 0, read);
            read =(int)(Object) in.read(buf);
        }
        in.close();
        out.close();
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
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
