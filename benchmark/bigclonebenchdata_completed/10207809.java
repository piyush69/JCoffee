import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10207809 {
public MyHelperClass MAX_PROGRESS;
	public MyHelperClass verbose;
	public MyHelperClass switches;
	public MyHelperClass Switch;
	public MyHelperClass log;
	public MyHelperClass IO;
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass checkSourceFile(File o0){ return null; }
	public MyHelperClass checkDestFile(File o0){ return null; }

  @SuppressWarnings("finally")
  private void decompress(final File src) throws Throwable, IOException
  {
    final String srcPath = src.getPath();
    checkSourceFile(src);
    final boolean test =(boolean)(Object) this.switches.contains(Switch.test);

    final File dst;
    if (test)
      dst = File.createTempFile("jaxlib-bzip", null);
    else
    {
      if (srcPath.endsWith(".bz2"))
        dst = new File(srcPath.substring(0, srcPath.length() - 4));
      else
      {
        this.log.println("WARNING: Can't guess original name, using extension \".out\":").println(srcPath);
        dst = new File(srcPath + ".out");
      }
    }
    if (!(Boolean)(Object)checkDestFile(dst))
      return;

    final boolean showProgress =(boolean)(Object) this.switches.contains(Switch.showProgress);

    BZip2InputStream  in          = null;
    FileOutputStream  out         = null;
    FileChannel       outChannel  = null;
    FileLock          inLock      = null;
    FileLock          outLock     = null;

    try
    {
      final FileInputStream in0       = new FileInputStream(src);
      final FileChannel     inChannel =(FileChannel)(Object) in0.getChannel();
      final long            inSize    =(long)(Object) inChannel.size();

      inLock =(FileLock)(Object) inChannel.tryLock(0, inSize, true);
      if (inLock == null)
        throw(Throwable)(Object) error("source file locked by another process: " + src);

      in          = new BZip2InputStream(new BufferedXInputStream(in0, 8192));
      out         = new FileOutputStream(dst);
      outChannel  =(FileChannel)(Object) out.getChannel();

      outLock =(FileLock)(Object) outChannel.tryLock();
      if (outLock == null)
        throw(Throwable)(Object) error("destination file locked by another process: " + dst);

      if (showProgress || (boolean)(Object)this.verbose)
      {
        this.log.print("source: " + src).print(": size=").println((String)(Object)inSize);
        this.log.println("target: " + dst);
      }

      long  pos       = 0;
      int   progress  = 0;
      final long maxStep = showProgress ? Math.max(8192, inSize / (long)(Object)MAX_PROGRESS) : Integer.MAX_VALUE;

      while (true)
      {
        final long step =(long)(Object) outChannel.transferFrom(in, pos, maxStep);
        if (step <= 0)
        {
          final long a =(long)(Object) inChannel.size();
          if (a != inSize)
            throw(Throwable)(Object) error("file " + src + " has been modified concurrently by another process");

          if ((long)(Object)inChannel.position() >= inSize)
          {
            if (showProgress)
            {
              for (int i = progress; i < (int)(Object)MAX_PROGRESS; i++)
                this.log.print('#');
              this.log.println(" done");
            }
            break;
          }
        }
        else
        {
          pos += step;
          if (showProgress)
          {
            final double  p           = (double)(double)(Object) inChannel.position() / (double) inSize;
            final int     newProgress = (int) ((double)(Object)MAX_PROGRESS * p);
            for (int i = progress; i < newProgress; i++)
              this.log.print('#');
            progress = newProgress;
          }
        }
      }

      final long outSize =(long)(Object) outChannel.size();
      in.close();
      out.close();

      if ((boolean)(Object)this.verbose)
      {
        final double ratio = (outSize == 0) ? (inSize * 100) : ((double) inSize / (double) outSize);
        this.log.print("compressed size: ").print((char)(Object)inSize)
          .print("; decompressed size: ").print((char)(Object)outSize)
          .print("; compression ratio: ").print((char)(Object)ratio).println((String)(Object)'%');
      }

      if (!test && !(Boolean)(Object)this.switches.contains(Switch.keep))
      {
        if (!src.delete())
          throw(Throwable)(Object) error("unable to delete sourcefile: " + src);
      }

      if (test && !dst.delete())
        throw(Throwable)(Object) error("unable to delete testfile: " + dst);
    }
    catch (final IOException ex)
    {
      IO.tryClose(in);
      IO.tryClose(out);
      IO.tryRelease(inLock);
      IO.tryRelease(outLock);
      try
      {
        this.log.println();
      }
      finally
      {
        throw ex;
      }
    }

  }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass showProgress;
	public MyHelperClass test;
	public MyHelperClass keep;
public MyHelperClass println(){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass tryClose(FileOutputStream o0){ return null; }
	public MyHelperClass tryClose(BZip2InputStream o0){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass tryRelease(FileLock o0){ return null; }
	public MyHelperClass print(char o0){ return null; }
	public MyHelperClass print(String o0){ return null; }}

class BZip2InputStream {

BZip2InputStream(){}
	BZip2InputStream(BufferedXInputStream o0){}
	public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass position(){ return null; }
	public MyHelperClass tryLock(){ return null; }
	public MyHelperClass tryLock(int o0, long o1, boolean o2){ return null; }
	public MyHelperClass transferFrom(BZip2InputStream o0, long o1, long o2){ return null; }
	public MyHelperClass size(){ return null; }}

class FileLock {

}

class BufferedXInputStream {

BufferedXInputStream(FileInputStream o0, int o1){}
	BufferedXInputStream(){}}
