import java.io.*;
import java.lang.*;
import java.util.*;



class c13643066 {
public MyHelperClass NULL;
public MyHelperClass MessageFormat;
	public MyHelperClass Version;
	public MyHelperClass LAST_VERSION_KEY;
	public MyHelperClass MSG_UP_TO_DATE;
	public MyHelperClass MSG_OUT_OF_DATE;
public MyHelperClass MSG_IGNORE_TITLE;
	public MyHelperClass JOptionPane;
	public MyHelperClass mMode;
	public MyHelperClass MSG_UPDATE_TITLE;
	public MyHelperClass DelayedTask;
	public MyHelperClass WindowUtils;
	public MyHelperClass getResult(){ return null; }
	public MyHelperClass goToUpdate(){ return null; }

//    @Override
    public void run() {
        MyHelperClass mMode = new MyHelperClass();
        if ((int)(Object)mMode == 0) {
            MyHelperClass App = new MyHelperClass();
            long currentVersion =(long)(Object) Version.extractVersion((String)(Object)App.getVersion());
            if (currentVersion == 0) {
//                MyHelperClass mMode = new MyHelperClass();
                mMode =(MyHelperClass)(Object) 2;
                MyHelperClass RESULT = new MyHelperClass();
                RESULT = MSG_UP_TO_DATE;
                return;
            }
            long versionAvailable = currentVersion;
//            MyHelperClass mMode = new MyHelperClass();
            mMode =(MyHelperClass)(Object) 2;
            try {
                MyHelperClass mCheckURL = new MyHelperClass();
                StringBuilder buffer = new StringBuilder((int)(Object)mCheckURL);
                try {
                    MyHelperClass InetAddress = new MyHelperClass();
                    NetworkInterface ni =(NetworkInterface)(Object) NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
                    if (!(Boolean)(Object)ni.isLoopback()) {
                        if ((boolean)(Object)ni.isUp()) {
                            if (!(Boolean)(Object)ni.isVirtual()) {
                                buffer.append('?');
                                byte[] macAddress =(byte[])(Object) ni.getHardwareAddress();
                                for (byte one : macAddress) {
                                    buffer.append(Integer.toHexString(one >>> 4 & 0xF));
                                    buffer.append(Integer.toHexString(one & 0xF));
                                }
                            }
                        }
                    }
                } catch (Exception exception) {
                }
                URL url = new URL(buffer.toString());
                BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream()));
                String line = in.readLine();
                while (line != null) {
                    StringTokenizer tokenizer = new StringTokenizer(line, "\t");
                    if (tokenizer.hasMoreTokens()) {
                        try {
                            MyHelperClass mProductKey = new MyHelperClass();
                            if (tokenizer.nextToken().equalsIgnoreCase((String)(Object)mProductKey)) {
                                String token = tokenizer.nextToken();
                                MyHelperClass Version = new MyHelperClass();
                                long version =(long)(Object) Version.extractVersion(token);
                                if (version > versionAvailable) {
                                    versionAvailable = version;
                                }
                            }
                        } catch (Exception exception) {
                        }
                    }
                    line = in.readLine();
                }
            } catch (Exception exception) {
            }
            if (versionAvailable > currentVersion) {
                MyHelperClass Preferences = new MyHelperClass();
                Preferences prefs =(Preferences)(Object) Preferences.getInstance();
                MyHelperClass Version = new MyHelperClass();
                String humanReadableVersion =(String)(Object) Version.getHumanReadableVersion(versionAvailable);
                boolean NEW_VERSION_AVAILABLE =(boolean)(Object) NULL; //new boolean();
                NEW_VERSION_AVAILABLE = true;
                MyHelperClass RESULT = new MyHelperClass();
                RESULT = MessageFormat.format(MSG_OUT_OF_DATE, humanReadableVersion);
                MyHelperClass MODULE = new MyHelperClass();
                if (versionAvailable > (long)(Object)Version.extractVersion((String)(Object)prefs.getStringValue(MODULE, LAST_VERSION_KEY, App.getVersion()))) {
//                    MyHelperClass MODULE = new MyHelperClass();
                    prefs.setValue(MODULE, LAST_VERSION_KEY, humanReadableVersion);
                    prefs.save();
//                    MyHelperClass mMode = new MyHelperClass();
                    mMode =(MyHelperClass)(Object) 1;
                    MyHelperClass EventQueue = new MyHelperClass();
                    EventQueue.invokeLater(this);
                    return;
                }
            } else {
                MyHelperClass RESULT = new MyHelperClass();
                RESULT = MSG_UP_TO_DATE;
            }
//        MyHelperClass mMode = new MyHelperClass();
        } else if ((int)(Object)mMode == 1) {
            MyHelperClass App = new MyHelperClass();
            if ((boolean)(Object)App.isNotificationAllowed()) {
                String result =(String)(Object) getResult();
                mMode =(MyHelperClass)(Object) 2;
                if (WindowUtils.showConfirmDialog(null, result, MSG_UPDATE_TITLE, JOptionPane.OK_CANCEL_OPTION, new String[] {(String)(Object) MSG_UPDATE_TITLE,(String)(Object) MSG_IGNORE_TITLE }, MSG_UPDATE_TITLE) == JOptionPane.OK_OPTION) {
                    goToUpdate();
                }
            } else {
                DelayedTask.schedule(this, 250);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK_CANCEL_OPTION;
	public MyHelperClass OK_OPTION;
public MyHelperClass getLocalHost(){ return null; }
	public MyHelperClass isNotificationAllowed(){ return null; }
	public MyHelperClass extractVersion(String o0){ return null; }
	public MyHelperClass invokeLater(c13643066 o0){ return null; }
	public MyHelperClass showConfirmDialog(Object o0, String o1, MyHelperClass o2, MyHelperClass o3, String[] o4, MyHelperClass o5){ return null; }
	public MyHelperClass getHumanReadableVersion(long o0){ return null; }
	public MyHelperClass format(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass schedule(c13643066 o0, int o1){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class NetworkInterface {

public MyHelperClass isUp(){ return null; }
	public MyHelperClass getHardwareAddress(){ return null; }
	public static MyHelperClass getByInetAddress(MyHelperClass o0){ return null; }
	public MyHelperClass isVirtual(){ return null; }
	public MyHelperClass isLoopback(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class Preferences {

public MyHelperClass save(){ return null; }
	public MyHelperClass getStringValue(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass setValue(MyHelperClass o0, MyHelperClass o1, String o2){ return null; }}
