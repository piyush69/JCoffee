import java.io.*;
import java.lang.*;
import java.util.*;



class c12561424 {
public MyHelperClass NULL;
public MyHelperClass logger;
	public MyHelperClass Frame;
	public MyHelperClass ServiceLocator;

    private boolean copyFile(File file) throws Exception {
        File destination =(File)(Object) NULL; //new File();
        destination = new File((String)(Object)ServiceLocator.getSqliteDir(), file.getName());
//        MyHelperClass destination = new MyHelperClass();
        logger.debug("Writing to: " + destination);
//        MyHelperClass destination = new MyHelperClass();
        if (destination.exists()) {
            MyHelperClass ServiceLocator = new MyHelperClass();
            Frame.showMessage(ServiceLocator.getText("Error.file.exists") + file.getName(), null);
            MyHelperClass logger = new MyHelperClass();
            logger.debug("File already exists: " + file);
            return false;
        }
//        MyHelperClass destination = new MyHelperClass();
        destination.createNewFile();
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(file);
//            MyHelperClass destination = new MyHelperClass();
            out = new FileOutputStream((String)(Object)destination);
            int read = 0;
            byte[] buffer = new byte[2048];
            while ((read = in.read(buffer)) > 0) {
                out.write(buffer, 0, read);
            }
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getText(String o0){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass showMessage(String o0, Object o1){ return null; }
	public MyHelperClass getSqliteDir(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}
