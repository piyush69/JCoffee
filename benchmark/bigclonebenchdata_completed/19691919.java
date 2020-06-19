


class c19691919 {

    public static void main(String[] args) throws IOException {
        FileChannel fc =(FileChannel)(Object) (new FileOutputStream("src/com/aaron/nio/data.txt").getChannel());
        MyHelperClass ByteBuffer = new MyHelperClass();
        fc.write(ByteBuffer.wrap("dfsdf ".getBytes()));
        fc.close();
        fc =(FileChannel)(Object) (new RandomAccessFile("src/com/aaron/nio/data.txt", "rw").getChannel());
        fc.position(fc.size());
//        MyHelperClass ByteBuffer = new MyHelperClass();
        fc.write(ByteBuffer.wrap("中文的 ".getBytes()));
        fc.close();
        fc =(FileChannel)(Object) (new FileInputStream("src/com/aaron/nio/data.txt").getChannel());
//        MyHelperClass ByteBuffer = new MyHelperClass();
        ByteBuffer buff =(ByteBuffer)(Object) ByteBuffer.allocate(1024);
        fc.read(buff);
        buff.flip();
        while ((boolean)(Object)buff.hasRemaining()) {
            System.out.print(buff.getChar());
        }
        fc.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass wrap(byte[] o0){ return null; }
	public MyHelperClass allocate(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass position(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class RandomAccessFile {

RandomAccessFile(){}
	RandomAccessFile(String o0, String o1){}
	public MyHelperClass getChannel(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass getChar(){ return null; }}
