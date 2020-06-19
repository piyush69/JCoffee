import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c596993 {

    private String makeLoginRequest(URL url) throws Throwable, IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setDoInput(true);
        urlConnection.setDoOutput(true);
        urlConnection.setUseCaches(false);
        urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        StringBuilder content = new StringBuilder();
        MyHelperClass EMAIL = new MyHelperClass();
        content.append("Email=").append(URLEncoder.encode((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)EMAIL, "UTF-8"));
        MyHelperClass PASSWORD = new MyHelperClass();
        content.append("&Passwd=").append(URLEncoder.encode((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)PASSWORD, "UTF-8"));
        MyHelperClass SERVICE = new MyHelperClass();
        content.append("&service=").append(URLEncoder.encode((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)SERVICE, "UTF-8"));
        content.append("&source=").append(URLEncoder.encode("Google Base data API", "UTF-8"));
        OutputStream outputStream = urlConnection.getOutputStream();
        outputStream.write(content.toString().getBytes("UTF-8"));
        outputStream.close();
        int responseCode = urlConnection.getResponseCode();
        InputStream inputStream;
        if (responseCode == HttpURLConnection.HTTP_OK) {
            inputStream = urlConnection.getInputStream();
        } else {
            inputStream = urlConnection.getErrorStream();
        }
        return toString(inputStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
