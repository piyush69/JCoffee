


class c5869954 {

    public static void copyFile(File sourceFile, File targetFile) throws IOException {
        FileInputStream iStream = new FileInputStream(sourceFile);
        FileOutputStream oStream = new FileOutputStream(targetFile);
        FileChannel inChannel =(FileChannel)(Object) iStream.getChannel();
        FileChannel outChannel =(FileChannel)(Object) oStream.getChannel();
        MyHelperClass ByteBuffer = new MyHelperClass();
        ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(1024);
        while (true) {
            buffer.clear();
            int readCount =(int)(Object) inChannel.read(buffer);
            if (readCount == -1) {
                break;
            }
            buffer.flip();
            outChannel.write(buffer);
        }
        iStream.close();
        oStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}
