import java.io.*;
import java.lang.*;
import java.util.*;



class c11198368 {
public static MyHelperClass HardLink;
	public static MyHelperClass convertMetatadataFileName(String o0){ return null; }
//public MyHelperClass HardLink;
//	public MyHelperClass convertMetatadataFileName(String o0){ return null; }

    static void linkBlocks(File from, File to, int oldLV) throws IOException {
        if (!from.isDirectory()) {
            MyHelperClass COPY_FILE_PREFIX = new MyHelperClass();
            if (from.getName().startsWith((String)(Object)COPY_FILE_PREFIX)) {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyBytes(new FileInputStream(from), new FileOutputStream(to), 16 * 1024, true);
            } else {
                MyHelperClass PRE_GENERATIONSTAMP_LAYOUT_VERSION = new MyHelperClass();
                if (oldLV >= (int)(Object)PRE_GENERATIONSTAMP_LAYOUT_VERSION) {
                    to = new File((String)(Object)convertMetatadataFileName(to.getAbsolutePath()));
                }
                HardLink.createHardLink(from, to);
            }
            return;
        }
        if (!to.mkdir()) throw new IOException("Cannot create directory " + to);
        String[] blockNames = from.list(new java.io.FilenameFilter() {

            public boolean accept(File dir, String name) {
                MyHelperClass BLOCK_SUBDIR_PREFIX = new MyHelperClass();
                MyHelperClass BLOCK_FILE_PREFIX = new MyHelperClass();
                MyHelperClass COPY_FILE_PREFIX = new MyHelperClass();
                return name.startsWith((String)(Object)BLOCK_SUBDIR_PREFIX) || name.startsWith((String)(Object)BLOCK_FILE_PREFIX) || name.startsWith((String)(Object)COPY_FILE_PREFIX);
            }
        });
        for (int i = 0; i < blockNames.length; i++) linkBlocks(new File(from, blockNames[i]), new File(to, blockNames[i]), oldLV);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyBytes(FileInputStream o0, FileOutputStream o1, int o2, boolean o3){ return null; }
	public MyHelperClass createHardLink(File o0, File o1){ return null; }}
