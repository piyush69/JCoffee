


class c4147982 {
public static MyHelperClass systemNewLine;
//public MyHelperClass systemNewLine;

    public static void fixEol(File fin) throws IOException {
        MyHelperClass File = new MyHelperClass();
        File fout =(File)(Object) File.createTempFile(fin.getName(), ".fixEol", fin.getParentFile());
        FileChannel in =(FileChannel)(Object) (new FileInputStream(fin).getChannel());
        if (0 != (int)(Object)in.size()) {
            FileChannel out =(FileChannel)(Object) (new FileOutputStream(fout).getChannel());
            byte[] eol =(byte[])(Object) systemNewLine.getBytes();
            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer bufOut =(ByteBuffer)(Object) ByteBuffer.allocateDirect(1024 * eol.length);
            boolean previousIsCr = false;
//            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer buf =(ByteBuffer)(Object) ByteBuffer.allocateDirect(1024);
            while ((int)(Object)in.read(buf) > 0) {
                buf.limit(buf.position());
                buf.position(0);
                while ((int)(Object)buf.remaining() > 0) {
                    byte b =(byte)(Object) buf.get();
                    if (b == '\r') {
                        previousIsCr = true;
                        bufOut.put(eol);
                    } else {
                        if (b == '\n') {
                            if (!previousIsCr) bufOut.put(eol);
                        } else bufOut.put(b);
                        previousIsCr = false;
                    }
                }
                bufOut.limit(bufOut.position());
                bufOut.position(0);
                out.write(bufOut);
                bufOut.clear();
                buf.clear();
            }
            out.close();
        }
        in.close();
        fin.delete();
        fout.renameTo(fin);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(){ return null; }
	public MyHelperClass allocateDirect(int o0){ return null; }
	public MyHelperClass createTempFile(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass put(byte[] o0){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass position(int o0){ return null; }
	public MyHelperClass put(byte o0){ return null; }
	public MyHelperClass limit(MyHelperClass o0){ return null; }
	public MyHelperClass position(){ return null; }
	public MyHelperClass remaining(){ return null; }
	public MyHelperClass get(){ return null; }}
