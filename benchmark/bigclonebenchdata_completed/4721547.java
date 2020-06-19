


class c4721547 {

    public static void main(String[] args) throws Exception {
        String infile = "C:\\copy.sql";
        String outfile = "C:\\copy.txt";
        FileInputStream fin = new FileInputStream(infile);
        FileOutputStream fout = new FileOutputStream(outfile);
        FileChannel fcin =(FileChannel)(Object) fin.getChannel();
        FileChannel fcout =(FileChannel)(Object) fout.getChannel();
        MyHelperClass ByteBuffer = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(1024);
        while (true) {
            buffer.clear();
            int r =(int)(Object) fcin.read(buffer);
            if (r == -1) {
                break;
            }
            buffer.flip();
            fcout.write(buffer);
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
