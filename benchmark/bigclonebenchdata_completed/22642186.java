import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22642186 {
public MyHelperClass maxReduceTasks;
	public MyHelperClass sortOne(Configuration o0, Path o1, Path o2, String o3, String o4){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass BlockCompressedStreamConstants;
	public MyHelperClass getConf(){ return null; }

//    @Override
    protected int run(CmdLineParser parser)  throws Throwable {
        final List<String> args =(List<String>)(Object) parser.getRemainingArgs();
        if (args.isEmpty()) {
            System.err.println("summarysort :: WORKDIR not given.");
            return 3;
        }
        if (args.size() == 1) {
            System.err.println("summarysort :: INPATH not given.");
            return 3;
        }
        MyHelperClass outputDirOpt = new MyHelperClass();
        final String outS = (String)(String)(Object) parser.getOptionValue(outputDirOpt);
        final Path wrkDir = new Path(args.get(0)), in = new Path(args.get(1)), out = outS == null ? null : new Path(outS);
        MyHelperClass verboseOpt = new MyHelperClass();
        final boolean verbose =(boolean)(Object) parser.getBoolean(verboseOpt);
        final Configuration conf =(Configuration)(Object) getConf();
        final Timer t = new Timer();
        try {
//            @SuppressWarnings("deprecation") final int maxReduceTasks = new JobClient(new JobConf(conf)).getClusterStatus().getMaxReduceTasks();
            conf.setInt("mapred.reduce.tasks", Math.max(1,(int)(Object) maxReduceTasks * 9 / 10));
            final Job job =(Job)(Object) sortOne(conf, in, wrkDir, "summarysort", "");
            System.out.printf("summarysort :: Waiting for job completion...\n");
            t.start();
            if (!(Boolean)(Object)job.waitForCompletion(verbose)) {
                System.err.println("summarysort :: Job failed.");
                return 4;
            }
            System.out.printf("summarysort :: Job complete in %d.%03d s.\n", t.stopS(), t.fms());
        } catch (IOException e) {
            System.err.printf("summarysort :: Hadoop error: %s\n", e);
            return 4;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (out != null) try {
            System.out.println("summarysort :: Merging output...");
            t.start();
            final FileSystem srcFS = wrkDir.getFileSystem(conf);
            final FileSystem dstFS = out.getFileSystem(conf);
            final OutputStream outs = dstFS.create(out);
            final FileStatus[] parts = srcFS.globStatus(new Path(wrkDir, in.getName() + "-[0-9][0-9][0-9][0-9][0-9][0-9]*"));
            {
                int i = 0;
                final Timer t2 = new Timer();
                for (final FileStatus part : parts) {
                    t2.start();
                    final InputStream ins = srcFS.open(part.getPath());
                    IOUtils.copyBytes(ins, outs, conf, false);
                    ins.close();
                    System.out.printf("summarysort :: Merged part %d in %d.%03d s.\n", ++i, t2.stopS(), t2.fms());
                }
            }
            for (final FileStatus part : parts) srcFS.delete(part.getPath(), false);
            outs.write((int)(Object)BlockCompressedStreamConstants.EMPTY_GZIP_BLOCK);
            outs.close();
            System.out.printf("summarysort :: Merging complete in %d.%03d s.\n", t.stopS(), t.fms());
        } catch (IOException e) {
            System.err.printf("summarysort :: Output merging failed: %s\n", e);
            return 5;
        }
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMPTY_GZIP_BLOCK;
public MyHelperClass copyBytes(InputStream o0, OutputStream o1, Configuration o2, boolean o3){ return null; }}

class CmdLineParser {

public MyHelperClass getOptionValue(MyHelperClass o0){ return null; }
	public MyHelperClass getBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass getRemainingArgs(){ return null; }}

class Path {

Path(Path o0, String o1){}
	Path(){}
	Path(String o0){}
	public MyHelperClass getFileSystem(Configuration o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class Configuration {

public MyHelperClass setInt(String o0, int o1){ return null; }}

class JobClient {

}

class JobConf {

}

class Job {

public MyHelperClass waitForCompletion(boolean o0){ return null; }}

class Timer {

public MyHelperClass fms(){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass stopS(){ return null; }}

class FileStatus {

public MyHelperClass getPath(){ return null; }}
