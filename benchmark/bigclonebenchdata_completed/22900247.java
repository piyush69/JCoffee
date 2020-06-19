import java.io.*;
import java.lang.*;
import java.util.*;



class c22900247 {

    public static void copyDirectory(File sourceDirectory, File targetDirectory) throws IOException {
        MyHelperClass FILE_FILTER = new MyHelperClass();
        File[] sourceFiles = sourceDirectory.listFiles((FilenameFilter)(Object)FILE_FILTER);
        MyHelperClass DIRECTORY_FILTER = new MyHelperClass();
        File[] sourceDirectories = sourceDirectory.listFiles((FilenameFilter)(Object)DIRECTORY_FILTER);
        targetDirectory.mkdirs();
        if (sourceFiles != null && sourceFiles.length > 0) {
            for (int i = 0; i < sourceFiles.length; i++) {
                File sourceFile = sourceFiles[i];
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(targetDirectory + File.separator + sourceFile.getName());
                FileChannel fcin =(FileChannel)(Object) fis.getChannel();
                FileChannel fcout =(FileChannel)(Object) fos.getChannel();
                MyHelperClass ByteBuffer = new MyHelperClass();
                ByteBuffer buf =(ByteBuffer)(Object) ByteBuffer.allocateDirect(8192);
                long size =(long)(Object) fcin.size();
                long n = 0;
                while (n < size) {
                    buf.clear();
                    if ((int)(Object)fcin.read(buf) < 0) {
                        break;
                    }
                    buf.flip();
                    n += (long)(Object)fcout.write(buf);
                }
                fcin.close();
                fcout.close();
                fis.close();
                fos.close();
            }
        }
        if (sourceDirectories != null && sourceDirectories.length > 0) {
            for (int i = 0; i < sourceDirectories.length; i++) {
                File directory = sourceDirectories[i];
                File newTargetDirectory = new File(targetDirectory, directory.getName());
                copyDirectory(directory, newTargetDirectory);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocateDirect(int o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public MyHelperClass clear(){ return null; }}
