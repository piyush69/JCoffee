import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21094933 {
public static MyHelperClass getVersion(){ return null; }
//public MyHelperClass getVersion(){ return null; }

    private static void checkForUpdates()  throws Throwable {
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.debug("Checking for Updates");
        new Thread() {

//            @Override
            public void run() {
                String lastVersion = null;
                try {
                    URL projectSite = new URL("http://code.google.com/p/g15lastfm/");
                    URLConnection urlC = projectSite.openConnection();
                    BufferedReader in = new BufferedReader(new InputStreamReader(urlC.getInputStream()));
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        if (inputLine.contains("<strong>Current version:")) {
                            lastVersion = inputLine;
                            break;
                        }
                    }
                    in.close();
                    if (lastVersion != null && lastVersion.length() > 0) {
                        lastVersion = lastVersion.substring(lastVersion.indexOf("Current version:") + 16);
                        lastVersion = lastVersion.substring(0, lastVersion.indexOf("</strong>")).trim();
                        MyHelperClass LOGGER = new MyHelperClass();
                        LOGGER.debug("last Version=" + lastVersion);
                    }
                    MyHelperClass LOGGER = new MyHelperClass();
                    if (lastVersion.equals(getVersion())) LOGGER.debug("Not necessary to update"); else {
//                        MyHelperClass LOGGER = new MyHelperClass();
                        LOGGER.debug("New update found!");
                        MyHelperClass SwingUtilities = new MyHelperClass();
                        SwingUtilities.invokeLater(new Runnable() {

//                            @Override
                            public void run() {
                                MyHelperClass JOptionPane = new MyHelperClass();
                                if (JOptionPane.showConfirmDialog(null, "New version of G15Lastfm is available to download!", "New Update for G15Lastfm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                                    MyHelperClass LOGGER = new MyHelperClass();
                                    LOGGER.debug("User choose to update, opening browser.");
                                    MyHelperClass Desktop = new MyHelperClass();
                                    Desktop desktop =(Desktop)(Object) Desktop.getDesktop();
                                    try {
                                        desktop.browse(new URI("http://code.google.com/p/g15lastfm/"));
                                    } catch (UncheckedIOException e) {
//                                        MyHelperClass LOGGER = new MyHelperClass();
                                        LOGGER.debug(e);
                                    } catch (URISyntaxException e) {
//                                        MyHelperClass LOGGER = new MyHelperClass();
                                        LOGGER.debug(e);
                                    }
                                } else {
                                    MyHelperClass LOGGER = new MyHelperClass();
                                    LOGGER.debug("User choose to not update.");
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.debug(e);
                }
            }
        }.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass YES_OPTION;
	public MyHelperClass YES_NO_OPTION;
public MyHelperClass getDesktop(){ return null; }
	public MyHelperClass invokeLater( Runnable o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass debug(IOException o0){ return null; }
	public MyHelperClass invokeLater(){ return null; }
	public MyHelperClass debug(URISyntaxException o0){ return null; }
	public MyHelperClass debug(Exception o0){ return null; }
	public MyHelperClass showConfirmDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }}

class Desktop {

public MyHelperClass browse(URI o0){ return null; }}
