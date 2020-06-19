import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8292552 {
public MyHelperClass e_mail;
	public MyHelperClass Proxy_Host;
	public MyHelperClass pass;
	public MyHelperClass Vars;
	public MyHelperClass Proxy_Port;
	public MyHelperClass curCmd;

    public void run()  throws Throwable {
        BufferedReader inp = null;
        try {
            MyHelperClass user = new MyHelperClass();
            String urlString = "http://www.hubtracker.com/query.php?action=add&username=" + user + "&password=" + pass + "&email=" + e_mail + "&address=" + Vars.Hub_Host;
            URL url = new URL(urlString);
            URLConnection conn;
            if (!Proxy_Host.equals("")) conn = url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(Proxy_Host, Proxy_Port))); else conn = url.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.connect();
            inp = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String xx;
            MyHelperClass PluginMain = new MyHelperClass();
            while ((xx = inp.readLine()) != null) PluginMain.result += "\n" + xx;
            MyHelperClass curCmd = new MyHelperClass();
            if (curCmd != null) this.curCmd.cur_client.sendFromBot("[hubtracker:] " + PluginMain.result); else PluginMain.curFrame.showMsg();
            inp.close();
            inp = null;
        } catch (MalformedURLException ue) {
            MyHelperClass PluginMain = new MyHelperClass();
            PluginMain.result = ue.toString();
        } catch (Exception e) {
            MyHelperClass PluginMain = new MyHelperClass();
            PluginMain.result = e.toString();
        }
        boolean done = NULL; //new boolean();
        done = true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass result;
}
