import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23467092 {
public MyHelperClass CONTROL_PORT;
	public MyHelperClass maxID;
public MyHelperClass delay;
	public MyHelperClass random;
	public MyHelperClass event(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }

    public void control() {
        MyHelperClass host = new MyHelperClass();
        String urlPrefix = "http://" + host + ":" + CONTROL_PORT + "/servlet/Streamsicle";
        String skipURL = urlPrefix + "?action=skip";
        String addURL = urlPrefix + "?action=add&song=";
        String removeURL = urlPrefix + "?action=action=remove&fileID=";
        String url = null;
        String desc = null;
        while (true) {
            long time = System.currentTimeMillis();
            MyHelperClass random = new MyHelperClass();
            int action = Math.abs((int)(Object)random.nextInt() % 3);
//            MyHelperClass random = new MyHelperClass();
            long id = 1 + (Math.abs((int)(Object)random.nextLong()) % ((int)(Object)maxID - 1));
            switch(action) {
                case 0:
                    {
                        url = skipURL;
                        desc = "Skip song.";
                        break;
                    }
                case 1:
                    {
                        url = addURL + id;
                        desc = "Add song #" + id + ".";
                        break;
                    }
                case 2:
                    {
                        url = removeURL + id;
                        desc = "Remove song #" + id + ".";
                        break;
                    }
            }
            try {
                HttpURLConnection conn = (HttpURLConnection) (new URL(url).openConnection());
                conn.connect();
                String response = "(" + conn.getResponseCode() + ", " + conn.getResponseMessage() + ")";
                event(desc + " Reponse: " + response + ".");
            } catch (Exception e) {
                error("Problem with control action: url.", e);
                return;
            }
            long waitTime = Math.abs((int)(Object)random.nextLong()) % (int)(Object)delay;
            long now = System.currentTimeMillis();
            long diff = waitTime - (now - time);
            if (diff > 0) {
                try {
                    Thread.sleep(diff);
                } catch (InterruptedException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass nextLong(){ return null; }
	public MyHelperClass nextInt(){ return null; }}
