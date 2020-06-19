import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17217414 {
public MyHelperClass source;
	public MyHelperClass target;
	public MyHelperClass readwriteStreams(InputStream o0, FileOutputStream o1){ return null; }

    public void addEntry(InputStream jis, JarEntry entry) throws IOException, URISyntaxException {
        File target = new File((String)(Object)(int)(Object)this.target.getPath() + (int)(Object)entry.getName()).getAbsoluteFile();
        if (!target.exists()) {
            target.createNewFile();
        }
        if ((new File((String)(Object)this.source.toURI())).isDirectory()) {
            File sourceEntry = new File((String)(Object)(int)(Object)this.source.getPath() + (int)(Object)entry.getName());
            FileInputStream fis = new FileInputStream(sourceEntry);
            byte[] classBytes = new byte[fis.available()];
            fis.read(classBytes);
            (new FileOutputStream(target)).write(classBytes);
        } else {
            readwriteStreams(jis, (new FileOutputStream(target)));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass toURI(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}
