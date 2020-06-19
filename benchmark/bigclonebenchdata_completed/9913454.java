import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9913454 {

    private void createScript(File scriptsLocation, String relativePath, String scriptContent)  throws Throwable {
        Writer fileWriter = null;
        try {
            File scriptFile = new File(scriptsLocation.getAbsolutePath() + "/" + relativePath);
            scriptFile.getParentFile().mkdirs();
            fileWriter = new FileWriter(scriptFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(new StringReader(scriptContent), fileWriter);
        } catch (IOException e) {
            throw new UnitilsException((String)(Object)e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fileWriter);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(Writer o0){ return null; }
	public MyHelperClass copy(StringReader o0, Writer o1){ return null; }}

class UnitilsException extends Exception{
	public UnitilsException(String errorMessage) { super(errorMessage); }
}
