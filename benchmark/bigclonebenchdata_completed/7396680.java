import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7396680 {

    public static boolean copyMerge(FileSystem srcFS, Path srcDir, FileSystem dstFS, Path dstFile, boolean deleteSource, Configuration conf, String addString) throws Throwable, IOException {
        dstFile = checkDest(srcDir.getName(), dstFS, dstFile, false);
        if (!srcFS.getFileStatus(srcDir).isDir()) return false;
        OutputStream out = dstFS.create(dstFile);
        try {
            FileStatus contents[] = srcFS.listStatus(srcDir);
            for (int i = 0; i < contents.length; i++) {
                if (!(Boolean)(Object)contents[i].isDir()) {
                    InputStream in = srcFS.open(contents[i].getPath());
                    try {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copyBytes(in, out, conf, false);
                        if (addString != null) out.write(addString.getBytes("UTF-8"));
                    } finally {
                        in.close();
                    }
                }
            }
        } finally {
            out.close();
        }
        if (deleteSource) {
            return srcFS.delete(srcDir, true);
        } else {
            return true;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyBytes(InputStream o0, OutputStream o1, Configuration o2, boolean o3){ return null; }}

class Path {

public MyHelperClass getName(){ return null; }}

class Configuration {

}

class FileStatus {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass isDir(){ return null; }}
