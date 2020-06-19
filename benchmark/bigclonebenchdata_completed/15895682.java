import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15895682 {

    protected static Certificate[] getCurrentCertificates() throws Exception {
        Certificate[] certificate =(java.security.Certificate[])(Object) AppletLoader.class.getProtectionDomain().getCodeSource().getCertificates();
        if (certificate == null) {
            URL location = AppletLoader.class.getProtectionDomain().getCodeSource().getLocation();
            JarURLConnection jurl = (JarURLConnection) (new URL("jar:" + location.toString() + "!/org/lwjgl/util/applet/AppletLoader.class").openConnection());
            jurl.setDefaultUseCaches(true);
            certificate =(java.security.Certificate[])(Object) jurl.getCertificates();
        }
        return certificate;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class AppletLoader {

}
