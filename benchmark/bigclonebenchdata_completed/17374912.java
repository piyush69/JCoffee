import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17374912 {
public MyHelperClass currentPath;
	public MyHelperClass newFile;
	public MyHelperClass name;
	public MyHelperClass isNewFile(){ return null; }

        public void copyTo(File folder)  throws Throwable {
            if (!(Boolean)(Object)isNewFile()) {
                return;
            }
            if (!folder.exists()) {
                folder.mkdir();
            }
            File dest = new File((String)(Object)folder,(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) name);
            try {
                FileInputStream in = new FileInputStream((String)(Object)currentPath);
                FileOutputStream out = new FileOutputStream(dest);
                byte[] readBuf = new byte[1024 * 512];
                int readLength;
                long totalCopiedSize = 0;
                boolean canceled = false;
                while ((readLength = in.read(readBuf)) != -1) {
                    out.write(readBuf, 0, readLength);
                }
                in.close();
                out.close();
                if (canceled) {
                    dest.delete();
                } else {
                    currentPath =(MyHelperClass)(Object) dest;
                    newFile =(MyHelperClass)(Object) false;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
