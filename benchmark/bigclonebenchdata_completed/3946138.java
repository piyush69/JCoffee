


class c3946138 {

    public static void main(String args[]) throws Exception {
        FileInputStream fin = new FileInputStream("D:/work/test.txt");
        FileOutputStream fout = new FileOutputStream("D:/work/output.txt");
        FileChannel inChannel =(FileChannel)(Object) fin.getChannel();
        FileChannel outChannel =(FileChannel)(Object) fout.getChannel();
        MyHelperClass ByteBuffer = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(1024);
        while (true) {
            int ret =(int)(Object) inChannel.read(buffer);
            if (ret == -1) break;
            buffer.flip();
            outChannel.write(buffer);
            buffer.clear();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}
