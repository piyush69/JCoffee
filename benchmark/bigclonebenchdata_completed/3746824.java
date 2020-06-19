import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3746824 {
public static MyHelperClass IOUtils;
	public static MyHelperClass createDir(File o0){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass createDir(File o0){ return null; }

    private static void unzipEntry(final ZipFile zipfile, final ZipEntry entry, final File outputDir) throws Throwable, IOException {
        if ((boolean)(Object)entry.isDirectory()) {
            createDir(new File((String)(Object)outputDir,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) entry.getName()));
            return;
        }
        File outputFile = new File((String)(Object)outputDir,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) entry.getName());
        if (!outputFile.getParentFile().exists()) {
            createDir(outputFile.getParentFile());
        }
        BufferedInputStream inputStream = new BufferedInputStream((InputStream)(Object)zipfile.getInputStream(entry));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile));
        try {
            IOUtils.copy(inputStream, outputStream);
        } finally {
            outputStream.close();
            inputStream.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }}

class ZipFile {

public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
