
import java.io.UncheckedIOException;


class c18935086 {

    private void copia(FileInputStream input, FileOutputStream output) throws ErrorException {
        if (input == null || output == null) {
            throw new ErrorException("Param null");
        }
        FileChannel inChannel =(FileChannel)(Object) input.getChannel();
        FileChannel outChannel =(FileChannel)(Object) output.getChannel();
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
            inChannel.close();
            outChannel.close();
        } catch (UncheckedIOException e) {
            throw new ErrorException("Casino nella copia del file");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

public MyHelperClass getChannel(){ return null; }}

class ErrorException extends Exception{
	public ErrorException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
