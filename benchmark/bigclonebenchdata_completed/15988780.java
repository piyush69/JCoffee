import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15988780 {
public MyHelperClass doneWithScript(TinyCGI o0){ return null; }
public MyHelperClass exceptionEncountered;
	public MyHelperClass env;
	public MyHelperClass inputStream;
	public MyHelperClass outputStream;
	public MyHelperClass clientSocket;
	public MyHelperClass CRLF;
	public MyHelperClass readLine(InputStream o0, boolean o1){ return null; }
	public MyHelperClass parseHTTPHeaders(){ return null; }
	public MyHelperClass parseHeader(String o0, StringBuffer o1){ return null; }
	public MyHelperClass sendHeaders(int o0, String o1, String o2, long o3, int o4, String o5){ return null; }
	public MyHelperClass sendError(int o0, String o1, String o2){ return null; }

        private void serveCGI(TinyCGI script) throws Throwable, IOException, TinyWebThreadException {
            parseHTTPHeaders();
            OutputStream cgiOut = null;
            File tempFile = null;
            try {
                if (script == null) sendError(500, "Internal Error", "Couldn't load script.");
                if ((TinyCGIHighVolume)(Object)script instanceof TinyCGIHighVolume) {
                    tempFile = File.createTempFile("cgi", null);
                    cgiOut = new FileOutputStream(tempFile);
                } else {
                    cgiOut = new ByteArrayOutputStream();
                }
                script.service(inputStream, cgiOut, env);
            } catch (Exception cgie) {
                this.exceptionEncountered =(MyHelperClass)(Object) cgie;
                if (tempFile != null) tempFile.delete();
                if (clientSocket == null) {
                    return;
                } else if (cgie instanceof TinyCGIException) {
                    TinyCGIException tce = (TinyCGIException) cgie;
                    sendError(tce.getStatus(), tce.getTitle(), tce.getText(), tce.getOtherHeaders());
                } else {
                    StringWriter w = new StringWriter();
                    cgie.printStackTrace(new PrintWriter(w));
                    sendError(500, "CGI Error", "Error running script: " + "<PRE>" + w.toString() + "</PRE>");
                }
            } finally {
                if (script != null) doneWithScript(script);
            }
            InputStream cgiResults = null;
            long totalSize = 0;
            if (tempFile == null) {
                byte[] results = ((ByteArrayOutputStream) cgiOut).toByteArray();
                totalSize = results.length;
                cgiResults = new ByteArrayInputStream(results);
            } else {
                cgiOut.close();
                totalSize = tempFile.length();
                cgiResults = new FileInputStream(tempFile);
            }
            String contentType = null, statusString = "OK", line, header;
            StringBuffer otherHeaders = new StringBuffer();
            StringBuffer text = new StringBuffer();
            int status = 200;
            int headerLength = 0;
            while (true) {
                line =(String)(Object) readLine(cgiResults, true);
                headerLength += line.length();
                if (line.charAt(0) == '\r' || line.charAt(0) == '\n') break;
                header =(String)(Object) parseHeader(line, text);
                if (header.toUpperCase().equals("STATUS")) {
                    statusString = text.toString();
                    status = Integer.parseInt(statusString.substring(0, 3));
                    statusString = statusString.substring(4);
                } else if (header.toUpperCase().equals("CONTENT-TYPE")) contentType = text.toString(); else {
                    if (header.toUpperCase().equals("LOCATION")) status = 302;
                    otherHeaders.append(header).append(": ").append(text.toString()).append(CRLF);
                }
            }
            sendHeaders(status, statusString, contentType, totalSize - headerLength, -1, otherHeaders.toString());
            byte[] buf = new byte[2048];
            int bytesRead;
            while ((bytesRead = cgiResults.read(buf)) != -1) outputStream.write(buf, 0, bytesRead);
            outputStream.flush();
            try {
                cgiResults.close();
                if (tempFile != null) tempFile.delete();
            } catch (IOException ioe) {
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass flush(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class TinyCGI {

public MyHelperClass service(MyHelperClass o0, OutputStream o1, MyHelperClass o2){ return null; }}

class TinyWebThreadException extends Exception{
	public TinyWebThreadException(String errorMessage) { super(errorMessage); }
}

class TinyCGIHighVolume {

}

class TinyCGIException extends Exception{
	public TinyCGIException(String errorMessage) { super(errorMessage); }
}
