


class c10622245 {

    private void downloadTo(URL url, File out) throws IOException {
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        BufferedInputStream is = new BufferedInputStream(conn.getInputStream());
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(out));
        final int BLOCK_SIZE = 1024;
        byte[] buf = new byte[BLOCK_SIZE];
        int size;
        while ((size =(int)(Object) is.read(buf, 0, BLOCK_SIZE)) > 0) os.write(buf, 0, size);
        is.close();
        os.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
