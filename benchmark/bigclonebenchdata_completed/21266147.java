import java.io.*;
import java.lang.*;
import java.util.*;



class c21266147 {

    public void execute() {
        MyHelperClass oarfilePath = new MyHelperClass();
        File sourceFile = new File((String)(Object)oarfilePath);
        MyHelperClass deploymentDirectory = new MyHelperClass();
        File destinationFile = new File(deploymentDirectory + File.separator + sourceFile.getName());
        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);
            byte[] readArray = new byte[2048];
            while (fis.read(readArray) != -1) {
                fos.write(readArray);
            }
            fis.close();
            fos.flush();
            fos.close();
        } catch (IOException ioe) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe("failed to copy the file:" + ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0){ return null; }}
