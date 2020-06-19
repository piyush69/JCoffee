import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9834229 {
public MyHelperClass fixSuffix(String o0, MyHelperClass o1){ return null; }
public MyHelperClass suffix;
public MyHelperClass trace;
	public MyHelperClass tryCount;
	public MyHelperClass lastCommandTime;
	public MyHelperClass traceSends;
	public MyHelperClass name;
	public MyHelperClass logFile;
	public MyHelperClass getTimeout(){ return null; }
	public MyHelperClass delay(long o0){ return null; }

    public InputStream sendCommandRaw(String command, boolean usePost) throws Throwable, IOException {
        try {
            MyHelperClass prefix = new MyHelperClass();
            String fullCommand = prefix + command + fixSuffix(command, suffix);
            MyHelperClass lastCommandTime = new MyHelperClass();
            long curGap = System.currentTimeMillis() - (long)(Object)lastCommandTime;
            MyHelperClass minimumCommandPeriod = new MyHelperClass();
            long delayTime =(long)(Object) minimumCommandPeriod - curGap;
            delay(delayTime);
            URI uri = new URI(fullCommand);
            URL url = uri.toURL();
            if ((Boolean)(Object)trace || (Boolean)(Object)traceSends) {
                System.out.println("Sending-->     " + url);
            }
            if (logFile != null) {
                logFile.println("Sending-->     " + url);
            }
            InputStream is = null;
            for (int i = 0; i < (int)(Object)tryCount; i++) {
                try {
                    URLConnection urc = url.openConnection();
                    if (usePost) {
                        if (urc instanceof HttpURLConnection) {
                            ((HttpURLConnection) urc).setRequestMethod("POST");
                        }
                    }
                    if ((int)(Object)getTimeout() != -1) {
                        urc.setReadTimeout((int)(Object)getTimeout());
                        urc.setConnectTimeout((int)(Object)getTimeout());
                    }
                    is = new BufferedInputStream(urc.getInputStream());
                    break;
                } catch (FileNotFoundException e) {
                    throw e;
                } catch (IOException e) {
                    System.out.println(name + " Error: " + e + " cmd: " + command);
                }
            }
            lastCommandTime =(MyHelperClass)(Object) System.currentTimeMillis();
            if (is == null) {
                System.out.println(name + " retry failure  cmd: " + url);
                throw new IOException("Can't send command");
            }
            return is;
        } catch (URISyntaxException ex) {
            throw new IOException("bad uri " + ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass println(String o0){ return null; }}
