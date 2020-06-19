import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5520449 {
public MyHelperClass props;
	public MyHelperClass Logger;
	public MyHelperClass strUrl;

    protected void init() {
        if (this.strUrl != null) {
            InputStream in = null;
            try {
                URL url = ClassLoader.getSystemClassLoader().getResource((String)(Object)strUrl);
                if (url != null) {
                    in = url.openStream();
                    if (in != null) {
                        props.load(in);
                    }
                }
            } catch (IOException e) {
                Logger.defaultLogger().error("Error during framework properties loading", e);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException ignored) {
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass defaultLogger(){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}
