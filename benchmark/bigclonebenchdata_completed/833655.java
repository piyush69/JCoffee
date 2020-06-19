import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c833655 {
public MyHelperClass log(MyHelperClass o0, String o1){ return null; }

    private void checkForLatestVersion()  throws Throwable {
        MyHelperClass Color = new MyHelperClass();
        log(Color.BLUE, "Checking for latest version.");
        try {
            double LatestVersion = 0.0;
            URL url = new URL("http://www.powerbot.org/vb/showthread.php?t=723144");
            URLConnection urlc = url.openConnection();
            BufferedReader bf = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
            String CurrentLine;
            while ((CurrentLine = bf.readLine()) != null) {
                if (CurrentLine.contains("<pre class=\"bbcode_code\"style=\"height:48px;\"><i>Current version")) {
                    for (String s : CurrentLine.split(" ")) {
                        try {
                            LatestVersion = Double.parseDouble(s);
                        } catch (NumberFormatException nfe) {
                        }
                    }
                }
            }
            double CurrentVersion = getClass().getAnnotation(ScriptManifest.class).version();
            String Message = LatestVersion < CurrentVersion ? ", you should update to the latest version!" : ", you have the latest version of this script.";
//            MyHelperClass Color = new MyHelperClass();
            log(LatestVersion < CurrentVersion ? Color.RED : Color.BLUE, "Latest version available : " + LatestVersion + Message);
        } catch (IOException ioe) {
//            MyHelperClass Color = new MyHelperClass();
            log(Color.RED, "Couldn't retreive latest version due to a connection issue!");
        } catch (NumberFormatException nfe) {
//            MyHelperClass Color = new MyHelperClass();
            log(Color.RED, "Couldn't reveice latest version; no version were available on PowerBot website!.");
        } catch (Exception e) {
//            MyHelperClass Color = new MyHelperClass();
            log(Color.RED, "Couldn't retreive latest version due to an unknown reason!");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RED;
	public MyHelperClass BLUE;
}

class ScriptManifest {

}

class AnnotatedElement {

public MyHelperClass getAnnotation(Class<ScriptManifest> o0){ return null; }}
