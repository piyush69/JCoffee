import java.io.*;
import java.lang.*;
import java.util.*;



class c3739492 {

    public static boolean downloadFile(String url, String destination) {
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        File destfile;
        try {
            java.net.URL fileurl;
            try {
                fileurl = new java.net.URL(url);
            } catch (UncheckedIOException e) {
                return false;
            }
            bi = new BufferedInputStream(fileurl.openStream());
            destfile = new File(destination);
            if (!destfile.createNewFile()) {
                destfile.delete();
                destfile.createNewFile();
            }
            bo = new BufferedOutputStream(new FileOutputStream(destfile));
            int readedbyte;
            while ((readedbyte = bi.read()) != -1) {
                bo.write(readedbyte);
            }
            bo.flush();
        } catch (IOException ex) {
            return false;
        } finally {
            try {
                bi.close();
                bo.close();
            } catch (Exception ex) {
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
