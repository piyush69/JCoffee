import java.io.*;
import java.lang.*;
import java.util.*;



class c1395368 {
public MyHelperClass log(String o0, MyHelperClass o1){ return null; }

    private File copyFile(File currFile) throws IOException {
        MyHelperClass _distDir = new MyHelperClass();
        String relativePath = currFile.getPath().substring((int)(Object)_distDir.length() + 1);
        MyHelperClass _installDir = new MyHelperClass();
        File targetFile = new File((String)(Object)_installDir, relativePath);
        if (targetFile.exists()) {
            MyHelperClass Project = new MyHelperClass();
            log(targetFile.getPath() + " already exists, skipping libcopy", Project.MSG_INFO);
            return targetFile;
        } else {
            if (!targetFile.getParentFile().exists()) {
                if (!targetFile.getParentFile().mkdirs()) {
                    MyHelperClass Project = new MyHelperClass();
                    log("Unable to create target dir tree for " + targetFile.getPath(), Project.MSG_ERR);
                    throw new IOException();
                }
            }
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(currFile);
        } catch (FileNotFoundException e) {
            MyHelperClass Project = new MyHelperClass();
            log("Library from plugin manifest appears to have been deleted: " + currFile.getPath(), Project.MSG_ERR);
            throw new IOException();
        }
        try {
            fos = new FileOutputStream(targetFile);
        } catch (FileNotFoundException e) {
            MyHelperClass Project = new MyHelperClass();
            log("Unable to create target file to write to: " + targetFile.getPath(), Project.MSG_ERR);
            throw new IOException();
        }
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int read = 0;
        byte[] buff = new byte[65536];
        boolean success = true;
        while (read != -1 && success) {
            try {
                read = bis.read(buff, 0, 65536);
            } catch (IOException e) {
                MyHelperClass Project = new MyHelperClass();
                log("Read error whilst reading from: " + currFile.getPath(), Project.MSG_ERR);
                success = false;
            }
            if (read != -1 && success) {
                try {
                    bos.write(buff, 0, read);
                } catch (IOException e) {
                    MyHelperClass Project = new MyHelperClass();
                    log("Write error whilst writing to: " + targetFile.getPath(), Project.MSG_ERR);
                    success = false;
                }
            }
        }
        try {
            bis.close();
        } catch (IOException e) {
        }
        try {
            bos.close();
        } catch (IOException e) {
        }
        try {
            fis.close();
        } catch (IOException e) {
        }
        try {
            fos.close();
        } catch (IOException e) {
        }
        if (!success) {
            throw new IOException();
        }
        return targetFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MSG_ERR;
	public MyHelperClass MSG_INFO;
public MyHelperClass length(){ return null; }}
