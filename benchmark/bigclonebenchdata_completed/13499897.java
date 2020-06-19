import java.io.*;
import java.lang.*;
import java.util.*;



class c13499897 {
public static MyHelperClass DrxWriteError(String o0, String o1){ return null; }
//public MyHelperClass DrxWriteError(String o0, String o1){ return null; }

    public static String CopyFile(String sourcefile, String destfile) throws FileNotFoundException, IOException {
        int last = destfile.lastIndexOf('/');
        if (last < 0) {
            DrxWriteError("CopyFile", "Destination filepath " + destfile + " doesn't contain /");
            throw new java.io.FileNotFoundException(destfile);
        }
        String parent = destfile.substring(0, last);
        if (parent.length() > 0) {
            File f = new File(parent);
            if (!f.isDirectory()) {
                if (!f.mkdirs()) {
                    DrxWriteError("CopyFile", "Folder " + parent + " doesn't exist, cannot create");
                }
            }
        }
        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(sourcefile).getChannel());
        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(destfile).getChannel());
        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        srcChannel.close();
        dstChannel.close();
        return destfile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
