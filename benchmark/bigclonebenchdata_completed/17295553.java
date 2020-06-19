
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17295553 {
public MyHelperClass isNewer(VersionNumber o0, VersionNumber o1){ return null; }
public MyHelperClass mainFrame;
	public MyHelperClass Tools;
	public MyHelperClass showFailureDialog;
	public MyHelperClass JOptionPane;
	public MyHelperClass Version;
	public MyHelperClass getVersionNumber(String o0){ return null; }

    public void run() {
        List remoteVersions =(List)(Object) new LinkedList();
        MyHelperClass VERSION_URLS = new MyHelperClass();
        for (String s :(String[])(Object) (Object[])(Object)VERSION_URLS) {
            URL url = null;
            try {
                url = new URL(s);
            } catch (UncheckedIOException e) {
                MyHelperClass LogService = new MyHelperClass();
                LogService.getGlobal().log("Cannot create update target url: " + e.getMessage(), LogService.ERROR);
            }
            if (url != null) {
                BufferedReader in = null;
                try {
                    in = new BufferedReader(new InputStreamReader(url.openStream()));
                    String remoteVersion =(String)(Object) in.readLine();
                    if ((remoteVersion != null) && (remoteVersion.length() > 0) && (Character.isDigit(remoteVersion.charAt(0)))) {
                        remoteVersions.add(remoteVersion);
                    }
                } catch (UncheckedIOException e) {
                    MyHelperClass LogService = new MyHelperClass();
                    LogService.getGlobal().log("Not able to check for updates. Maybe no internet connection.", LogService.WARNING);
                } finally {
                    try {
                        if (in != null) in.close();
                    } catch (UncheckedIOException e) {
                        throw new Error(e);
                    }
                }
            }
        }
        if ((int)(Object)remoteVersions.size() > 0) {
            MyHelperClass RapidMinerGUI = new MyHelperClass();
            RapidMinerGUI.saveLastUpdateCheckDate();
        }
        Iterator i =(Iterator)(Object) remoteVersions.iterator();
        MyHelperClass Version = new MyHelperClass();
        VersionNumber newestVersion =(VersionNumber)(Object) getVersionNumber((String)(Object)Version.getLongVersion());
        while ((boolean)(Object)i.hasNext()) {
            String remoteVersionString =(String)(Object) i.next();
            if (remoteVersionString != null) {
                VersionNumber remoteVersion =(VersionNumber)(Object) getVersionNumber(remoteVersionString);
                if ((boolean)(Object)isNewer(remoteVersion, newestVersion)) {
                    newestVersion = remoteVersion;
                }
            }
        }
        if ((newestVersion != null) && (boolean)(Object)(isNewer(newestVersion,(VersionNumber)(Object) getVersionNumber((String)(Object)Version.getLongVersion())))) {
            JOptionPane.showMessageDialog(mainFrame, "New version of the RapidMiner Community Edition is available:" + Tools.getLineSeparator() + Tools.getLineSeparator() + "          RapidMiner " + newestVersion + Tools.getLineSeparator() + Tools.getLineSeparator() + "Please download it from:" + Tools.getLineSeparator() + "          http://www.rapidminer.com", "New RapidMiner version", JOptionPane.INFORMATION_MESSAGE);
        } else if ((boolean)(Object)showFailureDialog) {
            JOptionPane.showMessageDialog(mainFrame, "No newer versions of the RapidMiner Community Edition available!", "RapidMiner CE is up to date", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass ERROR;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass saveLastUpdateCheckDate(){ return null; }
	public MyHelperClass log(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getGlobal(){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass getLongVersion(){ return null; }
	public MyHelperClass getLineSeparator(){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class LinkedList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class VersionNumber {

}
