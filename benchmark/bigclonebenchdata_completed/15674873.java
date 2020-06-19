import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15674873 {
public static MyHelperClass writeContentDispositionFile(DataOutputStream o0, String o1, InputStream o2, String o3){ return null; }
	public static MyHelperClass writeContentDisposition(DataOutputStream o0, String o1, String o2){ return null; }
	public static MyHelperClass encodeBase64(String o0){ return null; }
public MyHelperClass encodeBase64(String o0){ return null; }
	public MyHelperClass writeContentDispositionFile(DataOutputStream o0, String o1, InputStream o2, String o3){ return null; }
	public MyHelperClass writeContentDisposition(DataOutputStream o0, String o1, String o2){ return null; }

    public static void uploadAsync(final String username, final String password, final String description, final String tags, final boolean addDateTags, final ArrayList<RecordedGeoPoint> recordedGeoPoints, final String pseudoFileName)  throws Throwable {
        if (username == null || username.length() == 0) return;
        if (password == null || password.length() == 0) return;
        if (description == null || description.length() == 0) return;
        if (tags == null || tags.length() == 0) return;
        if (pseudoFileName == null || pseudoFileName.endsWith(".gpx")) return;
        new Thread(new Runnable() {

            public void run() {
                MyHelperClass Util = new MyHelperClass();
                if (!Util.isSufficienDataForUpload(recordedGeoPoints)) return;
                MyHelperClass RecordedRouteGPXFormatter = new MyHelperClass();
                final InputStream gpxInputStream = new ByteArrayInputStream(RecordedRouteGPXFormatter.create(recordedGeoPoints).getBytes());
                String tagsToUse = tags;
                MyHelperClass autoTagFormat = new MyHelperClass();
                if (addDateTags || tagsToUse == null) if (tagsToUse == null) tagsToUse = autoTagFormat.format(new GregorianCalendar().getTime()); else tagsToUse = tagsToUse + " " + autoTagFormat.format(new GregorianCalendar().getTime());
                try {
                    MyHelperClass DEFAULT_DESCRIPTION = new MyHelperClass();
                    final String urlDesc = (description == null) ? DEFAULT_DESCRIPTION : description.replaceAll("\\.;&?,/", "_");
                    MyHelperClass DEFAULT_TAGS = new MyHelperClass();
                    final String urlTags = (tagsToUse == null) ? DEFAULT_TAGS : tagsToUse.replaceAll("\\\\.;&?,/", "_");
                    MyHelperClass API_VERSION = new MyHelperClass();
                    final URL url = new URL("http://www.openstreetmap.org/api/" + API_VERSION + "/gpx/create");
                    final HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setConnectTimeout(15000);
                    con.setRequestMethod("POST");
                    con.setDoOutput(true);
                    con.addRequestProperty("Authorization", "Basic " + encodeBase64(username + ":" + password));
                    MyHelperClass BOUNDARY = new MyHelperClass();
                    con.addRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
                    con.addRequestProperty("Connection", "close");
                    con.addRequestProperty("Expect", "");
                    con.connect();
                    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(con.getOutputStream()));
                    writeContentDispositionFile(out, "file", gpxInputStream, pseudoFileName);
                    writeContentDisposition(out, "description", urlDesc);
                    writeContentDisposition(out, "tags", urlTags);
                    writeContentDisposition(out, "public", "1");
//                    MyHelperClass BOUNDARY = new MyHelperClass();
                    MyHelperClass LINE_END = new MyHelperClass();
                    out.writeBytes("--" + BOUNDARY + "--" + LINE_END);
                    out.flush();
                    final int retCode = con.getResponseCode();
                    String retMsg = con.getResponseMessage();
                    if (retCode != 200) {
                        if (con.getHeaderField("Error") != null) retMsg += "\n" + con.getHeaderField("Error");
                        con.disconnect();
                        throw new RuntimeException(retCode + " " + retMsg);
                    }
                    out.close();
                    con.disconnect();
                } catch (Exception e) {
                }
            }
        }, "OSMUpload-Thread").start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass create(ArrayList<RecordedGeoPoint o0){ return null; }
	public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass isSufficienDataForUpload(ArrayList<RecordedGeoPoint o0){ return null; }}

class RecordedGeoPoint {

}
