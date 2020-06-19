import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3201728 {

//    @Override
    public InputStream openStream(long off, long len) throws IOException {
        MyHelperClass url = new MyHelperClass();
        URLConnection con =(URLConnection)(Object) url.openConnection();
        if (!(con instanceof HttpURLConnection)) {
            return null;
        }
        long t0 = System.currentTimeMillis();
        HttpURLConnection urlcon = (HttpURLConnection) con;
        urlcon.setRequestProperty("Connection", "Keep-Alive");
        String rangeS = "";
        if (off > 0) rangeS += "bytes=" + off + "-";
        MyHelperClass length = new MyHelperClass();
        if (len > 0 && off + len < (long)(Object)length) rangeS += (len - 1);
        if (rangeS.length() > 0) {
            urlcon.setRequestProperty("Range", rangeS);
        }
        urlcon.setRequestProperty("Content-Type", "application/octet-stream");
        InputStream in = urlcon.getInputStream();
        rangeS = urlcon.getHeaderField("Content-Range");
        long responseOff = 0;
        long responseEnd = -1;
        if (rangeS != null) {
            int start = rangeS.indexOf(' ') + 1;
            int end = rangeS.indexOf('-', start);
            String offS = rangeS.substring(start, end).trim();
            responseOff = Long.parseLong(offS);
            start = end + 1;
            end = rangeS.indexOf('/', start);
            String lenS = rangeS.substring(start, end).trim();
            responseEnd = 1 + Long.parseLong(lenS);
        }
        while (responseOff < off && responseOff <= responseEnd) {
            long s = in.skip(off - responseOff);
            if (s <= 0) {
                break;
            }
            responseOff += s;
        }
//        MyHelperClass length = new MyHelperClass();
        length =(MyHelperClass)(Object) urlcon.getHeaderFieldInt("Content-Length", -1);
        long respTime = System.currentTimeMillis() - t0;
        MyHelperClass responseTime = new MyHelperClass();
        if ((int)(Object)responseTime < 0) {
//            MyHelperClass responseTime = new MyHelperClass();
            responseTime =(MyHelperClass)(Object) respTime;
        } else {
//            MyHelperClass responseTime = new MyHelperClass();
            responseTime =(MyHelperClass)(Object) Math.round(0.5 * (double)(Object)responseTime + 0.5 * respTime);
        }
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}
