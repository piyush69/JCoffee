import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10118207 {

    public static final boolean zipUpdate(String zipfile, String name, String oldname, byte[] contents, boolean delete) {
        try {
            File temp = File.createTempFile("atf", ".zip");
            InputStream in = new BufferedInputStream(new FileInputStream(zipfile));
            OutputStream os = new BufferedOutputStream(new FileOutputStream(temp));
            ZipInputStream zin = new ZipInputStream(in);
            ZipOutputStream zout = new ZipOutputStream(os);
            ZipEntry e;
            ZipEntry e2;
            MyHelperClass TEMP_FILE_BUFFER_SIZE = new MyHelperClass();
            byte buffer[] = new byte[(int)(Object)TEMP_FILE_BUFFER_SIZE];
            int bytesRead;
            boolean found = false;
            boolean rename = false;
            String oname = name;
            if (oldname != null) {
                name = oldname;
                rename = true;
            }
            while ((e =(ZipEntry)(Object) zin.getNextEntry()) != null) {
                if (!(Boolean)(Object)e.isDirectory()) {
                    String ename =(String)(Object) e.getName();
                    if (delete && ename.equals(name)) continue;
                    e2 = new ZipEntry(rename ? oname : ename);
                    zout.putNextEntry(e2);
                    if (ename.equals(name)) {
                        found = true;
                        zout.write(contents);
                    } else {
                        while ((bytesRead =(int)(Object) zin.read(buffer)) != -1) zout.write(buffer, 0, bytesRead);
                    }
                    zout.closeEntry();
                }
            }
            if (!found && !delete) {
                e = new ZipEntry(name);
                zout.putNextEntry(e);
                zout.write(contents);
                zout.closeEntry();
            }
            zin.close();
            zout.close();
            File fp = new File(zipfile);
            fp.delete();
            MyHelperClass MLUtil = new MyHelperClass();
            MLUtil.copyFile(temp, fp);
            temp.delete();
            return (true);
        } catch (FileNotFoundException e) {
            MyHelperClass MLUtil = new MyHelperClass();
            MLUtil.runtimeError(e, "updateZip " + zipfile + " " + name);
        } catch (IOException e) {
            MyHelperClass MLUtil = new MyHelperClass();
            MLUtil.runtimeError(e, "updateZip " + zipfile + " " + name);
        }
        return (false);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass runtimeError(IOException o0, String o1){ return null; }
	public MyHelperClass runtimeError(FileNotFoundException o0, String o1){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }}

class ZipInputStream {

ZipInputStream(InputStream o0){}
	ZipInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipOutputStream {

ZipOutputStream(OutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
