import java.io.*;
import java.lang.*;
import java.util.*;



class c10432257 {
public MyHelperClass NULL;
public MyHelperClass resoutFolder;
public MyHelperClass imageFiles;
	public MyHelperClass resFolder;
	public MyHelperClass toNativeEndian(long o0){ return null; }

    private void createImageArchive() throws Exception {
        File imageArchive =(File)(Object) NULL; //new File();
        imageArchive = new File((String)(Object)resoutFolder, "images.CrAr");
//        MyHelperClass imageArchive = new MyHelperClass();
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream((String)(Object)imageArchive)));
        MyHelperClass imageFiles = new MyHelperClass();
        out.writeInt((int)(Object)toNativeEndian((long)(Object)imageFiles.size()));
//        MyHelperClass imageFiles = new MyHelperClass();
        for (int i = 0; i < (int)(Object)imageFiles.size(); i++) {
//            MyHelperClass imageFiles = new MyHelperClass();
            File f =(File)(Object) imageFiles.get(i);
            out.writeLong((long)(Object)toNativeEndian(f.length()));
            out.writeLong((long)(Object)toNativeEndian(new File((String)(Object)resFolder, f.getName().substring(0, f.getName().length() - 5)).length()));
        }
        for (int i = 0; i < (int)(Object)imageFiles.size(); i++) {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream((String)(Object)imageFiles.get(i)));
            int read;
            while ((read = in.read()) != -1) {
                out.write(read);
            }
            in.close();
        }
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}
