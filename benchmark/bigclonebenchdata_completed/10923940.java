import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10923940 {
public MyHelperClass NULL;
public MyHelperClass url;
	public MyHelperClass password;
public MyHelperClass method;
	public MyHelperClass connection;
	public MyHelperClass activeIS;
	public MyHelperClass toAbort;
	public MyHelperClass onreadystatechange;
	public MyHelperClass readyState;
	public MyHelperClass Pattern;
	public MyHelperClass statusText;
	public MyHelperClass status;
	public MyHelperClass activeOS;
	public MyHelperClass receiving;
	public MyHelperClass responseText;
	public MyHelperClass content;
	public MyHelperClass checkAbort(){ return null; }
	public MyHelperClass initializeReceivingMonitor(){ return null; }

    private void request()  throws Throwable {
        try {
            HttpURLConnection connection =(HttpURLConnection)(Object) NULL; //new HttpURLConnection();
            connection = (HttpURLConnection) new URL((String)(Object)url).openConnection();
            MyHelperClass isCometConnection = new MyHelperClass();
            if ((boolean)(Object)isCometConnection) {
//                MyHelperClass connection = new MyHelperClass();
                connection.setReadTimeout(0);
            } else {
//                MyHelperClass connection = new MyHelperClass();
                connection.setReadTimeout(30000);
            }
//            MyHelperClass connection = new MyHelperClass();
            connection.setInstanceFollowRedirects(false);
//            MyHelperClass connection = new MyHelperClass();
            connection.setDoInput(true);
            MyHelperClass method = new MyHelperClass();
            connection.setRequestMethod((String)(Object)method);
//            MyHelperClass connection = new MyHelperClass();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.5) Gecko/20091102 Firefox/3.5.5 GTB5");
//            MyHelperClass method = new MyHelperClass();
            if ("post".equalsIgnoreCase((String)(Object)method)) {
//                MyHelperClass connection = new MyHelperClass();
                connection.setDoOutput(true);
//                MyHelperClass connection = new MyHelperClass();
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            }
            MyHelperClass user = new MyHelperClass();
            if (user != null) {
//                MyHelperClass user = new MyHelperClass();
                String auth = user + ":" + (password != null ? password : "");
                String base64Auth =(String)(Object) Base64.byteArrayToBase64(auth.getBytes());
//                MyHelperClass connection = new MyHelperClass();
                connection.setRequestProperty("Authorization", "Basic " + base64Auth);
            }
            MyHelperClass headers = new MyHelperClass();
            for (Iterator<String> iter =(Iterator<String>)(Object) headers.keySet().iterator(); iter.hasNext(); ) {
                String key = (String) iter.next();
//                MyHelperClass headers = new MyHelperClass();
                connection.setRequestProperty(key, (String)(String)(Object) headers.get(key));
            }
//            MyHelperClass connection = new MyHelperClass();
            connection.setUseCaches(false);
            if ((boolean)(Object)checkAbort()) return;
            if ("post".equalsIgnoreCase((String)(Object)method)) {
                DataOutputStream dos = new DataOutputStream(connection.getOutputStream());
                activeOS =(MyHelperClass)(Object) dos;
                if (content != null) {
                    dos.writeBytes((String)(Object)content);
                }
                if ((boolean)(Object)checkAbort()) return;
                dos.flush();
                dos.close();
                activeOS = null;
            }
            if ((boolean)(Object)checkAbort()) return;
            InputStream is = null;
            try {
                is = connection.getInputStream();
            } catch (IOException e) {
                if ((boolean)(Object)checkAbort()) return;
                readyState =(MyHelperClass)(Object) 4;
                if (onreadystatechange != null) {
                    onreadystatechange.onLoaded();
                }
                connection = null;
                readyState =(MyHelperClass)(Object) 0;
                return;
            }
            activeIS =(MyHelperClass)(Object) is;
            if ((int)(Object)readyState < 2) {
                readyState =(MyHelperClass)(Object) 2;
                status =(MyHelperClass)(Object) connection.getResponseCode();
                statusText =(MyHelperClass)(Object) connection.getResponseMessage();
                if (onreadystatechange != null) {
                    onreadystatechange.onSent();
                }
            }
            receiving = initializeReceivingMonitor();
            ByteArrayOutputStream baos = new ByteArrayOutputStream(10240);
            byte[] buffer = new byte[10240];
            int read;
            while (!(Boolean)(Object)toAbort && (read = is.read(buffer)) != -1) {
                if ((boolean)(Object)checkAbort()) return;
                if ((int)(Object)readyState != 3) {
                    readyState =(MyHelperClass)(Object) 3;
                    if (onreadystatechange != null) {
                        onreadystatechange.onReceiving();
                    }
                }
                boolean received = false;
                if (receiving != null) {
                    received =(boolean)(Object) receiving.receiving(baos, buffer, 0, read);
                }
                if (!received) {
                    baos.write(buffer, 0, read);
                }
            }
            if ((boolean)(Object)checkAbort()) return;
            is.close();
            activeIS = null;
            responseText = null;
            String type = connection.getHeaderField("Content-Type");
            if (type != null) {
                String charset = null;
                String lowerType = type.toLowerCase();
                int idx = lowerType.indexOf("charset=");
                if (idx != -1) {
                    charset = type.substring(idx + 8);
                } else {
                    idx = lowerType.indexOf("/xml");
                    if (idx != -1) {
                        String tmp = baos.toString();
                        Matcher matcher =(Matcher)(Object) Pattern.compile("<\\?.*encoding\\s*=\\s*[\'\"]([^'\"]*)[\'\"].*\\?>", Pattern.MULTILINE).matcher(tmp);
                        if ((boolean)(Object)matcher.find()) {
                            charset =(String)(Object) matcher.group(1);
                        } else {
                            responseText =(MyHelperClass)(Object) tmp;
                        }
                    } else {
                        idx = lowerType.indexOf("html");
                        if (idx != -1) {
                            String tmp = baos.toString();
                            Matcher matcher = Pattern.compile("<meta.*content\\s*=\\s*[\'\"][^'\"]*charset\\s*=\\s*([^'\"]*)\\s*[\'\"].*>",(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) Pattern.MULTILINE | (int)(Object)Pattern.CASE_INSENSITIVE).matcher(tmp);
                            if ((boolean)(Object)matcher.find()) {
                                charset =(String)(Object) matcher.group(1);
                            } else {
                                responseText =(MyHelperClass)(Object) tmp;
                            }
                        }
                    }
                }
                if (charset != null) {
                    try {
                        responseText =(MyHelperClass)(Object) baos.toString(charset);
                    } catch (UnsupportedEncodingException e) {
                    }
                }
            }
            if (responseText == null) {
                try {
                    responseText =(MyHelperClass)(Object) baos.toString("iso-8859-1");
                } catch (UnsupportedEncodingException e) {
                    responseText =(MyHelperClass)(Object) baos.toString();
                }
            }
            readyState =(MyHelperClass)(Object) 4;
            if (onreadystatechange != null) {
                onreadystatechange.onLoaded();
            }
            connection.disconnect();
            readyState =(MyHelperClass)(Object) 0;
        } catch (Exception e) {
            if ((boolean)(Object)checkAbort()) return;
            e.printStackTrace();
            readyState =(MyHelperClass)(Object) 4;
            if (onreadystatechange != null) {
                onreadystatechange.onLoaded();
            }
            connection = null;
            readyState =(MyHelperClass)(Object) 0;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MULTILINE;
	public MyHelperClass CASE_INSENSITIVE;
public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass setInstanceFollowRedirects(boolean o0){ return null; }
	public MyHelperClass onSent(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass onLoaded(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass compile(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass onReceiving(){ return null; }
	public MyHelperClass matcher(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setRequestMethod(MyHelperClass o0){ return null; }
	public MyHelperClass receiving(ByteArrayOutputStream o0, byte[] o1, int o2, int o3){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass keySet(){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass find(){ return null; }}

class Base64 {

public static MyHelperClass byteArrayToBase64(byte[] o0){ return null; }}
