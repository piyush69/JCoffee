import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15416859 {
public MyHelperClass FORMAT;
	public MyHelperClass IOUtils;

    private boolean checkTimestamp(File timestamp, URL url) {
        try {
            if (timestamp.exists()) {
                FileReader reader = null;
                Date dateLocal = null;
                try {
                    reader = new FileReader(timestamp);
                    StringWriter tmp = new StringWriter();
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(reader, tmp);
                    dateLocal =(Date)(Object) this.FORMAT.parse(tmp.toString());
                } catch (UncheckedIOException e) {
                    timestamp.delete();
                } catch (IOException e) {
                } finally {
                    IOUtils.closeQuietly(reader);
                }
                if (dateLocal != null) {
                    try {
                        URLConnection conn = url.openConnection();
                        Date date =(Date)(Object) this.FORMAT.parse((String)(Object)this.FORMAT.format(new Date(conn.getLastModified())));
                        return (date.compareTo(dateLocal) == 0);
                    } catch (IOException e) {
                    }
                }
            }
        } catch (Throwable t) {
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass closeQuietly(FileReader o0){ return null; }
	public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass copy(FileReader o0, StringWriter o1){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
