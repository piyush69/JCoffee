import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16912326 {
public MyHelperClass baseStr;
	public MyHelperClass toDir;
	public MyHelperClass toFile;
	public MyHelperClass urlStr;

//    @Override
    public void execute() throws BuildException {
        if (this.toFile == null && this.toDir == null) throw new BuildException("Missing Destination File/Dir");
        if (this.toFile != null && this.toDir != null) throw new BuildException("Both Defined Destination File/Dir");
        if (this.urlStr == null) throw new BuildException("Missing URL");
        URL base = null;
        try {
            if (baseStr != null) base = new URL(this.baseStr + ((boolean)(Object)baseStr.endsWith("/") ? "" : "/"));
        } catch (MalformedURLException e) {
            throw new BuildException((String)(Object)e);
        }
        String tokens[] =(String[])(Object) this.urlStr.split("[ \t\n]+");
        try {
            for (String nextURL : tokens) {
                nextURL = nextURL.trim();
                if (nextURL.length() == 0) continue;
                URL url = null;
                try {
                    url = new URL(base, nextURL);
                } catch (MalformedURLException e) {
                    throw new BuildException((String)(Object)e);
                }
                File dest = null;
                if (this.toDir != null) {
                    String file = url.getFile();
                    int i = file.lastIndexOf('/');
                    if (i != -1 && i + 1 != file.length()) file = file.substring(i + 1);
                    dest = new File((String)(Object)this.toDir, file);
                } else {
                    dest =(File)(Object) this.toFile;
                }
                if (dest.exists()) continue;
                byte buff[] = new byte[2048];
                FileOutputStream out = new FileOutputStream(dest);
                InputStream in = url.openStream();
                int n = 0;
                while ((n = in.read(buff)) != -1) {
                    out.write(buff, 0, n);
                }
                in.close();
                out.flush();
                out.close();
                System.out.println("Downloaded " + url + " to " + dest);
            }
        } catch (IOException e) {
            throw new BuildException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass split(String o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}
