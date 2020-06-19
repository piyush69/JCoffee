import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20761702 {
public MyHelperClass stateDirProvider;
	public MyHelperClass IOUtils;

    private File newFile(File oldFile) throws IOException {
        int counter = 0;
        File nFile = new File(this.stateDirProvider.get() + File.separator + oldFile.getName());
        while (nFile.exists()) {
            nFile = new File(this.stateDirProvider.get() + File.separator + oldFile.getName() + "_" + counter);
        }
        IOUtils.copyFile(oldFile, nFile);
        return nFile;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }}
