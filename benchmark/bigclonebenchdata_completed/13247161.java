import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13247161 {
public MyHelperClass classLoadHelper;
	public MyHelperClass fileFound;
	public MyHelperClass filePath;
	public MyHelperClass isFailOnFileNotFound(){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass getFileName(){ return null; }

    private void findFile() throws SchedulerException {
        java.io.InputStream f = null;
        String furl = null;
        File file = new File((String)(Object)getFileName());
        if (!file.exists()) {
            URL url =(URL)(Object) classLoadHelper.getResource(getFileName());
            if (url != null) {
                try {
                    furl = URLDecoder.decode(url.getPath(), "UTF-8");
                    file = new File(furl);
                    f = url.openStream();
                } catch (java.io.UnsupportedEncodingException uee) {
                } catch (IOException ignor) {
                }
            }
        } else {
            try {
                f = new java.io.FileInputStream(file);
            } catch (FileNotFoundException e) {
            }
        }
        if (f == null && (boolean)(Object)isFailOnFileNotFound()) {
            throw new SchedulerException("File named '" + getFileName() + "' does not exist. f == null && isFailOnFileNotFound()");
        } else if (f == null) {
            getLog().warn("File named '" + getFileName() + "' does not exist. f == null");
        } else {
            fileFound =(MyHelperClass)(Object) true;
            try {
                if (furl != null) this.filePath =(MyHelperClass)(Object) furl; else this.filePath =(MyHelperClass)(Object) file.getAbsolutePath();
                f.close();
            } catch (IOException ioe) {
                getLog().warn("Error closing jobs file " + getFileName(), ioe);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getResource(MyHelperClass o0){ return null; }}

class SchedulerException extends Exception{
	public SchedulerException(String errorMessage) { super(errorMessage); }
}
