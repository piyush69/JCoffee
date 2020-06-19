import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8859873 {
public MyHelperClass wrkDir;
	public MyHelperClass getSortOutputDir(String o0, char o1){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass BlockCompressedStreamConstants;
	public MyHelperClass getConf(){ return null; }

    private void mergeOne(String level, char strand, String filename, Path outPath, FileSystem srcFS, FileSystem dstFS, Timer to) throws Throwable, IOException {
        to.start();
        final OutputStream outs = dstFS.create(new Path(outPath, filename));
        MyHelperClass sorted = new MyHelperClass();
        final FileStatus[] parts = srcFS.globStatus(new Path((boolean)(Object)sorted ? getSortOutputDir(level, strand) : wrkDir, filename + "-[0-9][0-9][0-9][0-9][0-9][0-9]"));
        for (final FileStatus part : parts) {
            final InputStream ins = srcFS.open(part.getPath());
            IOUtils.copyBytes(ins, outs, getConf(), false);
            ins.close();
        }
        for (final FileStatus part : parts) srcFS.delete(part.getPath(), false);
        outs.write((int)(Object)BlockCompressedStreamConstants.EMPTY_GZIP_BLOCK);
        outs.close();
        System.out.printf("summarize :: Merged %s%c in %d.%03d s.\n", level, strand, to.stopS(), to.fms());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMPTY_GZIP_BLOCK;
public MyHelperClass copyBytes(InputStream o0, OutputStream o1, MyHelperClass o2, boolean o3){ return null; }}

class Path {

Path(Path o0, String o1){}
	Path(){}}

class Timer {

public MyHelperClass fms(){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass stopS(){ return null; }}

class FileStatus {

public MyHelperClass getPath(){ return null; }}
