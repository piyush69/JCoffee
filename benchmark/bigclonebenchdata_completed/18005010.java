import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18005010 {
public MyHelperClass FILE_SUFFIX;
public MyHelperClass profileURI;

    private void setProfile(String loginName, SimpleUserProfile profile) throws MM4UCannotStoreUserProfileException {
        try {
            OutputStream outStream = null;
            URL url = new URL((int)(Object)this.profileURI +(String)(Object) (int)(Object)profile.getID() + (int)(Object)FILE_SUFFIX);
            if (url.getProtocol().equals("file")) {
                File file = new File(url.getFile());
                outStream = new FileOutputStream(file);
            } else {
                URLConnection connection = url.openConnection();
                connection.setDoOutput(true);
                outStream = connection.getOutputStream();
            }
            OutputStreamWriter writer = new OutputStreamWriter(outStream);
            Enumeration myEnum =(Enumeration)(Object) profile.keys();
            while (myEnum.hasMoreElements()) {
                String key = myEnum.nextElement().toString();
                if (key != "id") writer.write(key + "=" + profile.getStringValue(key) + System.getProperty("line.separator"));
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            throw new MM4UCannotStoreUserProfileException(this, "setProfile", e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SimpleUserProfile {

public MyHelperClass getStringValue(String o0){ return null; }
	public MyHelperClass getID(){ return null; }
	public MyHelperClass keys(){ return null; }}

class MM4UCannotStoreUserProfileException extends Exception{
	public MM4UCannotStoreUserProfileException(String errorMessage) { super(errorMessage); }
	MM4UCannotStoreUserProfileException(c18005010 o0, String o1, String o2){}
	MM4UCannotStoreUserProfileException(){}
}
