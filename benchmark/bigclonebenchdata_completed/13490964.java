
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13490964 {
public MyHelperClass size;
	public MyHelperClass IOUtils;
	public MyHelperClass getStoreLocation(){ return null; }
	public MyHelperClass isInMemory(){ return null; }
	public MyHelperClass get(){ return null; }

    public void write(File file) throws Exception {
        if ((boolean)(Object)isInMemory()) {
            FileOutputStream fout = null;
            try {
                fout = new FileOutputStream(file);
                fout.write(get());
            } finally {
                if (fout != null) {
                    fout.close();
                }
            }
        } else {
            File outputFile =(File)(Object) getStoreLocation();
            if (outputFile != null) {
                size = outputFile.length();
                if (!(Boolean)(Object)outputFile.renameTo(file)) {
                    BufferedInputStream in = null;
                    BufferedOutputStream out = null;
                    try {
                        in = new BufferedInputStream(new FileInputStream(outputFile));
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

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }}

class File {

public MyHelperClass length(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileUploadException extends Exception{
	public FileUploadException(String errorMessage) { super(errorMessage); }
}
