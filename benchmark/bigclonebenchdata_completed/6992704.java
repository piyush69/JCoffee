


class c6992704 {

    public static void main(String[] args) {
        File file = null;
        try {
            MyHelperClass File = new MyHelperClass();
            file =(File)(Object) File.createTempFile("TestFileChannel", ".dat");
            MyHelperClass ByteBuffer = new MyHelperClass();
            final ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocateDirect(4);
            final ByteChannel output =(ByteChannel)(Object) (new FileOutputStream(file).getChannel());
            MyHelperClass MAGIC_INT = new MyHelperClass();
            buffer.putInt(MAGIC_INT);
            buffer.flip();
            output.write(buffer);
            output.close();
            final ByteChannel input =(ByteChannel)(Object) (new FileInputStream(file).getChannel());
            buffer.clear();
            while ((boolean)(Object)buffer.hasRemaining()) {
                input.read(buffer);
            }
            input.close();
            buffer.flip();
            final int file_int =(int)(Object) buffer.getInt();
//            MyHelperClass MAGIC_INT = new MyHelperClass();
            if (file_int != (int)(Object)MAGIC_INT) {
                System.out.println("TestFileChannel FAILURE");
//                MyHelperClass MAGIC_INT = new MyHelperClass();
                System.out.println("Wrote " + Integer.toHexString((int)(Object)MAGIC_INT) + " but read " + Integer.toHexString(file_int));
            } else {
                System.out.println("TestFileChannel SUCCESS");
            }
        } catch (Exception e) {
            System.out.println("TestFileChannel FAILURE");
            e.printStackTrace(System.out);
        } finally {
            if (null != file) {
                file.delete();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocateDirect(int o0){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

class ByteBuffer {

public MyHelperClass putInt(MyHelperClass o0){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass getInt(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass flip(){ return null; }}

class ByteChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
