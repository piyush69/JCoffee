import java.io.*;
import java.lang.*;
import java.util.*;



class c20436817 {
public MyHelperClass println(MyHelperClass o0, String o1, boolean o2){ return null; }
public MyHelperClass LEVEL;

    private void copyXsl(File aTargetLogDir) {
        println(LEVEL.UTIL, "copyXsl( " + aTargetLogDir.getName() + " )", true);
        MyHelperClass myXslSourceDir = new MyHelperClass();
        if (myXslSourceDir == null) {
            return;
        }
//        MyHelperClass myXslSourceDir = new MyHelperClass();
        File[] files =(File[])(Object) myXslSourceDir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File srcFile = files[i];
            if (!srcFile.isDirectory()) {
                File tgtFile = new File(aTargetLogDir + File.separator + srcFile.getName());
                FileChannel inChannel = null;
                FileChannel outChannel = null;
                try {
                    inChannel =(FileChannel)(Object) (new FileInputStream(srcFile).getChannel());
                    outChannel =(FileChannel)(Object) (new FileOutputStream(tgtFile).getChannel());
                    inChannel.transferTo(0, inChannel.size(), outChannel);
                } catch (IOException e) {
                    throw new IOError(e);
                } finally {
                    if (inChannel != null) try {
                        inChannel.close();
                    } catch (UncheckedIOException exc) {
                        throw new IOError(exc);
                    }
                    if (outChannel != null) try {
                        outChannel.close();
                    } catch (UncheckedIOException exc) {
                        throw new IOError(exc);
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTIL;
public MyHelperClass listFiles(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass size(){ return null; }}
