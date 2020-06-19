import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8212985 {
public MyHelperClass createURLStringExistRESTGetXQuery(String o0){ return null; }

    private void writeCard() {
        try {
            MyHelperClass cata = new MyHelperClass();
            new URL((String)(Object)createURLStringExistRESTGetXQuery("update value //scheda[cata = \"" + cata + "\"] with " + "\"replaced from /schede/scheda-... by jEpi-Scheda-Applet\"")).openStream().close();
            MyHelperClass server = new MyHelperClass();
            String urlString = "http://" + server + "/exist/rest/db/schede/" + "scheda-" + cata + ".xml";
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(urlString).openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("PUT");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            MyHelperClass uiSchedaXml = new MyHelperClass();
            uiSchedaXml.write(outputStream);
            outputStream.close();
            httpURLConnection.getInputStream().close();
            httpURLConnection.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass write(OutputStream o0){ return null; }}
