import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17817569 {
public MyHelperClass VERSION_040;
	public MyHelperClass serviceEndPoint;
	public MyHelperClass VERSION_030;
	public MyHelperClass VERSION_041;
public MyHelperClass getEncoding(){ return null; }

    public String getFeatureInfoHTML(Point3d GKposition, String[] layerIds, int featureCount) {
        String html = "";
        try {
            String request = null;
            MyHelperClass version = new MyHelperClass();
            if (version == VERSION_030) {
                GetFeatureInfo getFeatureInfo = new GetFeatureInfo(this.serviceEndPoint);
                request =(String)(Object) getFeatureInfo.createRequest(GKposition, layerIds, featureCount);
//            MyHelperClass version = new MyHelperClass();
            } else if (version == VERSION_040) {
                GetFeatureInfo getFeatureInfo = new GetFeatureInfo(this.serviceEndPoint);
                request =(String)(Object) getFeatureInfo.createRequest(GKposition, layerIds, featureCount);
//            MyHelperClass version = new MyHelperClass();
            } else if (version == VERSION_041) {
                GetFeatureInfo getFeatureInfo = new GetFeatureInfo(this.serviceEndPoint);
                request =(String)(Object) getFeatureInfo.createRequest(GKposition, layerIds, featureCount);
            }
            MyHelperClass Navigator = new MyHelperClass();
            if ((boolean)(Object)Navigator.isVerbose()) System.out.println(request);
            URL url = new URL(request);
            int contentLength = -1;
            URLConnection urlc;
            urlc = url.openConnection();
//            MyHelperClass Navigator = new MyHelperClass();
            urlc.setReadTimeout((int)(Object)Navigator.TIME_OUT);
            if (getEncoding() != null) {
                urlc.setRequestProperty("Authorization", "Basic " + getEncoding());
            }
            urlc.connect();
            String content_type = urlc.getContentType();
            if (content_type.equalsIgnoreCase("text/html") || content_type.equalsIgnoreCase("text/html;charset=UTF-8")) {
                InputStream is = urlc.getInputStream();
                BufferedInputStream bis = new BufferedInputStream(is);
                StringBuffer sb = new StringBuffer();
                InputStreamReader isr = new InputStreamReader(bis);
                char chars[] = new char[10240];
                int len = 0;
                contentLength = 0;
                while ((len = isr.read(chars, 0, chars.length)) >= 0) {
                    sb.append(chars, 0, len);
                    contentLength += len;
                }
                chars = null;
                isr.close();
                bis.close();
                is.close();
                html = sb.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return html;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TIME_OUT;
public MyHelperClass isVerbose(){ return null; }}

class Point3d {

}

class GetFeatureInfo {

GetFeatureInfo(MyHelperClass o0){}
	GetFeatureInfo(){}
	public MyHelperClass createRequest(Point3d o0, String[] o1, int o2){ return null; }}
