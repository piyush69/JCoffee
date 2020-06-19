


class c3053403 {

    public static void main(String[] args) throws Exception {
        FileChannel fc =(FileChannel)(Object) (new FileOutputStream("data2.txt").getChannel());
        MyHelperClass ByteBuffer = new MyHelperClass();
        fc.write((ByteBuffer)(Object)ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        fc =(FileChannel)(Object) (new FileInputStream("data2.txt").getChannel());
        MyHelperClass BSIZE = new MyHelperClass();
        ByteBuffer buff =(ByteBuffer)(Object) ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        buff.rewind();
        String encoding = System.getProperty("file.encoding");
        MyHelperClass Charset = new MyHelperClass();
        System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buff));
        fc =(FileChannel)(Object) (new FileOutputStream("data2.txt").getChannel());
//        MyHelperClass ByteBuffer = new MyHelperClass();
        fc.write((ByteBuffer)(Object)ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
        fc.close();
        fc =(FileChannel)(Object) (new FileInputStream("data2.txt").getChannel());
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        fc =(FileChannel)(Object) (new FileOutputStream("data2.txt").getChannel());
//        MyHelperClass ByteBuffer = new MyHelperClass();
        buff =(ByteBuffer)(Object) ByteBuffer.allocate(24);
        buff.asCharBuffer().put("Some text");
        fc.write(buff);
        fc.close();
        fc =(FileChannel)(Object) (new FileInputStream("data2.txt").getChannel());
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0){ return null; }
	public MyHelperClass allocate(MyHelperClass o0){ return null; }
	public MyHelperClass wrap(byte[] o0){ return null; }
	public MyHelperClass decode(ByteBuffer o0){ return null; }
	public MyHelperClass forName(String o0){ return null; }
	public MyHelperClass allocate(int o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public MyHelperClass asCharBuffer(){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass rewind(){ return null; }}
