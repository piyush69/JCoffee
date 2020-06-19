


class c10959933 {

    public static void main(String[] args) throws Exception {
        FileChannel fc =(FileChannel)(Object) (new FileOutputStream("data.txt").getChannel());
        MyHelperClass ByteBuffer = new MyHelperClass();
        fc.write(ByteBuffer.wrap("some text ".getBytes()));
        fc.close();
        fc =(FileChannel)(Object) (new RandomAccessFile("data.txt", "rw").getChannel());
        fc.position(fc.size());
//        MyHelperClass ByteBuffer = new MyHelperClass();
        fc.write(ByteBuffer.wrap("some more".getBytes()));
        fc.close();
        fc =(FileChannel)(Object) (new FileInputStream("data.txt").getChannel());
        MyHelperClass BSIZE = new MyHelperClass();
        ByteBuffer buff =(ByteBuffer)(Object) ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while ((boolean)(Object)buff.hasRemaining()) {
            MyHelperClass PrintUtil = new MyHelperClass();
            PrintUtil.prt((char)(char)(Object) buff.get());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass wrap(byte[] o0){ return null; }
	public MyHelperClass prt(char o0){ return null; }
	public MyHelperClass allocate(MyHelperClass o0){ return null; }}

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
	public MyHelperClass get(){ return null; }}
