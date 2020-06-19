import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7044128 {

    public static String setErrorServer(String newServer)  throws Throwable {
        MyHelperClass errorServerURL = new MyHelperClass();
        String old =(String)(Object) errorServerURL;
        try {
            URL url = new URL(newServer);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setInstanceFollowRedirects(false);
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder page = new StringBuilder();
            String line = null;
            while ((line = rd.readLine()) != null) {
                page.append(line);
            }
            rd.close();
            MyHelperClass ConfigType = new MyHelperClass();
            if (!page.toString().equals("maRla")) throw new ConfigurationException("URL given for error server is invalid", ConfigType.ErrorServer);
        } catch (UnknownHostException ex) {
            System.out.println("Accepting setting for error sever, unable to check");
        } catch (MalformedURLException ex) {
            MyHelperClass ConfigType = new MyHelperClass();
            throw new ConfigurationException("URL given for error server ('" + newServer + "') appears invalid", ConfigType.ErrorServer, ex);
        } catch (IOException ex) {
            MyHelperClass ConfigType = new MyHelperClass();
            throw new ConfigurationException("URL given for error server could not be reached", ConfigType.ErrorServer, ex);
        }
//        MyHelperClass errorServerURL = new MyHelperClass();
        errorServerURL =(MyHelperClass)(Object) newServer;
        return old;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ErrorServer;
}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
	ConfigurationException(){}
	ConfigurationException(String o0, MyHelperClass o1, MalformedURLException o2){}
	ConfigurationException(String o0, MyHelperClass o1, IOException o2){}
	ConfigurationException(String o0, MyHelperClass o1){}
}
