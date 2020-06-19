import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1026385 {
public MyHelperClass returnChar;
	public MyHelperClass urlString;
public MyHelperClass log;
	public MyHelperClass txtList;
	public MyHelperClass fileList;
	public MyHelperClass transactFormStr(BufferedReader o0){ return null; }

    public String transmit(String input, String filePath) throws Exception {
        MyHelperClass cookie = new MyHelperClass();
        if (cookie == null || "".equals(urlString)) {
            return null;
        }
        String txt = "";
        StringBuffer returnMessage = new StringBuffer();
        final String boundary = String.valueOf(System.currentTimeMillis());
        URL url = null;
        URLConnection conn = null;
        BufferedReader br = null;
        DataOutputStream dos = null;
        try {
            MyHelperClass urlString = new MyHelperClass();
            url = new URL((String)(Object)urlString);
            conn = url.openConnection();
            ((HttpURLConnection) conn).setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setAllowUserInteraction(true);
            conn.setUseCaches(false);
            MyHelperClass HEADER_COOKIE = new MyHelperClass();
            conn.setRequestProperty((String)(Object)HEADER_COOKIE,(String)(Object) cookie);
            if (input != null) {
                String auth = "Basic " + new sun.misc.BASE64Encoder().encode(input.getBytes());
                conn.setRequestProperty("Authorization", auth);
            }
            dos = new DataOutputStream(conn.getOutputStream());
            MyHelperClass starter = new MyHelperClass();
            dos.write((starter + boundary + returnChar).getBytes());
            MyHelperClass txtList = new MyHelperClass();
            for (int i = 0; i < (int)(Object)txtList.size(); i++) {
//                MyHelperClass txtList = new MyHelperClass();
                HtmlFormText htmltext = (HtmlFormText)(HtmlFormText)(Object) txtList.get(i);
                dos.write((int)(Object)htmltext.getTranslated());
//                MyHelperClass txtList = new MyHelperClass();
                if (i + 1 < (int)(Object)txtList.size()) {
//                    MyHelperClass starter = new MyHelperClass();
                    dos.write((starter + boundary + returnChar).getBytes());
                MyHelperClass fileList = new MyHelperClass();
                } else if ((int)(Object)fileList.size() > 0) {
//                    MyHelperClass starter = new MyHelperClass();
                    dos.write((starter + boundary + returnChar).getBytes());
                }
            }
            MyHelperClass fileList = new MyHelperClass();
            for (int i = 0; i < (int)(Object)fileList.size(); i++) {
//                MyHelperClass fileList = new MyHelperClass();
                HtmlFormFile htmlfile = (HtmlFormFile)(HtmlFormFile)(Object) fileList.get(i);
                dos.write((int)(Object)htmlfile.getTranslated());
//                MyHelperClass fileList = new MyHelperClass();
                if (i + 1 < (int)(Object)fileList.size()) {
//                    MyHelperClass starter = new MyHelperClass();
                    dos.write((starter + boundary + returnChar).getBytes());
                }
            }
//            MyHelperClass starter = new MyHelperClass();
            dos.write((starter + boundary + "--" + returnChar).getBytes());
            dos.flush();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            txt =(String)(Object) transactFormStr(br);
            if (!"".equals(filePath) && !"null".equals(filePath)) {
                RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
                raf.seek(raf.length());
                raf.writeBytes(txt + "\n");
                raf.close();
            }
            txtList.clear();
            fileList.clear();
        } catch (Exception e) {
            log.error(e, e);
        } finally {
            try {
                dos.close();
            } catch (Exception e) {
            }
            try {
                br.close();
            } catch (Exception e) {
            }
        }
        return txt;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass error(Exception o0, Exception o1){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class HtmlFormText {

public MyHelperClass getTranslated(){ return null; }}

class HtmlFormFile {

public MyHelperClass getTranslated(){ return null; }}
