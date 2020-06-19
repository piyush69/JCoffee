import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9492898 {

    public static Object getInputStream(String name, boolean showMsg, URL appletDocumentBase, String appletProxy)  throws Throwable {
        String errorMessage = null;
        int iurlPrefix;
        MyHelperClass urlPrefixes = new MyHelperClass();
        for (iurlPrefix = urlPrefixes.length; --iurlPrefix >= 0; ) if (name.startsWith(urlPrefixes[iurlPrefix])) break;
        boolean isURL = (iurlPrefix >= 0);
        boolean isApplet = (appletDocumentBase != null);
        InputStream in = null;
        int length;
        try {
            if (isApplet || isURL) {
                if (isApplet && isURL && appletProxy != null) name = appletProxy + "?url=" + URLEncoder.encode(name, "utf-8");
                URL url = (isApplet ? new URL(appletDocumentBase, name) : new URL(name));
                name = url.toString();
                MyHelperClass Logger = new MyHelperClass();
                if (showMsg) Logger.info("FileManager opening " + url.toString());
                URLConnection conn = url.openConnection();
                length = conn.getContentLength();
                in = conn.getInputStream();
            } else {
                MyHelperClass Logger = new MyHelperClass();
                if (showMsg) Logger.info("FileManager opening " + name);
                File file = new File(name);
                length = (int) file.length();
                in = new FileInputStream(file);
            }
            return new MonitorInputStream(in, length);
        } catch (Exception e) {
            try {
                if (in != null) in.close();
            } catch (IOException e1) {
            }
            errorMessage = "" + e;
        }
        return errorMessage;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MonitorInputStream {

}
