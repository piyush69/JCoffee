import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13207437 {
public MyHelperClass NewGenMain;
	public MyHelperClass Utility;
public MyHelperClass serverURL;

    public Object sendRequestObjectResponse(java.lang.String servletName, java.lang.String request)  throws Throwable {
        MyHelperClass OSRoot = new MyHelperClass();
        String osRoot =(String)(Object) OSRoot.getRoot();
        String fname = "";
        Object retobj = null;
        String myurl = java.util.prefs.Preferences.systemRoot().get("serverurl", "");
        String myport = java.util.prefs.Preferences.systemRoot().get("portno", "8080");
        if (myport == null || myport.trim().equals("")) {
            myport = "80";
        }
        if (this.serverURL == null) {
            try {
                java.net.URL codebase =(URL)(Object) NewGenMain.getAppletInstance().getCodeBase();
                if (codebase != null) serverURL =(MyHelperClass)(Object) codebase.getHost(); else serverURL =(MyHelperClass)(Object) "localhost";
            } catch (Exception exp) {
                exp.printStackTrace();
                serverURL =(MyHelperClass)(Object) "localhost";
            }
            IPAddressPortNoDialog ipdig = new IPAddressPortNoDialog(myurl, myport);
            ipdig.show();
            serverURL =(MyHelperClass)(Object) myurl = ipdig.getIPAddress();
            myport =(String)(Object) ipdig.getPortNo();
            java.util.prefs.Preferences.systemRoot().put("serverurl",(String)(Object) serverURL);
            java.util.prefs.Preferences.systemRoot().put("portno", myport);
            System.out.println(serverURL);
        }
        try {
            System.out.println("http://" + serverURL + ":" + myport + "/newgenlibctxt/" + servletName);
            java.net.URL url = new java.net.URL("http://" + serverURL + ":" + myport + "/newgenlibctxt/" + servletName);
            java.net.URLConnection urlconn = (java.net.URLConnection) url.openConnection();
            urlconn.setDoOutput(true);
            urlconn.setRequestProperty("Content-type", "text/xml; charset=UTF-8");
            java.io.OutputStream os = urlconn.getOutputStream();
            String req1xml = request;
            java.util.zip.CheckedOutputStream cos = new java.util.zip.CheckedOutputStream(os, new java.util.zip.Adler32());
            java.util.zip.GZIPOutputStream gop = new java.util.zip.GZIPOutputStream(cos);
            java.io.OutputStreamWriter dos = new java.io.OutputStreamWriter(gop, "UTF-8");
            System.out.println(req1xml);
            try {
                java.io.FileOutputStream pw = new java.io.FileOutputStream("log.txt");
                pw.write(req1xml.getBytes());
                pw.flush();
                pw.close();
            } catch (Exception exp) {
                exp.printStackTrace();
            }
            dos.write(req1xml);
            dos.flush();
            dos.close();
            System.out.println("url conn: " + urlconn.getContentEncoding() + "  " + urlconn.getContentType());
            java.io.InputStream ios = urlconn.getInputStream();
            java.io.File f1 = new java.io.File(osRoot + "/localattachments/Reports");
            if (!f1.exists()) f1.mkdirs();
            java.io.File file = null;
            if (urlconn.getContentType() != null && urlconn.getContentType().trim().equals("application/vnd.oasis.opendocument.text")) {
                file = new java.io.File(osRoot + "/localattachments/Reports/" + System.currentTimeMillis() + ".odt");
            } else if (urlconn.getContentType() != null && urlconn.getContentType().trim().equals("text/html")) {
                file = new java.io.File(osRoot + "/localattachments/Reports/" + System.currentTimeMillis() + ".html");
            } else {
                file = new java.io.File(osRoot + "/localattachments/Reports/" + System.currentTimeMillis() + ".xls");
            }
            file = new java.io.File(file.getAbsolutePath());
            java.io.FileOutputStream fos = new java.io.FileOutputStream(file);
            int c;
            while ((c = ios.read()) != -1) fos.write(c);
            fos.close();
            ios.close();
            fname = file.getAbsolutePath();
            System.out.println(fname);
            Utility.getInstance().showBrowser("file://" + fname);
        } catch (Exception exp) {
            exp.printStackTrace(System.out);
            javax.swing.JOptionPane.showMessageDialog(null, "<html>Could not establish connection with the server, <br>Please verify server name/IP adress, <br>Also check if NewGenLib server is running</html>", "Critical error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        return fname;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAppletInstance(){ return null; }
	public MyHelperClass showBrowser(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass getCodeBase(){ return null; }}

class IPAddressPortNoDialog {

IPAddressPortNoDialog(){}
	IPAddressPortNoDialog(String o0, String o1){}
	public MyHelperClass getIPAddress(){ return null; }
	public MyHelperClass getPortNo(){ return null; }
	public MyHelperClass show(){ return null; }}
