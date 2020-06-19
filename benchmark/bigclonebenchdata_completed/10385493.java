import java.io.*;
import java.lang.*;
import java.util.*;



class c10385493 {
public MyHelperClass m_tm;
	public MyHelperClass m_dfJhead;
	public MyHelperClass getOriginalTime(){ return null; }
	public MyHelperClass getExifTime(){ return null; }
	public MyHelperClass getFile(){ return null; }

    public void writeBack(File destinationFile, boolean makeCopy) throws IOException {
        if (makeCopy) {
            FileChannel sourceChannel =(FileChannel)(Object) (new java.io.FileInputStream((String)(Object)getFile()).getChannel());
            FileChannel destinationChannel =(FileChannel)(Object) (new java.io.FileOutputStream(destinationFile).getChannel());
            sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
            sourceChannel.close();
            destinationChannel.close();
        } else {
            getFile().renameTo(destinationFile);
        }
        if (getExifTime() != null && getOriginalTime() != null && !getExifTime().equals(getOriginalTime())) {
            String adjustArgument = "-ts" + m_dfJhead.format(getExifTime());
            ProcessBuilder pb = new ProcessBuilder(m_tm.getJheadCommand(), adjustArgument, destinationFile.getAbsolutePath());
            pb.directory(destinationFile.getParentFile());
            System.out.println(pb.command().get(0) + " " + pb.command().get(1) + " " + pb.command().get(2));
            final Process p =(Process)(Object) pb.start();
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getJheadCommand(){ return null; }
	public MyHelperClass format(MyHelperClass o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass size(){ return null; }}

class ProcessBuilder {

ProcessBuilder(MyHelperClass o0, String o1, String o2){}
	ProcessBuilder(){}
	public MyHelperClass directory(File o0){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass command(){ return null; }}
