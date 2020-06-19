import java.io.*;
import java.lang.*;
import java.util.*;



class c23634465 {

    private static void zip(File d) throws FileNotFoundException, IOException {
        String[] entries = d.list();
        byte[] buffer = new byte[4096];
        int bytesRead;
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(new File(d.getParent() + File.separator + "dist.zip")));
        for (int i = 0; i < entries.length; i++) {
            File f = new File(d, entries[i]);
            if (f.isDirectory()) continue;
            FileInputStream in = new FileInputStream(f);
            int skipl = d.getCanonicalPath().length();
            ZipEntry entry = new ZipEntry(f.getPath().substring(skipl));
            out.putNextEntry(entry);
            while ((bytesRead = in.read(buffer)) != -1) out.write(buffer, 0, bytesRead);
            in.close();
        }
        out.close();
        MyHelperClass FileUtils = new MyHelperClass();
        FileUtils.moveFile(new File(d.getParent() + File.separator + "dist.zip"), new File(d + File.separator + "dist.zip"));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass moveFile(File o0, File o1){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(){}
	ZipEntry(String o0){}}
