import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15645004 {
public MyHelperClass FileUtils;
	public MyHelperClass SUFFIX_ZIP;

    private void unzip(File filename) throws Throwable, ZipException, IOException {
        ZipInputStream in = new ZipInputStream(new BufferedInputStream(new FileInputStream(filename)));
        ZipEntry entry = null;
        boolean first_entry = true;
        while ((entry =(ZipEntry)(Object) in.getNextEntry()) != null) {
            if (first_entry) {
                if (!(Boolean)(Object)entry.isDirectory()) {
                    MyHelperClass dir = new MyHelperClass();
                    File subdir = new File(dir + File.separator + filename.getName().substring(0, filename.getName().length() - (int)(Object)SUFFIX_ZIP.length()));
                    if (!subdir.exists()) {
                        subdir.mkdir();
//                        MyHelperClass dir = new MyHelperClass();
                        dir =(MyHelperClass)(Object) subdir;
                    }
                }
                first_entry = false;
            }
            if ((boolean)(Object)entry.isDirectory()) {
                MyHelperClass dir = new MyHelperClass();
                FileUtils.forceMkdir(new File(dir + File.separator + entry.getName()));
            } else {
                MyHelperClass dir = new MyHelperClass();
                File outfile = new File(dir + File.separator + entry.getName());
                File outdir = new File(outfile.getAbsolutePath().substring(0, outfile.getAbsolutePath().length() - outfile.getName().length()));
                MyHelperClass FileUtils = new MyHelperClass();
                if (!outdir.exists()) FileUtils.forceMkdir(outdir);
                FileOutputStream fo = new FileOutputStream(outfile);
                MyHelperClass BUFFER = new MyHelperClass();
                BufferedOutputStream bos = new BufferedOutputStream(fo,(int)(Object) BUFFER);
                int read;
//                MyHelperClass BUFFER = new MyHelperClass();
                byte data[] = new byte[(int)(Object)BUFFER];
//                MyHelperClass BUFFER = new MyHelperClass();
                while ((read =(int)(Object) in.read(data, 0, BUFFER)) != -1) {
                    MyHelperClass read_position = new MyHelperClass();
                    read_position++;
                    bos.write(data, 0, read);
                }
                bos.flush();
                bos.close();
            }
        }
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int read_position;
public MyHelperClass forceMkdir(File o0){ return null; }
	public MyHelperClass length(){ return null; }}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}

class ZipInputStream {

ZipInputStream(BufferedInputStream o0){}
	ZipInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
