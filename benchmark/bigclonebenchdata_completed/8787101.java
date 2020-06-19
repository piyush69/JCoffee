
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8787101 {
public MyHelperClass date;
	public MyHelperClass url;
	public MyHelperClass sleep(MyHelperClass o0){ return null; }

    private void downloadThread() {
        int c;
        boolean status;// = new boolean();
        status = false;
        try {
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            MyHelperClass resource = new MyHelperClass();
            File f =(File)(Object) resource.createFile();
            boolean resume = false;
//            MyHelperClass resource = new MyHelperClass();
            resource.resetBytesDown();
            if ((boolean)(Object)f.exists()) {
                if ((int)(Object)f.lastModified() > (int)(Object)date.getTime()) {
//                    MyHelperClass resource = new MyHelperClass();
                    if ((resource.getFileSize() == f.length())) {
//                        MyHelperClass status = new MyHelperClass();
                        status = true;
                        return;
                    } else {
                        urlc.setRequestProperty("Range", "bytes=" + f.length() + "-");
                        resume = true;
//                        MyHelperClass resource = new MyHelperClass();
                        resource.incrementBytesDown(f.length());
                        System.out.println("Resume download");
                        System.out.println("file length: " + f.length());
                    }
                }
            }
            urlc.connect();
            BufferedInputStream bin;// = new BufferedInputStream();
            bin = new BufferedInputStream(urlc.getInputStream());
            FileOutputStream file_out;// = new FileOutputStream();
            file_out = new FileOutputStream(f.getPath(), resume);
            MyHelperClass life = new MyHelperClass();
            while ((boolean)(Object)life) {
//                MyHelperClass bin = new MyHelperClass();
                if ((int)(Object)bin.available() > 0) {
//                    MyHelperClass bin = new MyHelperClass();
                    c =(int)(Object) bin.read();
                    if (c == -1) {
                        break;
                    }
//                    MyHelperClass file_out = new MyHelperClass();
                    file_out.write(c);
//                    MyHelperClass resource = new MyHelperClass();
                    if ((boolean)(Object)resource.incrementBytesDown()) {
                        break;
                    } else {
                        continue;
                    }
                }
                MyHelperClass WAIT_FOR_A_BYTE_TIME = new MyHelperClass();
                sleep(WAIT_FOR_A_BYTE_TIME);
            }
//            MyHelperClass file_out = new MyHelperClass();
            file_out.flush();
//            MyHelperClass status = new MyHelperClass();
            status = true;
        } catch (UncheckedIOException e) {
            System.out.println("excepcion cpoy file");
        } catch (ArithmeticException e) {
            System.out.println("InterruptException download");
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass incrementBytesDown(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass incrementBytesDown(MyHelperClass o0){ return null; }
	public MyHelperClass resetBytesDown(){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass createFile(){ return null; }
	public MyHelperClass getFileSize(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass flush(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass connect(){ return null; }}

class File {

public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
	public MyHelperClass available(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0, boolean o1){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(int o0){ return null; }}
