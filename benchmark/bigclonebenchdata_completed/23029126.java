import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23029126 {
public MyHelperClass HTMLUtils;
	public MyHelperClass CLIENT_VERSION;

    private HttpURLConnection makeGetRequest(String action, Object... parameters) throws IOException {
        MyHelperClass remoteUrl = new MyHelperClass();
        StringBuffer request = new StringBuffer((int)(Object)remoteUrl);
        MyHelperClass VERSION_PARAM = new MyHelperClass();
        HTMLUtils.appendQuery(request,(String)(Object) VERSION_PARAM,(String)(Object) CLIENT_VERSION);
        MyHelperClass ACTION_PARAM = new MyHelperClass();
        HTMLUtils.appendQuery(request,(String)(Object) ACTION_PARAM, action);
        for (int i = 0; i < parameters.length; i += 2) {
            MyHelperClass HTMLUtils = new MyHelperClass();
            HTMLUtils.appendQuery(request, String.valueOf(parameters[i]), String.valueOf(parameters[i + 1]));
        }
        String requestStr = request.toString();
        URLConnection conn;
        MyHelperClass MAX_URL_LENGTH = new MyHelperClass();
        if (requestStr.length() < (int)(Object)MAX_URL_LENGTH) {
            URL url = new URL(requestStr);
            conn = url.openConnection();
        } else {
            int queryPos = requestStr.indexOf('?');
            MyHelperClass HTTPUtils = new MyHelperClass();
            byte[] query = requestStr.substring(queryPos + 1).getBytes((String)(Object)HTTPUtils.DEFAULT_CHARSET);
            URL url = new URL(requestStr.substring(0, queryPos));
            conn = url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length", Integer.toString(query.length));
            OutputStream outputStream = new BufferedOutputStream(conn.getOutputStream());
            outputStream.write(query);
            outputStream.close();
        }
        return (HttpURLConnection) conn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_CHARSET;
public MyHelperClass appendQuery(StringBuffer o0, String o1, String o2){ return null; }}
