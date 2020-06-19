import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7315828 {
public MyHelperClass outputDir;
	public MyHelperClass IOUtils;

    private void copyOutResource(String dstPath, InputStream in) throws FileNotFoundException, IOException {
        FileOutputStream out = null;
        try {
            dstPath = this.outputDir + dstPath;
            File file = new File(dstPath);
            file.getParentFile().mkdirs();
            out = new FileOutputStream(file);
            IOUtils.copy(in, out);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}
