import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14865742 {
public MyHelperClass projectName;

    public ObjectInputStream getObjectInputStreamFromServlet(String strUrl) throws Throwable, Exception {
        MyHelperClass headList = new MyHelperClass();
        if ((int)(Object)headList.size() == 0) {
            return null;
        }
        String starter = "-----------------------------";
        String returnChar = "\r\n";
        String lineEnd = "--";
        String urlString = strUrl;
        String input = null;
        List txtList = new ArrayList();
        List fileList = new ArrayList();
        String targetFile = null;
        String actionStatus = null;
        StringBuffer returnMessage = new StringBuffer();
        List head = new ArrayList();
        final String boundary = String.valueOf(System.currentTimeMillis());
        URL url = null;
        URLConnection conn = null;
        DataOutputStream dos = null;
        ObjectInputStream inputFromServlet = null;
        try {
            MyHelperClass baseURL = new MyHelperClass();
            url = new URL((URL)(Object)baseURL, "/" + projectName + strUrl);
            conn = url.openConnection();
            ((HttpURLConnection) conn).setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestProperty("Content-Type", "multipart/form-data, boundary=" + "---------------------------" + boundary);
//            MyHelperClass headList = new MyHelperClass();
            conn.setRequestProperty("Cookie", (String)(String)(Object) headList.get(0));
            if (input != null) {
                String auth = "Basic " + new sun.misc.BASE64Encoder().encode(input.getBytes());
                conn.setRequestProperty("Authorization", auth);
            }
            dos = new DataOutputStream(conn.getOutputStream());
            dos.flush();
            inputFromServlet = new ObjectInputStream(conn.getInputStream());
            txtList.clear();
            fileList.clear();
        } catch (EOFException e) {
            MyHelperClass workflowEditor = new MyHelperClass();
            workflowEditor.getEditor().outputMessage("Session Expired!", false);
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                dos.close();
            } catch (Exception e) {
            }
        }
        return inputFromServlet;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass outputMessage(String o0, boolean o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getEditor(){ return null; }}
