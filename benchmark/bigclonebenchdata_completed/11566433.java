
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11566433 {
public MyHelperClass size;
	public MyHelperClass IOUtils;
	public MyHelperClass getGEDCOMFile(){ return null; }

    public void write(File file) throws Exception {
        if (getGEDCOMFile() != null) {
            size = getGEDCOMFile().length();
            if (!(Boolean)(Object)getGEDCOMFile().renameTo(file)) {
                BufferedInputStream in = null;
                BufferedOutputStream out = null;
                try {
                    in = new BufferedInputStream(new FileInputStream(getGEDCOMFile()));
                    out = new BufferedOutputStream(new FileOutputStream(file));
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
	public MyHelperClass length(){ return null; }
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
