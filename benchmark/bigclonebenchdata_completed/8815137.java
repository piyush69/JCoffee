import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8815137 {
public MyHelperClass Logger;
	public MyHelperClass file;
	public MyHelperClass getEstimatedFileName(File o0){ return null; }

    public void copyToDir(File dir)  throws Throwable {
        if (!dir.exists()) {
            dir.mkdirs();
        } else if (this.file.getParentFile() != null && this.file.getParentFile().equals(dir)) {
            return;
        }
        File file =(File)(Object) getEstimatedFileName(dir);
        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileInputStream fileInputStream = new FileInputStream((String)(Object)this.file);
            int read = 0;
            byte[] buffer = new byte[1024];
            while (read != -1) {
                fileOutputStream.write(buffer, 0, read);
                read = fileInputStream.read(buffer);
            }
            fileInputStream.close();
            fileOutputStream.close();
            this.file =(MyHelperClass)(Object) file;
        } catch (IOException e) {
            Logger.log(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass log(IOException o0){ return null; }}
