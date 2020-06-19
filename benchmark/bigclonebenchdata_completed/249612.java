import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c249612 {
public static MyHelperClass DEBUG;
//public MyHelperClass DEBUG;

    protected static boolean checkVersion(String address)  throws Throwable {
        Scanner scanner = null;
        try {
            URL url = new URL(address);
            InputStream iS = url.openStream();
            scanner = new Scanner(iS);
            MyHelperClass DEBUG = new MyHelperClass();
            if (scanner == null && (boolean)(Object)DEBUG) System.out.println("SCANNER NULL");
            String firstLine = scanner.nextLine();
            double latestVersion = Double.valueOf(firstLine.trim());
            MyHelperClass JCards = new MyHelperClass();
            double thisVersion =(double)(Object) JCards.VERSION;
            if (thisVersion >= latestVersion) {
//                MyHelperClass JCards = new MyHelperClass();
                JCards.latestVersion =(MyHelperClass)(Object) true;
            } else {
//                MyHelperClass JCards = new MyHelperClass();
                displaySimpleAlert(null, JCards.VERSION_PREFIX +(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object)(double)(Object) latestVersion + " is available online!\n" + "Look under the file menu for a link to the download site.");
            }
        } catch (Exception e) {
            MyHelperClass VERBOSE = new MyHelperClass();
            if ((Boolean)(Object)VERBOSE || (Boolean)(Object)DEBUG) {
                System.out.println("Can't decide latest version");
                e.printStackTrace();
            }
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERSION_PREFIX;
	public MyHelperClass VERSION;
	public MyHelperClass latestVersion;
}
