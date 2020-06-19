import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16333373 {
public MyHelperClass DateUtil;
public MyHelperClass RollerConfig;
	public MyHelperClass mLogger;
	public MyHelperClass blacklistFile;
	public MyHelperClass lastModified;

    private boolean downloadBlacklist() {
        boolean blacklist_updated = false;
        try {
            MyHelperClass mLogger = new MyHelperClass();
            mLogger.debug("Attempting to download MT blacklist");
            MyHelperClass blacklistURL = new MyHelperClass();
            URL url = new URL((String)(Object)blacklistURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            if (this.lastModified != null) {
                connection.setRequestProperty("If-Modified-Since",(String)(Object) DateUtil.formatRfc822(this.lastModified));
            }
            int responseCode = connection.getResponseCode();
            mLogger.debug("HttpConnection response = " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_NOT_MODIFIED) {
                mLogger.debug("MT blacklist site says we are current");
                return false;
            }
            long lastModifiedLong = connection.getHeaderFieldDate("Last-Modified", -1);
            if (responseCode == HttpURLConnection.HTTP_OK && (this.lastModified == null ||(long)(Object) this.lastModified.getTime() < lastModifiedLong)) {
                mLogger.debug("my last modified = " + this.lastModified.getTime());
                mLogger.debug("MT last modified = " + lastModifiedLong);
                InputStream instream = connection.getInputStream();
                String uploadDir =(String)(Object) RollerConfig.getProperty("uploads.dir");
                String path = uploadDir + File.separator + blacklistFile;
                FileOutputStream outstream = new FileOutputStream(path);
                mLogger.debug("writing updated MT blacklist to " + path);
                byte[] buf = new byte[4096];
                int length = 0;
                while ((length = instream.read(buf)) > 0) outstream.write(buf, 0, length);
                outstream.close();
                instream.close();
                blacklist_updated = true;
                mLogger.debug("MT blacklist download completed.");
            } else {
                mLogger.debug("blacklist *NOT* saved, assuming we are current");
            }
        } catch (Exception e) {
            mLogger.error("error downloading blacklist", e);
        }
        return blacklist_updated;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass formatRfc822(MyHelperClass o0){ return null; }}
