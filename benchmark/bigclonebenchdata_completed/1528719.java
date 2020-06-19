import java.io.*;
import java.lang.*;
import java.util.*;



class c1528719 {
public MyHelperClass NULL;
public MyHelperClass tempDir;

    public void prepareWorkingDirectory() throws Exception {
        String workingDirectory =(String)(Object) NULL; //new String();
        workingDirectory = tempDir + "/profile_" + System.nanoTime();
//        MyHelperClass workingDirectory = new MyHelperClass();
        (new File((String)(Object)workingDirectory)).mkdir();
        String monitorCallShellScript = "data/scripts/monitorcall.sh";
        URL monitorCallShellScriptUrl =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(monitorCallShellScript);
        File inScriptFile = null;
        try {
            inScriptFile = new File((String)(Object)monitorCallShellScriptUrl.toURI());
        } catch (UncheckedIOException e) {
            throw e;
        }
        String monitorShellScript =(String)(Object) NULL; //new String();
        monitorShellScript = workingDirectory + "/monitorcall.sh";
//        MyHelperClass monitorShellScript = new MyHelperClass();
        File outScriptFile = new File((String)(Object)monitorShellScript);
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
//            MyHelperClass monitorShellScript = new MyHelperClass();
            cmdExecutor.runCommand("chmod 777 " + monitorShellScript);
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

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass size(){ return null; }}

class LinuxCommandExecutor {

public MyHelperClass runCommand(String o0){ return null; }}
