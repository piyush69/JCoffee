import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14416222 {
public MyHelperClass logger;
	public MyHelperClass getValue(String o0, String o1){ return null; }
	public MyHelperClass generateXMLRPCSS(String o0){ return null; }
	public MyHelperClass getHash(File o0){ return null; }
	public MyHelperClass sendRPC(String o0){ return null; }
	public MyHelperClass generateXMLRPCSS(String o0, String o1){ return null; }

    private boolean subtitleDownload(Movie movie, File movieFile, File subtitleFile) {
        try {
            String ret;
            String xml;
            String moviehash =(String)(Object) getHash(movieFile);
            String moviebytesize = String.valueOf(movieFile.length());
            xml =(String)(Object) generateXMLRPCSS(moviehash, moviebytesize);
            ret =(String)(Object) sendRPC(xml);
            String subDownloadLink =(String)(Object) getValue("SubDownloadLink", ret);
            if (subDownloadLink.equals("")) {
                String moviefilename = movieFile.getName();
                if (!(moviefilename.toUpperCase().endsWith(".M2TS") && moviefilename.startsWith("0"))) {
                    String subfilename = subtitleFile.getName();
                    int index = subfilename.lastIndexOf(".");
                    String query = subfilename.substring(0, index);
                    xml =(String)(Object) generateXMLRPCSS(query);
                    ret =(String)(Object) sendRPC(xml);
                    subDownloadLink =(String)(Object) getValue("SubDownloadLink", ret);
                }
            }
            if (subDownloadLink.equals("")) {
                logger.finer("OpenSubtitles Plugin: Subtitle not found for " + movie.getBaseName());
                return false;
            }
            logger.finer("OpenSubtitles Plugin: Download subtitle for " + movie.getBaseName());
            URL url = new URL(subDownloadLink);
            HttpURLConnection connection = (HttpURLConnection) (url.openConnection());
            connection.setRequestProperty("Connection", "Close");
            InputStream inputStream = connection.getInputStream();
            int code = connection.getResponseCode();
            if (code != HttpURLConnection.HTTP_OK) {
                logger.severe("OpenSubtitles Plugin: Download Failed");
                return false;
            }
            GZIPInputStream a = new GZIPInputStream(inputStream);
            OutputStream out = new FileOutputStream(subtitleFile);
            byte buf[] = new byte[1024];
            int len;
            while ((len =(int)(Object) a.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            out.close();
            movie.setSubtitles(true);
            return true;
        } catch (Exception e) {
            logger.severe("OpenSubtitles Plugin: Download Exception (Movie Not Found)");
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass finer(String o0){ return null; }}

class Movie {

public MyHelperClass getBaseName(){ return null; }
	public MyHelperClass setSubtitles(boolean o0){ return null; }}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}
