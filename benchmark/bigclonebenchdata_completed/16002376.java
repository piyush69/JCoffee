import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16002376 {
public MyHelperClass strPassword;

    protected HttpURLConnection frndTrySend(HttpURLConnection h) throws OAIException {
        HttpURLConnection http = h;
        boolean done = false;
        GregorianCalendar sendTime = new GregorianCalendar();
        GregorianCalendar testTime = new GregorianCalendar();
        GregorianCalendar retryTime = null;
        String retryAfter;
        int retryCount = 0;
        do {
            try {
                MyHelperClass strUserAgent = new MyHelperClass();
                http.setRequestProperty("User-Agent",(String)(Object) strUserAgent);
                MyHelperClass strFrom = new MyHelperClass();
                http.setRequestProperty("From",(String)(Object) strFrom);
                MyHelperClass strUser = new MyHelperClass();
                if (strUser != null &&(int)(Object) strUser.length() > 0) {
//                    MyHelperClass strUser = new MyHelperClass();
                    byte[] encodedPassword = (strUser + ":" + strPassword).getBytes();
                    BASE64Encoder encoder = new BASE64Encoder();
                    http.setRequestProperty("Authorization", "Basic " + encoder.encode(encodedPassword));
                }
                sendTime.setTime(new Date());
                http.connect();
                if (http.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    done = true;
                } else if (http.getResponseCode() == HttpURLConnection.HTTP_UNAVAILABLE) {
                    retryCount++;
                    MyHelperClass iRetryLimit = new MyHelperClass();
                    if (retryCount > (int)(Object)iRetryLimit) {
                        MyHelperClass OAIException = new MyHelperClass();
                        throw new OAIException(OAIException.RETRY_LIMIT_ERR, "The RetryLimit " + iRetryLimit + " has been exceeded");
                    } else {
                        retryAfter = http.getHeaderField("Retry-After");
                        if (retryAfter == null) {
                            MyHelperClass OAIException = new MyHelperClass();
                            throw new OAIException(OAIException.RETRY_AFTER_ERR, "No Retry-After header");
                        } else {
                            try {
                                int sec = Integer.parseInt(retryAfter);
                                sendTime.add(Calendar.SECOND, sec);
                                retryTime = sendTime;
                            } catch (NumberFormatException ne) {
                                try {
                                    MyHelperClass DateFormat = new MyHelperClass();
                                    Date retryDate =(Date)(Object) DateFormat.getDateInstance().parse(retryAfter);
                                    retryTime = new GregorianCalendar();
                                    retryTime.setTime(retryDate);
                                } catch (UncheckedIOException pe) {
                                    MyHelperClass OAIException = new MyHelperClass();
                                    throw new OAIException(OAIException.CRITICAL_ERR, pe.getMessage());
                                }
                            }
                            if (retryTime != null) {
                                testTime.setTime(new Date());
                                MyHelperClass iMaxRetryMinutes = new MyHelperClass();
                                testTime.add(Calendar.MINUTE,(int)(Object) iMaxRetryMinutes);
                                if (retryTime.getTime().before(testTime.getTime())) {
                                    try {
                                        while (retryTime.getTime().after(new Date())) {
                                            Thread.sleep(60000);
                                        }
                                        URL url = http.getURL();
                                        http.disconnect();
                                        http = (HttpURLConnection) url.openConnection();
                                    } catch (InterruptedException ie) {
                                        MyHelperClass OAIException = new MyHelperClass();
                                        throw new OAIException(OAIException.CRITICAL_ERR, ie.getMessage());
                                    }
                                } else {
                                    MyHelperClass OAIException = new MyHelperClass();
                                    throw new OAIException(OAIException.RETRY_AFTER_ERR, "Retry time(" + retryAfter + " sec) is too long");
                                }
                            } else {
                                MyHelperClass OAIException = new MyHelperClass();
                                throw new OAIException(OAIException.RETRY_AFTER_ERR, retryAfter + "is not a valid Retry-After header");
                            }
                        }
                    }
                } else if (http.getResponseCode() == HttpURLConnection.HTTP_FORBIDDEN) {
                    MyHelperClass OAIException = new MyHelperClass();
                    throw new OAIException(OAIException.CRITICAL_ERR, http.getResponseMessage());
                } else {
                    retryCount++;
                    MyHelperClass iRetryLimit = new MyHelperClass();
                    if (retryCount > (int)(Object)iRetryLimit) {
                        MyHelperClass OAIException = new MyHelperClass();
                        throw new OAIException(OAIException.RETRY_LIMIT_ERR, "The RetryLimit " + iRetryLimit + " has been exceeded");
                    } else {
                        int sec = 10 * ((int) Math.exp(retryCount));
                        sendTime.add(Calendar.SECOND, sec);
                        retryTime = sendTime;
                        try {
                            while (retryTime.getTime().after(new Date())) {
                                Thread.sleep(sec * 1000);
                            }
                            URL url = http.getURL();
                            http.disconnect();
                            http = (HttpURLConnection) url.openConnection();
                        } catch (InterruptedException ie) {
                            MyHelperClass OAIException = new MyHelperClass();
                            throw new OAIException(OAIException.CRITICAL_ERR, ie.getMessage());
                        }
                    }
                }
            } catch (IOException ie) {
                MyHelperClass OAIException = new MyHelperClass();
                throw new OAIException(OAIException.CRITICAL_ERR, ie.getMessage());
            }
        } while (!done);
        return http;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CRITICAL_ERR;
	public MyHelperClass RETRY_AFTER_ERR;
	public MyHelperClass RETRY_LIMIT_ERR;
public MyHelperClass parse(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getDateInstance(){ return null; }}

class OAIException extends Exception{
	public OAIException(String errorMessage) { super(errorMessage); }
	OAIException(){}
	OAIException(MyHelperClass o0, String o1){}
}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}
