import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8831513 {
public MyHelperClass mwlog;
public MyHelperClass MWCyclopsUtils;
	public MyHelperClass stringURL;
	public MyHelperClass ip;
	public MyHelperClass serverName;

    public String sendMessage(String message, boolean log) {
        StringBuilder ret;
        try {
            URL url = new URL((String)(Object)this.stringURL);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setRequestProperty("User-Agent",(String)(Object) serverName);
            urlConnection.setRequestProperty("Host",(String)(Object) ip);
            urlConnection.setRequestProperty("Content-type", "text/xml");
            urlConnection.setRequestProperty("Content-length", Integer.toString(message.length()));
            PrintWriter _out = new PrintWriter(urlConnection.getOutputStream());
            if (log) {
                mwlog.infoLog("Sending Message: " + MWCyclopsUtils.formatMessage(message));
            } else mwlog.infoLog("Sending Message: " + message);
            _out.println(message);
            _out.flush();
            _out.close();
            ret = new StringBuilder();
            if (log) {
                BufferedReader _in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String input;
                while ((input = _in.readLine()) != null) ret.append(input + "\n");
                mwlog.infoLog(ret.toString());
                _in.close();
            } else {
                BufferedReader _in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                while (_in.readLine() != null) {
                }
                _in.close();
            }
            _out.close();
            urlConnection.disconnect();
            return ret.toString();
        } catch (Exception ex) {
            mwlog.errLog(ex);
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass errLog(Exception o0){ return null; }
	public MyHelperClass formatMessage(String o0){ return null; }
	public MyHelperClass infoLog(String o0){ return null; }}
