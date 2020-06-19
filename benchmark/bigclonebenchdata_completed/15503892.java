import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15503892 {
public MyHelperClass path;
	public MyHelperClass file;
	public MyHelperClass FileUtils;
	public MyHelperClass url;

    public DownloadThread call() throws UpdateModException {
        try {
            MyHelperClass modName = new MyHelperClass();
            Thread.currentThread().setName("Download - " + modName);
            MyHelperClass url = new MyHelperClass();
            if (url != null) {
                URL urls = new URL((String)(Object)this.url);
                URLConnection connection = urls.openConnection();
                connection.setConnectTimeout(7500);
                InputStream is = urls.openStream();
                String filename = null;
                if (path == null || (boolean)(Object)path.isEmpty()) {
                    String pattern = "[^a-z,A-Z,0-9, ,.]";
                    filename =(String)(Object) this.url.substring((int)(Object)this.url.lastIndexOf("/") + 1).replace("%20", " ");
                    filename = filename.replaceAll(pattern, "");
                } else {
                    filename =(String)(Object) path;
                }
                FileOutputStream fos = null;
                file =(MyHelperClass)(Object) new File(System.getProperty("java.io.tmpdir") + File.separator + filename);
                fos = new FileOutputStream((String)(Object)file, false);
                FileUtils.copyInputStream(is, fos);
                is.close();
                fos.flush();
                fos.close();
            }
        } catch (MalformedURLException ex) {
            System.out.println(ex);
            file = null;
            throw new UpdateModException(null, ex);
        } catch (ConnectException ex) {
            System.out.println(ex);
            file = null;
            throw new UpdateModException(null, ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);
            file = null;
            throw new UpdateModException(null, ex);
        } catch (InvalidParameterException ex) {
            System.out.println(ex);
            file = null;
            throw new UpdateModException(null, ex);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            file = null;
            throw new UpdateModException(null, ex);
        } catch (IOException ex) {
            System.out.println(ex);
            file = null;
            throw new UpdateModException(null, ex);
        }
        return (DownloadThread)(Object)this;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass copyInputStream(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass isEmpty(){ return null; }}

class DownloadThread {

}

class UpdateModException extends Exception{
	public UpdateModException(String errorMessage) { super(errorMessage); }
	UpdateModException(){}
	UpdateModException(Object o0, ConnectException o1){}
	UpdateModException(Object o0, InvalidParameterException o1){}
	UpdateModException(Object o0, NullPointerException o1){}
	UpdateModException(Object o0, FileNotFoundException o1){}
	UpdateModException(Object o0, IOException o1){}
	UpdateModException(Object o0, MalformedURLException o1){}
}
