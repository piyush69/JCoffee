import java.io.*;
import java.lang.*;
import java.util.*;



class c687106 {
public MyHelperClass NULL;

    public boolean copyDirectoryTree(File srcPath, File dstPath) {
        try {
            if (srcPath.isDirectory()) {
                if (!dstPath.exists()) dstPath.mkdir();
                String files[] = srcPath.list();
                for (int i = 0; i < files.length; i++) copyDirectoryTree(new File(srcPath, files[i]), new File(dstPath, files[i]));
            } else {
                if (!srcPath.exists()) {
                    String errMsgLog =(String)(Object) NULL; //new String();
                    errMsgLog += "copyDirectoryTree I/O error from '" + srcPath + "' does not exist.\n";
                    String lastErrMsgLog =(String)(Object) NULL; //new String();
                    lastErrMsgLog = errMsgLog;
                    return (false);
                } else {
                    InputStream in = new FileInputStream(srcPath);
                    OutputStream out = new FileOutputStream(dstPath);
                    byte[] buf = new byte[10240];
                    int len;
                    while ((len = in.read(buf)) > 0) out.write(buf, 0, len);
                    in.close();
                    out.close();
                }
            }
            return (true);
        } catch (Exception e) {
            String errMsgLog =(String)(Object) NULL; //new String();
            errMsgLog += "copyDirectoryTree I/O error from '" + srcPath.getName() + "' to '" + dstPath.getName() + "\n  " + e + "\n";
            String lastErrMsgLog =(String)(Object) NULL; //new String();
            lastErrMsgLog = errMsgLog;
            return (false);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
