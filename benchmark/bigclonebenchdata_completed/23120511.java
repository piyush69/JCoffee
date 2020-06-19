import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23120511 {

    private static final String getResult(String url, String postData) throws MalformedURLException, IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        if (!postData.equals("null")) {
            postData = postData.substring(1, postData.length() - 1);
            connection.setDoOutput(true);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
            writer.write(postData);
            writer.flush();
        }
        InputStreamReader reader = new InputStreamReader(connection.getInputStream());
        int i;
        StringBuffer buffer = new StringBuffer();
        while ((i = reader.read()) != -1) {
            buffer.append((char) i);
        }
        reader.close();
        String response = buffer.toString().trim();
        MyHelperClass StringUtilities = new MyHelperClass();
        response =(String)(Object) StringUtilities.replaceAll(response, "\r\n", "\\r\\n");
//        MyHelperClass StringUtilities = new MyHelperClass();
        response =(String)(Object) StringUtilities.replaceAll(response, "\"", "\\\"");
        return "\"" + response + "\"";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceAll(String o0, String o1, String o2){ return null; }}
