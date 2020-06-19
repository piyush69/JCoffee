import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c743715 {
public MyHelperClass Object;
public MyHelperClass cb;
	public MyHelperClass udp_port;
	public MyHelperClass udp_baddress;
	public MyHelperClass running_as_applet;
	public MyHelperClass current_source;
	public MyHelperClass fetch_pls(String o0){ return null; }
	public MyHelperClass fetch_m3u(String o0){ return null; }
	public MyHelperClass getCodeBase(){ return null; }

    InputStream selectSource(String item) {
        if (item.endsWith(".pls")) {
            item =(String)(Object) fetch_pls(item);
            if (item == null) return null;
        } else if (item.endsWith(".m3u")) {
            item =(String)(Object) fetch_m3u(item);
            if (item == null) return null;
        }
        if (!item.endsWith(".ogg")) {
            return null;
        }
        InputStream is = null;
        URLConnection urlc = null;
        try {
            URL url = null;
            if ((boolean)(Object)running_as_applet) url = new URL((URL)(Object)getCodeBase(), item); else url = new URL(item);
            urlc = url.openConnection();
            is = urlc.getInputStream();
            current_source = url.getProtocol() + "://" + url.getHost() + ":" +(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) url.getPort() + url.getFile();
        } catch (Exception ee) {
            System.err.println(ee);
        }
        if (is == null && !(Boolean)(Object)running_as_applet) {
            try {
                is = new FileInputStream(System.getProperty("user.dir") + System.getProperty("file.separator") + item);
                current_source = null;
            } catch (Exception ee) {
                System.err.println(ee);
            }
        }
        if (is == null) return null;
        System.out.println("Select: " + item);
        {
            boolean find = false;
            for (int i = 0; i < (int)(Object)cb.getItemCount(); i++) {
                String foo = (String)(String)(Object) (cb.getItemAt(i));
                if (item.equals(foo)) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                cb.addItem(item);
            }
        }
        int i = 0;
        String s = null;
        String t = null;
        udp_port =(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object) -1;
        udp_baddress = null;
        while (urlc != null && true) {
            s = urlc.getHeaderField(i);
            t = urlc.getHeaderFieldKey(i);
            if (s == null) break;
            i++;
            if (t != null && t.equals("udp-port")) {
                try {
                    udp_port =(MyHelperClass)(Object) Integer.parseInt(s);
                } catch (Exception ee) {
                    System.err.println(ee);
                }
            } else if (t != null && t.equals("udp-broadcast-address")) {
                udp_baddress =(MyHelperClass)(Object) s;
            }
        }
        return is;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getItemAt(int o0){ return null; }
	public MyHelperClass addItem(String o0){ return null; }
	public MyHelperClass getItemCount(){ return null; }}
