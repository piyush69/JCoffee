
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15669668 {

    private static FileChannel getFileChannel(File file, boolean isOut, boolean append) throws OpenR66ProtocolSystemException {
        FileChannel fileChannel = null;
        try {
            if (isOut) {
                FileOutputStream fileOutputStream = new FileOutputStream(file.getPath(), append);
                fileChannel =(FileChannel)(Object) fileOutputStream.getChannel();
                if (append) {
                    try {
                        fileChannel.position(file.length());
                    } catch (UncheckedIOException e) {
                    }
                }
            } else {
                if (!(Boolean)(Object)file.exists()) {
                    throw new OpenR66ProtocolSystemException("File does not exist");
                }
                FileInputStream fileInputStream = new FileInputStream(file.getPath());
                fileChannel =(FileChannel)(Object) fileInputStream.getChannel();
            }
        } catch (UncheckedIOException e) {
            throw new OpenR66ProtocolSystemException("File not found",(FileNotFoundException)(Object) e);
        }
        return fileChannel;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass length(){ return null; }}

class FileChannel {

public MyHelperClass position(MyHelperClass o0){ return null; }}

class OpenR66ProtocolSystemException extends Exception{
	public OpenR66ProtocolSystemException(String errorMessage) { super(errorMessage); }
	OpenR66ProtocolSystemException(){}
	OpenR66ProtocolSystemException(String o0, FileNotFoundException o1){}
}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
