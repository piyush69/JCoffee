import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15078689 {
public MyHelperClass publicationProperties;
public MyHelperClass config;
	public MyHelperClass Utilities;

    protected void fetchDicomSopInstance(File result) throws Exception {
        try {
            URL url = new URL(this.config.getUrl("wadoserver.url").toString() + "?requestType=WADO&contentType=text/xml" + "&studyUID=" + publicationProperties.getProperty("studyUID") + "&seriesUID=" + publicationProperties.getProperty("seriesUID") + "&objectUID=" + publicationProperties.getProperty("objectUID"));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            OutputStream ostream;
            InputStream istream;
            connection.setUseCaches(false);
            connection.setRequestProperty("accept", "text/xml");
            connection.connect();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new Exception("Error fetching DICOM SOP instance (" + connection.getResponseCode() + " " + connection.getResponseMessage() + ")");
            }
            ostream = new BufferedOutputStream(new FileOutputStream(result));
            try {
                istream = connection.getInputStream();
                Utilities.copyStream(istream, ostream);
            } finally {
                ostream.close();
            }
        } catch (Exception e) {
            throw new Exception("Error fetching DICOM SOP instance.", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyStream(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getUrl(String o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }}
