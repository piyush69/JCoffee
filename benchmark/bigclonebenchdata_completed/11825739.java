


class c11825739 {

    public static void copyFile(String from, String to, boolean append) throws IOException {
        FileChannel in =(FileChannel)(Object) (new FileInputStream(from).getChannel());
        FileChannel out =(FileChannel)(Object) (new FileOutputStream(to, append).getChannel());
        MyHelperClass BSIZE = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(BSIZE);
        while ((int)(Object)in.read(buffer) != -1) {
            buffer.flip();
            out.write(buffer);
            buffer.clear();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public static MyHelperClass allocate(MyHelperClass o0){ return null; }
	public MyHelperClass clear(){ return null; }}
