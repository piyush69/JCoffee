import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22401746 {
public MyHelperClass NewGenMain;
public MyHelperClass serverURL;

    public String sendRequest(java.lang.String servletName, java.lang.String request)  throws Throwable {
        String reqxml = "";
        Document retdoc = null;
        String myurl = java.util.prefs.Preferences.systemRoot().get("serverurl", "");
        String myport = java.util.prefs.Preferences.systemRoot().get("portno", "8080");
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
            dos.write(req1xml);
            dos.flush();
            dos.close();
            System.out.println("url conn: " + urlconn.getContentEncoding() + "  " + urlconn.getContentType());
            java.io.InputStream ios = urlconn.getInputStream();
            java.util.zip.CheckedInputStream cis = new java.util.zip.CheckedInputStream(ios, new java.util.zip.Adler32());
            java.util.zip.GZIPInputStream gip = new java.util.zip.GZIPInputStream(cis);
            java.io.InputStreamReader br = new java.io.InputStreamReader(gip, "UTF-8");
            retdoc =(Document)(Object) (new SAXBuilder()).build(br);
        } catch (java.net.ConnectException conexp) {
            javax.swing.JOptionPane.showMessageDialog(null, NewGenMain.getAppletInstance().getMyResource().getString("ConnectExceptionMessage"), "Critical error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception exp) {
            exp.printStackTrace(System.out);
        }
        System.out.println(reqxml);
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMyResource(){ return null; }
	public MyHelperClass getAppletInstance(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getCodeBase(){ return null; }}

class Document {

}

class IPAddressPortNoDialog {

IPAddressPortNoDialog(){}
	IPAddressPortNoDialog(String o0, String o1){}
	public MyHelperClass getIPAddress(){ return null; }
	public MyHelperClass getPortNo(){ return null; }
	public MyHelperClass show(){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStreamReader o0){ return null; }}
