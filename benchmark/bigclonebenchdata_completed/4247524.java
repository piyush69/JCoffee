import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4247524 {

    public static String backupFile(File source)  throws Throwable {
        File backup = new File(source.getParent() + "/~" + source.getName());
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(source)));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(backup)));
            MyHelperClass FileUtil = new MyHelperClass();
            return(String)(Object) FileUtil.backupFile(reader, writer, source.getAbsolutePath());
        } catch (FileNotFoundException fe) {
            String msg = "Failed to find file for backup [" + source.getAbsolutePath() + "].";
            MyHelperClass _log = new MyHelperClass();
            _log.error(msg, fe);
            throw new InvalidImplementationException(msg, fe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass backupFile(BufferedReader o0, BufferedWriter o1, String o2){ return null; }
	public MyHelperClass error(String o0, FileNotFoundException o1){ return null; }}

class InvalidImplementationException extends Exception{
	public InvalidImplementationException(String errorMessage) { super(errorMessage); }
	InvalidImplementationException(){}
	InvalidImplementationException(String o0, FileNotFoundException o1){}
}
