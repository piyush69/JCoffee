import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15660054 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static List<PluginInfo> getPluginInfos(String urlRepo) throws Throwable, MalformedURLException, IOException {
        XStream xStream = new XStream();
        xStream.alias("plugin",(PluginInfo)(Object) PluginInfo.class);
        xStream.alias("plugins",(PluginInfo)(Object) List.class);
        List<PluginInfo> infos = null;
        URL url;
        BufferedReader in = null;
        StringBuilder buffer = new StringBuilder();
        try {
            url = new URL(urlRepo);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                buffer.append(inputLine);
            }
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(RemotePluginsManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        infos = (List<PluginInfo>) xStream.fromXML(buffer.toString());
        return infos;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }}

class PluginInfo {

}

class XStream {

public MyHelperClass alias(String o0, PluginInfo o1){ return null; }
	public MyHelperClass fromXML(String o0){ return null; }
	public MyHelperClass alias(String o0, List o1){ return null; }}

class RemotePluginsManager {

}
