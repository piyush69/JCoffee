import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10091126 {
public MyHelperClass DEFAULT_CHARACTER_ENCODING;
	public MyHelperClass createTestdata(int o0){ return null; }
public MyHelperClass url;

    public void sendLargePostRequest(final int size) throws IOException {
        String encodedData = URLEncoder.encode("test",(String)(Object) DEFAULT_CHARACTER_ENCODING.getValue()) + "=" + URLEncoder.encode("this is just a mass test",(String)(Object) DEFAULT_CHARACTER_ENCODING.getValue());
        encodedData += "&" + URLEncoder.encode("payload",(String)(Object) DEFAULT_CHARACTER_ENCODING.getValue()) + "=" + createTestdata(size);
        final long start = System.currentTimeMillis();
        final long end;
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) this.url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setUseCaches(false);
        connection.setFollowRedirects(true);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Length", "" + encodedData.length());
        DataOutputStream output = null;
        BufferedReader reader = null;
        try {
            output = new DataOutputStream(connection.getOutputStream());
            output.writeBytes(encodedData);
            output.flush();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
            }
            end = System.currentTimeMillis();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException ignored) {
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignored) {
                }
            }
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Duration: " + (end - start) + " ms");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getValue(){ return null; }}
