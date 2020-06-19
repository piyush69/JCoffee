import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19943672 {

    public void delete(URI uri, Map<?, ?> options) throws Throwable, IOException {
        try {
            URL url = new URL(uri.toString());
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            if (urlConnection instanceof HttpURLConnection) {
                final HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setRequestMethod("DELETE");
                int responseCode = httpURLConnection.getResponseCode();
                switch(responseCode) {
                    case HttpURLConnection.HTTP_OK:
                    case HttpURLConnection.HTTP_ACCEPTED:
                    case HttpURLConnection.HTTP_NO_CONTENT:
                        {
                            break;
                        }
                    default:
                        {
                            throw new IOException("DELETE failed with HTTP response code " + responseCode);
                        }
                }
            } else {
                throw new IOException("Delete is not supported for " + uri);
            }
        } catch (RuntimeException exception) {
            throw new IOWrappedException((String)(Object)exception);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOWrappedException extends Exception{
	public IOWrappedException(String errorMessage) { super(errorMessage); }
}
