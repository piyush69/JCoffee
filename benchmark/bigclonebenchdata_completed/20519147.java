import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20519147 {
public MyHelperClass code;
	public MyHelperClass PreferencesManager;
	public MyHelperClass getFilename(){ return null; }

    public boolean load()  throws Throwable {
        if (getFilename() != null &&(int)(Object) getFilename().length() > 0) {
            try {
                File file = new File(PreferencesManager.loadDirectoryLocation("macros") + File.separator + getFilename());
                URL url = file.toURL();
                InputStreamReader isr = new InputStreamReader(url.openStream());
                BufferedReader br = new BufferedReader(isr);
                String line = br.readLine();
                String macro_text = "";
                while (line != null) {
                    macro_text = macro_text.concat(line);
                    line = br.readLine();
                    if (line != null) {
                        macro_text = macro_text.concat(System.getProperty("line.separator"));
                    }
                }
                code =(MyHelperClass)(Object) macro_text;
            } catch (Exception e) {
                System.err.println("Exception at StoredMacro.load(): " + e.toString());
                return false;
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass loadDirectoryLocation(String o0){ return null; }}
