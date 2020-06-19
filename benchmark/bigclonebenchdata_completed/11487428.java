import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11487428 {
public MyHelperClass NULL;

    private void loadHtmlHeader()  throws Throwable {
        MyHelperClass defaultSkinFileName = new MyHelperClass();
//        MyHelperClass defaultSkinFileName = new MyHelperClass();
//        MyHelperClass defaultSkinFileName = new MyHelperClass();
//        MyHelperClass defaultSkinFileName = new MyHelperClass();
//        MyHelperClass defaultSkinFileName = new MyHelperClass();
//        MyHelperClass defaultSkinFileName = new MyHelperClass();
//        MyHelperClass defaultSkinFileName = new MyHelperClass();
//        MyHelperClass defaultSkinFileName = new MyHelperClass();
//        MyHelperClass defaultSkinFileName = new MyHelperClass();
        MyHelperClass defaultSkinFileName = new MyHelperClass();
        String skinUrl = getClass().getResource("/" + Properties.defaultSkinFileName).toString();
        MyHelperClass headerSkin = new MyHelperClass();
//        MyHelperClass headerSkin = new MyHelperClass();
//        MyHelperClass headerSkin = new MyHelperClass();
//        MyHelperClass headerSkin = new MyHelperClass();
//        MyHelperClass headerSkin = new MyHelperClass();
//        MyHelperClass headerSkin = new MyHelperClass();
//        MyHelperClass headerSkin = new MyHelperClass();
//        MyHelperClass headerSkin = new MyHelperClass();
//        MyHelperClass headerSkin = new MyHelperClass();
        MyHelperClass headerSkin = new MyHelperClass();
        if (Properties.headerSkin != null && !Properties.headerSkin.equals("")) {
            try {
//                MyHelperClass headerSkin = new MyHelperClass();
//                MyHelperClass headerSkin = new MyHelperClass();
//                MyHelperClass headerSkin = new MyHelperClass();
//                MyHelperClass headerSkin = new MyHelperClass();
//                MyHelperClass headerSkin = new MyHelperClass();
//                MyHelperClass headerSkin = new MyHelperClass();
//                MyHelperClass headerSkin = new MyHelperClass();
//                MyHelperClass headerSkin = new MyHelperClass();
//                MyHelperClass headerSkin = new MyHelperClass();
                MyHelperClass headerSkin = new MyHelperClass();
                URL url = new URL(Properties.headerSkin);
                if (url.getProtocol().equalsIgnoreCase("http")) {
                    boolean isHttpUrl =(boolean)(Object) NULL; //new boolean();
                    isHttpUrl = true;
                    HttpURLConnection.setFollowRedirects(false);
                    HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
                    httpConn.setRequestMethod("HEAD");
                    boolean urlExists = (httpConn.getResponseCode() == HttpURLConnection.HTTP_OK);
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
                    MyHelperClass headerSkin = new MyHelperClass();
                    if (urlExists) skinUrl = Properties.headerSkin;
                } else if (url.getProtocol().equalsIgnoreCase("jar")) {
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
                    MyHelperClass headerSkin = new MyHelperClass();
                    String jarFile = Properties.headerSkin.substring(9).split("!")[0];
                    File skinFile = new File(jarFile);
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
                    MyHelperClass headerSkin = new MyHelperClass();
                    if (skinFile.exists() && skinFile.canRead()) skinUrl = Properties.headerSkin;
                } else if (url.getProtocol().equalsIgnoreCase("file")) {
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
                    MyHelperClass headerSkin = new MyHelperClass();
                    File skinFile = new File(Properties.headerSkin.substring(5));
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
                    MyHelperClass headerSkin = new MyHelperClass();
                    if (skinFile.exists() && skinFile.canRead()) skinUrl = Properties.headerSkin;
                } else {
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
                    MyHelperClass headerSkin = new MyHelperClass();
                    File skinFile = new File(Properties.headerSkin);
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
//                    MyHelperClass headerSkin = new MyHelperClass();
                    MyHelperClass headerSkin = new MyHelperClass();
                    if (skinFile.exists() && skinFile.canRead()) skinUrl = Properties.headerSkin;
                }
            } catch (Exception ex) {
                MyHelperClass XohmLogger = new MyHelperClass();
                XohmLogger.debugPrintln("Header skin url not valid. " + ex.getMessage());
//                MyHelperClass XohmLogger = new MyHelperClass();
                XohmLogger.debugPrintln("Loading the default skin.");
                ex.printStackTrace();
            }
        }
        MyHelperClass XohmLogger = new MyHelperClass();
        XohmLogger.debugPrintln("Header skin file = " + skinUrl);
        try {
            MyHelperClass htmlHeaderPanel = new MyHelperClass();
            LocalHtmlRendererContext rendererContext = new LocalHtmlRendererContext(htmlHeaderPanel, new SimpleUserAgentContext());
            rendererContext.navigate(skinUrl);
            boolean headerLoaded =(boolean)(Object) NULL; //new boolean();
            headerLoaded = true;
        } catch (IOException urlEx) {
//            MyHelperClass XohmLogger = new MyHelperClass();
            XohmLogger.debugPrintln("Exception occured while loading the skin. " + urlEx.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debugPrintln(String o0){ return null; }}

class LocalHtmlRendererContext {

LocalHtmlRendererContext(){}
	LocalHtmlRendererContext(MyHelperClass o0, SimpleUserAgentContext o1){}
	public MyHelperClass navigate(String o0){ return null; }}

class SimpleUserAgentContext {

}
