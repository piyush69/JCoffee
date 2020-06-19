import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19172383 {
public MyHelperClass IOUtils;
public MyHelperClass FileUtils;
	public MyHelperClass directory;

        public void readEntry(String name, InputStream input) throws Exception {
            File file = new File((String)(Object)this.directory, name);
            OutputStream output = new BufferedOutputStream((OutputStream)(Object)FileUtils.openOutputStream(file));
            try {
                IOUtils.copy(input, output);
            } finally {
                output.close();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }}
