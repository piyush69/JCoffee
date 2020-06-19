import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15416858 {
public MyHelperClass FORMAT;
	public MyHelperClass IOUtils;

    private void download(File archive, File timestamp, URL url, IProgressMonitor monitor) throws IOException {
        monitor.subTask("download " + url.toString());
        InputStream in = null;
        FileOutputStream out = null;
        URLConnection conn = null;
        try {
            conn = url.openConnection();
            Writer writer = null;
            try {
                Date date = new Date(conn.getLastModified());
                writer = new FileWriter(timestamp);
                writer.write((int)(Object)this.FORMAT.format(date));
            } catch (IOException e) {
                timestamp.delete();
            } finally {
                IOUtils.closeQuietly(writer);
            }
            in = conn.getInputStream();
            out = new FileOutputStream(archive);
            IOUtils.copy(in, out);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(Writer o0){ return null; }
	public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class IProgressMonitor {

public MyHelperClass subTask(String o0){ return null; }}
