import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13462484 {

    public static GoogleResponse getElevation(String lat, String lon) throws IOException {
        String url = "http://maps.google.com/maps/api/elevation/xml?locations=";
        url = url + String.valueOf(lat);
        url = url + ",";
        url = url + String.valueOf(lon);
        url = url + "&sensor=false";
        BufferedReader in = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
        String line;
        GoogleResponse googleResponse = new GoogleResponse();
        googleResponse.lat =(MyHelperClass)(Object) Double.valueOf(lat);
        googleResponse.lon =(MyHelperClass)(Object) Double.valueOf(lon);
        while ((line = in.readLine()) != null) {
            line = line.trim();
            if (line.startsWith("<status>")) {
                line = line.replace("<status>", "");
                line = line.replace("</status>", "");
                googleResponse.status =(MyHelperClass)(Object) line;
                if (!line.toLowerCase().equals("ok")) return googleResponse;
            } else if (line.startsWith("<elevation>")) {
                line = line.replace("<elevation>", "");
                line = line.replace("</elevation>", "");
                googleResponse.elevation =(MyHelperClass)(Object) Double.valueOf(line);
                return googleResponse;
            }
        }
        return googleResponse;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GoogleResponse {
public MyHelperClass status;
	public MyHelperClass lon;
	public MyHelperClass elevation;
	public MyHelperClass lat;
}
