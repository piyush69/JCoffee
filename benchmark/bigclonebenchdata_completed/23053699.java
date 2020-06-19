
import java.io.UncheckedIOException;


class c23053699 {

    public void copy(File from, String to) throws SystemException {
        assert from != null;
        MyHelperClass folder = new MyHelperClass();
        File dst = new File(folder, to);
        dst.getParentFile().mkdirs();
        FileChannel in = null;
        FileChannel out = null;
        try {
            if (!(Boolean)(Object)dst.exists()) dst.createNewFile();
            in =(FileChannel)(Object) (new FileInputStream(from).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
            in.transferTo(0, in.size(), out);
        } catch (UncheckedIOException e) {
            throw new SystemException((String)(Object)e);
        } finally {
            try {
                if (in != null) in.close();
            } catch (Exception e1) {
            }
            try {
                if (out != null) out.close();
            } catch (Exception e1) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class SystemException extends Exception{
	public SystemException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
