import java.io.*;
import java.lang.*;
import java.util.*;



class c9837783 {
public MyHelperClass Errmsg;
	public MyHelperClass getContactPicPath(){ return null; }

    private void fileCopier(String filenameFrom, String filenameTo) {
        FileInputStream fromStream = null;
        FileOutputStream toStream = null;
        try {
            fromStream = new FileInputStream(new File(filenameFrom));
            if (new File(filenameTo).exists()) {
                new File(filenameTo).delete();
            }
            File dirr = new File((String)(Object)getContactPicPath());
            if (!dirr.exists()) {
                dirr.mkdir();
            }
            toStream = new FileOutputStream(new File(filenameTo));
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fromStream.read(buffer)) != -1) toStream.write(buffer, 0, bytesRead);
        } catch (FileNotFoundException e) {
            Errmsg.errmsg(e);
        } catch (IOException e) {
            Errmsg.errmsg(e);
        } finally {
            try {
                if (fromStream != null) {
                    fromStream.close();
                }
                if (toStream != null) {
                    toStream.close();
                }
            } catch (IOException e) {
                Errmsg.errmsg(e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass errmsg(IOException o0){ return null; }
	public MyHelperClass errmsg(FileNotFoundException o0){ return null; }}
