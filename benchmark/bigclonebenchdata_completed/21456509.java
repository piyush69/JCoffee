import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21456509 {
public MyHelperClass mstrUsername;
	public MyHelperClass mstrPassword;
	public MyHelperClass BASE_URL_GET_VOTE;
	public MyHelperClass SAXParserFactory;
	public MyHelperClass join(ArrayList<String> o0, String o1){ return null; }

    private HashMap<String, GCVote> getVotes(ArrayList<String> waypoints, boolean blnSleepBeforeDownload) {
        if (blnSleepBeforeDownload) {
            try {
                MyHelperClass PACKET_SLEEP_TIME = new MyHelperClass();
                Thread.sleep((long)(Object)PACKET_SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        final String strWaypoints =(String)(Object) this.join(waypoints, ",");
        try {
            String strParameters = URLEncoder.encode("waypoints", "UTF-8") + "=" + URLEncoder.encode(strWaypoints, "UTF-8");
            if ((int)(Object)this.mstrUsername.length() > 0) {
                strParameters += "&" + URLEncoder.encode("userName", "UTF-8") + "=" + URLEncoder.encode((String)(Object)this.mstrUsername, "UTF-8");
                if ((int)(Object)this.mstrPassword.length() > 0) {
                    strParameters += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode((String)(Object)this.mstrPassword, "UTF-8");
                }
            }
            final URL url = new URL((String)(Object)BASE_URL_GET_VOTE);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            final OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
            osw.write(strParameters);
            osw.flush();
            final SAXParserFactory saxParserFactory =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
            saxParserFactory.setValidating(false);
            saxParserFactory.setNamespaceAware(true);
            final SAXParser saxParser =(SAXParser)(Object) saxParserFactory.newSAXParser();
            final XMLReader xmlReader =(XMLReader)(Object) saxParser.getXMLReader();
            final GCVoteHandler gcVoteHandler = new GCVoteHandler();
            xmlReader.setContentHandler(gcVoteHandler);
            xmlReader.parse(new InputSource(new InputStreamReader(conn.getInputStream())));
            return(HashMap<String,GCVote>)(Object) gcVoteHandler.getVotes();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass length(){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class GCVote {

}

class SAXParserFactory {

public MyHelperClass setNamespaceAware(boolean o0){ return null; }
	public MyHelperClass newSAXParser(){ return null; }
	public MyHelperClass setValidating(boolean o0){ return null; }}

class SAXParser {

public MyHelperClass getXMLReader(){ return null; }}

class XMLReader {

public MyHelperClass setContentHandler(GCVoteHandler o0){ return null; }
	public MyHelperClass parse(InputSource o0){ return null; }}

class GCVoteHandler {

public MyHelperClass getVotes(){ return null; }}

class InputSource {

InputSource(){}
	InputSource(InputStreamReader o0){}}
