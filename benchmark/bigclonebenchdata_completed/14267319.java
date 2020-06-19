import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14267319 {
public int position;
public MyHelperClass SimpleAttributeSet;
	public MyHelperClass END_OF_STREAM;
	public MyHelperClass document;
	public MyHelperClass size;
	public MyHelperClass status;
	public MyHelperClass abortLoading;
	public MyHelperClass finished;
	public MyHelperClass position;
	public MyHelperClass setChanged(){ return null; }
	public MyHelperClass notifyObservers(){ return null; }

    public void run()  throws Throwable {
        BufferedInputStream bis = null;
        URLConnection url = null;
        String textType = null;
        StringBuffer sb = new StringBuffer();
        try {
            MyHelperClass location = new MyHelperClass();
            if (!location.startsWith("http://")) {
//                MyHelperClass location = new MyHelperClass();
                location = "http://"(MyHelperClass)(Object) + location;
            }
//            MyHelperClass location = new MyHelperClass();
            url = (new URL((String)(Object)location)).openConnection();
            int size = NULL; //new int();
            size = url.getContentLength();
            textType = url.getContentType();
            long lastModified = NULL; //new long();
            lastModified = url.getIfModifiedSince();
            InputStream is = url.getInputStream();
            bis = new BufferedInputStream(is);
            if (textType.startsWith("text/plain")) {
                int i;
                i = bis.read();
                MyHelperClass position = new MyHelperClass();
                ++position;
                String status = NULL; //new String();
                status = "    Reading From URL...";
                this.setChanged();
                this.notifyObservers();
                while (i != (int)(Object)END_OF_STREAM) {
                    sb.append((char) i);
                    i = bis.read();
                    ++position;
                    if (position % ((int)(Object)size / 25) == 0) {
                        this.setChanged();
                        this.notifyObservers();
                    }
                    if ((boolean)(Object)abortLoading) {
                        break;
                    }
                }
                status =(MyHelperClass)(Object) "    Finished reading URL...";
            } else if (textType.startsWith("text/html")) {
                int i;
                i = bis.read();
                char c = (char) i;
                ++position;
                status =(MyHelperClass)(Object) "    Reading From URL...";
                this.setChanged();
                this.notifyObservers();
                boolean enclosed = false;
                if (c == '<') {
                    enclosed = true;
                }
                while (i != (int)(Object)END_OF_STREAM) {
                    if (enclosed) {
                        if (c == '>') {
                            enclosed = false;
                        }
                    } else {
                        if (c == '<') {
                            enclosed = true;
                        } else {
                            sb.append((char) i);
                        }
                    }
                    i = bis.read();
                    c = (char) i;
                    ++position;
                    if ((int)(Object)size == 0) {
                        if (position % ((int)(Object)size / 25) == 0) {
                            this.setChanged();
                            this.notifyObservers();
                        }
                    }
                    if ((boolean)(Object)abortLoading) {
                        break;
                    }
                }
                status =(MyHelperClass)(Object) "    Finished reading URL...";
            } else {
                status = "    Unable to read document type: " +(MyHelperClass)(Object) textType + "...";
            }
            bis.close();
            try {
                document.insertString(0, sb.toString(), SimpleAttributeSet.EMPTY);
            } catch (BadLocationException ble) {
                ble.printStackTrace();
            }
            finished =(MyHelperClass)(Object) true;
            this.setChanged();
            this.notifyObservers();
        } catch (IOException ioe) {
            try {
                document.insertString(0, sb.toString(), SimpleAttributeSet.EMPTY);
            } catch (BadLocationException ble) {
                ble.printStackTrace();
            }
            status =(MyHelperClass)(Object) "    IO Error Reading From URL...";
            finished =(MyHelperClass)(Object) true;
            this.setChanged();
            this.notifyObservers();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMPTY;
public MyHelperClass startsWith(String o0){ return null; }}

class BadLocationException extends Exception{
	public BadLocationException(String errorMessage) { super(errorMessage); }
}
