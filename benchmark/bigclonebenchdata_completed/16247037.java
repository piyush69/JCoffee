import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16247037 {
public MyHelperClass Object;
	public MyHelperClass NULL;
public MyHelperClass AETemporaryFileHandler;
	public MyHelperClass destroy(ExternalSeedException o0){ return null; }
public MyHelperClass last_response_retry_after_secs;
	public MyHelperClass Debug;
	public MyHelperClass con_fail_is_perm_fail;
	public MyHelperClass SESecurityManager;
	public MyHelperClass checkRequests(){ return null; }

        protected void download()  throws Throwable {
            boolean connected = false;
            String outcome = "";
            try {
                InputStream is = null;
                try {
                    MyHelperClass SESecurityManager = new MyHelperClass();
                    SESecurityManager.setThreadPasswordHandler(this);
                    synchronized (this) {
                        MyHelperClass destroyed = new MyHelperClass();
                        if ((boolean)(Object)destroyed) {
                            return;
                        }
                        MyHelperClass scratch_file = new MyHelperClass();
                        scratch_file = AETemporaryFileHandler.createTempFile();
                        RandomAccessFile raf =(RandomAccessFile)(Object) NULL; //new RandomAccessFile();
                        raf = new RandomAccessFile((String)(Object)scratch_file, "rw");
                    }
                    HttpURLConnection connection;
                    int response;
                    MyHelperClass original_url = new MyHelperClass();
                    connection = (HttpURLConnection)(HttpURLConnection)(Object) original_url.openConnection();
                    connection.setRequestProperty("Connection", "Keep-Alive");
                    MyHelperClass user_agent = new MyHelperClass();
                    connection.setRequestProperty("User-Agent",(String)(Object) user_agent);
                    MyHelperClass listener = new MyHelperClass();
                    int time_remaining =(int)(Object) listener.getPermittedTime();
                    if (time_remaining > 0) {
                        MyHelperClass Java15Utils = new MyHelperClass();
                        Java15Utils.setConnectTimeout(connection, time_remaining);
                    }
                    connection.connect();
//                    MyHelperClass listener = new MyHelperClass();
                    time_remaining =(int)(Object) listener.getPermittedTime();
                    if (time_remaining < 0) {
                        throw (new IOException("Timeout during connect"));
                    }
                    MyHelperClass Java15Utils = new MyHelperClass();
                    Java15Utils.setReadTimeout(connection, time_remaining);
                    connected = true;
                    response = connection.getResponseCode();
                    int last_response =(int)(Object) NULL; //new int();
                    last_response = response;
                    int last_response_retry_after_secs =(int)(Object) NULL; //new int();
                    last_response_retry_after_secs = -1;
                    if (response == 503) {
                        long retry_after_date = new Long(connection.getHeaderFieldDate("Retry-After", -1L)).longValue();
                        if (retry_after_date <= -1) {
//                            MyHelperClass last_response_retry_after_secs = new MyHelperClass();
                            last_response_retry_after_secs =(int)(Object)(MyHelperClass)(Object) connection.getHeaderFieldInt("Retry-After", -1);
                        } else {
//                            MyHelperClass last_response_retry_after_secs = new MyHelperClass();
                            last_response_retry_after_secs =(int)(Object)(MyHelperClass)(Object) (int) ((retry_after_date - System.currentTimeMillis()) / 1000);
//                            MyHelperClass last_response_retry_after_secs = new MyHelperClass();
                            if ((int)(Object)last_response_retry_after_secs < 0) {
//                                MyHelperClass last_response_retry_after_secs = new MyHelperClass();
                                last_response_retry_after_secs =(int)(Object)(MyHelperClass)(Object) -1;
                            }
                        }
                    }
                    is = connection.getInputStream();
                    if (response == HttpURLConnection.HTTP_ACCEPTED || response == HttpURLConnection.HTTP_OK || response == HttpURLConnection.HTTP_PARTIAL) {
                        byte[] buffer = new byte[64 * 1024];
                        int requests_outstanding = 1;
                        MyHelperClass destroyed = new MyHelperClass();
                        while (!(Boolean)(Object)destroyed) {
//                            MyHelperClass listener = new MyHelperClass();
                            int permitted =(int)(Object) listener.getPermittedBytes();
                            if (requests_outstanding == 0 || permitted < 1) {
                                permitted = 1;
                                Thread.sleep(100);
                            }
                            int len = is.read(buffer, 0, Math.min(permitted, buffer.length));
                            if (len <= 0) {
                                break;
                            }
                            synchronized (this) {
                                try {
                                    MyHelperClass raf = new MyHelperClass();
                                    raf.write(buffer, 0, len);
                                } catch (Throwable e) {
                                    outcome = "Write failed: " + e.getMessage();
                                    ExternalSeedException error = new ExternalSeedException(outcome, e);
                                    error.setPermanentFailure(true);
                                    throw (error);
                                }
                            }
//                            MyHelperClass listener = new MyHelperClass();
                            listener.reportBytesRead(len);
                            requests_outstanding =(int)(Object) checkRequests();
                        }
                        checkRequests();
                    } else {
                        outcome = "Connection failed: " + connection.getResponseMessage();
                        ExternalSeedException error = new ExternalSeedException(outcome);
                        error.setPermanentFailure(true);
                        throw (error);
                    }
                } catch (IOException e) {
                    if ((boolean)(Object)con_fail_is_perm_fail && !connected) {
                        outcome = "Connection failed: " + e.getMessage();
                        ExternalSeedException error = new ExternalSeedException(outcome);
                        error.setPermanentFailure(true);
                        throw (error);
                    } else {
                        outcome = "Connection failed: " + Debug.getNestedExceptionMessage(e);
                        if ((int)(Object)last_response_retry_after_secs >= 0) {
                            outcome += ", Retry-After: " + last_response_retry_after_secs + " seconds";
                        }
                        ExternalSeedException excep = new ExternalSeedException(outcome, e);
                        if (e instanceof FileNotFoundException) {
                            excep.setPermanentFailure(true);
                        }
                        throw (excep);
                    }
                } catch (ExternalSeedException e) {
                    throw (e);
                } catch (Throwable e) {
                    if (e instanceof ExternalSeedException) {
                        throw ((ExternalSeedException) e);
                    }
                    outcome = "Connection failed: " + Debug.getNestedExceptionMessage(e);
                    throw (new ExternalSeedException("Connection failed", e));
                } finally {
                    SESecurityManager.unsetThreadPasswordHandler();
                    if (is != null) {
                        try {
                            is.close();
                        } catch (Throwable e) {
                        }
                    }
                }
            } catch (ExternalSeedException e) {
                if (!connected && (boolean)(Object)con_fail_is_perm_fail) {
                    e.setPermanentFailure(true);
                }
                destroy(e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass createTempFile(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass setReadTimeout(HttpURLConnection o0, int o1){ return null; }
	public MyHelperClass setConnectTimeout(HttpURLConnection o0, int o1){ return null; }
	public MyHelperClass getNestedExceptionMessage(Throwable o0){ return null; }
	public MyHelperClass setThreadPasswordHandler(c16247037 o0){ return null; }
	public MyHelperClass unsetThreadPasswordHandler(){ return null; }
	public MyHelperClass reportBytesRead(int o0){ return null; }
	public MyHelperClass getPermittedTime(){ return null; }
	public MyHelperClass getNestedExceptionMessage(IOException o0){ return null; }
	public MyHelperClass getPermittedBytes(){ return null; }}

class ExternalSeedException extends Exception{
	public ExternalSeedException(String errorMessage) { super(errorMessage); }
	ExternalSeedException(String o0, Throwable o1){}
	ExternalSeedException(String o0, IOException o1){}
	ExternalSeedException(){}
}
