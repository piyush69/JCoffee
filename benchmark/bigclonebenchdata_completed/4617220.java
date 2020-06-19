import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4617220 {
public MyHelperClass STATUS_UPLOADING;
	public MyHelperClass STATUS_INIT;
public MyHelperClass isThreadStopped;
	public MyHelperClass error;
	public MyHelperClass urlString;
	public MyHelperClass parentWorkflow;
	public MyHelperClass errorStr;
	public MyHelperClass finished;
	public MyHelperClass setUploadProgress(int o0, int o1){ return null; }
	public MyHelperClass setDecompressStatusAtUpload(String o0){ return null; }

        public String postFileRequest(String fileName, String internalFileName) throws Throwable, Exception {
            MyHelperClass status = new MyHelperClass();
            status = STATUS_INIT;
            String responseString = null;
            String requestStringPostFix = new String("");
            MyHelperClass isThreadStopped = new MyHelperClass();
            if ((boolean)(Object)isThreadStopped) {
                return "";
            }
//            MyHelperClass status = new MyHelperClass();
            status = STATUS_UPLOADING;
//            MyHelperClass isThreadStopped = new MyHelperClass();
            if ((boolean)(Object)isThreadStopped) {
                return "";
            }
            String requestString = new String("");
            int contentLength = 0, c = 0, counter = 0;
            try {
                MyHelperClass parameters = new MyHelperClass();
                for (java.util.Iterator i = parameters.entrySet().iterator(); i.hasNext(); ) {
                    java.util.Map.Entry e = (java.util.Map.Entry) i.next();
                    requestString = requestString + "-----------------------------7d338a374003ea\n" + "Content-Disposition: form-data; name=\"" + (String) e.getKey() + "\"\n\n" + (String) e.getValue() + "\n\n";
                }
                MyHelperClass urlString = new MyHelperClass();
                URL url = new URL((String)(Object)urlString);
                URLConnection connection = url.openConnection();
                HttpURLConnection httpConn = (HttpURLConnection) connection;
                requestString = requestString + "-----------------------------7d338a374003ea\n" + "Content-Disposition: form-data; name=\"" + internalFileName + "\"; filename=\"" + fileName + "\"\n" + "Content-Type: text/plain\n\n";
                requestStringPostFix = requestStringPostFix + "\n\n" + "-----------------------------7d338a374003ea\n" + "\n";
                FileInputStream fis = null;
                String str = null;
                try {
                    fis = new FileInputStream(fileName);
                    int fileSize = fis.available();
                    contentLength = requestString.length() + requestStringPostFix.length() + fileSize;
                    httpConn.setRequestProperty("Content-Length", String.valueOf(contentLength));
                    httpConn.setRequestProperty("Content-Type", "multipart/form-data; boundary=---------------------------7d338a374003ea");
                    httpConn.setRequestMethod("POST");
                    httpConn.setDoOutput(true);
                    httpConn.setDoInput(true);
                    try {
                        connection.connect();
                    } catch (ConnectException ec2) {
                        boolean error = NULL; //new boolean();
                        error = true;
                        boolean finished = NULL; //new boolean();
                        finished = true;
                        String errorStr = NULL; //new String();
                        errorStr = "Cannot connect to: " + urlString;
//                        MyHelperClass urlString = new MyHelperClass();
                        System.out.println("Cannot connect to:" + urlString);
                    } catch (java.io.InterruptedIOException e) {
                        boolean error = NULL; //new boolean();
                        error = true;
                        boolean finished = NULL; //new boolean();
                        finished = true;
                        String errorStr = NULL; //new String();
                        errorStr = "Connection to Portal lost: communication is timeouted.";
                        MyHelperClass parentWorkflow = new MyHelperClass();
                        parentWorkflow.getMenuButtonEventHandler().stopAutomaticRefresh();
                    } catch (IllegalStateException ei) {
                        boolean error = NULL; //new boolean();
                        error = true;
                        boolean finished = NULL; //new boolean();
                        finished = true;
                        String errorStr = NULL; //new String();
                        errorStr = "IllegalStateException: " + ei.getMessage();
                    }
                    OutputStream out = httpConn.getOutputStream();
                    byte[] toTransfer = requestString.getBytes("UTF-8");
                    for (int i = 0; i < toTransfer.length; i++) {
                        out.write(toTransfer[i]);
                    }
                    int count;
                    int zBUFFER = 8 * 1024;
                    setUploadProgress(fileSize, counter);
                    byte data[] = new byte[zBUFFER];
                    GZIPOutputStream zos = new GZIPOutputStream(out);
                    while ((count = fis.read(data, 0, zBUFFER)) != -1) {
                        if ((boolean)(Object)isThreadStopped) {
                            return "";
                        }
                        zos.write(data, 0, count);
                        setUploadProgress(fileSize, counter);
                        counter += count;
                    }
                    zos.flush();
                    zos.finish();
                    setUploadProgress(fileSize, counter);
                    toTransfer = requestStringPostFix.getBytes("UTF-8");
                    for (int i = 0; i < toTransfer.length; i++) {
                        out.write(toTransfer[i]);
                    }
                    out.close();
                } catch (IOException e) {
                    finished =(MyHelperClass)(Object) true;
                    error =(MyHelperClass)(Object) true;
                    errorStr = "Error in Uploading file: "(MyHelperClass)(Object) + fileName;
                } finally {
                    try {
                        fis.close();
                    } catch (IOException e2) {
                    }
                }
                InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                String temp;
                String tempResponse = "";
                while ((temp = br.readLine()) != null) {
                    if ((boolean)(Object)isThreadStopped) {
                        return "";
                    }
                    tempResponse = tempResponse + temp + "\n";
                    setDecompressStatusAtUpload(temp);
                }
                responseString = tempResponse;
                isr.close();
            } catch (ConnectException ec) {
                error =(MyHelperClass)(Object) true;
                finished =(MyHelperClass)(Object) true;
                errorStr = "Cannot connect to: " +(MyHelperClass)(Object) urlString + "\nServer is not responding.";
            } catch (java.io.InterruptedIOException e) {
                error =(MyHelperClass)(Object) true;
                finished =(MyHelperClass)(Object) true;
                errorStr =(MyHelperClass)(Object) "Connection to Portal lost: communication is timeouted.";
                parentWorkflow.getMenuButtonEventHandler().stopAutomaticRefresh();
            } catch (IOException e2) {
                finished =(MyHelperClass)(Object) true;
                error =(MyHelperClass)(Object) true;
                errorStr = "IOError in postFileRequest: "(MyHelperClass)(Object) + e2.getMessage();
            } catch (Exception e4) {
                finished =(MyHelperClass)(Object) true;
                error =(MyHelperClass)(Object) true;
                errorStr = "Error while trying to communicate the server: "(MyHelperClass)(Object) + e4.getMessage();
            }
            return responseString;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass entrySet(){ return null; }
	public MyHelperClass getMenuButtonEventHandler(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(OutputStream o0){}
	GZIPOutputStream(){}
	public MyHelperClass finish(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass flush(){ return null; }}
