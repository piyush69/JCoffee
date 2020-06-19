import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4617221 {
public MyHelperClass NULL;
public MyHelperClass urlString;
	public MyHelperClass currentFile;

        public String postDownloadRequest(String localFile) throws Exception {
            String responseString = "";
            String requestString = "";
            if (localFile == null) {
                boolean error =(boolean)(Object) NULL; //new boolean();
                error = true;
                MyHelperClass errorStr = new MyHelperClass();
                errorStr = errorStr.concat("No local target for: " + currentFile.getRelativePath() + "\n");
                return "";
            }
            try {
                MyHelperClass parameters = new MyHelperClass();
                for (java.util.Iterator i =(Iterator)(Object) parameters.entrySet().iterator(); i.hasNext(); ) {
                    java.util.Map.Entry e = (java.util.Map.Entry) i.next();
                    requestString = requestString + URLEncoder.encode((String) e.getKey(), "UTF-8") + "=" + URLEncoder.encode((String) e.getValue(), "UTF-8") + "&";
                }
                MyHelperClass urlString = new MyHelperClass();
                URL url = new URL((String)(Object)urlString);
                URLConnection connection = url.openConnection();
                HttpURLConnection httpConn = (HttpURLConnection) connection;
                httpConn.setRequestProperty("Content-Length", String.valueOf(requestString.length()));
                httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpConn.setRequestMethod("POST");
                httpConn.setDoOutput(true);
                httpConn.setDoInput(true);
                connection.connect();
                PrintWriter out = new PrintWriter(httpConn.getOutputStream());
                out.println(requestString);
                out.close();
                if (httpConn.HTTP_NOT_FOUND == httpConn.getResponseCode()) {
                    boolean error =(boolean)(Object) NULL; //new boolean();
                    error = true;
                    MyHelperClass errorStr = new MyHelperClass();
                    errorStr = errorStr.concat("Cannot find file: " + currentFile.getRelativePath() + "\n");
                    return responseString;
                }
                String localFileName = new String(localFile);
                File f = new File(localFileName);
                File dir = new File(f.getParent());
                dir.mkdirs();
                FileOutputStream fis = new FileOutputStream(f);
                try {
                    InputStream is = httpConn.getInputStream();
                    java.util.zip.GZIPInputStream gin = new java.util.zip.GZIPInputStream(new BufferedInputStream(is));
                    int temp;
                    while ((temp = gin.read()) != -1) {
                        fis.write(temp);
                    }
                    if (fis.getChannel().size() > 0) {
                        fis.getChannel().truncate(fis.getChannel().size() - 1);
                    }
                    MyHelperClass downloadDir = new MyHelperClass();
                    responseString = downloadDir + "/" + currentFile.getRelativePath();
                    is.close();
                    fis.close();
                    httpConn.disconnect();
                } catch (IOException io) {
                    boolean error =(boolean)(Object) NULL; //new boolean();
                    error = true;
                    MyHelperClass errorStr = new MyHelperClass();
                    errorStr = errorStr.concat("Cannot find file: " + currentFile.getRelativePath() + "\n");
                    return responseString;
                }
            } catch (java.net.ConnectException conne) {
                boolean error =(boolean)(Object) NULL; //new boolean();
                error = true;
                boolean finished =(boolean)(Object) NULL; //new boolean();
                finished = true;
                String errorStr =(String)(Object) NULL; //new String();
                errorStr = "Cannot connect to: " + urlString;
            } catch (java.io.InterruptedIOException e) {
                boolean error =(boolean)(Object) NULL; //new boolean();
                error = true;
                boolean finished =(boolean)(Object) NULL; //new boolean();
                finished = true;
                String errorStr =(String)(Object) NULL; //new String();
                errorStr = "Connection to Portal lost: communication is timeouted.";
                MyHelperClass parentWorkflow = new MyHelperClass();
                parentWorkflow.getMenuButtonEventHandler().stopAutomaticRefresh();
            } catch (java.net.MalformedURLException e) {
                boolean error =(boolean)(Object) NULL; //new boolean();
                error = true;
                boolean finished =(boolean)(Object) NULL; //new boolean();
                finished = true;
                String errorStr =(String)(Object) NULL; //new String();
                errorStr = "Error in postDownloadRequest()";
            } catch (Exception e) {
                e.printStackTrace();
                boolean error =(boolean)(Object) NULL; //new boolean();
                error = true;
                boolean finished =(boolean)(Object) NULL; //new boolean();
                finished = true;
                String errorStr =(String)(Object) NULL; //new String();
                errorStr = "Error in Download: " + e.getMessage();
            }
            return responseString;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getRelativePath(){ return null; }
	public MyHelperClass concat(String o0){ return null; }
	public MyHelperClass getMenuButtonEventHandler(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass stopAutomaticRefresh(){ return null; }}
