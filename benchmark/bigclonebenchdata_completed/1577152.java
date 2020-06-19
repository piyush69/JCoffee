
import java.io.UncheckedIOException;


class c1577152 {
public MyHelperClass dest;

            public void run() {
                try {
                    MyHelperClass dest = new MyHelperClass();
                    File inf = new File(dest);
                    if (!(Boolean)(Object)inf.exists()) {
                        inf.getParentFile().mkdirs();
                    }
                    MyHelperClass src = new MyHelperClass();
                    FileChannel in =(FileChannel)(Object) (new FileInputStream(src).getChannel());
//                    MyHelperClass dest = new MyHelperClass();
                    FileChannel out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
                    out.transferFrom(in, 0, in.size());
                    in.close();
                    out.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                    MyHelperClass src = new MyHelperClass();
                    System.err.println("Error copying file \n" + src + "\n" + dest);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
