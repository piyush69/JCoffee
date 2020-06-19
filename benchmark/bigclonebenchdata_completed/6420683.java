import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6420683 {
public MyHelperClass m_numReplies;
	public MyHelperClass m_attachId;
	public MyHelperClass m_gameId;
	public MyHelperClass Pattern;
	public MyHelperClass m_turnSummaryRef;
	public MyHelperClass m_msgNum;
	public MyHelperClass readCookies(URLConnection o0){ return null; }

    private boolean goToForum()  throws Throwable {
        URL url = null;
        URLConnection urlConn = null;
        int code = 0;
        boolean gotNumReplies = false;
        boolean gotMsgNum = false;
        try {
            MyHelperClass m_host = new MyHelperClass();
            url = new URL("http://" + m_host + "/forums/index.php?topic=" + m_gameId + ".new");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        }
        try {
            urlConn = url.openConnection();
            ((HttpURLConnection) urlConn).setRequestMethod("GET");
            ((HttpURLConnection) urlConn).setInstanceFollowRedirects(false);
            urlConn.setDoOutput(false);
            urlConn.setDoInput(true);
            MyHelperClass m_host = new MyHelperClass();
            urlConn.setRequestProperty("Host",(String)(Object) m_host);
            urlConn.setRequestProperty("Accept", "*/*");
            urlConn.setRequestProperty("Connection", "Keep-Alive");
            urlConn.setRequestProperty("Cache-Control", "no-cache");
            MyHelperClass m_referer = new MyHelperClass();
            if (m_referer != null) urlConn.setRequestProperty("Referer",(String)(Object) m_referer);
            MyHelperClass m_cookies = new MyHelperClass();
            if (m_cookies != null) urlConn.setRequestProperty("Cookie",(String)(Object) m_cookies);
//            MyHelperClass m_referer = new MyHelperClass();
            m_referer =(MyHelperClass)(Object) url.toString();
            readCookies(urlConn);
            code = ((HttpURLConnection) urlConn).getResponseCode();
            if (code != 200) {
                String msg = ((HttpURLConnection) urlConn).getResponseMessage();
                m_turnSummaryRef = String.valueOf(code) + ": "(MyHelperClass)(Object) + msg;
                return false;
            }
            BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line = "";
            Pattern p_numReplies = Pattern.compile(".*?;num_replies=(\\d+)\".*");
            Pattern p_msgNum = Pattern.compile(".*?<a name=\"msg(\\d+)\"></a><a name=\"new\"></a>.*");
            Pattern p_attachId = Pattern.compile(".*?action=dlattach;topic=" + m_gameId + ".0;attach=(\\d+)\">.*");
            while ((line = in.readLine()) != null) {
                if (!gotNumReplies) {
                    Matcher match_numReplies = p_numReplies.matcher(line);
                    if (match_numReplies.matches()) {
                        m_numReplies = match_numReplies.group(1);
                        gotNumReplies = true;
                        continue;
                    }
                }
                if (!gotMsgNum) {
                    Matcher match_msgNum = p_msgNum.matcher(line);
                    if (match_msgNum.matches()) {
                        m_msgNum = match_msgNum.group(1);
                        gotMsgNum = true;
                        continue;
                    }
                }
                Matcher match_attachId = p_attachId.matcher(line);
                if (match_attachId.matches()) m_attachId = match_attachId.group(1);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        if (!gotNumReplies || !gotMsgNum) {
            m_turnSummaryRef =(MyHelperClass)(Object) "Error: ";
            if (!gotNumReplies) m_turnSummaryRef +=(MyHelperClass)(Object) "No num_replies found in A&A.org forum topic. ";
            if (!gotMsgNum) m_turnSummaryRef +=(MyHelperClass)(Object) "No msgXXXXXX found in A&A.org forum topic. ";
            return false;
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

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass matches(){ return null; }}
