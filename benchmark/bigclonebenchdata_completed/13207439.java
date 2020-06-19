import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13207439 {
public MyHelperClass NewGenMain;
public MyHelperClass serverURL;

    public String sendRequestAndGetNormalStringOutPut(java.lang.String servletName, java.lang.String request)  throws Throwable {
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
        String response = "";
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
            int n = -1;
            while ((n = br.read()) != -1) response += (char) n;
        } catch (java.net.ConnectException conexp) {
            javax.swing.JOptionPane.showMessageDialog(null, "<html>Could not establish connection with the NewGenLib server, " + "<br>These might be the possible reasons." + "<br><li>Check the network connectivity between this machine and the server." + "<br><li>Check whether NewGenLib server is running on the server machine." + "<br><li>NewGenLib server might not have initialized properly. In this case" + "<br>go to server machine, open NewGenLibDesktop Application," + "<br> utility ->Send log to NewGenLib Customer Support</html>", "Critical error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception exp) {
            exp.printStackTrace(System.out);
            TroubleShootConnectivity troubleShoot = new TroubleShootConnectivity();
        }
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAppletInstance(){ return null; }
	public MyHelperClass getCodeBase(){ return null; }}

class TroubleShootConnectivity {

}

class IPAddressPortNoDialog {

IPAddressPortNoDialog(){}
	IPAddressPortNoDialog(String o0, String o1){}
	public MyHelperClass getIPAddress(){ return null; }
	public MyHelperClass getPortNo(){ return null; }
	public MyHelperClass show(){ return null; }}
