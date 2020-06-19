import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16204779 {
public MyHelperClass NULL;
	public MyHelperClass sendMessage(MyHelperClass o0){ return null; }
public MyHelperClass SECONDS;
	public MyHelperClass PlayListTab;
	public MyHelperClass INTIAL_KB_BUFFER;
	public MyHelperClass BIT;
	public MyHelperClass regularStream;
	public MyHelperClass Log;
	public MyHelperClass stop(){ return null; }
	public MyHelperClass downloadAudio(String o0){ return null; }
	public MyHelperClass downloadAudioIncrement(String o0){ return null; }

    public void startStreaming(final String mediaUrl) throws Throwable, IOException {
        final String TAG = "startStreaming";
        int bitrate = 56;
        MyHelperClass PlayListTab = new MyHelperClass();
        sendMessage(PlayListTab.CHECKRIORITY);
//        MyHelperClass PlayListTab = new MyHelperClass();
        sendMessage(PlayListTab.RAISEPRIORITY);
//        MyHelperClass PlayListTab = new MyHelperClass();
        sendMessage(PlayListTab.START);
        try {
            URL url =(URL)(Object) NULL; //new URL();
            url = new URL(mediaUrl);
            HttpURLConnection urlConn =(HttpURLConnection)(Object) NULL; //new HttpURLConnection();
            urlConn = (HttpURLConnection) url.openConnection();
//            MyHelperClass urlConn = new MyHelperClass();
            urlConn.setReadTimeout(1000 * 20);
//            MyHelperClass urlConn = new MyHelperClass();
            urlConn.setConnectTimeout(1000 * 5);
//            MyHelperClass urlConn = new MyHelperClass();
            String ctype = urlConn.getContentType();
            if (ctype == null) {
                ctype = "";
            } else {
                ctype = ctype.toLowerCase();
            }
            MyHelperClass Log = new MyHelperClass();
            Log.d(TAG, "Content Type: " + ctype);
            MyHelperClass AUDIO_MPEG = new MyHelperClass();
            if (ctype.contains((CharSequence)(Object)AUDIO_MPEG) || ctype.equals("")) {
                MyHelperClass BITERATE_HEADER = new MyHelperClass();
                String temp = urlConn.getHeaderField((String)(Object)BITERATE_HEADER);
//                MyHelperClass Log = new MyHelperClass();
                Log.d(TAG, "Bitrate: " + temp);
                if (temp != null) {
                    bitrate = new Integer(temp).intValue();
                }
            } else {
//                MyHelperClass Log = new MyHelperClass();
                Log.e(TAG, "Does not look like we can play this audio type: " + ctype);
//                MyHelperClass Log = new MyHelperClass();
                Log.e(TAG, "Or we could not connect to audio");
//                MyHelperClass PlayListTab = new MyHelperClass();
                sendMessage(PlayListTab.TROUBLEWITHAUDIO);
                stop();
                return;
            }
        } catch (IOException ioe) {
            Log.e(TAG, "Could not connect to " + mediaUrl);
            sendMessage(PlayListTab.TROUBLEWITHAUDIO);
            stop();
            return;
        }
        if ((boolean)(Object)regularStream) {
            Log.d(TAG, "Setup regular stream");
            Runnable r = new Runnable() {

                public void run() {
                    try {
                        downloadAudio(mediaUrl);
                    } catch (IOException e) {
                        MyHelperClass Log = new MyHelperClass();
                        Log.e(TAG, "Unable to initialize the MediaPlayer for Audio Url = " + mediaUrl, e);
                        MyHelperClass PlayListTab = new MyHelperClass();
                        sendMessage(PlayListTab.TROUBLEWITHAUDIO);
                        stop();
                        return;
                    }
                }
            };
            Thread t = new Thread(r);
            t.start();
        } else {
            Log.d(TAG, "Setup incremental stream");
            INTIAL_KB_BUFFER = bitrate *(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) (int)(Object)SECONDS / (int)(Object)BIT;
            Runnable r = new Runnable() {

                public void run() {
                    try {
                        downloadAudioIncrement(mediaUrl);
                    } catch (IOException e) {
                        MyHelperClass Log = new MyHelperClass();
                        Log.e(TAG, "Unable to initialize the MediaPlayer for Audio Url = " + mediaUrl, e);
                        MyHelperClass PlayListTab = new MyHelperClass();
                        sendMessage(PlayListTab.TROUBLEWITHAUDIO);
                        stop();
                        return;
                    }
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TROUBLEWITHAUDIO;
	public MyHelperClass RAISEPRIORITY;
	public MyHelperClass START;
	public MyHelperClass CHECKRIORITY;
public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass e(String o0, String o1, IOException o2){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass getHeaderField(MyHelperClass o0){ return null; }}
