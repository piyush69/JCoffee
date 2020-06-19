import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13745376 {
public int pref;
public int pref;
//public int pref;
//public int pref;
//public int pref;
//public int pref;
//public int pref;
//public int pref;
	public MyHelperClass createOpenUrl(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass open(URL o0, MyHelperClass o1, int o2){ return null; }
//public int pref;
	public MyHelperClass NLS;

        public IStatus runInUIThread(IProgressMonitor monitor)  throws Throwable {
            MyHelperClass Strings = new MyHelperClass();
            monitor.beginTask(Strings.MSG_CONNECT_SERVER, 3);
            InputStream in = null;
            try {
                MyHelperClass resource = new MyHelperClass();
                URL url =(URL)(Object) createOpenUrl(resource, pref);
                if (url != null) {
                    URLConnection con = url.openConnection();
                    monitor.worked(1);
//                    MyHelperClass Strings = new MyHelperClass();
                    monitor.setTaskName(Strings.MSG_WAIT_FOR_SERVER);
                    con.connect();
                    in = con.getInputStream();
                    in.read();
                    monitor.worked(1);
//                    MyHelperClass Strings = new MyHelperClass();
                    monitor.setTaskName(NLS.bind(Strings.MSG_OPEN_URL, url));
//                    MyHelperClass resource = new MyHelperClass();
                    open(url, resource.getProject(), pref);
                    monitor.worked(1);
                }
            } catch (ConnectException con) {
                MyHelperClass count = new MyHelperClass();
                if ((int)(Object)count < 3) {
                    MyHelperClass resource = new MyHelperClass();
                    ConnectAndOpenJob job = new ConnectAndOpenJob(resource, pref, ++count);
                    job.schedule(1000L);
                } else {
                    MyHelperClass Activator = new MyHelperClass();
                    Activator.log(con);
                }
            } catch (Exception e) {
                MyHelperClass Activator = new MyHelperClass();
                Activator.log(e);
            } finally {
                MyHelperClass Streams = new MyHelperClass();
                Streams.close(in);
                monitor.done();
            }
            MyHelperClass Status = new MyHelperClass();
            return(IStatus)(Object) Status.OK_STATUS;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK_STATUS;
	public MyHelperClass MSG_OPEN_URL;
	public MyHelperClass MSG_CONNECT_SERVER;
	public MyHelperClass MSG_WAIT_FOR_SERVER;
public MyHelperClass log(Exception o0){ return null; }
	public MyHelperClass bind(MyHelperClass o0, URL o1){ return null; }
	public MyHelperClass getProject(){ return null; }
	public MyHelperClass close(InputStream o0){ return null; }
	public MyHelperClass log(ConnectException o0){ return null; }}

class IProgressMonitor {

public MyHelperClass beginTask(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass done(){ return null; }
	public MyHelperClass setTaskName(MyHelperClass o0){ return null; }
	public MyHelperClass worked(int o0){ return null; }}

class IStatus {

}

class ConnectAndOpenJob {

public MyHelperClass schedule(long o0){ return null; }}
