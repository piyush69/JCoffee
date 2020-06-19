import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6420682 {
public MyHelperClass m_password;
public MyHelperClass Pattern;
	public MyHelperClass m_turnSummaryRef;
	public MyHelperClass m_cookies;
	public MyHelperClass m_loginDelayInSeconds;
	public MyHelperClass m_host;
	public MyHelperClass m_referer;
	public MyHelperClass readCookies(URLConnection o0){ return null; }

    private boolean postLogin()  throws Throwable {
        URL url = null;
        URLConnection urlConn = null;
        OutputStream out = null;
        int code = 0;
        boolean gotPhpsessid = false;
        try {
            MyHelperClass m_host = new MyHelperClass();
            url = new URL("http://" + m_host + "/forums/index.php?action=login2");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
        try {
            urlConn = url.openConnection();
            ((HttpURLConnection) urlConn).setRequestMethod("POST");
            ((HttpURLConnection) urlConn).setInstanceFollowRedirects(false);
            urlConn.setDoOutput(true);
            urlConn.setDoInput(true);
            MyHelperClass m_host = new MyHelperClass();
            urlConn.setRequestProperty("Host",(String)(Object) m_host);
            urlConn.setRequestProperty("Accept", "*/*");
            urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            urlConn.setRequestProperty("Connection", "Keep-Alive");
            urlConn.setRequestProperty("Cache-Control", "no-cache");
            out = urlConn.getOutputStream();
            MyHelperClass m_username = new MyHelperClass();
            out.write(new String("user=" + m_username + "&passwrd=" + m_password + "&cookielength=60").getBytes());
            out.flush();
            out.close();
            do {
                readCookies(urlConn);
                m_referer =(MyHelperClass)(Object) url.toString();
                code = ((HttpURLConnection) urlConn).getResponseCode();
                if (code == 301 || code == 302) {
                    url = new URL(urlConn.getHeaderField("Location"));
                    urlConn = url.openConnection();
                    ((HttpURLConnection) urlConn).setRequestMethod("GET");
                    ((HttpURLConnection) urlConn).setInstanceFollowRedirects(false);
                    urlConn.setDoOutput(true);
                    urlConn.setDoInput(true);
                    urlConn.setRequestProperty("Host",(String)(Object) m_host);
                    urlConn.setRequestProperty("Accept", "*/*");
                    urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    urlConn.setRequestProperty("Connection", "Keep-Alive");
                    urlConn.setRequestProperty("Cache-Control", "no-cache");
                    if (m_referer != null) urlConn.setRequestProperty("Referer",(String)(Object) m_referer);
                    if (m_cookies != null) urlConn.setRequestProperty("Cookie",(String)(Object) m_cookies);
                    continue;
                }
                if (code == 200) {
                    String refreshHdr = urlConn.getHeaderField("Refresh");
                    Pattern p_phpsessid = Pattern.compile(".*?\\?PHPSESSID=(\\w+).*");
                    Matcher match_phpsessid = p_phpsessid.matcher(refreshHdr);
                    if (match_phpsessid.matches()) {
                        gotPhpsessid = true;
                    }
                    urlConn = null;
                    continue;
                }
                String msg = ((HttpURLConnection) urlConn).getResponseMessage();
                m_turnSummaryRef = String.valueOf(code) + ": "(MyHelperClass)(Object) + msg;
                return false;
            } while (urlConn != null);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        if (!gotPhpsessid) {
            m_turnSummaryRef =(MyHelperClass)(Object) "Error: PHPSESSID not found after login. ";
            return false;
        }
        if (m_cookies == null) {
            m_turnSummaryRef =(MyHelperClass)(Object) "Error: cookies not found after login. ";
            return false;
        }
        try {
            Thread.sleep((int)(Object)m_loginDelayInSeconds * 1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass compile(String o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass matches(){ return null; }}
