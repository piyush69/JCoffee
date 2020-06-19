import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15767189 {
public MyHelperClass createFolderStructure(String o0){ return null; }
public MyHelperClass Logging;
	public MyHelperClass task;

    private boolean copyFile(BackupItem item) {
        try {
            FileChannel src = (FileChannel)(Object)new FileInputStream(item.getDrive() + ":" + item.getPath()).getChannel();
            createFolderStructure(this.task.getDestinationPath() + "\\" + item.getDrive() + item.getPath());
            FileChannel dest = (FileChannel)(Object)new FileOutputStream(this.task.getDestinationPath() + "\\" + item.getDrive() + item.getPath()).getChannel();
            dest.transferFrom(src, 0, src.size());
            src.close();
            dest.close();
            Logging.logMessage("file " + item.getDrive() + ":" + item.getPath() + " was backuped");
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logMessage(String o0){ return null; }
	public MyHelperClass getDestinationPath(){ return null; }}

class BackupItem {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass getDrive(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
