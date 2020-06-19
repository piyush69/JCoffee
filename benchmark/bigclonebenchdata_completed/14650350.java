import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14650350 {
public MyHelperClass mSession;
	public MyHelperClass Log;

    private boolean adjust(String stationUrl) throws Throwable, LastFMError(Throwable)(Object) {
        try {
            MyHelperClass mBaseURL = new MyHelperClass();
            URL url = new URL("http://" + mBaseURL + "/adjust.php?session=" + mSession + "&url=" + URLEncoder.encode(stationUrl, "UTF-8"));
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();
            InputStream is = conn.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader stringReader = new BufferedReader(reader);
            OptionsParser options = new OptionsParser(stringReader);
            if (!options.parse()) options = null;
            stringReader.close();
            if ("OK".equals(options.get("response"))) {
                return true;
            } else {
                MyHelperClass TAG = new MyHelperClass();
                Log.e(TAG, "Adjust failed: \"" + options.get("response") + "\"");
                return false;
            }
        } catch (MalformedURLException e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "in adjust", e);
            throw new LastFMError("Adjust failed:" + e.toString());
        } catch (UnsupportedEncodingException e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "in adjust", e);
            throw new LastFMError("Adjust failed:" + e.toString());
        } catch (IOException e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "in adjust", e);
            throw new LastFMError("Station not found:" + stationUrl);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class LastFMError {

LastFMError(String o0){}
	LastFMError(){}}

class OptionsParser {

}
