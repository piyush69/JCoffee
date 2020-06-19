import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11481709 {
public MyHelperClass pathName;
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass abort(String o0){ return null; }

    public boolean copy(File fromFile) throws Throwable, IOException {
        FileUtility toFile =(FileUtility)(Object) this;
        if (!fromFile.exists()) {
            abort("FileUtility: no such source file: " + fromFile.getAbsolutePath());
            return false;
        }
        if (!fromFile.isFile()) {
            abort("FileUtility: can't copy directory: " + fromFile.getAbsolutePath());
            return false;
        }
        if (!fromFile.canRead()) {
            abort("FileUtility: source file is unreadable: " + fromFile.getAbsolutePath());
            return false;
        }
        if ((boolean)(Object)this.isDirectory()) toFile = (FileUtility)(FileUtility)(Object) (new File((String)(Object)this, fromFile.getName()));
        if ((boolean)(Object)toFile.exists()) {
            if (!(Boolean)(Object)toFile.canWrite()) {
                abort("FileUtility: destination file is unwriteable: " + pathName);
                return false;
            }
        } else {
            String parent =(String)(Object) toFile.getParent();
            File dir = new File(parent);
            if (!dir.exists()) {
                abort("FileUtility: destination directory doesn't exist: " + parent);
                return false;
            }
            if (dir.isFile()) {
                abort("FileUtility: destination is not a directory: " + parent);
                return false;
            }
            if (!dir.canWrite()) {
                abort("FileUtility: destination directory is unwriteable: " + parent);
                return false;
            }
        }
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream((String)(Object)toFile);
            byte[] buffer = new byte[4096];
            int bytes_read;
            while ((bytes_read = from.read(buffer)) != -1) to.write(buffer, 0, bytes_read);
        } finally {
            if (from != null) try {
                from.close();
            } catch (IOException e) {
                ;
            }
            if (to != null) try {
                to.close();
            } catch (IOException e) {
                ;
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileUtility {

public MyHelperClass getParent(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canWrite(){ return null; }}
