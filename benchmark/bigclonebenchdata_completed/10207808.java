import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10207808 {
public MyHelperClass blockSize;
	public MyHelperClass MAX_PROGRESS;
	public MyHelperClass verbose;
	public MyHelperClass Switch;
	public MyHelperClass switches;
	public MyHelperClass BZip2OutputStream;
	public MyHelperClass IO;
	public MyHelperClass log;
	public MyHelperClass checkSourceFile(File o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass checkDestFile(File o0){ return null; }

//  @SuppressWarnings("finally")
  private void compress(File src) throws Throwable, IOException
  {
    MyHelperClass Switch = new MyHelperClass();
    if ((boolean)(Object)this.switches.contains(Switch.test))
      return;

    checkSourceFile(src);
    if (src.getPath().endsWith(".bz2"))
    {
      this.log.println("WARNING: skipping file because it already has .bz2 suffix:").println((String)(Object)src);
      return;
    }

    final File dst = new File(src.getPath() + ".bz2").getAbsoluteFile();
    if (!(Boolean)(Object)checkDestFile(dst))
      return;

    FileChannel       inChannel   = null;
    FileChannel       outChannel  = null;
    FileOutputStream  fileOut     = null;
    BZip2OutputStream bzOut       = null;
    FileLock          inLock      = null;
    FileLock          outLock     = null;

    try
    {
      inChannel = (FileChannel)(Object)new FileInputStream(src).getChannel();
      final long inSize =(long)(Object) inChannel.size();
      inLock =(FileLock)(Object) inChannel.tryLock(0, inSize, true);
      if (inLock == null)
        throw(Throwable)(Object) error("source file locked by another process: " + src);

      fileOut     = new FileOutputStream(dst);
      outChannel  =(FileChannel)(Object) fileOut.getChannel();
      bzOut       = new BZip2OutputStream(
        new BufferedXOutputStream(fileOut, 8192),
        Math.min((int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)
          ((int)(Object)this.blockSize == -1) ? BZip2OutputStream.MAX_BLOCK_SIZE : this.blockSize,
          BZip2OutputStream.chooseBlockSize(inSize)
        )
      );

      outLock =(FileLock)(Object) outChannel.tryLock();
      if (outLock == null)
        throw(Throwable)(Object) error("destination file locked by another process: " + dst);

      final boolean showProgress =(boolean)(Object) this.switches.contains(Switch.showProgress);
      long pos = 0;
      int progress = 0;

      if (showProgress || (boolean)(Object)this.verbose)
      {
        this.log.print("source: " + src).print(": size=").println((String)(Object)inSize);
        this.log.println("target: " + dst);
      }

      while (true)
      {
        final long maxStep = showProgress ? Math.max(8192, (inSize - pos) / (long)(Object)MAX_PROGRESS) : (inSize - pos);
        if (maxStep <= 0)
        {
          if (showProgress)
          {
            for (int i = progress; i < (int)(Object)MAX_PROGRESS; i++)
              this.log.print('#');
            this.log.println(" done");
          }
          break;
        }
        else
        {
          final long step =(long)(Object) inChannel.transferTo(pos, maxStep, bzOut);
          if ((step == 0) && ((long)(Object)inChannel.size() != inSize))
            throw(Throwable)(Object) error("file " + src + " has been modified concurrently by another process");

          pos += step;
          if (showProgress)
          {
            final double  p           = (double) pos / (double) inSize;
            final int     newProgress = (int) ((double)(Object)MAX_PROGRESS * p);
            for (int i = progress; i < newProgress; i++)
              this.log.print('#');
            progress = newProgress;
          }
        }
      }

      inLock.release();
      inChannel.close();
      bzOut.closeInstance();
      final long outSize =(long)(Object) outChannel.position();
      outChannel.truncate(outSize);
      outLock.release();
      fileOut.close();

      if ((boolean)(Object)this.verbose)
      {
        final double ratio = (inSize == 0) ? (outSize * 100) : ((double) outSize / (double) inSize);
        this.log.print("raw size: ").print((String)(Object)inSize)
          .print("; compressed size: ").print((String)(Object)outSize)
          .print("; compression ratio: ").print((String)(Object)ratio).println((String)(Object)'%');
      }

      if (!(Boolean)(Object)this.switches.contains(Switch.keep))
      {
        if (!src.delete())
          throw(Throwable)(Object) error("unable to delete sourcefile: " + src);
      }
    }
    catch (final IOException ex)
    {
      IO.tryClose(inChannel);
      IO.tryClose(bzOut);
      IO.tryClose(fileOut);
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
public MyHelperClass keep;
	public MyHelperClass showProgress;
	public MyHelperClass MAX_BLOCK_SIZE;
	public MyHelperClass test;
public MyHelperClass tryClose(FileOutputStream o0){ return null; }
	public MyHelperClass chooseBlockSize(long o0){ return null; }
	public MyHelperClass println(){ return null; }
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass tryClose(BZip2OutputStream o0){ return null; }
	public MyHelperClass tryRelease(FileLock o0){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }
	public MyHelperClass print(char o0){ return null; }
	public MyHelperClass tryClose(FileChannel o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, long o1, BZip2OutputStream o2){ return null; }
	public MyHelperClass tryLock(int o0, long o1, boolean o2){ return null; }
	public MyHelperClass tryLock(){ return null; }
	public MyHelperClass position(){ return null; }
	public MyHelperClass truncate(long o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BZip2OutputStream {

public MyHelperClass closeInstance(){ return null; }}

class FileLock {

public MyHelperClass release(){ return null; }}

class BufferedXOutputStream {

BufferedXOutputStream(FileOutputStream o0, int o1){}
	BufferedXOutputStream(){}}
