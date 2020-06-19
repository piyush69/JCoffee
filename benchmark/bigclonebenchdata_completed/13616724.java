
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13616724 {

    public void write(File file) throws Exception {
        MyHelperClass medooFile = new MyHelperClass();
        if (medooFile != null) {
//            MyHelperClass medooFile = new MyHelperClass();
            if (!(Boolean)(Object)medooFile.renameTo(file)) {
                BufferedInputStream in = null;
                BufferedOutputStream out = null;
                try {
//                    MyHelperClass medooFile = new MyHelperClass();
                    in = new BufferedInputStream(new FileInputStream(medooFile));
                    out = new BufferedOutputStream(new FileOutputStream(file));
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(in, out);
                } finally {
                    if (in != null) {
                        try {
                            in.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (UncheckedIOException e) {
                        }
                    }
                }
            }
        } else {
            throw new FileUploadException("Cannot write uploaded file to disk!");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class File {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileUploadException extends Exception{
	public FileUploadException(String errorMessage) { super(errorMessage); }
}
