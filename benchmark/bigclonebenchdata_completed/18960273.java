import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18960273 {

    public void doActionOn(TomcatProject prj) throws Exception {
        MyHelperClass TomcatLauncherPlugin = new MyHelperClass();
        String path =(String)(Object) TomcatLauncherPlugin.getDefault().getManagerAppUrl();
        try {
            path += "/reload?path=" + prj.getWebPath();
            URL url = new URL(path);
            Authenticator.setDefault(new Authenticator() {

                protected PasswordAuthentication getPasswordAuthentication() {
                    MyHelperClass TomcatLauncherPlugin = new MyHelperClass();
                    String user =(String)(Object) TomcatLauncherPlugin.getDefault().getManagerAppUser();
//                    MyHelperClass TomcatLauncherPlugin = new MyHelperClass();
                    String password =(String)(Object) TomcatLauncherPlugin.getDefault().getManagerAppPassword();
                    return new PasswordAuthentication(user, password.toCharArray());
                }
            });
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.getContent();
            connection.disconnect();
            Authenticator.setDefault(null);
        } catch (Exception e) {
            throw new Exception("The following url was used : \n" + path + "\n\nCheck manager app settings (username and password)\n\n");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getManagerAppPassword(){ return null; }
	public MyHelperClass getManagerAppUser(){ return null; }
	public MyHelperClass getManagerAppUrl(){ return null; }
	public MyHelperClass getDefault(){ return null; }}

class TomcatProject {

public MyHelperClass getWebPath(){ return null; }}
