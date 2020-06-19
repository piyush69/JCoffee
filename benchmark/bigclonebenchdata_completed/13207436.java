import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13207436 {
public MyHelperClass NewGenMain;
public MyHelperClass serverURL;

    public Object sendObjectRequestToSpecifiedServer(java.lang.String serverName, java.lang.String servletName, java.lang.Object request)  throws Throwable {
        Object reqxml = null;
        Document retdoc = null;
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
            java.net.URL url = new java.net.URL("http://" + serverName + ":" + myport + "/newgenlibctxt/" + servletName);
            java.net.URLConnection urlconn = (java.net.URLConnection) url.openConnection();
            urlconn.setDoOutput(true);
            java.io.OutputStream os = urlconn.getOutputStream();
            java.util.zip.CheckedOutputStream cos = new java.util.zip.CheckedOutputStream(os, new java.util.zip.Adler32());
            java.util.zip.GZIPOutputStream gop = new java.util.zip.GZIPOutputStream(cos);
            java.io.ObjectOutputStream dos = new java.io.ObjectOutputStream(gop);
            dos.writeObject(request);
            dos.flush();
            dos.close();
            java.io.InputStream ios = urlconn.getInputStream();
            java.util.zip.CheckedInputStream cis = new java.util.zip.CheckedInputStream(ios, new java.util.zip.Adler32());
            java.util.zip.GZIPInputStream gip = new java.util.zip.GZIPInputStream(cis);
            java.io.ObjectInputStream br = new java.io.ObjectInputStream(gip);
            reqxml = br.readObject();
        } catch (Exception exp) {
            exp.printStackTrace(System.out);
            System.out.println("Exception in Servlet Connector: " + exp);
        }
        return reqxml;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAppletInstance(){ return null; }
	public MyHelperClass getCodeBase(){ return null; }}

class Document {

}

class IPAddressPortNoDialog {

IPAddressPortNoDialog(){}
	IPAddressPortNoDialog(String o0, String o1){}
	public MyHelperClass getIPAddress(){ return null; }
	public MyHelperClass getPortNo(){ return null; }
	public MyHelperClass show(){ return null; }}
