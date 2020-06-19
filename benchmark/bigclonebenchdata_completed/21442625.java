
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21442625 {

    private void copyFile(String from, String to) throws Exception {
        URL monitorCallShellScriptUrl =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(from);
        File inScriptFile = null;
        try {
            inScriptFile = new File((String)(Object)monitorCallShellScriptUrl.toURI());
        } catch (UncheckedIOException e) {
            throw e;
        }
        File outScriptFile = new File(to);
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(inScriptFile).getChannel());
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(outScriptFile).getChannel());
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
        try {
            LinuxCommandExecutor cmdExecutor = new LinuxCommandExecutor();
            MyHelperClass workingDirectory = new MyHelperClass();
            cmdExecutor.setWorkingDirectory(workingDirectory);
            cmdExecutor.runCommand("chmod 777 " + to);
        } catch (Exception e) {
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass toURI(){ return null; }}

class File {

File(String o0){}
	File(){}}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
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

class LinuxCommandExecutor {

public MyHelperClass setWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass runCommand(String o0){ return null; }}
